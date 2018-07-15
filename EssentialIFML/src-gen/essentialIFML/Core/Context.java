/**
 */
package essentialIFML.Core;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Context</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link essentialIFML.Core.Context#getContextDimensions <em>Context Dimensions</em>}</li>
 *   <li>{@link essentialIFML.Core.Context#getContextVariables <em>Context Variables</em>}</li>
 * </ul>
 *
 * @see essentialIFML.Core.CorePackage#getContext()
 * @model
 * @generated
 */
public interface Context extends Element {
	/**
	 * Returns the value of the '<em><b>Context Dimensions</b></em>' containment reference list.
	 * The list contents are of type {@link essentialIFML.Core.ContextDimension}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Context Dimensions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context Dimensions</em>' containment reference list.
	 * @see essentialIFML.Core.CorePackage#getContext_ContextDimensions()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<ContextDimension> getContextDimensions();

	/**
	 * Returns the value of the '<em><b>Context Variables</b></em>' containment reference list.
	 * The list contents are of type {@link essentialIFML.Core.ContextVariable}.
	 * It is bidirectional and its opposite is '{@link essentialIFML.Core.ContextVariable#getContext <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Context Variables</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context Variables</em>' containment reference list.
	 * @see essentialIFML.Core.CorePackage#getContext_ContextVariables()
	 * @see essentialIFML.Core.ContextVariable#getContext
	 * @model opposite="context" containment="true" ordered="false"
	 * @generated
	 */
	EList<ContextVariable> getContextVariables();

} // Context
