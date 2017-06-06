/**
 */
package net.feichti.codingcontest.impl;

import java.util.Map;

import net.feichti.codingcontest.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CodingcontestFactoryImpl extends EFactoryImpl implements CodingcontestFactory
{
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CodingcontestFactory init()
	{
		try
		{
			CodingcontestFactory theCodingcontestFactory = (CodingcontestFactory)EPackage.Registry.INSTANCE.getEFactory(CodingcontestPackage.eNS_URI);
			if (theCodingcontestFactory != null)
			{
				return theCodingcontestFactory;
			}
		}
		catch (Exception exception)
		{
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CodingcontestFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodingcontestFactoryImpl()
	{
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass)
	{
		switch (eClass.getClassifierID())
		{
			case CodingcontestPackage.CODER: return createCoder();
			case CodingcontestPackage.CONTEST: return createContest();
			case CodingcontestPackage.LOCATION: return createLocation();
			case CodingcontestPackage.TEAM: return createTeam();
			case CodingcontestPackage.ORGANIZER: return createOrganizer();
			case CodingcontestPackage.LEVEL: return createLevel();
			case CodingcontestPackage.PROBLEM: return createProblem();
			case CodingcontestPackage.LANGUAGE_TO_PROBLEM_MAP: return (EObject)createLanguageToProblemMap();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coder createCoder()
	{
		CoderImpl coder = new CoderImpl();
		return coder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Contest createContest()
	{
		ContestImpl contest = new ContestImpl();
		return contest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Location createLocation()
	{
		LocationImpl location = new LocationImpl();
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Team createTeam()
	{
		TeamImpl team = new TeamImpl();
		return team;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Organizer createOrganizer()
	{
		OrganizerImpl organizer = new OrganizerImpl();
		return organizer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Level createLevel()
	{
		LevelImpl level = new LevelImpl();
		return level;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Problem createProblem()
	{
		ProblemImpl problem = new ProblemImpl();
		return problem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map.Entry<String, Problem> createLanguageToProblemMap()
	{
		LanguageToProblemMapImpl languageToProblemMap = new LanguageToProblemMapImpl();
		return languageToProblemMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodingcontestPackage getCodingcontestPackage()
	{
		return (CodingcontestPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CodingcontestPackage getPackage()
	{
		return CodingcontestPackage.eINSTANCE;
	}

} //CodingcontestFactoryImpl
