/**
 */
package net.feichti.codingcontest;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Contest</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.feichti.codingcontest.Contest#getId <em>Id</em>}</li>
 *   <li>{@link net.feichti.codingcontest.Contest#getTheme <em>Theme</em>}</li>
 *   <li>{@link net.feichti.codingcontest.Contest#getLocalDate <em>Local Date</em>}</li>
 *   <li>{@link net.feichti.codingcontest.Contest#getLocations <em>Locations</em>}</li>
 *   <li>{@link net.feichti.codingcontest.Contest#getLevels <em>Levels</em>}</li>
 *   <li>{@link net.feichti.codingcontest.Contest#getEntries <em>Entries</em>}</li>
 *   <li>{@link net.feichti.codingcontest.Contest#getOrganizer <em>Organizer</em>}</li>
 *   <li>{@link net.feichti.codingcontest.Contest#getProblems <em>Problems</em>}</li>
 * </ul>
 *
 * @see net.feichti.codingcontest.CodingcontestPackage#getContest()
 * @model
 * @generated
 */
public interface Contest extends EObject
{
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see net.feichti.codingcontest.CodingcontestPackage#getContest_Id()
	 * @model id="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link net.feichti.codingcontest.Contest#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Theme</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Theme</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Theme</em>' attribute.
	 * @see #setTheme(String)
	 * @see net.feichti.codingcontest.CodingcontestPackage#getContest_Theme()
	 * @model required="true"
	 * @generated
	 */
	String getTheme();

	/**
	 * Sets the value of the '{@link net.feichti.codingcontest.Contest#getTheme <em>Theme</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Theme</em>' attribute.
	 * @see #getTheme()
	 * @generated
	 */
	void setTheme(String value);

	/**
	 * Returns the value of the '<em><b>Local Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Local Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Local Date</em>' attribute.
	 * @see #setLocalDate(Date)
	 * @see net.feichti.codingcontest.CodingcontestPackage#getContest_LocalDate()
	 * @model required="true"
	 * @generated
	 */
	Date getLocalDate();

	/**
	 * Sets the value of the '{@link net.feichti.codingcontest.Contest#getLocalDate <em>Local Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Local Date</em>' attribute.
	 * @see #getLocalDate()
	 * @generated
	 */
	void setLocalDate(Date value);

	/**
	 * Returns the value of the '<em><b>Locations</b></em>' containment reference list.
	 * The list contents are of type {@link net.feichti.codingcontest.Location}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Locations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Locations</em>' containment reference list.
	 * @see net.feichti.codingcontest.CodingcontestPackage#getContest_Locations()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Location> getLocations();

	/**
	 * Returns the value of the '<em><b>Levels</b></em>' containment reference list.
	 * The list contents are of type {@link net.feichti.codingcontest.Level}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Levels</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Levels</em>' containment reference list.
	 * @see net.feichti.codingcontest.CodingcontestPackage#getContest_Levels()
	 * @model containment="true" lower="3" upper="8"
	 * @generated
	 */
	EList<Level> getLevels();

	/**
	 * Returns the value of the '<em><b>Entries</b></em>' containment reference list.
	 * The list contents are of type {@link net.feichti.codingcontest.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entries</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entries</em>' containment reference list.
	 * @see net.feichti.codingcontest.CodingcontestPackage#getContest_Entries()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Entry> getEntries();

	/**
	 * Returns the value of the '<em><b>Organizer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Organizer</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Organizer</em>' containment reference.
	 * @see #setOrganizer(Organizer)
	 * @see net.feichti.codingcontest.CodingcontestPackage#getContest_Organizer()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	Organizer getOrganizer();

	/**
	 * Sets the value of the '{@link net.feichti.codingcontest.Contest#getOrganizer <em>Organizer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Organizer</em>' containment reference.
	 * @see #getOrganizer()
	 * @generated
	 */
	void setOrganizer(Organizer value);

	/**
	 * Returns the value of the '<em><b>Problems</b></em>' containment reference list.
	 * The list contents are of type {@link net.feichti.codingcontest.Problem}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Problems</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Problems</em>' containment reference list.
	 * @see net.feichti.codingcontest.CodingcontestPackage#getContest_Problems()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Problem> getProblems();

} // Contest
