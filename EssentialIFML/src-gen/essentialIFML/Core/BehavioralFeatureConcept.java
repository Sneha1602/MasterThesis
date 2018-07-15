/**
 */
package essentialIFML.Core;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Behavioral Feature Concept</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link essentialIFML.Core.BehavioralFeatureConcept#getDynamicBehavior <em>Dynamic Behavior</em>}</li>
 * </ul>
 *
 * @see essentialIFML.Core.CorePackage#getBehavioralFeatureConcept()
 * @model
 * @generated
 */
public interface BehavioralFeatureConcept extends DomainElement {
	/**
	 * Returns the value of the '<em><b>Dynamic Behavior</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link essentialIFML.Core.DynamicBehavior#getBehavioralFeatureConcept <em>Behavioral Feature Concept</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dynamic Behavior</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dynamic Behavior</em>' reference.
	 * @see #setDynamicBehavior(DynamicBehavior)
	 * @see essentialIFML.Core.CorePackage#getBehavioralFeatureConcept_DynamicBehavior()
	 * @see essentialIFML.Core.DynamicBehavior#getBehavioralFeatureConcept
	 * @model opposite="behavioralFeatureConcept" required="true" ordered="false"
	 * @generated
	 */
	DynamicBehavior getDynamicBehavior();

	/**
	 * Sets the value of the '{@link essentialIFML.Core.BehavioralFeatureConcept#getDynamicBehavior <em>Dynamic Behavior</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dynamic Behavior</em>' reference.
	 * @see #getDynamicBehavior()
	 * @generated
	 */
	void setDynamicBehavior(DynamicBehavior value);

} // BehavioralFeatureConcept
