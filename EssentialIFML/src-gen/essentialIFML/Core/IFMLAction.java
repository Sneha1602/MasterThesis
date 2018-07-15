/**
 */
package essentialIFML.Core;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IFML Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link essentialIFML.Core.IFMLAction#getActionEvents <em>Action Events</em>}</li>
 *   <li>{@link essentialIFML.Core.IFMLAction#getDynamicBehavior <em>Dynamic Behavior</em>}</li>
 *   <li>{@link essentialIFML.Core.IFMLAction#getViewContainer <em>View Container</em>}</li>
 * </ul>
 *
 * @see essentialIFML.Core.CorePackage#getIFMLAction()
 * @model
 * @generated
 */
public interface IFMLAction extends InteractionFlowElement, NamedElement {
	/**
	 * Returns the value of the '<em><b>Action Events</b></em>' containment reference list.
	 * The list contents are of type {@link essentialIFML.Core.ActionEvent}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Action Events</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action Events</em>' containment reference list.
	 * @see essentialIFML.Core.CorePackage#getIFMLAction_ActionEvents()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<ActionEvent> getActionEvents();

	/**
	 * Returns the value of the '<em><b>Dynamic Behavior</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dynamic Behavior</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dynamic Behavior</em>' reference.
	 * @see #setDynamicBehavior(DynamicBehavior)
	 * @see essentialIFML.Core.CorePackage#getIFMLAction_DynamicBehavior()
	 * @model ordered="false"
	 * @generated
	 */
	DynamicBehavior getDynamicBehavior();

	/**
	 * Sets the value of the '{@link essentialIFML.Core.IFMLAction#getDynamicBehavior <em>Dynamic Behavior</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dynamic Behavior</em>' reference.
	 * @see #getDynamicBehavior()
	 * @generated
	 */
	void setDynamicBehavior(DynamicBehavior value);

	/**
	 * Returns the value of the '<em><b>View Container</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link essentialIFML.Core.ViewContainer#getActions <em>Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>View Container</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>View Container</em>' container reference.
	 * @see #setViewContainer(ViewContainer)
	 * @see essentialIFML.Core.CorePackage#getIFMLAction_ViewContainer()
	 * @see essentialIFML.Core.ViewContainer#getActions
	 * @model opposite="actions" transient="false" ordered="false"
	 * @generated
	 */
	ViewContainer getViewContainer();

	/**
	 * Sets the value of the '{@link essentialIFML.Core.IFMLAction#getViewContainer <em>View Container</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>View Container</em>' container reference.
	 * @see #getViewContainer()
	 * @generated
	 */
	void setViewContainer(ViewContainer value);

} // IFMLAction
