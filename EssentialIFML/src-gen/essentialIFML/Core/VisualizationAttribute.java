/**
 */
package essentialIFML.Core;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Visualization Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link essentialIFML.Core.VisualizationAttribute#getFeatureConcept <em>Feature Concept</em>}</li>
 * </ul>
 *
 * @see essentialIFML.Core.CorePackage#getVisualizationAttribute()
 * @model
 * @generated
 */
public interface VisualizationAttribute extends ViewComponentPart {
	/**
	 * Returns the value of the '<em><b>Feature Concept</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Feature Concept</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature Concept</em>' reference.
	 * @see #setFeatureConcept(FeatureConcept)
	 * @see essentialIFML.Core.CorePackage#getVisualizationAttribute_FeatureConcept()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	FeatureConcept getFeatureConcept();

	/**
	 * Sets the value of the '{@link essentialIFML.Core.VisualizationAttribute#getFeatureConcept <em>Feature Concept</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feature Concept</em>' reference.
	 * @see #getFeatureConcept()
	 * @generated
	 */
	void setFeatureConcept(FeatureConcept value);

} // VisualizationAttribute
