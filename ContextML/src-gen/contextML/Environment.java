/**
 */
package contextML;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Environment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link contextML.Environment#getMovementLevel <em>Movement Level</em>}</li>
 * </ul>
 *
 * @see contextML.ContextMLPackage#getEnvironment()
 * @model
 * @generated
 */
public interface Environment extends Entity {

	/**
	 * Returns the value of the '<em><b>Movement Level</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Movement Level</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Movement Level</em>' containment reference.
	 * @see #setMovementLevel(Movement)
	 * @see contextML.ContextMLPackage#getEnvironment_MovementLevel()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Movement getMovementLevel();

	/**
	 * Sets the value of the '{@link contextML.Environment#getMovementLevel <em>Movement Level</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Movement Level</em>' containment reference.
	 * @see #getMovementLevel()
	 * @generated
	 */
	void setMovementLevel(Movement value);
} // Environment
