package eifml.generator.views;


import essentialIFML.Extensions.impl.DetailsImpl
import essentialIFML.Core.impl.VisualizationAttributeImpl
import essentialIFML.Core.impl.UMLStructuralFeatureImpl
import org.eclipse.uml2.uml.StructuralFeature
import eifml.generator.general.AbstractViewElementGenerator
import eifml.generator.utils.ServiceCollection
import eifml.generator.utils.UMLReferenceResolver
import org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl

public class DetailsGenerator extends AbstractViewElementGenerator<DetailsImpl>{
	
	override protected generateTemplate(DetailsImpl listElement) {
		var output = ""
		
		var dataBinding = listElement.viewComponentParts.get(0)
		var visualizationAttributes = dataBinding.subViewComponentParts.toList()
		
		output += '''
			<table id="«listElement.id»" name="«listElement.name»" [ngClass]="_«ServiceCollection.sharedInstance.displayProperties.name.toFirstLower».displayProperties.tableClass">
		'''
		
		for(attribute : visualizationAttributes){
			output += '''
				<tr>
					<th>
						{{_«ServiceCollection.sharedInstance.resource.name.toFirstLower».getLangString('«attribute.name»')}}
					</th>
			'''
			
			output += '''	
				«IF (((attribute as VisualizationAttributeImpl).featureConcept as UMLStructuralFeatureImpl).structuralFeature as StructuralFeature).type instanceof PrimitiveTypeImpl»
					<td>
						{{selected«listElement.parameters.get(0).name.toFirstUpper».«(((attribute as VisualizationAttributeImpl).featureConcept as UMLStructuralFeatureImpl).structuralFeature as StructuralFeature).name»}}
					</td>
				«ELSE»
					«FOR ref : UMLReferenceResolver::sharedInstance.getOwnedAttributesLong(((attribute as VisualizationAttributeImpl).featureConcept as UMLStructuralFeatureImpl).structuralFeature)»
						<td>
							{{selected«listElement.parameters.get(0).name.toFirstUpper».«ref»}}
						</td>
					«ENDFOR»
				«ENDIF»
			'''
			
			output += '''			
				</tr>
			'''
		}
		
		output += '''
			</table>
		'''

		return output
	}
	
	override protected prepareGeneration(DetailsImpl it) {
	}
	
}
