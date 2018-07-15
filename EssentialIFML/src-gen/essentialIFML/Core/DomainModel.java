/**
 */
package essentialIFML.Core;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Domain Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link essentialIFML.Core.DomainModel#getDomainElements <em>Domain Elements</em>}</li>
 * </ul>
 *
 * @see essentialIFML.Core.CorePackage#getDomainModel()
 * @model
 * @generated
 */
public interface DomainModel extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Domain Elements</b></em>' containment reference list.
	 * The list contents are of type {@link essentialIFML.Core.DomainElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Domain Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain Elements</em>' containment reference list.
	 * @see essentialIFML.Core.CorePackage#getDomainModel_DomainElements()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<DomainElement> getDomainElements();

} // DomainModel
