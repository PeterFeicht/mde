/**
 */
package net.feichti.codingcontest;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Level</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.feichti.codingcontest.Level#getNumber <em>Number</em>}</li>
 *   <li>{@link net.feichti.codingcontest.Level#getTitle <em>Title</em>}</li>
 *   <li>{@link net.feichti.codingcontest.Level#getProblems <em>Problems</em>}</li>
 * </ul>
 *
 * @see net.feichti.codingcontest.CodingcontestPackage#getLevel()
 * @model
 * @generated
 */
public interface Level extends EObject
{
	/**
	 * Returns the value of the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number</em>' attribute.
	 * @see #setNumber(int)
	 * @see net.feichti.codingcontest.CodingcontestPackage#getLevel_Number()
	 * @model id="true" required="true"
	 * @generated
	 */
	int getNumber();

	/**
	 * Sets the value of the '{@link net.feichti.codingcontest.Level#getNumber <em>Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number</em>' attribute.
	 * @see #getNumber()
	 * @generated
	 */
	void setNumber(int value);

	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Title</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see net.feichti.codingcontest.CodingcontestPackage#getLevel_Title()
	 * @model
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link net.feichti.codingcontest.Level#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

	/**
	 * Returns the value of the '<em><b>Problems</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link net.feichti.codingcontest.Problem},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Problems</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Problems</em>' map.
	 * @see net.feichti.codingcontest.CodingcontestPackage#getLevel_Problems()
	 * @model mapType="net.feichti.codingcontest.LanguageToProblemMap<org.eclipse.emf.ecore.xml.type.Language, net.feichti.codingcontest.Problem>" ordered="false"
	 * @generated
	 */
	EMap<String, Problem> getProblems();

} // Level
