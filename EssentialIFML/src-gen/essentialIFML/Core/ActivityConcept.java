/**
 */
package essentialIFML.Core;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activity Concept</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link essentialIFML.Core.ActivityConcept#getModuleDefinition <em>Module Definition</em>}</li>
 * </ul>
 *
 * @see essentialIFML.Core.CorePackage#getActivityConcept()
 * @model
 * @generated
 */
public interface ActivityConcept extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Module Definition</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link essentialIFML.Core.ModuleDefinition#getActivityConcept <em>Activity Concept</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Module Definition</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Module Definition</em>' reference.
	 * @see #setModuleDefinition(ModuleDefinition)
	 * @see essentialIFML.Core.CorePackage#getActivityConcept_ModuleDefinition()
	 * @see essentialIFML.Core.ModuleDefinition#getActivityConcept
	 * @model opposite="activityConcept" required="true" ordered="false"
	 * @generated
	 */
	ModuleDefinition getModuleDefinition();

	/**
	 * Sets the value of the '{@link essentialIFML.Core.ActivityConcept#getModuleDefinition <em>Module Definition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Module Definition</em>' reference.
	 * @see #getModuleDefinition()
	 * @generated
	 */
	void setModuleDefinition(ModuleDefinition value);

} // ActivityConcept
