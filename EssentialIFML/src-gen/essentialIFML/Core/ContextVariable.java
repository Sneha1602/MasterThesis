/**
 */
package essentialIFML.Core;

import essentialIFML.DataTypes.ContextVariableScope;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Context Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link essentialIFML.Core.ContextVariable#getContext <em>Context</em>}</li>
 *   <li>{@link essentialIFML.Core.ContextVariable#getScope <em>Scope</em>}</li>
 * </ul>
 *
 * @see essentialIFML.Core.CorePackage#getContextVariable()
 * @model
 * @generated
 */
public interface ContextVariable extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Context</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link essentialIFML.Core.Context#getContextVariables <em>Context Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Context</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context</em>' container reference.
	 * @see #setContext(Context)
	 * @see essentialIFML.Core.CorePackage#getContextVariable_Context()
	 * @see essentialIFML.Core.Context#getContextVariables
	 * @model opposite="contextVariables" required="true" transient="false" ordered="false"
	 * @generated
	 */
	Context getContext();

	/**
	 * Sets the value of the '{@link essentialIFML.Core.ContextVariable#getContext <em>Context</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Context</em>' container reference.
	 * @see #getContext()
	 * @generated
	 */
	void setContext(Context value);

	/**
	 * Returns the value of the '<em><b>Scope</b></em>' attribute.
	 * The literals are from the enumeration {@link essentialIFML.DataTypes.ContextVariableScope}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scope</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scope</em>' attribute.
	 * @see essentialIFML.DataTypes.ContextVariableScope
	 * @see #setScope(ContextVariableScope)
	 * @see essentialIFML.Core.CorePackage#getContextVariable_Scope()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	ContextVariableScope getScope();

	/**
	 * Sets the value of the '{@link essentialIFML.Core.ContextVariable#getScope <em>Scope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scope</em>' attribute.
	 * @see essentialIFML.DataTypes.ContextVariableScope
	 * @see #getScope()
	 * @generated
	 */
	void setScope(ContextVariableScope value);

} // ContextVariable
