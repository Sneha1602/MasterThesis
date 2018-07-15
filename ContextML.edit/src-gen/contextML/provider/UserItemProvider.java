/**
 */
package contextML.provider;

import contextML.ContextMLFactory;
import contextML.ContextMLPackage;
import contextML.User;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link contextML.User} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class UserItemProvider extends EntityItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addIdPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Id feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIdPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_User_id_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_User_id_feature", "_UI_User_type"),
						ContextMLPackage.Literals.USER__ID, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(ContextMLPackage.Literals.USER__ROLE);
			childrenFeatures.add(ContextMLPackage.Literals.USER__COLOR_BLIND);
			childrenFeatures.add(ContextMLPackage.Literals.USER__AGE);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns User.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/User"));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean shouldComposeCreationImage() {
		return true;
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((User) object).getId();
		return label == null || label.length() == 0 ? getString("_UI_User_type")
				: getString("_UI_User_type") + " " + label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(User.class)) {
		case ContextMLPackage.USER__ID:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		case ContextMLPackage.USER__ROLE:
		case ContextMLPackage.USER__COLOR_BLIND:
		case ContextMLPackage.USER__AGE:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
			return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add(createChildParameter(ContextMLPackage.Literals.USER__ROLE,
				ContextMLFactory.eINSTANCE.createUserRole()));

		newChildDescriptors.add(
				createChildParameter(ContextMLPackage.Literals.USER__ROLE, ContextMLFactory.eINSTANCE.createAdmin()));

		newChildDescriptors.add(
				createChildParameter(ContextMLPackage.Literals.USER__ROLE, ContextMLFactory.eINSTANCE.createStudent()));

		newChildDescriptors.add(createChildParameter(ContextMLPackage.Literals.USER__COLOR_BLIND,
				ContextMLFactory.eINSTANCE.createColorBlind()));

		newChildDescriptors.add(createChildParameter(ContextMLPackage.Literals.USER__COLOR_BLIND,
				ContextMLFactory.eINSTANCE.createUserIsNotColorBlind()));

		newChildDescriptors.add(createChildParameter(ContextMLPackage.Literals.USER__COLOR_BLIND,
				ContextMLFactory.eINSTANCE.createUserIsColorBlind()));

		newChildDescriptors
				.add(createChildParameter(ContextMLPackage.Literals.USER__AGE, ContextMLFactory.eINSTANCE.createAge()));

		newChildDescriptors.add(createChildParameter(ContextMLPackage.Literals.USER__AGE,
				ContextMLFactory.eINSTANCE.createUserIsYoung()));

		newChildDescriptors.add(createChildParameter(ContextMLPackage.Literals.USER__AGE,
				ContextMLFactory.eINSTANCE.createUserIsOld()));
	}

}
