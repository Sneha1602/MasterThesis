/**
 */
package contextML;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see contextML.ContextMLFactory
 * @model kind="package"
 * @generated
 */
public interface ContextMLPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "contextML";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "platform:/resource/ContextML/model/contextML.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "contextML";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ContextMLPackage eINSTANCE = contextML.impl.ContextMLPackageImpl.init();

	/**
	 * The meta object id for the '{@link contextML.impl.ContextImpl <em>Context</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see contextML.impl.ContextImpl
	 * @see contextML.impl.ContextMLPackageImpl#getContext()
	 * @generated
	 */
	int CONTEXT = 0;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT__ENTITY = 0;

	/**
	 * The feature id for the '<em><b>Provider</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT__PROVIDER = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT__NAME = 2;

	/**
	 * The number of structural features of the '<em>Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link contextML.impl.PropertyImpl <em>Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see contextML.impl.PropertyImpl
	 * @see contextML.impl.ContextMLPackageImpl#getProperty()
	 * @generated
	 */
	int PROPERTY = 10;

	/**
	 * The feature id for the '<em><b>Provider</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__PROVIDER = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__TYPE = 1;

	/**
	 * The number of structural features of the '<em>Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link contextML.impl.EntityImpl <em>Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see contextML.impl.EntityImpl
	 * @see contextML.impl.ContextMLPackageImpl#getEntity()
	 * @generated
	 */
	int ENTITY = 2;

	/**
	 * The meta object id for the '{@link contextML.impl.ProviderImpl <em>Provider</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see contextML.impl.ProviderImpl
	 * @see contextML.impl.ContextMLPackageImpl#getProvider()
	 * @generated
	 */
	int PROVIDER = 3;

	/**
	 * The meta object id for the '{@link contextML.impl.UserImpl <em>User</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see contextML.impl.UserImpl
	 * @see contextML.impl.ContextMLPackageImpl#getUser()
	 * @generated
	 */
	int USER = 4;

	/**
	 * The meta object id for the '{@link contextML.impl.PlatformImpl <em>Platform</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see contextML.impl.PlatformImpl
	 * @see contextML.impl.ContextMLPackageImpl#getPlatform()
	 * @generated
	 */
	int PLATFORM = 5;

	/**
	 * The meta object id for the '{@link contextML.impl.EnvironmentImpl <em>Environment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see contextML.impl.EnvironmentImpl
	 * @see contextML.impl.ContextMLPackageImpl#getEnvironment()
	 * @generated
	 */
	int ENVIRONMENT = 6;

	/**
	 * The meta object id for the '{@link contextML.impl.AgeImpl <em>Age</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see contextML.impl.AgeImpl
	 * @see contextML.impl.ContextMLPackageImpl#getAge()
	 * @generated
	 */
	int AGE = 1;

	/**
	 * The feature id for the '<em><b>Provider</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGE__PROVIDER = PROPERTY__PROVIDER;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGE__TYPE = PROPERTY__TYPE;

	/**
	 * The number of structural features of the '<em>Age</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGE_FEATURE_COUNT = PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Age</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGE_OPERATION_COUNT = PROPERTY_OPERATION_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDER__ID = 0;

	/**
	 * The number of structural features of the '<em>Provider</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDER_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Provider</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDER_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Role</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__ROLE = ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__ID = ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Color Blind</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__COLOR_BLIND = ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Age</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__AGE = ENTITY_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_FEATURE_COUNT = ENTITY_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_OPERATION_COUNT = ENTITY_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Device</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM__DEVICE = ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Lang</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM__LANG = ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Platform</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_FEATURE_COUNT = ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Platform</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_OPERATION_COUNT = ENTITY_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Movement Level</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT__MOVEMENT_LEVEL = ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Environment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_FEATURE_COUNT = ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Environment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_OPERATION_COUNT = ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link contextML.impl.UserRoleImpl <em>User Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see contextML.impl.UserRoleImpl
	 * @see contextML.impl.ContextMLPackageImpl#getUserRole()
	 * @generated
	 */
	int USER_ROLE = 7;

	/**
	 * The feature id for the '<em><b>Provider</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_ROLE__PROVIDER = PROPERTY__PROVIDER;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_ROLE__TYPE = PROPERTY__TYPE;

	/**
	 * The number of structural features of the '<em>User Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_ROLE_FEATURE_COUNT = PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>User Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_ROLE_OPERATION_COUNT = PROPERTY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link contextML.impl.ColorBlindImpl <em>Color Blind</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see contextML.impl.ColorBlindImpl
	 * @see contextML.impl.ContextMLPackageImpl#getColorBlind()
	 * @generated
	 */
	int COLOR_BLIND = 11;

	/**
	 * The meta object id for the '{@link contextML.impl.DeviceTypeImpl <em>Device Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see contextML.impl.DeviceTypeImpl
	 * @see contextML.impl.ContextMLPackageImpl#getDeviceType()
	 * @generated
	 */
	int DEVICE_TYPE = 16;

	/**
	 * The meta object id for the '{@link contextML.impl.MobileImpl <em>Mobile</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see contextML.impl.MobileImpl
	 * @see contextML.impl.ContextMLPackageImpl#getMobile()
	 * @generated
	 */
	int MOBILE = 17;

	/**
	 * The meta object id for the '{@link contextML.impl.DesktopImpl <em>Desktop</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see contextML.impl.DesktopImpl
	 * @see contextML.impl.ContextMLPackageImpl#getDesktop()
	 * @generated
	 */
	int DESKTOP = 18;

	/**
	 * The meta object id for the '{@link contextML.impl.LanguageImpl <em>Language</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see contextML.impl.LanguageImpl
	 * @see contextML.impl.ContextMLPackageImpl#getLanguage()
	 * @generated
	 */
	int LANGUAGE = 19;

	/**
	 * The meta object id for the '{@link contextML.impl.GermanImpl <em>German</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see contextML.impl.GermanImpl
	 * @see contextML.impl.ContextMLPackageImpl#getGerman()
	 * @generated
	 */
	int GERMAN = 20;

	/**
	 * The meta object id for the '{@link contextML.impl.EnglishImpl <em>English</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see contextML.impl.EnglishImpl
	 * @see contextML.impl.ContextMLPackageImpl#getEnglish()
	 * @generated
	 */
	int ENGLISH = 21;

	/**
	 * The meta object id for the '{@link contextML.impl.MovementImpl <em>Movement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see contextML.impl.MovementImpl
	 * @see contextML.impl.ContextMLPackageImpl#getMovement()
	 * @generated
	 */
	int MOVEMENT = 22;

	/**
	 * The meta object id for the '{@link contextML.impl.HighMovementImpl <em>High Movement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see contextML.impl.HighMovementImpl
	 * @see contextML.impl.ContextMLPackageImpl#getHighMovement()
	 * @generated
	 */
	int HIGH_MOVEMENT = 23;

	/**
	 * The meta object id for the '{@link contextML.impl.LowMovementImpl <em>Low Movement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see contextML.impl.LowMovementImpl
	 * @see contextML.impl.ContextMLPackageImpl#getLowMovement()
	 * @generated
	 */
	int LOW_MOVEMENT = 24;

	/**
	 * The meta object id for the '{@link contextML.impl.UserIsYoungImpl <em>User Is Young</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see contextML.impl.UserIsYoungImpl
	 * @see contextML.impl.ContextMLPackageImpl#getUserIsYoung()
	 * @generated
	 */
	int USER_IS_YOUNG = 14;

	/**
	 * The meta object id for the '{@link contextML.impl.UserIsOldImpl <em>User Is Old</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see contextML.impl.UserIsOldImpl
	 * @see contextML.impl.ContextMLPackageImpl#getUserIsOld()
	 * @generated
	 */
	int USER_IS_OLD = 15;

	/**
	 * The meta object id for the '{@link contextML.impl.AdminImpl <em>Admin</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see contextML.impl.AdminImpl
	 * @see contextML.impl.ContextMLPackageImpl#getAdmin()
	 * @generated
	 */
	int ADMIN = 8;

	/**
	 * The feature id for the '<em><b>Provider</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN__PROVIDER = USER_ROLE__PROVIDER;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN__TYPE = USER_ROLE__TYPE;

	/**
	 * The number of structural features of the '<em>Admin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN_FEATURE_COUNT = USER_ROLE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Admin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN_OPERATION_COUNT = USER_ROLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link contextML.impl.StudentImpl <em>Student</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see contextML.impl.StudentImpl
	 * @see contextML.impl.ContextMLPackageImpl#getStudent()
	 * @generated
	 */
	int STUDENT = 9;

	/**
	 * The feature id for the '<em><b>Provider</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDENT__PROVIDER = USER_ROLE__PROVIDER;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDENT__TYPE = USER_ROLE__TYPE;

	/**
	 * The number of structural features of the '<em>Student</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDENT_FEATURE_COUNT = USER_ROLE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Student</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDENT_OPERATION_COUNT = USER_ROLE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Provider</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOR_BLIND__PROVIDER = PROPERTY__PROVIDER;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOR_BLIND__TYPE = PROPERTY__TYPE;

	/**
	 * The number of structural features of the '<em>Color Blind</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOR_BLIND_FEATURE_COUNT = PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Color Blind</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOR_BLIND_OPERATION_COUNT = PROPERTY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link contextML.impl.UserIsColorBlindImpl <em>User Is Color Blind</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see contextML.impl.UserIsColorBlindImpl
	 * @see contextML.impl.ContextMLPackageImpl#getUserIsColorBlind()
	 * @generated
	 */
	int USER_IS_COLOR_BLIND = 13;

	/**
	 * The meta object id for the '{@link contextML.impl.UserIsNotColorBlindImpl <em>User Is Not Color Blind</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see contextML.impl.UserIsNotColorBlindImpl
	 * @see contextML.impl.ContextMLPackageImpl#getUserIsNotColorBlind()
	 * @generated
	 */
	int USER_IS_NOT_COLOR_BLIND = 12;

	/**
	 * The feature id for the '<em><b>Provider</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_IS_NOT_COLOR_BLIND__PROVIDER = COLOR_BLIND__PROVIDER;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_IS_NOT_COLOR_BLIND__TYPE = COLOR_BLIND__TYPE;

	/**
	 * The number of structural features of the '<em>User Is Not Color Blind</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_IS_NOT_COLOR_BLIND_FEATURE_COUNT = COLOR_BLIND_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>User Is Not Color Blind</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_IS_NOT_COLOR_BLIND_OPERATION_COUNT = COLOR_BLIND_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Provider</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_IS_COLOR_BLIND__PROVIDER = COLOR_BLIND__PROVIDER;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_IS_COLOR_BLIND__TYPE = COLOR_BLIND__TYPE;

	/**
	 * The number of structural features of the '<em>User Is Color Blind</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_IS_COLOR_BLIND_FEATURE_COUNT = COLOR_BLIND_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>User Is Color Blind</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_IS_COLOR_BLIND_OPERATION_COUNT = COLOR_BLIND_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Provider</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_IS_YOUNG__PROVIDER = AGE__PROVIDER;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_IS_YOUNG__TYPE = AGE__TYPE;

	/**
	 * The number of structural features of the '<em>User Is Young</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_IS_YOUNG_FEATURE_COUNT = AGE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>User Is Young</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_IS_YOUNG_OPERATION_COUNT = AGE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Provider</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_IS_OLD__PROVIDER = AGE__PROVIDER;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_IS_OLD__TYPE = AGE__TYPE;

	/**
	 * The number of structural features of the '<em>User Is Old</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_IS_OLD_FEATURE_COUNT = AGE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>User Is Old</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_IS_OLD_OPERATION_COUNT = AGE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Provider</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_TYPE__PROVIDER = PROPERTY__PROVIDER;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_TYPE__TYPE = PROPERTY__TYPE;

	/**
	 * The number of structural features of the '<em>Device Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_TYPE_FEATURE_COUNT = PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Device Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_TYPE_OPERATION_COUNT = PROPERTY_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Provider</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE__PROVIDER = DEVICE_TYPE__PROVIDER;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE__TYPE = DEVICE_TYPE__TYPE;

	/**
	 * The number of structural features of the '<em>Mobile</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_FEATURE_COUNT = DEVICE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Mobile</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_OPERATION_COUNT = DEVICE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Provider</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESKTOP__PROVIDER = DEVICE_TYPE__PROVIDER;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESKTOP__TYPE = DEVICE_TYPE__TYPE;

	/**
	 * The number of structural features of the '<em>Desktop</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESKTOP_FEATURE_COUNT = DEVICE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Desktop</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESKTOP_OPERATION_COUNT = DEVICE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Provider</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE__PROVIDER = PROPERTY__PROVIDER;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE__TYPE = PROPERTY__TYPE;

	/**
	 * The number of structural features of the '<em>Language</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_FEATURE_COUNT = PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Language</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_OPERATION_COUNT = PROPERTY_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Provider</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GERMAN__PROVIDER = LANGUAGE__PROVIDER;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GERMAN__TYPE = LANGUAGE__TYPE;

	/**
	 * The number of structural features of the '<em>German</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GERMAN_FEATURE_COUNT = LANGUAGE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>German</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GERMAN_OPERATION_COUNT = LANGUAGE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Provider</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENGLISH__PROVIDER = LANGUAGE__PROVIDER;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENGLISH__TYPE = LANGUAGE__TYPE;

	/**
	 * The number of structural features of the '<em>English</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENGLISH_FEATURE_COUNT = LANGUAGE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>English</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENGLISH_OPERATION_COUNT = LANGUAGE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Provider</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVEMENT__PROVIDER = PROPERTY__PROVIDER;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVEMENT__TYPE = PROPERTY__TYPE;

	/**
	 * The number of structural features of the '<em>Movement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVEMENT_FEATURE_COUNT = PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Movement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVEMENT_OPERATION_COUNT = PROPERTY_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Provider</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIGH_MOVEMENT__PROVIDER = MOVEMENT__PROVIDER;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIGH_MOVEMENT__TYPE = MOVEMENT__TYPE;

	/**
	 * The number of structural features of the '<em>High Movement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIGH_MOVEMENT_FEATURE_COUNT = MOVEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>High Movement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIGH_MOVEMENT_OPERATION_COUNT = MOVEMENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Provider</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOW_MOVEMENT__PROVIDER = MOVEMENT__PROVIDER;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOW_MOVEMENT__TYPE = MOVEMENT__TYPE;

	/**
	 * The number of structural features of the '<em>Low Movement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOW_MOVEMENT_FEATURE_COUNT = MOVEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Low Movement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOW_MOVEMENT_OPERATION_COUNT = MOVEMENT_OPERATION_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link contextML.Context <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Context</em>'.
	 * @see contextML.Context
	 * @generated
	 */
	EClass getContext();

	/**
	 * Returns the meta object for the containment reference list '{@link contextML.Context#getEntity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entity</em>'.
	 * @see contextML.Context#getEntity()
	 * @see #getContext()
	 * @generated
	 */
	EReference getContext_Entity();

	/**
	 * Returns the meta object for the containment reference list '{@link contextML.Context#getProvider <em>Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Provider</em>'.
	 * @see contextML.Context#getProvider()
	 * @see #getContext()
	 * @generated
	 */
	EReference getContext_Provider();

	/**
	 * Returns the meta object for the attribute '{@link contextML.Context#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see contextML.Context#getName()
	 * @see #getContext()
	 * @generated
	 */
	EAttribute getContext_Name();

	/**
	 * Returns the meta object for class '{@link contextML.Entity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity</em>'.
	 * @see contextML.Entity
	 * @generated
	 */
	EClass getEntity();

	/**
	 * Returns the meta object for class '{@link contextML.Provider <em>Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Provider</em>'.
	 * @see contextML.Provider
	 * @generated
	 */
	EClass getProvider();

	/**
	 * Returns the meta object for the attribute '{@link contextML.Provider#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see contextML.Provider#getId()
	 * @see #getProvider()
	 * @generated
	 */
	EAttribute getProvider_Id();

	/**
	 * Returns the meta object for class '{@link contextML.User <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User</em>'.
	 * @see contextML.User
	 * @generated
	 */
	EClass getUser();

	/**
	 * Returns the meta object for the containment reference '{@link contextML.User#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Role</em>'.
	 * @see contextML.User#getRole()
	 * @see #getUser()
	 * @generated
	 */
	EReference getUser_Role();

	/**
	 * Returns the meta object for the attribute '{@link contextML.User#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see contextML.User#getId()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_Id();

	/**
	 * Returns the meta object for the containment reference '{@link contextML.User#getColorBlind <em>Color Blind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Color Blind</em>'.
	 * @see contextML.User#getColorBlind()
	 * @see #getUser()
	 * @generated
	 */
	EReference getUser_ColorBlind();

	/**
	 * Returns the meta object for the containment reference '{@link contextML.User#getAge <em>Age</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Age</em>'.
	 * @see contextML.User#getAge()
	 * @see #getUser()
	 * @generated
	 */
	EReference getUser_Age();

	/**
	 * Returns the meta object for class '{@link contextML.Platform <em>Platform</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Platform</em>'.
	 * @see contextML.Platform
	 * @generated
	 */
	EClass getPlatform();

	/**
	 * Returns the meta object for the containment reference '{@link contextML.Platform#getDevice <em>Device</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Device</em>'.
	 * @see contextML.Platform#getDevice()
	 * @see #getPlatform()
	 * @generated
	 */
	EReference getPlatform_Device();

	/**
	 * Returns the meta object for the containment reference '{@link contextML.Platform#getLang <em>Lang</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lang</em>'.
	 * @see contextML.Platform#getLang()
	 * @see #getPlatform()
	 * @generated
	 */
	EReference getPlatform_Lang();

	/**
	 * Returns the meta object for class '{@link contextML.Environment <em>Environment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Environment</em>'.
	 * @see contextML.Environment
	 * @generated
	 */
	EClass getEnvironment();

	/**
	 * Returns the meta object for the containment reference '{@link contextML.Environment#getMovementLevel <em>Movement Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Movement Level</em>'.
	 * @see contextML.Environment#getMovementLevel()
	 * @see #getEnvironment()
	 * @generated
	 */
	EReference getEnvironment_MovementLevel();

	/**
	 * Returns the meta object for class '{@link contextML.Age <em>Age</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Age</em>'.
	 * @see contextML.Age
	 * @generated
	 */
	EClass getAge();

	/**
	 * Returns the meta object for class '{@link contextML.UserRole <em>User Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User Role</em>'.
	 * @see contextML.UserRole
	 * @generated
	 */
	EClass getUserRole();

	/**
	 * Returns the meta object for class '{@link contextML.ColorBlind <em>Color Blind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Color Blind</em>'.
	 * @see contextML.ColorBlind
	 * @generated
	 */
	EClass getColorBlind();

	/**
	 * Returns the meta object for class '{@link contextML.DeviceType <em>Device Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Device Type</em>'.
	 * @see contextML.DeviceType
	 * @generated
	 */
	EClass getDeviceType();

	/**
	 * Returns the meta object for class '{@link contextML.Mobile <em>Mobile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mobile</em>'.
	 * @see contextML.Mobile
	 * @generated
	 */
	EClass getMobile();

	/**
	 * Returns the meta object for class '{@link contextML.Desktop <em>Desktop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Desktop</em>'.
	 * @see contextML.Desktop
	 * @generated
	 */
	EClass getDesktop();

	/**
	 * Returns the meta object for class '{@link contextML.Language <em>Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Language</em>'.
	 * @see contextML.Language
	 * @generated
	 */
	EClass getLanguage();

	/**
	 * Returns the meta object for class '{@link contextML.German <em>German</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>German</em>'.
	 * @see contextML.German
	 * @generated
	 */
	EClass getGerman();

	/**
	 * Returns the meta object for class '{@link contextML.English <em>English</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>English</em>'.
	 * @see contextML.English
	 * @generated
	 */
	EClass getEnglish();

	/**
	 * Returns the meta object for class '{@link contextML.Movement <em>Movement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Movement</em>'.
	 * @see contextML.Movement
	 * @generated
	 */
	EClass getMovement();

	/**
	 * Returns the meta object for class '{@link contextML.HighMovement <em>High Movement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>High Movement</em>'.
	 * @see contextML.HighMovement
	 * @generated
	 */
	EClass getHighMovement();

	/**
	 * Returns the meta object for class '{@link contextML.LowMovement <em>Low Movement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Low Movement</em>'.
	 * @see contextML.LowMovement
	 * @generated
	 */
	EClass getLowMovement();

	/**
	 * Returns the meta object for class '{@link contextML.UserIsYoung <em>User Is Young</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User Is Young</em>'.
	 * @see contextML.UserIsYoung
	 * @generated
	 */
	EClass getUserIsYoung();

	/**
	 * Returns the meta object for class '{@link contextML.UserIsOld <em>User Is Old</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User Is Old</em>'.
	 * @see contextML.UserIsOld
	 * @generated
	 */
	EClass getUserIsOld();

	/**
	 * Returns the meta object for class '{@link contextML.Admin <em>Admin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Admin</em>'.
	 * @see contextML.Admin
	 * @generated
	 */
	EClass getAdmin();

	/**
	 * Returns the meta object for class '{@link contextML.Student <em>Student</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Student</em>'.
	 * @see contextML.Student
	 * @generated
	 */
	EClass getStudent();

	/**
	 * Returns the meta object for class '{@link contextML.Property <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property</em>'.
	 * @see contextML.Property
	 * @generated
	 */
	EClass getProperty();

	/**
	 * Returns the meta object for the reference '{@link contextML.Property#getProvider <em>Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Provider</em>'.
	 * @see contextML.Property#getProvider()
	 * @see #getProperty()
	 * @generated
	 */
	EReference getProperty_Provider();

	/**
	 * Returns the meta object for the attribute '{@link contextML.Property#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see contextML.Property#getType()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_Type();

	/**
	 * Returns the meta object for class '{@link contextML.UserIsColorBlind <em>User Is Color Blind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User Is Color Blind</em>'.
	 * @see contextML.UserIsColorBlind
	 * @generated
	 */
	EClass getUserIsColorBlind();

	/**
	 * Returns the meta object for class '{@link contextML.UserIsNotColorBlind <em>User Is Not Color Blind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User Is Not Color Blind</em>'.
	 * @see contextML.UserIsNotColorBlind
	 * @generated
	 */
	EClass getUserIsNotColorBlind();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ContextMLFactory getContextMLFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link contextML.impl.ContextImpl <em>Context</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see contextML.impl.ContextImpl
		 * @see contextML.impl.ContextMLPackageImpl#getContext()
		 * @generated
		 */
		EClass CONTEXT = eINSTANCE.getContext();

		/**
		 * The meta object literal for the '<em><b>Entity</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTEXT__ENTITY = eINSTANCE.getContext_Entity();

		/**
		 * The meta object literal for the '<em><b>Provider</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTEXT__PROVIDER = eINSTANCE.getContext_Provider();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTEXT__NAME = eINSTANCE.getContext_Name();

		/**
		 * The meta object literal for the '{@link contextML.impl.EntityImpl <em>Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see contextML.impl.EntityImpl
		 * @see contextML.impl.ContextMLPackageImpl#getEntity()
		 * @generated
		 */
		EClass ENTITY = eINSTANCE.getEntity();

		/**
		 * The meta object literal for the '{@link contextML.impl.ProviderImpl <em>Provider</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see contextML.impl.ProviderImpl
		 * @see contextML.impl.ContextMLPackageImpl#getProvider()
		 * @generated
		 */
		EClass PROVIDER = eINSTANCE.getProvider();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROVIDER__ID = eINSTANCE.getProvider_Id();

		/**
		 * The meta object literal for the '{@link contextML.impl.UserImpl <em>User</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see contextML.impl.UserImpl
		 * @see contextML.impl.ContextMLPackageImpl#getUser()
		 * @generated
		 */
		EClass USER = eINSTANCE.getUser();

		/**
		 * The meta object literal for the '<em><b>Role</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER__ROLE = eINSTANCE.getUser_Role();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__ID = eINSTANCE.getUser_Id();

		/**
		 * The meta object literal for the '<em><b>Color Blind</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER__COLOR_BLIND = eINSTANCE.getUser_ColorBlind();

		/**
		 * The meta object literal for the '<em><b>Age</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER__AGE = eINSTANCE.getUser_Age();

		/**
		 * The meta object literal for the '{@link contextML.impl.PlatformImpl <em>Platform</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see contextML.impl.PlatformImpl
		 * @see contextML.impl.ContextMLPackageImpl#getPlatform()
		 * @generated
		 */
		EClass PLATFORM = eINSTANCE.getPlatform();

		/**
		 * The meta object literal for the '<em><b>Device</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLATFORM__DEVICE = eINSTANCE.getPlatform_Device();

		/**
		 * The meta object literal for the '<em><b>Lang</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLATFORM__LANG = eINSTANCE.getPlatform_Lang();

		/**
		 * The meta object literal for the '{@link contextML.impl.EnvironmentImpl <em>Environment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see contextML.impl.EnvironmentImpl
		 * @see contextML.impl.ContextMLPackageImpl#getEnvironment()
		 * @generated
		 */
		EClass ENVIRONMENT = eINSTANCE.getEnvironment();

		/**
		 * The meta object literal for the '<em><b>Movement Level</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENVIRONMENT__MOVEMENT_LEVEL = eINSTANCE.getEnvironment_MovementLevel();

		/**
		 * The meta object literal for the '{@link contextML.impl.AgeImpl <em>Age</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see contextML.impl.AgeImpl
		 * @see contextML.impl.ContextMLPackageImpl#getAge()
		 * @generated
		 */
		EClass AGE = eINSTANCE.getAge();

		/**
		 * The meta object literal for the '{@link contextML.impl.UserRoleImpl <em>User Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see contextML.impl.UserRoleImpl
		 * @see contextML.impl.ContextMLPackageImpl#getUserRole()
		 * @generated
		 */
		EClass USER_ROLE = eINSTANCE.getUserRole();

		/**
		 * The meta object literal for the '{@link contextML.impl.ColorBlindImpl <em>Color Blind</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see contextML.impl.ColorBlindImpl
		 * @see contextML.impl.ContextMLPackageImpl#getColorBlind()
		 * @generated
		 */
		EClass COLOR_BLIND = eINSTANCE.getColorBlind();

		/**
		 * The meta object literal for the '{@link contextML.impl.DeviceTypeImpl <em>Device Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see contextML.impl.DeviceTypeImpl
		 * @see contextML.impl.ContextMLPackageImpl#getDeviceType()
		 * @generated
		 */
		EClass DEVICE_TYPE = eINSTANCE.getDeviceType();

		/**
		 * The meta object literal for the '{@link contextML.impl.MobileImpl <em>Mobile</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see contextML.impl.MobileImpl
		 * @see contextML.impl.ContextMLPackageImpl#getMobile()
		 * @generated
		 */
		EClass MOBILE = eINSTANCE.getMobile();

		/**
		 * The meta object literal for the '{@link contextML.impl.DesktopImpl <em>Desktop</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see contextML.impl.DesktopImpl
		 * @see contextML.impl.ContextMLPackageImpl#getDesktop()
		 * @generated
		 */
		EClass DESKTOP = eINSTANCE.getDesktop();

		/**
		 * The meta object literal for the '{@link contextML.impl.LanguageImpl <em>Language</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see contextML.impl.LanguageImpl
		 * @see contextML.impl.ContextMLPackageImpl#getLanguage()
		 * @generated
		 */
		EClass LANGUAGE = eINSTANCE.getLanguage();

		/**
		 * The meta object literal for the '{@link contextML.impl.GermanImpl <em>German</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see contextML.impl.GermanImpl
		 * @see contextML.impl.ContextMLPackageImpl#getGerman()
		 * @generated
		 */
		EClass GERMAN = eINSTANCE.getGerman();

		/**
		 * The meta object literal for the '{@link contextML.impl.EnglishImpl <em>English</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see contextML.impl.EnglishImpl
		 * @see contextML.impl.ContextMLPackageImpl#getEnglish()
		 * @generated
		 */
		EClass ENGLISH = eINSTANCE.getEnglish();

		/**
		 * The meta object literal for the '{@link contextML.impl.MovementImpl <em>Movement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see contextML.impl.MovementImpl
		 * @see contextML.impl.ContextMLPackageImpl#getMovement()
		 * @generated
		 */
		EClass MOVEMENT = eINSTANCE.getMovement();

		/**
		 * The meta object literal for the '{@link contextML.impl.HighMovementImpl <em>High Movement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see contextML.impl.HighMovementImpl
		 * @see contextML.impl.ContextMLPackageImpl#getHighMovement()
		 * @generated
		 */
		EClass HIGH_MOVEMENT = eINSTANCE.getHighMovement();

		/**
		 * The meta object literal for the '{@link contextML.impl.LowMovementImpl <em>Low Movement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see contextML.impl.LowMovementImpl
		 * @see contextML.impl.ContextMLPackageImpl#getLowMovement()
		 * @generated
		 */
		EClass LOW_MOVEMENT = eINSTANCE.getLowMovement();

		/**
		 * The meta object literal for the '{@link contextML.impl.UserIsYoungImpl <em>User Is Young</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see contextML.impl.UserIsYoungImpl
		 * @see contextML.impl.ContextMLPackageImpl#getUserIsYoung()
		 * @generated
		 */
		EClass USER_IS_YOUNG = eINSTANCE.getUserIsYoung();

		/**
		 * The meta object literal for the '{@link contextML.impl.UserIsOldImpl <em>User Is Old</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see contextML.impl.UserIsOldImpl
		 * @see contextML.impl.ContextMLPackageImpl#getUserIsOld()
		 * @generated
		 */
		EClass USER_IS_OLD = eINSTANCE.getUserIsOld();

		/**
		 * The meta object literal for the '{@link contextML.impl.AdminImpl <em>Admin</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see contextML.impl.AdminImpl
		 * @see contextML.impl.ContextMLPackageImpl#getAdmin()
		 * @generated
		 */
		EClass ADMIN = eINSTANCE.getAdmin();

		/**
		 * The meta object literal for the '{@link contextML.impl.StudentImpl <em>Student</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see contextML.impl.StudentImpl
		 * @see contextML.impl.ContextMLPackageImpl#getStudent()
		 * @generated
		 */
		EClass STUDENT = eINSTANCE.getStudent();

		/**
		 * The meta object literal for the '{@link contextML.impl.PropertyImpl <em>Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see contextML.impl.PropertyImpl
		 * @see contextML.impl.ContextMLPackageImpl#getProperty()
		 * @generated
		 */
		EClass PROPERTY = eINSTANCE.getProperty();

		/**
		 * The meta object literal for the '<em><b>Provider</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY__PROVIDER = eINSTANCE.getProperty_Provider();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__TYPE = eINSTANCE.getProperty_Type();

		/**
		 * The meta object literal for the '{@link contextML.impl.UserIsColorBlindImpl <em>User Is Color Blind</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see contextML.impl.UserIsColorBlindImpl
		 * @see contextML.impl.ContextMLPackageImpl#getUserIsColorBlind()
		 * @generated
		 */
		EClass USER_IS_COLOR_BLIND = eINSTANCE.getUserIsColorBlind();

		/**
		 * The meta object literal for the '{@link contextML.impl.UserIsNotColorBlindImpl <em>User Is Not Color Blind</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see contextML.impl.UserIsNotColorBlindImpl
		 * @see contextML.impl.ContextMLPackageImpl#getUserIsNotColorBlind()
		 * @generated
		 */
		EClass USER_IS_NOT_COLOR_BLIND = eINSTANCE.getUserIsNotColorBlind();

	}

} //ContextMLPackage
