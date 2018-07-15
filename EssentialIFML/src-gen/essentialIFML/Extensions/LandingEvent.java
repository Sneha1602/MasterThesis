/**
 */
package essentialIFML.Extensions;

import essentialIFML.Core.CatchingEvent;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Landing Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link essentialIFML.Extensions.LandingEvent#getJumpingEvents <em>Jumping Events</em>}</li>
 * </ul>
 *
 * @see essentialIFML.Extensions.ExtensionsPackage#getLandingEvent()
 * @model
 * @generated
 */
public interface LandingEvent extends CatchingEvent {
	/**
	 * Returns the value of the '<em><b>Jumping Events</b></em>' reference list.
	 * The list contents are of type {@link essentialIFML.Extensions.JumpEvent}.
	 * It is bidirectional and its opposite is '{@link essentialIFML.Extensions.JumpEvent#getLandingEvent <em>Landing Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Jumping Events</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Jumping Events</em>' reference list.
	 * @see essentialIFML.Extensions.ExtensionsPackage#getLandingEvent_JumpingEvents()
	 * @see essentialIFML.Extensions.JumpEvent#getLandingEvent
	 * @model opposite="landingEvent" ordered="false"
	 * @generated
	 */
	EList<JumpEvent> getJumpingEvents();

} // LandingEvent
