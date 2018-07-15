/**
 */
package essentialIFML.Core.provider;

import essentialIFML.Core.CoreFactory;
import essentialIFML.Core.CorePackage;
import essentialIFML.Core.EssentialIFMLModel;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link essentialIFML.Core.EssentialIFMLModel} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class EssentialIFMLModelItemProvider extends NamedElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EssentialIFMLModelItemProvider(AdapterFactory adapterFactory) {
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

		}
		return itemPropertyDescriptors;
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
			childrenFeatures.add(CorePackage.Literals.ESSENTIAL_IFML_MODEL__INTERACTION_FLOW_MODEL);
			childrenFeatures.add(CorePackage.Literals.ESSENTIAL_IFML_MODEL__DOMAIN_MODEL);
			childrenFeatures.add(CorePackage.Literals.ESSENTIAL_IFML_MODEL__INTERACTION_FLOW_MODEL_VIEWPOINT);
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
	 * This returns EssentialIFMLModel.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/EssentialIFMLModel"));
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
		String label = ((EssentialIFMLModel) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_EssentialIFMLModel_type")
				: getString("_UI_EssentialIFMLModel_type") + " " + label;
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

		switch (notification.getFeatureID(EssentialIFMLModel.class)) {
		case CorePackage.ESSENTIAL_IFML_MODEL__INTERACTION_FLOW_MODEL:
		case CorePackage.ESSENTIAL_IFML_MODEL__DOMAIN_MODEL:
		case CorePackage.ESSENTIAL_IFML_MODEL__INTERACTION_FLOW_MODEL_VIEWPOINT:
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

		newChildDescriptors.add(createChildParameter(CorePackage.Literals.ESSENTIAL_IFML_MODEL__INTERACTION_FLOW_MODEL,
				CoreFactory.eINSTANCE.createInteractionFlowModel()));

		newChildDescriptors.add(createChildParameter(CorePackage.Literals.ESSENTIAL_IFML_MODEL__DOMAIN_MODEL,
				CoreFactory.eINSTANCE.createDomainModel()));

		newChildDescriptors
				.add(createChildParameter(CorePackage.Literals.ESSENTIAL_IFML_MODEL__INTERACTION_FLOW_MODEL_VIEWPOINT,
						CoreFactory.eINSTANCE.createViewpoint()));
	}

}
