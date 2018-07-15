/**
 */
package essentialIFML.Core;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>View Element Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link essentialIFML.Core.ViewElementEvent#getViewElement <em>View Element</em>}</li>
 * </ul>
 *
 * @see essentialIFML.Core.CorePackage#getViewElementEvent()
 * @model
 * @generated
 */
public interface ViewElementEvent extends CatchingEvent {
	/**
	 * Returns the value of the '<em><b>View Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>View Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>View Element</em>' reference.
	 * @see #setViewElement(ViewElement)
	 * @see essentialIFML.Core.CorePackage#getViewElementEvent_ViewElement()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	ViewElement getViewElement();

	/**
	 * Sets the value of the '{@link essentialIFML.Core.ViewElementEvent#getViewElement <em>View Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>View Element</em>' reference.
	 * @see #getViewElement()
	 * @generated
	 */
	void setViewElement(ViewElement value);

} // ViewElementEvent
