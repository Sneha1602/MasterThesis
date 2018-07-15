/**
 */
package contextML;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>User</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link contextML.User#getRole <em>Role</em>}</li>
 *   <li>{@link contextML.User#getId <em>Id</em>}</li>
 *   <li>{@link contextML.User#getColorBlind <em>Color Blind</em>}</li>
 *   <li>{@link contextML.User#getAge <em>Age</em>}</li>
 * </ul>
 *
 * @see contextML.ContextMLPackage#getUser()
 * @model
 * @generated
 */
public interface User extends Entity {

	/**
	 * Returns the value of the '<em><b>Role</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role</em>' containment reference.
	 * @see #setRole(UserRole)
	 * @see contextML.ContextMLPackage#getUser_Role()
	 * @model containment="true" required="true"
	 * @generated
	 */
	UserRole getRole();

	/**
	 * Sets the value of the '{@link contextML.User#getRole <em>Role</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role</em>' containment reference.
	 * @see #getRole()
	 * @generated
	 */
	void setRole(UserRole value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see contextML.ContextMLPackage#getUser_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link contextML.User#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Color Blind</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Color Blind</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Color Blind</em>' containment reference.
	 * @see #setColorBlind(ColorBlind)
	 * @see contextML.ContextMLPackage#getUser_ColorBlind()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ColorBlind getColorBlind();

	/**
	 * Sets the value of the '{@link contextML.User#getColorBlind <em>Color Blind</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Color Blind</em>' containment reference.
	 * @see #getColorBlind()
	 * @generated
	 */
	void setColorBlind(ColorBlind value);

	/**
	 * Returns the value of the '<em><b>Age</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Age</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Age</em>' containment reference.
	 * @see #setAge(Age)
	 * @see contextML.ContextMLPackage#getUser_Age()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Age getAge();

	/**
	 * Sets the value of the '{@link contextML.User#getAge <em>Age</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Age</em>' containment reference.
	 * @see #getAge()
	 * @generated
	 */
	void setAge(Age value);
} // User
