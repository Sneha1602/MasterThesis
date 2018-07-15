/**
 */
package essentialIFML.Core;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interaction Flow Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link essentialIFML.Core.InteractionFlowModel#getInteractionFlowModelElements <em>Interaction Flow Model Elements</em>}</li>
 *   <li>{@link essentialIFML.Core.InteractionFlowModel#getScreenZoom <em>Screen Zoom</em>}</li>
 *   <li>{@link essentialIFML.Core.InteractionFlowModel#getChangeBackgroundColor <em>Change Background Color</em>}</li>
 *   <li>{@link essentialIFML.Core.InteractionFlowModel#getNavBarContainer <em>Nav Bar Container</em>}</li>
 *   <li>{@link essentialIFML.Core.InteractionFlowModel#getSetLanguage <em>Set Language</em>}</li>
 * </ul>
 *
 * @see essentialIFML.Core.CorePackage#getInteractionFlowModel()
 * @model
 * @generated
 */
public interface InteractionFlowModel extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Interaction Flow Model Elements</b></em>' containment reference list.
	 * The list contents are of type {@link essentialIFML.Core.InteractionFlowModelElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interaction Flow Model Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interaction Flow Model Elements</em>' containment reference list.
	 * @see essentialIFML.Core.CorePackage#getInteractionFlowModel_InteractionFlowModelElements()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<InteractionFlowModelElement> getInteractionFlowModelElements();

	/**
	 * Returns the value of the '<em><b>Screen Zoom</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Screen Zoom</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Screen Zoom</em>' containment reference.
	 * @see #setScreenZoom(ScreenZoom)
	 * @see essentialIFML.Core.CorePackage#getInteractionFlowModel_ScreenZoom()
	 * @model containment="true"
	 * @generated
	 */
	ScreenZoom getScreenZoom();

	/**
	 * Sets the value of the '{@link essentialIFML.Core.InteractionFlowModel#getScreenZoom <em>Screen Zoom</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Screen Zoom</em>' containment reference.
	 * @see #getScreenZoom()
	 * @generated
	 */
	void setScreenZoom(ScreenZoom value);

	/**
	 * Returns the value of the '<em><b>Change Background Color</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Change Background Color</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Change Background Color</em>' containment reference.
	 * @see #setChangeBackgroundColor(LightBackgroundColor)
	 * @see essentialIFML.Core.CorePackage#getInteractionFlowModel_ChangeBackgroundColor()
	 * @model containment="true"
	 * @generated
	 */
	LightBackgroundColor getChangeBackgroundColor();

	/**
	 * Sets the value of the '{@link essentialIFML.Core.InteractionFlowModel#getChangeBackgroundColor <em>Change Background Color</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Change Background Color</em>' containment reference.
	 * @see #getChangeBackgroundColor()
	 * @generated
	 */
	void setChangeBackgroundColor(LightBackgroundColor value);

	/**
	 * Returns the value of the '<em><b>Nav Bar Container</b></em>' containment reference list.
	 * The list contents are of type {@link essentialIFML.Core.ViewContainer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nav Bar Container</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nav Bar Container</em>' containment reference list.
	 * @see essentialIFML.Core.CorePackage#getInteractionFlowModel_NavBarContainer()
	 * @model containment="true"
	 * @generated
	 */
	EList<ViewContainer> getNavBarContainer();

	/**
	 * Returns the value of the '<em><b>Set Language</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Set Language</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Set Language</em>' containment reference.
	 * @see #setSetLanguage(Language)
	 * @see essentialIFML.Core.CorePackage#getInteractionFlowModel_SetLanguage()
	 * @model containment="true"
	 * @generated
	 */
	Language getSetLanguage();

	/**
	 * Sets the value of the '{@link essentialIFML.Core.InteractionFlowModel#getSetLanguage <em>Set Language</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Set Language</em>' containment reference.
	 * @see #getSetLanguage()
	 * @generated
	 */
	void setSetLanguage(Language value);

} // InteractionFlowModel
