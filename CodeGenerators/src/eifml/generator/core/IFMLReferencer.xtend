package eifml.generator.core

import essentialIFML.Core.IFMLAction
import essentialIFML.Core.IFMLModel
import essentialIFML.Core.IFMLParameter
import essentialIFML.Core.InteractionFlowElement
import essentialIFML.Core.NamedElement
import essentialIFML.Core.ViewComponent
import essentialIFML.Core.ViewComponentPart
import essentialIFML.Core.ViewContainer
import essentialIFML.Core.ViewElementEvent
import java.util.ArrayList
import org.w3c.dom.Document

class IFMLReferencer {
	
	Iterable<InteractionFlowElement> interactionFlowElements
	Iterable<IFMLAction> actions
	Iterable<ViewContainer> viewContainers
	Iterable<ViewComponent> viewComponents
	Iterable<IFMLParameter> parameters
	var viewComponentParts =  new ArrayList<ViewComponentPart> 
	var viewElementEvents = new ArrayList<ViewElementEvent>
	var namedElements = new ArrayList<NamedElement>
	
	//Identify names in adaptation model and replace them with IDs from IFML model
	def Document insertIDReference(Document contextML, IFMLModel ifmlModel){
		
		//Iterate over rules and actions of adaptation model and find add- and deleteInteractionObjectOperations
		var adapt = contextML.firstChild.firstChild.nextSibling
		var rule = adapt.firstChild.nextSibling.firstChild
		while(rule !== null){
			var actions = rule.firstChild.nextSibling
			var action = actions.firstChild
			while(action !== null){
				if(action.attributes.getNamedItem("interactionObject") != null){
					var interObj = action.attributes.getNamedItem("interactionObject").getNodeValue
					//ID of Interaction Object is identified from ifml model
					var elementID = getIFMLID(interObj, ifmlModel)
					//New ID is inserted
					action.attributes.getNamedItem("interactionObject").nodeValue = elementID
					println(interObj + " was replaced by " + elementID)
				}
				action = action.nextSibling
			}
			rule = rule.nextSibling	
		}
		return contextML
	}
	
	//Return the related ID to the interaction object from the IFML Model
	def String getIFMLID(String elementName, IFMLModel ifmlModel){
		
		// Extract model elements
		interactionFlowElements = ifmlModel.interactionFlowModel.interactionFlowModelElements.filter(typeof(InteractionFlowElement));	
		parameters = interactionFlowElements.map[e | e.parameters].flatten
		actions = interactionFlowElements.filter(typeof(IFMLAction))
		viewContainers = interactionFlowElements.filter(typeof(ViewContainer))	
		viewComponents = viewContainers.map[e | e.viewElements.filter(typeof(ViewComponent))].flatten;
		viewComponentParts.addAll(viewComponents.map[e | e.viewComponentParts].flatten)
		viewComponentParts.addAll(viewComponentParts.map[e | e.subViewComponentParts].flatten)
		viewElementEvents.addAll(viewContainers.map[e | e.viewElementEvents].flatten)
		viewElementEvents.addAll(viewContainers.map[e | e.viewElements.map[i | i.viewElementEvents].flatten].flatten);
		
		for(i: interactionFlowElements){
			if(i.name.compareTo(elementName) == 0){
				return i.id
			}
		}
		
		for(i: actions){
			if(i.name.compareTo(elementName) == 0){
				return i.id
			}
		}
		
		for(i: viewContainers){
			if(i.name.compareTo(elementName) == 0){
				return i.id
			}
		}
		
		for(i: viewComponents){
			if(i.name.compareTo(elementName) == 0){
				return i.id
			}
		}
		
		for(i: viewComponentParts){
			if(i.name.compareTo(elementName) == 0){
				return i.id
			}
		}
		
		for(i: viewElementEvents){
			if(i.name.compareTo(elementName) == 0){
				return i.id
			}
		}
		println("No fitting ID of an interaction object was found in IFML model to be inserted in adaptation model. Please check your reference.")
		return elementName
	}
}

