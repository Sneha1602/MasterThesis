/**
 */
package essentialIFML.Extensions.impl;

import essentialIFML.Core.impl.ViewComponentImpl;

import essentialIFML.Extensions.ExtensionsPackage;
import essentialIFML.Extensions.List;
import essentialIFML.Extensions.OnSelectEvent;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>List</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link essentialIFML.Extensions.impl.ListImpl#getSelectEvent <em>Select Event</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ListImpl extends ViewComponentImpl implements List {
	/**
	 * The cached value of the '{@link #getSelectEvent() <em>Select Event</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelectEvent()
	 * @generated
	 * @ordered
	 */
	protected EList<OnSelectEvent> selectEvent;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ListImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExtensionsPackage.Literals.LIST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OnSelectEvent> getSelectEvent() {
		if (selectEvent == null) {
			selectEvent = new EObjectContainmentEList<OnSelectEvent>(OnSelectEvent.class, this,
					ExtensionsPackage.LIST__SELECT_EVENT);
		}
		return selectEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ExtensionsPackage.LIST__SELECT_EVENT:
			return ((InternalEList<?>) getSelectEvent()).basicRemove(otherEnd, msgs);
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
		case ExtensionsPackage.LIST__SELECT_EVENT:
			return getSelectEvent();
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
		case ExtensionsPackage.LIST__SELECT_EVENT:
			getSelectEvent().clear();
			getSelectEvent().addAll((Collection<? extends OnSelectEvent>) newValue);
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
		case ExtensionsPackage.LIST__SELECT_EVENT:
			getSelectEvent().clear();
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
		case ExtensionsPackage.LIST__SELECT_EVENT:
			return selectEvent != null && !selectEvent.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ListImpl
