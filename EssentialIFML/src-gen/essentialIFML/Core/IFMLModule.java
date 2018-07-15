/**
 */
package essentialIFML.Core;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IFML Module</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link essentialIFML.Core.IFMLModule#getModuleDefinition <em>Module Definition</em>}</li>
 *   <li>{@link essentialIFML.Core.IFMLModule#getPorts <em>Ports</em>}</li>
 * </ul>
 *
 * @see essentialIFML.Core.CorePackage#getIFMLModule()
 * @model
 * @generated
 */
public interface IFMLModule extends NamedElement, InteractionFlowElement {
	/**
	 * Returns the value of the '<em><b>Module Definition</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link essentialIFML.Core.ModuleDefinition#getModules <em>Modules</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Module Definition</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Module Definition</em>' reference.
	 * @see #setModuleDefinition(ModuleDefinition)
	 * @see essentialIFML.Core.CorePackage#getIFMLModule_ModuleDefinition()
	 * @see essentialIFML.Core.ModuleDefinition#getModules
	 * @model opposite="modules" required="true" ordered="false"
	 * @generated
	 */
	ModuleDefinition getModuleDefinition();

	/**
	 * Sets the value of the '{@link essentialIFML.Core.IFMLModule#getModuleDefinition <em>Module Definition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Module Definition</em>' reference.
	 * @see #getModuleDefinition()
	 * @generated
	 */
	void setModuleDefinition(ModuleDefinition value);

	/**
	 * Returns the value of the '<em><b>Ports</b></em>' reference list.
	 * The list contents are of type {@link essentialIFML.Core.IFMLPort}.
	 * It is bidirectional and its opposite is '{@link essentialIFML.Core.IFMLPort#getModule <em>Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ports</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ports</em>' reference list.
	 * @see essentialIFML.Core.CorePackage#getIFMLModule_Ports()
	 * @see essentialIFML.Core.IFMLPort#getModule
	 * @model opposite="module" ordered="false"
	 * @generated
	 */
	EList<IFMLPort> getPorts();

} // IFMLModule
