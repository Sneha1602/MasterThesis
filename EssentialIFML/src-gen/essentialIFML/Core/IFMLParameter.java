/**
 */
package essentialIFML.Core;

import essentialIFML.DataTypes.Direction;

import org.eclipse.uml2.uml.Type;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IFML Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link essentialIFML.Core.IFMLParameter#getDirection <em>Direction</em>}</li>
 *   <li>{@link essentialIFML.Core.IFMLParameter#getDefaultValue <em>Default Value</em>}</li>
 *   <li>{@link essentialIFML.Core.IFMLParameter#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see essentialIFML.Core.CorePackage#getIFMLParameter()
 * @model
 * @generated
 */
public interface IFMLParameter extends InteractionFlowModelElement, NamedElement {
	/**
	 * Returns the value of the '<em><b>Direction</b></em>' attribute.
	 * The default value is <code>"in"</code>.
	 * The literals are from the enumeration {@link essentialIFML.DataTypes.Direction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Direction</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Direction</em>' attribute.
	 * @see essentialIFML.DataTypes.Direction
	 * @see #setDirection(Direction)
	 * @see essentialIFML.Core.CorePackage#getIFMLParameter_Direction()
	 * @model default="in" required="true" ordered="false"
	 * @generated
	 */
	Direction getDirection();

	/**
	 * Sets the value of the '{@link essentialIFML.Core.IFMLParameter#getDirection <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Direction</em>' attribute.
	 * @see essentialIFML.DataTypes.Direction
	 * @see #getDirection()
	 * @generated
	 */
	void setDirection(Direction value);

	/**
	 * Returns the value of the '<em><b>Default Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Value</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Value</em>' reference.
	 * @see #setDefaultValue(Expression)
	 * @see essentialIFML.Core.CorePackage#getIFMLParameter_DefaultValue()
	 * @model ordered="false"
	 * @generated
	 */
	Expression getDefaultValue();

	/**
	 * Sets the value of the '{@link essentialIFML.Core.IFMLParameter#getDefaultValue <em>Default Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Value</em>' reference.
	 * @see #getDefaultValue()
	 * @generated
	 */
	void setDefaultValue(Expression value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(Type)
	 * @see essentialIFML.Core.CorePackage#getIFMLParameter_Type()
	 * @model
	 * @generated
	 */
	Type getType();

	/**
	 * Sets the value of the '{@link essentialIFML.Core.IFMLParameter#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(Type value);

} // IFMLParameter
