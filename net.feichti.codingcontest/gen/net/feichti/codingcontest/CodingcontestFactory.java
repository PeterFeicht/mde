/**
 */
package net.feichti.codingcontest;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see net.feichti.codingcontest.CodingcontestPackage
 * @generated
 */
public interface CodingcontestFactory extends EFactory
{
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CodingcontestFactory eINSTANCE = net.feichti.codingcontest.impl.CodingcontestFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Coder</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Coder</em>'.
	 * @generated
	 */
	Coder createCoder();

	/**
	 * Returns a new object of class '<em>Contest</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Contest</em>'.
	 * @generated
	 */
	Contest createContest();

	/**
	 * Returns a new object of class '<em>Location</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Location</em>'.
	 * @generated
	 */
	Location createLocation();

	/**
	 * Returns a new object of class '<em>Team</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Team</em>'.
	 * @generated
	 */
	Team createTeam();

	/**
	 * Returns a new object of class '<em>Organizer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Organizer</em>'.
	 * @generated
	 */
	Organizer createOrganizer();

	/**
	 * Returns a new object of class '<em>Level</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Level</em>'.
	 * @generated
	 */
	Level createLevel();

	/**
	 * Returns a new object of class '<em>Problem</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Problem</em>'.
	 * @generated
	 */
	Problem createProblem();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	CodingcontestPackage getCodingcontestPackage();

} //CodingcontestFactory
