/**
 */
package essentialIFML.Core;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link essentialIFML.Core.Event#getActivationExpression <em>Activation Expression</em>}</li>
 *   <li>{@link essentialIFML.Core.Event#getInteractionFlowExpression <em>Interaction Flow Expression</em>}</li>
 * </ul>
 *
 * @see essentialIFML.Core.CorePackage#getEvent()
 * @model
 * @generated
 */
public interface Event extends InteractionFlowElement {
	/**
	 * Returns the value of the '<em><b>Activation Expression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activation Expression</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activation Expression</em>' reference.
	 * @see #setActivationExpression(ActivationExpression)
	 * @see essentialIFML.Core.CorePackage#getEvent_ActivationExpression()
	 * @model ordered="false"
	 * @generated
	 */
	ActivationExpression getActivationExpression();

	/**
	 * Sets the value of the '{@link essentialIFML.Core.Event#getActivationExpression <em>Activation Expression</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Activation Expression</em>' reference.
	 * @see #getActivationExpression()
	 * @generated
	 */
	void setActivationExpression(ActivationExpression value);

	/**
	 * Returns the value of the '<em><b>Interaction Flow Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interaction Flow Expression</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interaction Flow Expression</em>' containment reference.
	 * @see #setInteractionFlowExpression(InteractionFlowExpression)
	 * @see essentialIFML.Core.CorePackage#getEvent_InteractionFlowExpression()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	InteractionFlowExpression getInteractionFlowExpression();

	/**
	 * Sets the value of the '{@link essentialIFML.Core.Event#getInteractionFlowExpression <em>Interaction Flow Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interaction Flow Expression</em>' containment reference.
	 * @see #getInteractionFlowExpression()
	 * @generated
	 */
	void setInteractionFlowExpression(InteractionFlowExpression value);

} // Event
