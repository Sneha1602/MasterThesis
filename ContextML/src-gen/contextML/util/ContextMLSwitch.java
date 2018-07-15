/**
 */
package contextML.util;

import contextML.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see contextML.ContextMLPackage
 * @generated
 */
public class ContextMLSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ContextMLPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContextMLSwitch() {
		if (modelPackage == null) {
			modelPackage = ContextMLPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case ContextMLPackage.CONTEXT: {
			Context context = (Context) theEObject;
			T result = caseContext(context);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ContextMLPackage.AGE: {
			Age age = (Age) theEObject;
			T result = caseAge(age);
			if (result == null)
				result = caseProperty(age);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ContextMLPackage.ENTITY: {
			Entity entity = (Entity) theEObject;
			T result = caseEntity(entity);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ContextMLPackage.PROVIDER: {
			Provider provider = (Provider) theEObject;
			T result = caseProvider(provider);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ContextMLPackage.USER: {
			User user = (User) theEObject;
			T result = caseUser(user);
			if (result == null)
				result = caseEntity(user);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ContextMLPackage.PLATFORM: {
			Platform platform = (Platform) theEObject;
			T result = casePlatform(platform);
			if (result == null)
				result = caseEntity(platform);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ContextMLPackage.ENVIRONMENT: {
			Environment environment = (Environment) theEObject;
			T result = caseEnvironment(environment);
			if (result == null)
				result = caseEntity(environment);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ContextMLPackage.USER_ROLE: {
			UserRole userRole = (UserRole) theEObject;
			T result = caseUserRole(userRole);
			if (result == null)
				result = caseProperty(userRole);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ContextMLPackage.ADMIN: {
			Admin admin = (Admin) theEObject;
			T result = caseAdmin(admin);
			if (result == null)
				result = caseUserRole(admin);
			if (result == null)
				result = caseProperty(admin);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ContextMLPackage.STUDENT: {
			Student student = (Student) theEObject;
			T result = caseStudent(student);
			if (result == null)
				result = caseUserRole(student);
			if (result == null)
				result = caseProperty(student);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ContextMLPackage.PROPERTY: {
			Property property = (Property) theEObject;
			T result = caseProperty(property);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ContextMLPackage.COLOR_BLIND: {
			ColorBlind colorBlind = (ColorBlind) theEObject;
			T result = caseColorBlind(colorBlind);
			if (result == null)
				result = caseProperty(colorBlind);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ContextMLPackage.USER_IS_NOT_COLOR_BLIND: {
			UserIsNotColorBlind userIsNotColorBlind = (UserIsNotColorBlind) theEObject;
			T result = caseUserIsNotColorBlind(userIsNotColorBlind);
			if (result == null)
				result = caseColorBlind(userIsNotColorBlind);
			if (result == null)
				result = caseProperty(userIsNotColorBlind);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ContextMLPackage.USER_IS_COLOR_BLIND: {
			UserIsColorBlind userIsColorBlind = (UserIsColorBlind) theEObject;
			T result = caseUserIsColorBlind(userIsColorBlind);
			if (result == null)
				result = caseColorBlind(userIsColorBlind);
			if (result == null)
				result = caseProperty(userIsColorBlind);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ContextMLPackage.USER_IS_YOUNG: {
			UserIsYoung userIsYoung = (UserIsYoung) theEObject;
			T result = caseUserIsYoung(userIsYoung);
			if (result == null)
				result = caseAge(userIsYoung);
			if (result == null)
				result = caseProperty(userIsYoung);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ContextMLPackage.USER_IS_OLD: {
			UserIsOld userIsOld = (UserIsOld) theEObject;
			T result = caseUserIsOld(userIsOld);
			if (result == null)
				result = caseAge(userIsOld);
			if (result == null)
				result = caseProperty(userIsOld);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ContextMLPackage.DEVICE_TYPE: {
			DeviceType deviceType = (DeviceType) theEObject;
			T result = caseDeviceType(deviceType);
			if (result == null)
				result = caseProperty(deviceType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ContextMLPackage.MOBILE: {
			Mobile mobile = (Mobile) theEObject;
			T result = caseMobile(mobile);
			if (result == null)
				result = caseDeviceType(mobile);
			if (result == null)
				result = caseProperty(mobile);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ContextMLPackage.DESKTOP: {
			Desktop desktop = (Desktop) theEObject;
			T result = caseDesktop(desktop);
			if (result == null)
				result = caseDeviceType(desktop);
			if (result == null)
				result = caseProperty(desktop);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ContextMLPackage.LANGUAGE: {
			Language language = (Language) theEObject;
			T result = caseLanguage(language);
			if (result == null)
				result = caseProperty(language);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ContextMLPackage.GERMAN: {
			German german = (German) theEObject;
			T result = caseGerman(german);
			if (result == null)
				result = caseLanguage(german);
			if (result == null)
				result = caseProperty(german);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ContextMLPackage.ENGLISH: {
			English english = (English) theEObject;
			T result = caseEnglish(english);
			if (result == null)
				result = caseLanguage(english);
			if (result == null)
				result = caseProperty(english);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ContextMLPackage.MOVEMENT: {
			Movement movement = (Movement) theEObject;
			T result = caseMovement(movement);
			if (result == null)
				result = caseProperty(movement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ContextMLPackage.HIGH_MOVEMENT: {
			HighMovement highMovement = (HighMovement) theEObject;
			T result = caseHighMovement(highMovement);
			if (result == null)
				result = caseMovement(highMovement);
			if (result == null)
				result = caseProperty(highMovement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ContextMLPackage.LOW_MOVEMENT: {
			LowMovement lowMovement = (LowMovement) theEObject;
			T result = caseLowMovement(lowMovement);
			if (result == null)
				result = caseMovement(lowMovement);
			if (result == null)
				result = caseProperty(lowMovement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Context</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Context</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContext(Context object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntity(Entity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Provider</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Provider</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProvider(Provider object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>User</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>User</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUser(User object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Platform</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Platform</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlatform(Platform object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Environment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Environment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnvironment(Environment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Age</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Age</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAge(Age object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>User Role</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>User Role</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUserRole(UserRole object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Color Blind</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Color Blind</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseColorBlind(ColorBlind object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Device Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Device Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeviceType(DeviceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mobile</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mobile</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMobile(Mobile object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Desktop</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Desktop</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDesktop(Desktop object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Language</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Language</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLanguage(Language object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>German</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>German</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGerman(German object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>English</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>English</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnglish(English object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Movement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Movement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMovement(Movement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>High Movement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>High Movement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHighMovement(HighMovement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Low Movement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Low Movement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLowMovement(LowMovement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>User Is Young</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>User Is Young</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUserIsYoung(UserIsYoung object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>User Is Old</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>User Is Old</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUserIsOld(UserIsOld object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Admin</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Admin</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAdmin(Admin object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Student</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Student</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStudent(Student object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProperty(Property object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>User Is Color Blind</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>User Is Color Blind</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUserIsColorBlind(UserIsColorBlind object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>User Is Not Color Blind</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>User Is Not Color Blind</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUserIsNotColorBlind(UserIsNotColorBlind object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //ContextMLSwitch
