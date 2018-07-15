package eifml.generator.utils

import essentialIFML.Core.IFMLParameter
import essentialIFML.Core.ParameterBindingGroup
import essentialIFML.Core.ViewElement
import essentialIFML.Extensions.List
import essentialIFML.Extensions.Form
import essentialIFML.Extensions.Details
import essentialIFML.Extensions.IFMLWindow
import essentialIFML.Extensions.IFMLMenu
import essentialIFML.Core.ViewElementEvent
import essentialIFML.Extensions.OnLoadEvent
import essentialIFML.Extensions.OnSelectEvent
import essentialIFML.Extensions.OnSubmitEvent

class GeneratorHelpers {

	static def String toMethodSignature(Iterable<IFMLParameter> parameters) {

		var methodSignature = new String

		if (!parameters.isNullOrEmpty) {

			var firstParam = parameters.head();
			methodSignature += '''With«firstParam.name.toFirstUpper»:(«firstParam.type.name» *)«firstParam.name» '''
			methodSignature +=
				parameters.tail().map[param|'''«param.name»:(«param.type.name» *)«param.name»'''].join(" ")
		}

		return methodSignature.trim
	}

	static def String toMethodInvocation(ParameterBindingGroup paramBindingGroup) {

		var parameterList = "";

		if (!paramBindingGroup.parameterBindings.isNullOrEmpty) {

			var sParam = paramBindingGroup.parameterBindings.head().sourceParameter;
			var tParam = paramBindingGroup.parameterBindings.head().targetParameter;

			parameterList += '''With«tParam.name.toFirstUpper»:[self getValueForParamWithName:@"«sParam.name»"]''';

			for (pBinding : paramBindingGroup.parameterBindings.tail()) {
				sParam = pBinding.sourceParameter;
				tParam = pBinding.targetParameter;
				parameterList += ''' «tParam.name»:[self getValueForParamWithName:@"«sParam.name»"]''';
			}
		}
		return parameterList;
	}

	static def String methodSignatureForViewElementEvent(ViewElementEvent event, ViewElement source) {

		switch event {
			OnSelectEvent: {
				'''- (void)didSelect«source.name.toFirstUpper»ItemAtIndex:(NSUInteger)index'''
			}
			OnSubmitEvent: {
				'''- (void)didSubmit«source.name.toFirstUpper»'''
			}
			OnLoadEvent: {
				/* 
				 * Empty signature.
				 * The handlers of these events are embedded within the presenter's viewDidLoad method
				 */
			}
			default: {
				'''- (void)didTapOn«event.name.toFirstUpper»'''
			}
		}
	}

	static def String methodSignatureForViewElement(ViewElement vElem) {

		switch vElem {
			List: {

				'''- (void)«GeneratorHelpers::methodNameForViewElement(vElem)»:(NSArray *)items'''
			}
			Form: {

				'''- (void)«GeneratorHelpers::methodNameForViewElement(vElem)»:(NSArray *)fields'''
			}
			Details: {

				'''- (void)«GeneratorHelpers::methodNameForViewElement(vElem)»:(NSArray *)values'''
			}
		}
	}

	static def String methodNameForViewElement(ViewElement vElem) {

		switch vElem {
			List: {
				'''show«vElem.name.toFirstUpper»'''
			}
			Form: {
				'''show«vElem.name.toFirstUpper»'''
			}
			Details: {
				'''show«vElem.name.toFirstUpper»'''
			}
		}

	}

	static def String ifmlKitClassForViewElement(ViewElement vElem) {

		switch vElem {
			IFMLWindow: {
				"IFMLWindow"
			}
			IFMLMenu: {
				"IFMLMenu"
			}
			List: {
				"IFMLList"
			}
			Form: {
				"IFMLForm"
			}
			Details: {
				"IFMLDetails"
			}
		}
	}

	static def String ifmlKitNameForViewElementEvent(ViewElementEvent event) {

		switch event {
			OnLoadEvent: {
				"IFMLViewElementEventTypeOnSubmit"
			}
			OnSelectEvent: {
				"IFMLViewElementEventTypeOnSelect"
			}
			OnSubmitEvent: {
				"IFMLViewElementEventTypeOnSubmit"
			}
			default: {
				"IFMLViewElementEventTypeDefault"
			}
		}
	}

	static def String ifmlKitNameForFormFieldType(String formFieldTypeName) {

		switch formFieldTypeName {
			case "NSString": {
				"IFMLFormFieldTypeString"
			}
			case "NSNumber": {
				"IFMLFormFieldTypeNumber"
			}
			case "NSDate": {
				"IFMLFormFieldTypeDate"
			}
			case "Bool": {
				"IFMLFormFieldTypeBoolean"
			}
		}

	}

}
