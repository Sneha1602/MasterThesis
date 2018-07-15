/**
 */
package contextML.impl;

import contextML.ContextMLPackage;
import contextML.Environment;

import contextML.Movement;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Environment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link contextML.impl.EnvironmentImpl#getMovementLevel <em>Movement Level</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EnvironmentImpl extends EntityImpl implements Environment {
	/**
	 * The cached value of the '{@link #getMovementLevel() <em>Movement Level</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMovementLevel()
	 * @generated
	 * @ordered
	 */
	protected Movement movementLevel;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnvironmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ContextMLPackage.Literals.ENVIRONMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Movement getMovementLevel() {
		return movementLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMovementLevel(Movement newMovementLevel, NotificationChain msgs) {
		Movement oldMovementLevel = movementLevel;
		movementLevel = newMovementLevel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ContextMLPackage.ENVIRONMENT__MOVEMENT_LEVEL, oldMovementLevel, newMovementLevel);
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
	public void setMovementLevel(Movement newMovementLevel) {
		if (newMovementLevel != movementLevel) {
			NotificationChain msgs = null;
			if (movementLevel != null)
				msgs = ((InternalEObject) movementLevel).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - ContextMLPackage.ENVIRONMENT__MOVEMENT_LEVEL, null, msgs);
			if (newMovementLevel != null)
				msgs = ((InternalEObject) newMovementLevel).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - ContextMLPackage.ENVIRONMENT__MOVEMENT_LEVEL, null, msgs);
			msgs = basicSetMovementLevel(newMovementLevel, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContextMLPackage.ENVIRONMENT__MOVEMENT_LEVEL,
					newMovementLevel, newMovementLevel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ContextMLPackage.ENVIRONMENT__MOVEMENT_LEVEL:
			return basicSetMovementLevel(null, msgs);
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
		case ContextMLPackage.ENVIRONMENT__MOVEMENT_LEVEL:
			return getMovementLevel();
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
		case ContextMLPackage.ENVIRONMENT__MOVEMENT_LEVEL:
			setMovementLevel((Movement) newValue);
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
		case ContextMLPackage.ENVIRONMENT__MOVEMENT_LEVEL:
			setMovementLevel((Movement) null);
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
		case ContextMLPackage.ENVIRONMENT__MOVEMENT_LEVEL:
			return movementLevel != null;
		}
		return super.eIsSet(featureID);
	}

} //EnvironmentImpl
