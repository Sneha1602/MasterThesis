package eifml.generator.views

import eifml.generator.general.AbstractClassGenerator
import eifml.generator.utils.ServiceCollection
import eifml.generator.utils.UMLReferenceResolver
import essentialIFML.Core.DomainConcept
import essentialIFML.Core.impl.DataBindingImpl
import essentialIFML.Core.impl.UMLStructuralFeatureImpl
import essentialIFML.Core.impl.ViewContainerImpl
import essentialIFML.Core.impl.VisualizationAttributeImpl
import essentialIFML.Extensions.impl.FormImpl
import essentialIFML.Extensions.impl.ListImpl
import essentialIFML.Extensions.impl.SimpleFieldImpl
import java.util.ArrayList
import org.eclipse.uml2.uml.StructuralFeature
import org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl

class ViewContainerGenerator extends AbstractClassGenerator<ViewContainerImpl> {
	
	ArrayList imports = new ArrayList();
	
	// Overridden Parent methods	
	override protected prepareGeneration(ViewContainerImpl it) {
	}

	override protected generateComponent(ViewContainerImpl it) {
		var header = '''
			// Angular Imports
			import { Component, OnInit } from '@angular/core';
			import { ActivatedRoute } from '@angular/router';
			import { Router } from '@angular/router';
			import { NgClass } from '@angular/common';
			
			«FOR vElem : it.viewElements»
				«IF (vElem instanceof ListImpl)»
					// Search Component Imports
					import { «vElem.name.toFirstUpper»Filter } from '../helper/pipes/«vElem.name.toFirstLower».pipe';
				«ENDIF»
			«ENDFOR»
			
			// Service Imports
			«FOR service : ServiceCollection.sharedInstance.services»
				import { «service.name» } from '..«service.location»';
			«ENDFOR»
			
		'''
			
		var componentBody = '''
			@Component({
				selector: '«it.name.toFirstLower»',
				templateUrl: '«folderName»«fileName».html',
				providers: [«FOR service : ServiceCollection.sharedInstance.providers SEPARATOR ','»«service.name»«ENDFOR»],
				directives: [NgClass «IF it.viewElements.exists[el|el instanceof ListImpl]»«ENDIF» ],
			«««				«FOR vElem : it.viewElements BEFORE 'pipes: [' SEPARATOR ',' AFTER ']'»«IF (vElem instanceof ListImpl)»«vElem.name.toFirstUpper»Filter«ENDIF»«ENDFOR»
				pipes: [«FOR vElem : it.viewElements»«IF (vElem instanceof ListImpl)»«vElem.name.toFirstUpper»Filter,«ENDIF»«ENDFOR»]
			})
			
			export class «it.name.toFirstUpper»Component {
				//Generate variables for parameters and bindings
				«FOR vElem : it.viewElements»
					«FOR vParam : vElem.parameters»
						selected«vParam.name.toFirstUpper»:  any;
						isSelected«vParam.name.toFirstUpper»:  boolean;
					«ENDFOR»
					«IF (vElem instanceof ListImpl)»
						// variable for advanced search space
						advancedSearchSpace: Object;
						filterBy: String;
						«FOR varCompPart : (vElem as ListImpl).viewComponentParts»
							«IF (varCompPart instanceof DataBindingImpl)»
								// variable for list data binding
								«(varCompPart as DataBindingImpl).name.toFirstLower»: «IF ((varCompPart as DataBindingImpl).domainConcept != null)»«this.addImport(((varCompPart as DataBindingImpl).domainConcept))»«(varCompPart as DataBindingImpl).domainConcept.name»[]«ELSE»any«ENDIF»;
								«FOR vVisualization : (varCompPart as DataBindingImpl).subViewComponentParts»
									«vVisualization.name»: any;
								«ENDFOR»
							«ENDIF»
						«ENDFOR»
					«ENDIF»
				«ENDFOR»
				«IF it.viewElements.exists[el|el instanceof FormImpl]»
					// bindings for fields in form
						«FOR vElem : it.viewElements»
							«IF (vElem instanceof FormImpl)»
								«FOR varCompPart : (vElem as FormImpl).viewComponentParts»		
									«varCompPart.name»: «UMLReferenceResolver.sharedInstance.resolveProxyURI(((varCompPart as SimpleFieldImpl).type as PrimitiveTypeImpl).eProxyURI)»;
								«ENDFOR»						
							«ENDIF»
						«ENDFOR»
				«ENDIF»
				// PROTECTED REGION ID «it.id».«it.name» ENABLED START
				// PROTECTED REGION END
			
				constructor(
				private _router: Router,
				private _route: ActivatedRoute
				«FOR service : ServiceCollection.sharedInstance.services BEFORE ',' SEPARATOR ','»
					private _«service.name.toFirstLower»: «service.name»
				«ENDFOR»){
				«FOR vElem : it.viewElements»
					«IF vElem instanceof ListImpl»
						// fill advanced search space
						this.advancedSearchSpace = [
						«FOR attribute: (vElem as ListImpl).viewComponentParts.get(0).subViewComponentParts.toList() SEPARATOR ','»
							«IF (((attribute as VisualizationAttributeImpl).featureConcept as UMLStructuralFeatureImpl).structuralFeature as StructuralFeature).type instanceof PrimitiveTypeImpl»
								{key: "«(((attribute as VisualizationAttributeImpl).featureConcept as UMLStructuralFeatureImpl).structuralFeature as StructuralFeature).name»", title: "«attribute.name»"}
							«ELSE»
								«FOR ref : UMLReferenceResolver::sharedInstance.getOwnedAttributesLong(((attribute as VisualizationAttributeImpl).featureConcept as UMLStructuralFeatureImpl).structuralFeature) SEPARATOR ','»
									{key: "«ref»", title: "«ref»"}
								«ENDFOR»
							«ENDIF»
						«ENDFOR»
						];
					«ENDIF»
				«ENDFOR»
				}
					
				// stubs generated for view element events
				«new ViewElementEventGenerator().generateCode(it.viewElements.toList)»
			
				«FOR vElem : it.viewElements»
					«IF (vElem instanceof ListImpl)»
						«FOR varCompPart : (vElem as ListImpl).viewComponentParts»
							// stubs for data service calls for data bindings
							get«(varCompPart as DataBindingImpl).name.toFirstUpper»(){
								// PROTECTED REGION ID «varCompPart.id».get«varCompPart.name.toFirstUpper» ENABLED START
								// PROTECTED REGION END
							}
							
							onSelect(el: «(varCompPart as DataBindingImpl).domainConcept.name»){
								«FOR vParam : vElem.parameters»
									if(this.selected«vParam.name.toFirstUpper» === el){
										this.selected«vParam.name.toFirstUpper» = undefined;
										this.isSelected«vParam.name.toFirstUpper» = false;
									}else{
										this.selected«vParam.name.toFirstUpper» = el;
										this.isSelected«vParam.name.toFirstUpper» = true;
									}
								«ENDFOR»
							}
						«ENDFOR»
						
						// called when search filter is updated
						filterUpdated(val: Object){
							this.filterBy = JSON.stringify(val);
						}
					«ENDIF»
				«ENDFOR»
				
				// called when component is initiated			
				ngOnInit(){
					// Check authentication requirements, if empty, no authentication requirements for this component
					«new AuthenticationInitGenerator().generateCode(it)»
					
					«FOR vElem : it.viewElements»
						«IF (vElem instanceof ListImpl)»
							// Call methods for filling data binding
							«FOR varCompPart : (vElem as ListImpl).viewComponentParts»
								this.get«(varCompPart as DataBindingImpl).name.toFirstUpper»();
							«ENDFOR»
						«ENDIF»
					«ENDFOR»
					
					«IF it.inInteractionFlows.size >= 1 && it.inInteractionFlows.get(0).parameterBindingGroup != null»
						// Incoming Navigation Flows with Parameter Binding
						this._route.params.subscribe(params => {
							«FOR flow : it.inInteractionFlows»
								«FOR binding : flow.parameterBindingGroup.parameterBindings»
									if(params['«binding.targetParameter.name»'] != undefined){
										this.selected«binding.targetParameter.name.toFirstUpper» = JSON.parse(decodeURI(params['«binding.targetParameter.name»']));
									}
								«ENDFOR»							
							«ENDFOR»
						});
					«ENDIF»
					
					// PROTECTED REGION ID «it.id».ngOnInit ENABLED START
					// PROTECTED REGION END
				}
			}
		'''
		
		header += '''
			// domain concept imports
			«FOR concept : this.imports»
				import { «(concept as DomainConcept).name.toFirstUpper» } from '../data/«(concept as DomainConcept).name.toFirstLower»';
			«ENDFOR»
			
		'''
		
		return header + componentBody;
	}
	
	def void addImport(DomainConcept umldc){
		imports.add(umldc);
	}

	override protected generateTemplate(ViewContainerImpl it) {
		'''
			<div class="col-md-12">
			
				<!-- PROTECTED REGION ID «it.name.toFirstLower» ENABLED START -->
				<!-- PROTECTED REGION END -->
				
				<div name="content">
			«new ViewElementGenerator().generateCode(it.viewElements.toList)»
				</div>
			</div>
		'''
	}

	override protected fileName(ViewContainerImpl it) {
		'''«it.name.toFirstLower».component'''
	}

	override protected folderName(ViewContainerImpl it) {
		"app/views/"
	}

}
