/**
 */
package essentialIFML.Core;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Port Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link essentialIFML.Core.PortDefinition#getPorts <em>Ports</em>}</li>
 * </ul>
 *
 * @see essentialIFML.Core.CorePackage#getPortDefinition()
 * @model
 * @generated
 */
public interface PortDefinition extends InteractionFlowElement {
	/**
	 * Returns the value of the '<em><b>Ports</b></em>' reference list.
	 * The list contents are of type {@link essentialIFML.Core.IFMLPort}.
	 * It is bidirectional and its opposite is '{@link essentialIFML.Core.IFMLPort#getPortDefinition <em>Port Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ports</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ports</em>' reference list.
	 * @see essentialIFML.Core.CorePackage#getPortDefinition_Ports()
	 * @see essentialIFML.Core.IFMLPort#getPortDefinition
	 * @model opposite="portDefinition" ordered="false"
	 * @generated
	 */
	EList<IFMLPort> getPorts();

} // PortDefinition
