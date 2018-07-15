/**
 */
package essentialIFML.Core.impl;

import essentialIFML.Core.CorePackage;
import essentialIFML.Core.InteractionFlowModel;
import essentialIFML.Core.InteractionFlowModelElement;
import essentialIFML.Core.Language;
import essentialIFML.Core.LightBackgroundColor;
import essentialIFML.Core.ScreenZoom;
import essentialIFML.Core.ViewContainer;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interaction Flow Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link essentialIFML.Core.impl.InteractionFlowModelImpl#getInteractionFlowModelElements <em>Interaction Flow Model Elements</em>}</li>
 *   <li>{@link essentialIFML.Core.impl.InteractionFlowModelImpl#getScreenZoom <em>Screen Zoom</em>}</li>
 *   <li>{@link essentialIFML.Core.impl.InteractionFlowModelImpl#getChangeBackgroundColor <em>Change Background Color</em>}</li>
 *   <li>{@link essentialIFML.Core.impl.InteractionFlowModelImpl#getNavBarContainer <em>Nav Bar Container</em>}</li>
 *   <li>{@link essentialIFML.Core.impl.InteractionFlowModelImpl#getSetLanguage <em>Set Language</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InteractionFlowModelImpl extends NamedElementImpl implements InteractionFlowModel {
	/**
	 * The cached value of the '{@link #getInteractionFlowModelElements() <em>Interaction Flow Model Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInteractionFlowModelElements()
	 * @generated
	 * @ordered
	 */
	protected EList<InteractionFlowModelElement> interactionFlowModelElements;

	/**
	 * The cached value of the '{@link #getScreenZoom() <em>Screen Zoom</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScreenZoom()
	 * @generated
	 * @ordered
	 */
	protected ScreenZoom screenZoom;

	/**
	 * The cached value of the '{@link #getChangeBackgroundColor() <em>Change Background Color</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChangeBackgroundColor()
	 * @generated
	 * @ordered
	 */
	protected LightBackgroundColor changeBackgroundColor;

	/**
	 * The cached value of the '{@link #getNavBarContainer() <em>Nav Bar Container</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNavBarContainer()
	 * @generated
	 * @ordered
	 */
	protected EList<ViewContainer> navBarContainer;

	/**
	 * The cached value of the '{@link #getSetLanguage() <em>Set Language</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSetLanguage()
	 * @generated
	 * @ordered
	 */
	protected Language setLanguage;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InteractionFlowModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.INTERACTION_FLOW_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InteractionFlowModelElement> getInteractionFlowModelElements() {
		if (interactionFlowModelElements == null) {
			interactionFlowModelElements = new EObjectContainmentEList<InteractionFlowModelElement>(
					InteractionFlowModelElement.class, this,
					CorePackage.INTERACTION_FLOW_MODEL__INTERACTION_FLOW_MODEL_ELEMENTS);
		}
		return interactionFlowModelElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScreenZoom getScreenZoom() {
		return screenZoom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetScreenZoom(ScreenZoom newScreenZoom, NotificationChain msgs) {
		ScreenZoom oldScreenZoom = screenZoom;
		screenZoom = newScreenZoom;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CorePackage.INTERACTION_FLOW_MODEL__SCREEN_ZOOM, oldScreenZoom, newScreenZoom);
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
	public void setScreenZoom(ScreenZoom newScreenZoom) {
		if (newScreenZoom != screenZoom) {
			NotificationChain msgs = null;
			if (screenZoom != null)
				msgs = ((InternalEObject) screenZoom).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CorePackage.INTERACTION_FLOW_MODEL__SCREEN_ZOOM, null, msgs);
			if (newScreenZoom != null)
				msgs = ((InternalEObject) newScreenZoom).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CorePackage.INTERACTION_FLOW_MODEL__SCREEN_ZOOM, null, msgs);
			msgs = basicSetScreenZoom(newScreenZoom, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.INTERACTION_FLOW_MODEL__SCREEN_ZOOM,
					newScreenZoom, newScreenZoom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LightBackgroundColor getChangeBackgroundColor() {
		return changeBackgroundColor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetChangeBackgroundColor(LightBackgroundColor newChangeBackgroundColor,
			NotificationChain msgs) {
		LightBackgroundColor oldChangeBackgroundColor = changeBackgroundColor;
		changeBackgroundColor = newChangeBackgroundColor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CorePackage.INTERACTION_FLOW_MODEL__CHANGE_BACKGROUND_COLOR, oldChangeBackgroundColor,
					newChangeBackgroundColor);
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
	public void setChangeBackgroundColor(LightBackgroundColor newChangeBackgroundColor) {
		if (newChangeBackgroundColor != changeBackgroundColor) {
			NotificationChain msgs = null;
			if (changeBackgroundColor != null)
				msgs = ((InternalEObject) changeBackgroundColor).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CorePackage.INTERACTION_FLOW_MODEL__CHANGE_BACKGROUND_COLOR, null,
						msgs);
			if (newChangeBackgroundColor != null)
				msgs = ((InternalEObject) newChangeBackgroundColor).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CorePackage.INTERACTION_FLOW_MODEL__CHANGE_BACKGROUND_COLOR, null,
						msgs);
			msgs = basicSetChangeBackgroundColor(newChangeBackgroundColor, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CorePackage.INTERACTION_FLOW_MODEL__CHANGE_BACKGROUND_COLOR, newChangeBackgroundColor,
					newChangeBackgroundColor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ViewContainer> getNavBarContainer() {
		if (navBarContainer == null) {
			navBarContainer = new EObjectContainmentEList<ViewContainer>(ViewContainer.class, this,
					CorePackage.INTERACTION_FLOW_MODEL__NAV_BAR_CONTAINER);
		}
		return navBarContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Language getSetLanguage() {
		return setLanguage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSetLanguage(Language newSetLanguage, NotificationChain msgs) {
		Language oldSetLanguage = setLanguage;
		setLanguage = newSetLanguage;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CorePackage.INTERACTION_FLOW_MODEL__SET_LANGUAGE, oldSetLanguage, newSetLanguage);
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
	public void setSetLanguage(Language newSetLanguage) {
		if (newSetLanguage != setLanguage) {
			NotificationChain msgs = null;
			if (setLanguage != null)
				msgs = ((InternalEObject) setLanguage).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CorePackage.INTERACTION_FLOW_MODEL__SET_LANGUAGE, null, msgs);
			if (newSetLanguage != null)
				msgs = ((InternalEObject) newSetLanguage).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CorePackage.INTERACTION_FLOW_MODEL__SET_LANGUAGE, null, msgs);
			msgs = basicSetSetLanguage(newSetLanguage, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.INTERACTION_FLOW_MODEL__SET_LANGUAGE,
					newSetLanguage, newSetLanguage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CorePackage.INTERACTION_FLOW_MODEL__INTERACTION_FLOW_MODEL_ELEMENTS:
			return ((InternalEList<?>) getInteractionFlowModelElements()).basicRemove(otherEnd, msgs);
		case CorePackage.INTERACTION_FLOW_MODEL__SCREEN_ZOOM:
			return basicSetScreenZoom(null, msgs);
		case CorePackage.INTERACTION_FLOW_MODEL__CHANGE_BACKGROUND_COLOR:
			return basicSetChangeBackgroundColor(null, msgs);
		case CorePackage.INTERACTION_FLOW_MODEL__NAV_BAR_CONTAINER:
			return ((InternalEList<?>) getNavBarContainer()).basicRemove(otherEnd, msgs);
		case CorePackage.INTERACTION_FLOW_MODEL__SET_LANGUAGE:
			return basicSetSetLanguage(null, msgs);
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
		case CorePackage.INTERACTION_FLOW_MODEL__INTERACTION_FLOW_MODEL_ELEMENTS:
			return getInteractionFlowModelElements();
		case CorePackage.INTERACTION_FLOW_MODEL__SCREEN_ZOOM:
			return getScreenZoom();
		case CorePackage.INTERACTION_FLOW_MODEL__CHANGE_BACKGROUND_COLOR:
			return getChangeBackgroundColor();
		case CorePackage.INTERACTION_FLOW_MODEL__NAV_BAR_CONTAINER:
			return getNavBarContainer();
		case CorePackage.INTERACTION_FLOW_MODEL__SET_LANGUAGE:
			return getSetLanguage();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case CorePackage.INTERACTION_FLOW_MODEL__INTERACTION_FLOW_MODEL_ELEMENTS:
			getInteractionFlowModelElements().clear();
			getInteractionFlowModelElements().addAll((Collection<? extends InteractionFlowModelElement>) newValue);
			return;
		case CorePackage.INTERACTION_FLOW_MODEL__SCREEN_ZOOM:
			setScreenZoom((ScreenZoom) newValue);
			return;
		case CorePackage.INTERACTION_FLOW_MODEL__CHANGE_BACKGROUND_COLOR:
			setChangeBackgroundColor((LightBackgroundColor) newValue);
			return;
		case CorePackage.INTERACTION_FLOW_MODEL__NAV_BAR_CONTAINER:
			getNavBarContainer().clear();
			getNavBarContainer().addAll((Collection<? extends ViewContainer>) newValue);
			return;
		case CorePackage.INTERACTION_FLOW_MODEL__SET_LANGUAGE:
			setSetLanguage((Language) newValue);
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
		case CorePackage.INTERACTION_FLOW_MODEL__INTERACTION_FLOW_MODEL_ELEMENTS:
			getInteractionFlowModelElements().clear();
			return;
		case CorePackage.INTERACTION_FLOW_MODEL__SCREEN_ZOOM:
			setScreenZoom((ScreenZoom) null);
			return;
		case CorePackage.INTERACTION_FLOW_MODEL__CHANGE_BACKGROUND_COLOR:
			setChangeBackgroundColor((LightBackgroundColor) null);
			return;
		case CorePackage.INTERACTION_FLOW_MODEL__NAV_BAR_CONTAINER:
			getNavBarContainer().clear();
			return;
		case CorePackage.INTERACTION_FLOW_MODEL__SET_LANGUAGE:
			setSetLanguage((Language) null);
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
		case CorePackage.INTERACTION_FLOW_MODEL__INTERACTION_FLOW_MODEL_ELEMENTS:
			return interactionFlowModelElements != null && !interactionFlowModelElements.isEmpty();
		case CorePackage.INTERACTION_FLOW_MODEL__SCREEN_ZOOM:
			return screenZoom != null;
		case CorePackage.INTERACTION_FLOW_MODEL__CHANGE_BACKGROUND_COLOR:
			return changeBackgroundColor != null;
		case CorePackage.INTERACTION_FLOW_MODEL__NAV_BAR_CONTAINER:
			return navBarContainer != null && !navBarContainer.isEmpty();
		case CorePackage.INTERACTION_FLOW_MODEL__SET_LANGUAGE:
			return setLanguage != null;
		}
		return super.eIsSet(featureID);
	}

} //InteractionFlowModelImpl
