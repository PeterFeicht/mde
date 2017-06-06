/**
 */
package net.feichti.codingcontest;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Coder</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.feichti.codingcontest.Coder#getName <em>Name</em>}</li>
 *   <li>{@link net.feichti.codingcontest.Coder#getAge <em>Age</em>}</li>
 * </ul>
 *
 * @see net.feichti.codingcontest.CodingcontestPackage#getCoder()
 * @model
 * @generated
 */
public interface Coder extends EObject
{
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see net.feichti.codingcontest.CodingcontestPackage#getCoder_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link net.feichti.codingcontest.Coder#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Age</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The age must be between 1 and 150.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Age</em>' attribute.
	 * @see #setAge(int)
	 * @see net.feichti.codingcontest.CodingcontestPackage#getCoder_Age()
	 * @model required="true"
	 * @generated
	 */
	int getAge();

	/**
	 * Sets the value of the '{@link net.feichti.codingcontest.Coder#getAge <em>Age</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Age</em>' attribute.
	 * @see #getAge()
	 * @generated
	 */
	void setAge(int value);

} // Coder
