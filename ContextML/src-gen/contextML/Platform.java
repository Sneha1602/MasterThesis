/**
 */
package contextML;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Platform</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link contextML.Platform#getDevice <em>Device</em>}</li>
 *   <li>{@link contextML.Platform#getLang <em>Lang</em>}</li>
 * </ul>
 *
 * @see contextML.ContextMLPackage#getPlatform()
 * @model
 * @generated
 */
public interface Platform extends Entity {

	/**
	 * Returns the value of the '<em><b>Device</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Device</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Device</em>' containment reference.
	 * @see #setDevice(DeviceType)
	 * @see contextML.ContextMLPackage#getPlatform_Device()
	 * @model containment="true" required="true"
	 * @generated
	 */
	DeviceType getDevice();

	/**
	 * Sets the value of the '{@link contextML.Platform#getDevice <em>Device</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Device</em>' containment reference.
	 * @see #getDevice()
	 * @generated
	 */
	void setDevice(DeviceType value);

	/**
	 * Returns the value of the '<em><b>Lang</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lang</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lang</em>' containment reference.
	 * @see #setLang(Language)
	 * @see contextML.ContextMLPackage#getPlatform_Lang()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Language getLang();

	/**
	 * Sets the value of the '{@link contextML.Platform#getLang <em>Lang</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lang</em>' containment reference.
	 * @see #getLang()
	 * @generated
	 */
	void setLang(Language value);
} // Platform
