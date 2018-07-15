/**
 */
package essentialIFML.Core;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Binding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link essentialIFML.Core.DataBinding#getConditionalExpression <em>Conditional Expression</em>}</li>
 *   <li>{@link essentialIFML.Core.DataBinding#getVisualizationAttribute <em>Visualization Attribute</em>}</li>
 *   <li>{@link essentialIFML.Core.DataBinding#getDataContextVariables <em>Data Context Variables</em>}</li>
 *   <li>{@link essentialIFML.Core.DataBinding#getDomainConcept <em>Domain Concept</em>}</li>
 * </ul>
 *
 * @see essentialIFML.Core.CorePackage#getDataBinding()
 * @model
 * @generated
 */
public interface DataBinding extends ContentBinding {
	/**
	 * Returns the value of the '<em><b>Conditional Expression</b></em>' containment reference list.
	 * The list contents are of type {@link essentialIFML.Core.ConditionalExpression}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Conditional Expression</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conditional Expression</em>' containment reference list.
	 * @see essentialIFML.Core.CorePackage#getDataBinding_ConditionalExpression()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<ConditionalExpression> getConditionalExpression();

	/**
	 * Returns the value of the '<em><b>Visualization Attribute</b></em>' containment reference list.
	 * The list contents are of type {@link essentialIFML.Core.VisualizationAttribute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Visualization Attribute</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Visualization Attribute</em>' containment reference list.
	 * @see essentialIFML.Core.CorePackage#getDataBinding_VisualizationAttribute()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<VisualizationAttribute> getVisualizationAttribute();

	/**
	 * Returns the value of the '<em><b>Data Context Variables</b></em>' reference list.
	 * The list contents are of type {@link essentialIFML.Core.DataContextVariable}.
	 * It is bidirectional and its opposite is '{@link essentialIFML.Core.DataContextVariable#getDataBinding <em>Data Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Context Variables</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Context Variables</em>' reference list.
	 * @see essentialIFML.Core.CorePackage#getDataBinding_DataContextVariables()
	 * @see essentialIFML.Core.DataContextVariable#getDataBinding
	 * @model opposite="dataBinding" ordered="false"
	 * @generated
	 */
	EList<DataContextVariable> getDataContextVariables();

	/**
	 * Returns the value of the '<em><b>Domain Concept</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link essentialIFML.Core.DomainConcept#getDataBinding <em>Data Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Domain Concept</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain Concept</em>' reference.
	 * @see #setDomainConcept(DomainConcept)
	 * @see essentialIFML.Core.CorePackage#getDataBinding_DomainConcept()
	 * @see essentialIFML.Core.DomainConcept#getDataBinding
	 * @model opposite="dataBinding" ordered="false"
	 * @generated
	 */
	DomainConcept getDomainConcept();

	/**
	 * Sets the value of the '{@link essentialIFML.Core.DataBinding#getDomainConcept <em>Domain Concept</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domain Concept</em>' reference.
	 * @see #getDomainConcept()
	 * @generated
	 */
	void setDomainConcept(DomainConcept value);

} // DataBinding
