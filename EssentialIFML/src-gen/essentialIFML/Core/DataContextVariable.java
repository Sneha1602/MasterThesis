/**
 */
package essentialIFML.Core;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Context Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link essentialIFML.Core.DataContextVariable#getDataBinding <em>Data Binding</em>}</li>
 * </ul>
 *
 * @see essentialIFML.Core.CorePackage#getDataContextVariable()
 * @model
 * @generated
 */
public interface DataContextVariable extends ContextVariable {
	/**
	 * Returns the value of the '<em><b>Data Binding</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link essentialIFML.Core.DataBinding#getDataContextVariables <em>Data Context Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Binding</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Binding</em>' reference.
	 * @see #setDataBinding(DataBinding)
	 * @see essentialIFML.Core.CorePackage#getDataContextVariable_DataBinding()
	 * @see essentialIFML.Core.DataBinding#getDataContextVariables
	 * @model opposite="dataContextVariables" required="true" ordered="false"
	 * @generated
	 */
	DataBinding getDataBinding();

	/**
	 * Sets the value of the '{@link essentialIFML.Core.DataContextVariable#getDataBinding <em>Data Binding</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Binding</em>' reference.
	 * @see #getDataBinding()
	 * @generated
	 */
	void setDataBinding(DataBinding value);

} // DataContextVariable
