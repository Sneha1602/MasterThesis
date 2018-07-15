package eifml.generator.views

import java.util.List
import essentialIFML.Core.ViewElement
import essentialIFML.Extensions.impl.ListImpl
import essentialIFML.Extensions.impl.FormImpl
import essentialIFML.Extensions.impl.DetailsImpl

public class ViewElementGenerator {
	
	protected def String generateCode(List<ViewElement> viewElementList){
		var output = "" 
		
		for (viewElement : viewElementList){
			switch viewElement {
				ListImpl: output += new eifml.generator.views.ListGenerator().generateTemplate(viewElement)
				FormImpl: output += new eifml.generator.views.FormGenerator().generateTemplate(viewElement)
				DetailsImpl: output += new eifml.generator.views.DetailsGenerator().generateTemplate(viewElement)
				default: output += ""
			}
		}
		return output
	}
}
