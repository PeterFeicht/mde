/**
 */
package net.feichti.codingcontest;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.feichti.codingcontest.Entry#getCoders <em>Coders</em>}</li>
 *   <li>{@link net.feichti.codingcontest.Entry#getLocation <em>Location</em>}</li>
 *   <li>{@link net.feichti.codingcontest.Entry#getTeamName <em>Team Name</em>}</li>
 *   <li>{@link net.feichti.codingcontest.Entry#getLanguage <em>Language</em>}</li>
 * </ul>
 *
 * @see net.feichti.codingcontest.CodingcontestPackage#getEntry()
 * @model
 * @generated
 */
public interface Entry extends EObject
{
	/**
	 * Returns the value of the '<em><b>Coders</b></em>' containment reference list.
	 * The list contents are of type {@link net.feichti.codingcontest.Coder}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Coders</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Coders</em>' containment reference list.
	 * @see net.feichti.codingcontest.CodingcontestPackage#getEntry_Coders()
	 * @model containment="true" required="true" upper="3" ordered="false"
	 * @generated
	 */
	EList<Coder> getCoders();

	/**
	 * Returns the value of the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Location</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location</em>' reference.
	 * @see #setLocation(Location)
	 * @see net.feichti.codingcontest.CodingcontestPackage#getEntry_Location()
	 * @model resolveProxies="false" ordered="false"
	 * @generated
	 */
	Location getLocation();

	/**
	 * Sets the value of the '{@link net.feichti.codingcontest.Entry#getLocation <em>Location</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' reference.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(Location value);

	/**
	 * Returns the value of the '<em><b>Team Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Team Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Team Name</em>' attribute.
	 * @see #setTeamName(String)
	 * @see net.feichti.codingcontest.CodingcontestPackage#getEntry_TeamName()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getTeamName();

	/**
	 * Sets the value of the '{@link net.feichti.codingcontest.Entry#getTeamName <em>Team Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Team Name</em>' attribute.
	 * @see #getTeamName()
	 * @generated
	 */
	void setTeamName(String value);

	/**
	 * Returns the value of the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Language</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Language</em>' attribute.
	 * @see #setLanguage(String)
	 * @see net.feichti.codingcontest.CodingcontestPackage#getEntry_Language()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Language"
	 * @generated
	 */
	String getLanguage();

	/**
	 * Sets the value of the '{@link net.feichti.codingcontest.Entry#getLanguage <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Language</em>' attribute.
	 * @see #getLanguage()
	 * @generated
	 */
	void setLanguage(String value);

} // Entry
