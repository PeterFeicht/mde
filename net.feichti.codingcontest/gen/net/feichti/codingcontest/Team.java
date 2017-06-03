/**
 */
package net.feichti.codingcontest;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Team</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Represents a team competing in a coding contest.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.feichti.codingcontest.Team#getCoders <em>Coders</em>}</li>
 *   <li>{@link net.feichti.codingcontest.Team#getLocation <em>Location</em>}</li>
 *   <li>{@link net.feichti.codingcontest.Team#getName <em>Name</em>}</li>
 *   <li>{@link net.feichti.codingcontest.Team#getLanguage <em>Language</em>}</li>
 * </ul>
 *
 * @see net.feichti.codingcontest.CodingcontestPackage#getTeam()
 * @model
 * @generated
 */
public interface Team extends EObject
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
	 * @see net.feichti.codingcontest.CodingcontestPackage#getTeam_Coders()
	 * @model containment="true" required="true" upper="3" ordered="false"
	 * @generated
	 */
	EList<Coder> getCoders();

	/**
	 * Returns the value of the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The location this team is competing at, {@code null} indicates an online entry.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Location</em>' reference.
	 * @see #setLocation(Location)
	 * @see net.feichti.codingcontest.CodingcontestPackage#getTeam_Location()
	 * @model resolveProxies="false" ordered="false"
	 * @generated
	 */
	Location getLocation();

	/**
	 * Sets the value of the '{@link net.feichti.codingcontest.Team#getLocation <em>Location</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' reference.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(Location value);

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
	 * @see net.feichti.codingcontest.CodingcontestPackage#getTeam_Name()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link net.feichti.codingcontest.Team#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The preferred language for problem descriptions.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Language</em>' attribute.
	 * @see #setLanguage(String)
	 * @see net.feichti.codingcontest.CodingcontestPackage#getTeam_Language()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Language"
	 * @generated
	 */
	String getLanguage();

	/**
	 * Sets the value of the '{@link net.feichti.codingcontest.Team#getLanguage <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Language</em>' attribute.
	 * @see #getLanguage()
	 * @generated
	 */
	void setLanguage(String value);

} // Team
