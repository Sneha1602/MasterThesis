/**
 */
package contextML.impl;

import contextML.ContextMLPackage;
import contextML.DeviceType;
import contextML.Language;
import contextML.Platform;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Platform</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link contextML.impl.PlatformImpl#getDevice <em>Device</em>}</li>
 *   <li>{@link contextML.impl.PlatformImpl#getLang <em>Lang</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PlatformImpl extends EntityImpl implements Platform {
	/**
	 * The cached value of the '{@link #getDevice() <em>Device</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDevice()
	 * @generated
	 * @ordered
	 */
	protected DeviceType device;
	/**
	 * The cached value of the '{@link #getLang() <em>Lang</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLang()
	 * @generated
	 * @ordered
	 */
	protected Language lang;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlatformImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ContextMLPackage.Literals.PLATFORM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceType getDevice() {
		return device;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDevice(DeviceType newDevice, NotificationChain msgs) {
		DeviceType oldDevice = device;
		device = newDevice;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ContextMLPackage.PLATFORM__DEVICE, oldDevice, newDevice);
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
	public void setDevice(DeviceType newDevice) {
		if (newDevice != device) {
			NotificationChain msgs = null;
			if (device != null)
				msgs = ((InternalEObject) device).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - ContextMLPackage.PLATFORM__DEVICE, null, msgs);
			if (newDevice != null)
				msgs = ((InternalEObject) newDevice).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - ContextMLPackage.PLATFORM__DEVICE, null, msgs);
			msgs = basicSetDevice(newDevice, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContextMLPackage.PLATFORM__DEVICE, newDevice,
					newDevice));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Language getLang() {
		return lang;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLang(Language newLang, NotificationChain msgs) {
		Language oldLang = lang;
		lang = newLang;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ContextMLPackage.PLATFORM__LANG, oldLang, newLang);
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
	public void setLang(Language newLang) {
		if (newLang != lang) {
			NotificationChain msgs = null;
			if (lang != null)
				msgs = ((InternalEObject) lang).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - ContextMLPackage.PLATFORM__LANG, null, msgs);
			if (newLang != null)
				msgs = ((InternalEObject) newLang).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - ContextMLPackage.PLATFORM__LANG, null, msgs);
			msgs = basicSetLang(newLang, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContextMLPackage.PLATFORM__LANG, newLang, newLang));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ContextMLPackage.PLATFORM__DEVICE:
			return basicSetDevice(null, msgs);
		case ContextMLPackage.PLATFORM__LANG:
			return basicSetLang(null, msgs);
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
		case ContextMLPackage.PLATFORM__DEVICE:
			return getDevice();
		case ContextMLPackage.PLATFORM__LANG:
			return getLang();
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
		case ContextMLPackage.PLATFORM__DEVICE:
			setDevice((DeviceType) newValue);
			return;
		case ContextMLPackage.PLATFORM__LANG:
			setLang((Language) newValue);
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
		case ContextMLPackage.PLATFORM__DEVICE:
			setDevice((DeviceType) null);
			return;
		case ContextMLPackage.PLATFORM__LANG:
			setLang((Language) null);
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
		case ContextMLPackage.PLATFORM__DEVICE:
			return device != null;
		case ContextMLPackage.PLATFORM__LANG:
			return lang != null;
		}
		return super.eIsSet(featureID);
	}

} //PlatformImpl
