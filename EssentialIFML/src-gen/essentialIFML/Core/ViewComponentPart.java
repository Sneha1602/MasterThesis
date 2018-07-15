/**
 */
package essentialIFML.Core;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>View Component Part</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link essentialIFML.Core.ViewComponentPart#getViewElementEvents <em>View Element Events</em>}</li>
 *   <li>{@link essentialIFML.Core.ViewComponentPart#getActivationExpression <em>Activation Expression</em>}</li>
 *   <li>{@link essentialIFML.Core.ViewComponentPart#getParentViewComponentPart <em>Parent View Component Part</em>}</li>
 *   <li>{@link essentialIFML.Core.ViewComponentPart#getSubViewComponentParts <em>Sub View Component Parts</em>}</li>
 * </ul>
 *
 * @see essentialIFML.Core.CorePackage#getViewComponentPart()
 * @model
 * @generated
 */
public interface ViewComponentPart extends InteractionFlowElement {
	/**
	 * Returns the value of the '<em><b>View Element Events</b></em>' containment reference list.
	 * The list contents are of type {@link essentialIFML.Core.ViewElementEvent}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>View Element Events</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>View Element Events</em>' containment reference list.
	 * @see essentialIFML.Core.CorePackage#getViewComponentPart_ViewElementEvents()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<ViewElementEvent> getViewElementEvents();

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
	 * @see essentialIFML.Core.CorePackage#getViewComponentPart_ActivationExpression()
	 * @model ordered="false"
	 * @generated
	 */
	ActivationExpression getActivationExpression();

	/**
	 * Sets the value of the '{@link essentialIFML.Core.ViewComponentPart#getActivationExpression <em>Activation Expression</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Activation Expression</em>' reference.
	 * @see #getActivationExpression()
	 * @generated
	 */
	void setActivationExpression(ActivationExpression value);

	/**
	 * Returns the value of the '<em><b>Parent View Component Part</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link essentialIFML.Core.ViewComponentPart#getSubViewComponentParts <em>Sub View Component Parts</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent View Component Part</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent View Component Part</em>' container reference.
	 * @see #setParentViewComponentPart(ViewComponentPart)
	 * @see essentialIFML.Core.CorePackage#getViewComponentPart_ParentViewComponentPart()
	 * @see essentialIFML.Core.ViewComponentPart#getSubViewComponentParts
	 * @model opposite="subViewComponentParts" transient="false" ordered="false"
	 * @generated
	 */
	ViewComponentPart getParentViewComponentPart();

	/**
	 * Sets the value of the '{@link essentialIFML.Core.ViewComponentPart#getParentViewComponentPart <em>Parent View Component Part</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent View Component Part</em>' container reference.
	 * @see #getParentViewComponentPart()
	 * @generated
	 */
	void setParentViewComponentPart(ViewComponentPart value);

	/**
	 * Returns the value of the '<em><b>Sub View Component Parts</b></em>' containment reference list.
	 * The list contents are of type {@link essentialIFML.Core.ViewComponentPart}.
	 * It is bidirectional and its opposite is '{@link essentialIFML.Core.ViewComponentPart#getParentViewComponentPart <em>Parent View Component Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub View Component Parts</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub View Component Parts</em>' containment reference list.
	 * @see essentialIFML.Core.CorePackage#getViewComponentPart_SubViewComponentParts()
	 * @see essentialIFML.Core.ViewComponentPart#getParentViewComponentPart
	 * @model opposite="parentViewComponentPart" containment="true" ordered="false"
	 * @generated
	 */
	EList<ViewComponentPart> getSubViewComponentParts();

} // ViewComponentPart
