/**
 */
package essentialIFML.Core;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>View Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link essentialIFML.Core.ViewContainer#isIsLandmark <em>Is Landmark</em>}</li>
 *   <li>{@link essentialIFML.Core.ViewContainer#isIsDefault <em>Is Default</em>}</li>
 *   <li>{@link essentialIFML.Core.ViewContainer#isIsXOR <em>Is XOR</em>}</li>
 *   <li>{@link essentialIFML.Core.ViewContainer#getViewElements <em>View Elements</em>}</li>
 *   <li>{@link essentialIFML.Core.ViewContainer#getActions <em>Actions</em>}</li>
 * </ul>
 *
 * @see essentialIFML.Core.CorePackage#getViewContainer()
 * @model
 * @generated
 */
public interface ViewContainer extends ViewElement {
	/**
	 * Returns the value of the '<em><b>Is Landmark</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Landmark</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Landmark</em>' attribute.
	 * @see #setIsLandmark(boolean)
	 * @see essentialIFML.Core.CorePackage#getViewContainer_IsLandmark()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	boolean isIsLandmark();

	/**
	 * Sets the value of the '{@link essentialIFML.Core.ViewContainer#isIsLandmark <em>Is Landmark</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Landmark</em>' attribute.
	 * @see #isIsLandmark()
	 * @generated
	 */
	void setIsLandmark(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Default</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Default</em>' attribute.
	 * @see #setIsDefault(boolean)
	 * @see essentialIFML.Core.CorePackage#getViewContainer_IsDefault()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	boolean isIsDefault();

	/**
	 * Sets the value of the '{@link essentialIFML.Core.ViewContainer#isIsDefault <em>Is Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Default</em>' attribute.
	 * @see #isIsDefault()
	 * @generated
	 */
	void setIsDefault(boolean value);

	/**
	 * Returns the value of the '<em><b>Is XOR</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is XOR</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is XOR</em>' attribute.
	 * @see #setIsXOR(boolean)
	 * @see essentialIFML.Core.CorePackage#getViewContainer_IsXOR()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	boolean isIsXOR();

	/**
	 * Sets the value of the '{@link essentialIFML.Core.ViewContainer#isIsXOR <em>Is XOR</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is XOR</em>' attribute.
	 * @see #isIsXOR()
	 * @generated
	 */
	void setIsXOR(boolean value);

	/**
	 * Returns the value of the '<em><b>View Elements</b></em>' containment reference list.
	 * The list contents are of type {@link essentialIFML.Core.ViewElement}.
	 * It is bidirectional and its opposite is '{@link essentialIFML.Core.ViewElement#getViewContainer <em>View Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>View Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>View Elements</em>' containment reference list.
	 * @see essentialIFML.Core.CorePackage#getViewContainer_ViewElements()
	 * @see essentialIFML.Core.ViewElement#getViewContainer
	 * @model opposite="viewContainer" containment="true" ordered="false"
	 * @generated
	 */
	EList<ViewElement> getViewElements();

	/**
	 * Returns the value of the '<em><b>Actions</b></em>' containment reference list.
	 * The list contents are of type {@link essentialIFML.Core.IFMLAction}.
	 * It is bidirectional and its opposite is '{@link essentialIFML.Core.IFMLAction#getViewContainer <em>View Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actions</em>' containment reference list.
	 * @see essentialIFML.Core.CorePackage#getViewContainer_Actions()
	 * @see essentialIFML.Core.IFMLAction#getViewContainer
	 * @model opposite="viewContainer" containment="true" ordered="false"
	 * @generated
	 */
	EList<IFMLAction> getActions();

} // ViewContainer
