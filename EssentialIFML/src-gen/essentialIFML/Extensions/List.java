/**
 */
package essentialIFML.Extensions;

import essentialIFML.Core.ViewComponent;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link essentialIFML.Extensions.List#getSelectEvent <em>Select Event</em>}</li>
 * </ul>
 *
 * @see essentialIFML.Extensions.ExtensionsPackage#getList()
 * @model
 * @generated
 */
public interface List extends ViewComponent {
	/**
	 * Returns the value of the '<em><b>Select Event</b></em>' containment reference list.
	 * The list contents are of type {@link essentialIFML.Extensions.OnSelectEvent}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Select Event</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Select Event</em>' containment reference list.
	 * @see essentialIFML.Extensions.ExtensionsPackage#getList_SelectEvent()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<OnSelectEvent> getSelectEvent();

} // List
