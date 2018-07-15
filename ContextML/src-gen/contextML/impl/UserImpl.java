/**
 */
package contextML.impl;

import contextML.Age;
import contextML.ColorBlind;
import contextML.ContextMLPackage;
import contextML.User;

import contextML.UserRole;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>User</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link contextML.impl.UserImpl#getRole <em>Role</em>}</li>
 *   <li>{@link contextML.impl.UserImpl#getId <em>Id</em>}</li>
 *   <li>{@link contextML.impl.UserImpl#getColorBlind <em>Color Blind</em>}</li>
 *   <li>{@link contextML.impl.UserImpl#getAge <em>Age</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UserImpl extends EntityImpl implements User {
	/**
	 * The cached value of the '{@link #getRole() <em>Role</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole()
	 * @generated
	 * @ordered
	 */
	protected UserRole role;
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;
	/**
	 * The cached value of the '{@link #getColorBlind() <em>Color Blind</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColorBlind()
	 * @generated
	 * @ordered
	 */
	protected ColorBlind colorBlind;
	/**
	 * The cached value of the '{@link #getAge() <em>Age</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAge()
	 * @generated
	 * @ordered
	 */
	protected Age age;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UserImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ContextMLPackage.Literals.USER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserRole getRole() {
		return role;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRole(UserRole newRole, NotificationChain msgs) {
		UserRole oldRole = role;
		role = newRole;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ContextMLPackage.USER__ROLE,
					oldRole, newRole);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRole(UserRole newRole) {
		if (newRole != role) {
			NotificationChain msgs = null;
			if (role != null)
				msgs = ((InternalEObject) role).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - ContextMLPackage.USER__ROLE, null, msgs);
			if (newRole != null)
				msgs = ((InternalEObject) newRole).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - ContextMLPackage.USER__ROLE, null, msgs);
			msgs = basicSetRole(newRole, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContextMLPackage.USER__ROLE, newRole, newRole));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContextMLPackage.USER__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ColorBlind getColorBlind() {
		return colorBlind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetColorBlind(ColorBlind newColorBlind, NotificationChain msgs) {
		ColorBlind oldColorBlind = colorBlind;
		colorBlind = newColorBlind;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ContextMLPackage.USER__COLOR_BLIND, oldColorBlind, newColorBlind);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColorBlind(ColorBlind newColorBlind) {
		if (newColorBlind != colorBlind) {
			NotificationChain msgs = null;
			if (colorBlind != null)
				msgs = ((InternalEObject) colorBlind).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - ContextMLPackage.USER__COLOR_BLIND, null, msgs);
			if (newColorBlind != null)
				msgs = ((InternalEObject) newColorBlind).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - ContextMLPackage.USER__COLOR_BLIND, null, msgs);
			msgs = basicSetColorBlind(newColorBlind, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContextMLPackage.USER__COLOR_BLIND, newColorBlind,
					newColorBlind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Age getAge() {
		return age;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAge(Age newAge, NotificationChain msgs) {
		Age oldAge = age;
		age = newAge;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ContextMLPackage.USER__AGE,
					oldAge, newAge);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAge(Age newAge) {
		if (newAge != age) {
			NotificationChain msgs = null;
			if (age != null)
				msgs = ((InternalEObject) age).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ContextMLPackage.USER__AGE,
						null, msgs);
			if (newAge != null)
				msgs = ((InternalEObject) newAge).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ContextMLPackage.USER__AGE,
						null, msgs);
			msgs = basicSetAge(newAge, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContextMLPackage.USER__AGE, newAge, newAge));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ContextMLPackage.USER__ROLE:
			return basicSetRole(null, msgs);
		case ContextMLPackage.USER__COLOR_BLIND:
			return basicSetColorBlind(null, msgs);
		case ContextMLPackage.USER__AGE:
			return basicSetAge(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ContextMLPackage.USER__ROLE:
			return getRole();
		case ContextMLPackage.USER__ID:
			return getId();
		case ContextMLPackage.USER__COLOR_BLIND:
			return getColorBlind();
		case ContextMLPackage.USER__AGE:
			return getAge();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case ContextMLPackage.USER__ROLE:
			setRole((UserRole) newValue);
			return;
		case ContextMLPackage.USER__ID:
			setId((String) newValue);
			return;
		case ContextMLPackage.USER__COLOR_BLIND:
			setColorBlind((ColorBlind) newValue);
			return;
		case ContextMLPackage.USER__AGE:
			setAge((Age) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case ContextMLPackage.USER__ROLE:
			setRole((UserRole) null);
			return;
		case ContextMLPackage.USER__ID:
			setId(ID_EDEFAULT);
			return;
		case ContextMLPackage.USER__COLOR_BLIND:
			setColorBlind((ColorBlind) null);
			return;
		case ContextMLPackage.USER__AGE:
			setAge((Age) null);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case ContextMLPackage.USER__ROLE:
			return role != null;
		case ContextMLPackage.USER__ID:
			return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
		case ContextMLPackage.USER__COLOR_BLIND:
			return colorBlind != null;
		case ContextMLPackage.USER__AGE:
			return age != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //UserImpl
