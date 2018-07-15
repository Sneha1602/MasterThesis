package eifml.generator.views

import essentialIFML.Core.ViewElement
import essentialIFML.Extensions.impl.OnSubmitEventImpl
import essentialIFML.Core.impl.IFMLActionImpl

public class OnSubmitEventGenerator {
	
	protected def String generateCode(ViewElement el){
		var output = "";
		
		var onSubmitEvents = el.viewElementEvents.filter(typeof(OnSubmitEventImpl)); 
		
		for (event : onSubmitEvents) {
			// only one out interaction flow supported at the moment
			var outInteractionFlow = event.outInteractionFlows.get(0);
			if(outInteractionFlow.targetInteractionFlowElement instanceof IFMLActionImpl){
				output += '''
					
						«event.name»(){
							this.«outInteractionFlow.targetInteractionFlowElement.name»Action();
						}
					
						«outInteractionFlow.targetInteractionFlowElement.name»Action(){
							// PROTECTED REGION ID «outInteractionFlow.targetInteractionFlowElement.id».«outInteractionFlow.targetInteractionFlowElement.name» ENABLED START
							// PROTECTED REGION END
						}
				''';
			}
		}
		
		return output;
	}
}
