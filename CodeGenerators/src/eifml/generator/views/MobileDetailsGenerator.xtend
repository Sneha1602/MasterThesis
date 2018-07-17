package eifml.generator.views;

import essentialIFML.Extensions.impl.ListImpl;

import essentialIFML.Extensions.impl.OnSelectEventImpl
import essentialIFML.Core.impl.UMLStructuralFeatureImpl
import essentialIFML.Core.impl.VisualizationAttributeImpl

import org.eclipse.uml2.uml.internal.impl.PropertyImpl
import org.eclipse.uml2.uml.StructuralFeature
import org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
import eifml.generator.general.AbstractViewElementGenerator
import eifml.generator.utils.ServiceCollection
import eifml.generator.utils.UMLReferenceResolver

public class MobileDetailsGenerator extends AbstractViewElementGenerator<ListImpl>{
	
	override protected generateTemplate(ListImpl listElement) {
		var output = ""

		var dataBinding = listElement.viewComponentParts.get(0)
		var visualizationAttributes = dataBinding.subViewComponentParts.toList()
		 
		output += '''
			<div name="mobileDetails" *ngIf="_«ServiceCollection.sharedInstance.displayProperties.name.toFirstLower».displayProperties.isMobile && selected«listElement.parameters.get(0).name.toFirstUpper»" [ngClass]="_«ServiceCollection.sharedInstance.displayProperties.name.toFirstLower».displayProperties.hideOnDesktop">
				<div style="margin-bottom:5px">	
					<button type="button" class="btn btn-default" (click)="onSelect(selected«listElement.parameters.get(0).name.toFirstUpper»)"> 
						<span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span> {{_«ServiceCollection.sharedInstance.resource.name.toFirstLower».getLangString('back')}}
					</button>    		
				</div>
				<div name="detailsTable">
					<table [ngClass]="_«ServiceCollection.sharedInstance.displayProperties.name.toFirstLower».displayProperties.tableClass">
		'''
		for(attribute : visualizationAttributes){
			if((((attribute as VisualizationAttributeImpl).featureConcept as UMLStructuralFeatureImpl).structuralFeature as StructuralFeature).type instanceof PrimitiveTypeImpl){
				output+='''	
					
						<tr>
							<th>
								{{_«ServiceCollection.sharedInstance.resource.name.toFirstLower».getLangString('«(((attribute as VisualizationAttributeImpl).featureConcept as UMLStructuralFeatureImpl).structuralFeature as StructuralFeature).name»')}}
							</th>
							<td>
								{{selected«listElement.parameters.get(0).name.toFirstUpper».«(((attribute as VisualizationAttributeImpl).featureConcept as UMLStructuralFeatureImpl).structuralFeature as StructuralFeature).name»}}
							</td>
						</tr>
				'''
			}else{
				var refShort = UMLReferenceResolver::sharedInstance.getOwnedAttributesShort(((attribute as VisualizationAttributeImpl).featureConcept as UMLStructuralFeatureImpl).structuralFeature)
				var refLong = UMLReferenceResolver::sharedInstance.getOwnedAttributesLong(((attribute as VisualizationAttributeImpl).featureConcept as UMLStructuralFeatureImpl).structuralFeature)
				for (var i = 0; i < refShort.length; i++){
					output += '''
										<tr>
											<th>
												{{_«ServiceCollection.sharedInstance.resource.name.toFirstLower».getLangString('«refShort.get(i)»')}}
											</th>
											<td>
												{{selected«listElement.parameters.get(0).name.toFirstUpper».«refLong.get(i)»}}
											</td>
										</tr>
									'''
				}
			}
		}		
		
		output += '''
									</table>
								</div>
							</div>
						'''
		
		return output
	}
	
	override protected prepareGeneration(ListImpl it) {
	}
	
}
				