/**
 */
package contextML.impl;

import contextML.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ContextMLFactoryImpl extends EFactoryImpl implements ContextMLFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ContextMLFactory init() {
		try {
			ContextMLFactory theContextMLFactory = (ContextMLFactory) EPackage.Registry.INSTANCE
					.getEFactory(ContextMLPackage.eNS_URI);
			if (theContextMLFactory != null) {
				return theContextMLFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ContextMLFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContextMLFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case ContextMLPackage.CONTEXT:
			return createContext();
		case ContextMLPackage.AGE:
			return createAge();
		case ContextMLPackage.PROVIDER:
			return createProvider();
		case ContextMLPackage.USER:
			return createUser();
		case ContextMLPackage.PLATFORM:
			return createPlatform();
		case ContextMLPackage.ENVIRONMENT:
			return createEnvironment();
		case ContextMLPackage.USER_ROLE:
			return createUserRole();
		case ContextMLPackage.ADMIN:
			return createAdmin();
		case ContextMLPackage.STUDENT:
			return createStudent();
		case ContextMLPackage.COLOR_BLIND:
			return createColorBlind();
		case ContextMLPackage.USER_IS_NOT_COLOR_BLIND:
			return createUserIsNotColorBlind();
		case ContextMLPackage.USER_IS_COLOR_BLIND:
			return createUserIsColorBlind();
		case ContextMLPackage.USER_IS_YOUNG:
			return createUserIsYoung();
		case ContextMLPackage.USER_IS_OLD:
			return createUserIsOld();
		case ContextMLPackage.DEVICE_TYPE:
			return createDeviceType();
		case ContextMLPackage.MOBILE:
			return createMobile();
		case ContextMLPackage.DESKTOP:
			return createDesktop();
		case ContextMLPackage.LANGUAGE:
			return createLanguage();
		case ContextMLPackage.GERMAN:
			return createGerman();
		case ContextMLPackage.ENGLISH:
			return createEnglish();
		case ContextMLPackage.MOVEMENT:
			return createMovement();
		case ContextMLPackage.HIGH_MOVEMENT:
			return createHighMovement();
		case ContextMLPackage.LOW_MOVEMENT:
			return createLowMovement();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Context createContext() {
		ContextImpl context = new ContextImpl();
		return context;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Provider createProvider() {
		ProviderImpl provider = new ProviderImpl();
		return provider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public User createUser() {
		UserImpl user = new UserImpl();
		return user;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Platform createPlatform() {
		PlatformImpl platform = new PlatformImpl();
		return platform;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Environment createEnvironment() {
		EnvironmentImpl environment = new EnvironmentImpl();
		return environment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Age createAge() {
		AgeImpl age = new AgeImpl();
		return age;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserRole createUserRole() {
		UserRoleImpl userRole = new UserRoleImpl();
		return userRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ColorBlind createColorBlind() {
		ColorBlindImpl colorBlind = new ColorBlindImpl();
		return colorBlind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceType createDeviceType() {
		DeviceTypeImpl deviceType = new DeviceTypeImpl();
		return deviceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Mobile createMobile() {
		MobileImpl mobile = new MobileImpl();
		return mobile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Desktop createDesktop() {
		DesktopImpl desktop = new DesktopImpl();
		return desktop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Language createLanguage() {
		LanguageImpl language = new LanguageImpl();
		return language;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public German createGerman() {
		GermanImpl german = new GermanImpl();
		return german;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public English createEnglish() {
		EnglishImpl english = new EnglishImpl();
		return english;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Movement createMovement() {
		MovementImpl movement = new MovementImpl();
		return movement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HighMovement createHighMovement() {
		HighMovementImpl highMovement = new HighMovementImpl();
		return highMovement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LowMovement createLowMovement() {
		LowMovementImpl lowMovement = new LowMovementImpl();
		return lowMovement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserIsYoung createUserIsYoung() {
		UserIsYoungImpl userIsYoung = new UserIsYoungImpl();
		return userIsYoung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserIsOld createUserIsOld() {
		UserIsOldImpl userIsOld = new UserIsOldImpl();
		return userIsOld;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Admin createAdmin() {
		AdminImpl admin = new AdminImpl();
		return admin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Student createStudent() {
		StudentImpl student = new StudentImpl();
		return student;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserIsColorBlind createUserIsColorBlind() {
		UserIsColorBlindImpl userIsColorBlind = new UserIsColorBlindImpl();
		return userIsColorBlind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserIsNotColorBlind createUserIsNotColorBlind() {
		UserIsNotColorBlindImpl userIsNotColorBlind = new UserIsNotColorBlindImpl();
		return userIsNotColorBlind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContextMLPackage getContextMLPackage() {
		return (ContextMLPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ContextMLPackage getPackage() {
		return ContextMLPackage.eINSTANCE;
	}

} //ContextMLFactoryImpl
