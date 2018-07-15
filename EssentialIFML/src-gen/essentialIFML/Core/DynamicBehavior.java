/**
 */
package essentialIFML.Core;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dynamic Behavior</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link essentialIFML.Core.DynamicBehavior#getBehavioralFeatureConcept <em>Behavioral Feature Concept</em>}</li>
 *   <li>{@link essentialIFML.Core.DynamicBehavior#getBehaviorConcept <em>Behavior Concept</em>}</li>
 * </ul>
 *
 * @see essentialIFML.Core.CorePackage#getDynamicBehavior()
 * @model
 * @generated
 */
public interface DynamicBehavior extends ContentBinding {
	/**
	 * Returns the value of the '<em><b>Behavioral Feature Concept</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link essentialIFML.Core.BehavioralFeatureConcept#getDynamicBehavior <em>Dynamic Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Behavioral Feature Concept</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Behavioral Feature Concept</em>' reference.
	 * @see #setBehavioralFeatureConcept(BehavioralFeatureConcept)
	 * @see essentialIFML.Core.CorePackage#getDynamicBehavior_BehavioralFeatureConcept()
	 * @see essentialIFML.Core.BehavioralFeatureConcept#getDynamicBehavior
	 * @model opposite="dynamicBehavior" ordered="false"
	 * @generated
	 */
	BehavioralFeatureConcept getBehavioralFeatureConcept();

	/**
	 * Sets the value of the '{@link essentialIFML.Core.DynamicBehavior#getBehavioralFeatureConcept <em>Behavioral Feature Concept</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Behavioral Feature Concept</em>' reference.
	 * @see #getBehavioralFeatureConcept()
	 * @generated
	 */
	void setBehavioralFeatureConcept(BehavioralFeatureConcept value);

	/**
	 * Returns the value of the '<em><b>Behavior Concept</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link essentialIFML.Core.BehaviorConcept#getDynamicBehavior <em>Dynamic Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Behavior Concept</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Behavior Concept</em>' reference.
	 * @see #setBehaviorConcept(BehaviorConcept)
	 * @see essentialIFML.Core.CorePackage#getDynamicBehavior_BehaviorConcept()
	 * @see essentialIFML.Core.BehaviorConcept#getDynamicBehavior
	 * @model opposite="dynamicBehavior" ordered="false"
	 * @generated
	 */
	BehaviorConcept getBehaviorConcept();

	/**
	 * Sets the value of the '{@link essentialIFML.Core.DynamicBehavior#getBehaviorConcept <em>Behavior Concept</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Behavior Concept</em>' reference.
	 * @see #getBehaviorConcept()
	 * @generated
	 */
	void setBehaviorConcept(BehaviorConcept value);

} // DynamicBehavior
