/**
 */
package essentialIFML.Core;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interaction Flow Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link essentialIFML.Core.InteractionFlowElement#getParameters <em>Parameters</em>}</li>
 *   <li>{@link essentialIFML.Core.InteractionFlowElement#getOutInteractionFlows <em>Out Interaction Flows</em>}</li>
 *   <li>{@link essentialIFML.Core.InteractionFlowElement#getInInteractionFlows <em>In Interaction Flows</em>}</li>
 * </ul>
 *
 * @see essentialIFML.Core.CorePackage#getInteractionFlowElement()
 * @model abstract="true"
 * @generated
 */
public interface InteractionFlowElement extends NamedElement, InteractionFlowModelElement {
	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link essentialIFML.Core.IFMLParameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see essentialIFML.Core.CorePackage#getInteractionFlowElement_Parameters()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<IFMLParameter> getParameters();

	/**
	 * Returns the value of the '<em><b>Out Interaction Flows</b></em>' containment reference list.
	 * The list contents are of type {@link essentialIFML.Core.InteractionFlow}.
	 * It is bidirectional and its opposite is '{@link essentialIFML.Core.InteractionFlow#getSourceInteractionFlowElement <em>Source Interaction Flow Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Out Interaction Flows</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Out Interaction Flows</em>' containment reference list.
	 * @see essentialIFML.Core.CorePackage#getInteractionFlowElement_OutInteractionFlows()
	 * @see essentialIFML.Core.InteractionFlow#getSourceInteractionFlowElement
	 * @model opposite="sourceInteractionFlowElement" containment="true" ordered="false"
	 * @generated
	 */
	EList<InteractionFlow> getOutInteractionFlows();

	/**
	 * Returns the value of the '<em><b>In Interaction Flows</b></em>' reference list.
	 * The list contents are of type {@link essentialIFML.Core.InteractionFlow}.
	 * It is bidirectional and its opposite is '{@link essentialIFML.Core.InteractionFlow#getTargetInteractionFlowElement <em>Target Interaction Flow Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>In Interaction Flows</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In Interaction Flows</em>' reference list.
	 * @see essentialIFML.Core.CorePackage#getInteractionFlowElement_InInteractionFlows()
	 * @see essentialIFML.Core.InteractionFlow#getTargetInteractionFlowElement
	 * @model opposite="targetInteractionFlowElement" ordered="false"
	 * @generated
	 */
	EList<InteractionFlow> getInInteractionFlows();

} // InteractionFlowElement
