package eifml.generator.views

import java.util.List
import essentialIFML.Core.ViewElement
import essentialIFML.Extensions.impl.ListImpl
import essentialIFML.Extensions.impl.FormImpl

public class ViewElementEventGenerator {
	
	protected def String generateCode(List<ViewElement> viewElementList){
		var output = ""
		
		for (viewElement : viewElementList){
			switch viewElement {
				// for each event
				
				// OnSelect
				ListImpl: output += new eifml.generator.views.OnSelectEventGenerator().generateCode(viewElement)
				
				// OnSubmitEvent
				FormImpl: output += new eifml.generator.views.OnSubmitEventGenerator().generateCode(viewElement)
				
				// ViewElementEvent
				//DetailsImpl: output += new DetailsGenerator().generateTemplate(viewElement)
				default: output += ""
			}
		}
		return output
	}
}
