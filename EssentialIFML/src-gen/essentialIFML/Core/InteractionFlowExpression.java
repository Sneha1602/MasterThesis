/**
 */
package essentialIFML.Core;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interaction Flow Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link essentialIFML.Core.InteractionFlowExpression#getInteractionFlow <em>Interaction Flow</em>}</li>
 * </ul>
 *
 * @see essentialIFML.Core.CorePackage#getInteractionFlowExpression()
 * @model
 * @generated
 */
public interface InteractionFlowExpression extends Expression {
	/**
	 * Returns the value of the '<em><b>Interaction Flow</b></em>' reference list.
	 * The list contents are of type {@link essentialIFML.Core.InteractionFlow}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interaction Flow</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interaction Flow</em>' reference list.
	 * @see essentialIFML.Core.CorePackage#getInteractionFlowExpression_InteractionFlow()
	 * @model lower="2" ordered="false"
	 * @generated
	 */
	EList<InteractionFlow> getInteractionFlow();

} // InteractionFlowExpression
