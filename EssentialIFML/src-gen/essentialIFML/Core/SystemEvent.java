/**
 */
package essentialIFML.Core;

import essentialIFML.DataTypes.SystemEventType;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>System Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link essentialIFML.Core.SystemEvent#getTriggeringExpressions <em>Triggering Expressions</em>}</li>
 *   <li>{@link essentialIFML.Core.SystemEvent#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see essentialIFML.Core.CorePackage#getSystemEvent()
 * @model
 * @generated
 */
public interface SystemEvent extends CatchingEvent {
	/**
	 * Returns the value of the '<em><b>Triggering Expressions</b></em>' containment reference list.
	 * The list contents are of type {@link essentialIFML.Core.Expression}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Triggering Expressions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Triggering Expressions</em>' containment reference list.
	 * @see essentialIFML.Core.CorePackage#getSystemEvent_TriggeringExpressions()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Expression> getTriggeringExpressions();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link essentialIFML.DataTypes.SystemEventType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see essentialIFML.DataTypes.SystemEventType
	 * @see #setType(SystemEventType)
	 * @see essentialIFML.Core.CorePackage#getSystemEvent_Type()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	SystemEventType getType();

	/**
	 * Sets the value of the '{@link essentialIFML.Core.SystemEvent#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see essentialIFML.DataTypes.SystemEventType
	 * @see #getType()
	 * @generated
	 */
	void setType(SystemEventType value);

} // SystemEvent
