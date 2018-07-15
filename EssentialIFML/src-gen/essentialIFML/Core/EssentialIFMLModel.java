/**
 */
package essentialIFML.Core;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Essential IFML Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link essentialIFML.Core.EssentialIFMLModel#getInteractionFlowModel <em>Interaction Flow Model</em>}</li>
 *   <li>{@link essentialIFML.Core.EssentialIFMLModel#getDomainModel <em>Domain Model</em>}</li>
 *   <li>{@link essentialIFML.Core.EssentialIFMLModel#getInteractionFlowModelViewpoint <em>Interaction Flow Model Viewpoint</em>}</li>
 * </ul>
 *
 * @see essentialIFML.Core.CorePackage#getEssentialIFMLModel()
 * @model
 * @generated
 */
public interface EssentialIFMLModel extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Interaction Flow Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interaction Flow Model</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interaction Flow Model</em>' containment reference.
	 * @see #setInteractionFlowModel(InteractionFlowModel)
	 * @see essentialIFML.Core.CorePackage#getEssentialIFMLModel_InteractionFlowModel()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	InteractionFlowModel getInteractionFlowModel();

	/**
	 * Sets the value of the '{@link essentialIFML.Core.EssentialIFMLModel#getInteractionFlowModel <em>Interaction Flow Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interaction Flow Model</em>' containment reference.
	 * @see #getInteractionFlowModel()
	 * @generated
	 */
	void setInteractionFlowModel(InteractionFlowModel value);

	/**
	 * Returns the value of the '<em><b>Domain Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Domain Model</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain Model</em>' containment reference.
	 * @see #setDomainModel(DomainModel)
	 * @see essentialIFML.Core.CorePackage#getEssentialIFMLModel_DomainModel()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	DomainModel getDomainModel();

	/**
	 * Sets the value of the '{@link essentialIFML.Core.EssentialIFMLModel#getDomainModel <em>Domain Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domain Model</em>' containment reference.
	 * @see #getDomainModel()
	 * @generated
	 */
	void setDomainModel(DomainModel value);

	/**
	 * Returns the value of the '<em><b>Interaction Flow Model Viewpoint</b></em>' containment reference list.
	 * The list contents are of type {@link essentialIFML.Core.Viewpoint}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interaction Flow Model Viewpoint</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interaction Flow Model Viewpoint</em>' containment reference list.
	 * @see essentialIFML.Core.CorePackage#getEssentialIFMLModel_InteractionFlowModelViewpoint()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Viewpoint> getInteractionFlowModelViewpoint();

} // EssentialIFMLModel
