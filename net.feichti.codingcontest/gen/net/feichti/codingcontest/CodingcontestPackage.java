/**
 */
package net.feichti.codingcontest;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see net.feichti.codingcontest.CodingcontestFactory
 * @model kind="package"
 * @generated
 */
public interface CodingcontestPackage extends EPackage
{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "codingcontest";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.feichti.net/codingcontest";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "fcc";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CodingcontestPackage eINSTANCE = net.feichti.codingcontest.impl.CodingcontestPackageImpl.init();

	/**
	 * The meta object id for the '{@link net.feichti.codingcontest.impl.CoderImpl <em>Coder</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.feichti.codingcontest.impl.CoderImpl
	 * @see net.feichti.codingcontest.impl.CodingcontestPackageImpl#getCoder()
	 * @generated
	 */
	int CODER = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Age</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODER__AGE = 1;

	/**
	 * The number of structural features of the '<em>Coder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODER_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link net.feichti.codingcontest.impl.ContestImpl <em>Contest</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.feichti.codingcontest.impl.ContestImpl
	 * @see net.feichti.codingcontest.impl.CodingcontestPackageImpl#getContest()
	 * @generated
	 */
	int CONTEST = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEST__ID = 0;

	/**
	 * The feature id for the '<em><b>Theme</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEST__THEME = 1;

	/**
	 * The feature id for the '<em><b>Locations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEST__LOCATIONS = 2;

	/**
	 * The feature id for the '<em><b>Levels</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEST__LEVELS = 3;

	/**
	 * The feature id for the '<em><b>Entries</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEST__ENTRIES = 4;

	/**
	 * The feature id for the '<em><b>Organizer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEST__ORGANIZER = 5;

	/**
	 * The feature id for the '<em><b>Problems</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEST__PROBLEMS = 6;

	/**
	 * The number of structural features of the '<em>Contest</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEST_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link net.feichti.codingcontest.impl.LocationImpl <em>Location</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.feichti.codingcontest.impl.LocationImpl
	 * @see net.feichti.codingcontest.impl.CodingcontestPackageImpl#getLocation()
	 * @generated
	 */
	int LOCATION = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__ADDRESS = 1;

	/**
	 * The feature id for the '<em><b>Country</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__COUNTRY = 2;

	/**
	 * The feature id for the '<em><b>Local Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__LOCAL_DATE = 3;

	/**
	 * The number of structural features of the '<em>Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link net.feichti.codingcontest.impl.TeamImpl <em>Team</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.feichti.codingcontest.impl.TeamImpl
	 * @see net.feichti.codingcontest.impl.CodingcontestPackageImpl#getTeam()
	 * @generated
	 */
	int TEAM = 3;

	/**
	 * The feature id for the '<em><b>Coders</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM__CODERS = 0;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM__LOCATION = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM__NAME = 2;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM__LANGUAGE = 3;

	/**
	 * The number of structural features of the '<em>Team</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link net.feichti.codingcontest.impl.OrganizerImpl <em>Organizer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.feichti.codingcontest.impl.OrganizerImpl
	 * @see net.feichti.codingcontest.impl.CodingcontestPackageImpl#getOrganizer()
	 * @generated
	 */
	int ORGANIZER = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Website</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZER__WEBSITE = 1;

	/**
	 * The number of structural features of the '<em>Organizer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZER_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link net.feichti.codingcontest.impl.LevelImpl <em>Level</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.feichti.codingcontest.impl.LevelImpl
	 * @see net.feichti.codingcontest.impl.CodingcontestPackageImpl#getLevel()
	 * @generated
	 */
	int LEVEL = 5;

	/**
	 * The feature id for the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEVEL__NUMBER = 0;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEVEL__TITLE = 1;

	/**
	 * The feature id for the '<em><b>Problems</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEVEL__PROBLEMS = 2;

	/**
	 * The number of structural features of the '<em>Level</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEVEL_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link net.feichti.codingcontest.impl.ProblemImpl <em>Problem</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.feichti.codingcontest.impl.ProblemImpl
	 * @see net.feichti.codingcontest.impl.CodingcontestPackageImpl#getProblem()
	 * @generated
	 */
	int PROBLEM = 6;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM__TITLE = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Result</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM__RESULT = 2;

	/**
	 * The number of structural features of the '<em>Problem</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link net.feichti.codingcontest.impl.LanguageToProblemMapImpl <em>Language To Problem Map</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.feichti.codingcontest.impl.LanguageToProblemMapImpl
	 * @see net.feichti.codingcontest.impl.CodingcontestPackageImpl#getLanguageToProblemMap()
	 * @generated
	 */
	int LANGUAGE_TO_PROBLEM_MAP = 7;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_TO_PROBLEM_MAP__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_TO_PROBLEM_MAP__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Language To Problem Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_TO_PROBLEM_MAP_FEATURE_COUNT = 2;

	/**
	 * Returns the meta object for class '{@link net.feichti.codingcontest.Coder <em>Coder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Coder</em>'.
	 * @see net.feichti.codingcontest.Coder
	 * @generated
	 */
	EClass getCoder();

	/**
	 * Returns the meta object for the attribute '{@link net.feichti.codingcontest.Coder#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see net.feichti.codingcontest.Coder#getName()
	 * @see #getCoder()
	 * @generated
	 */
	EAttribute getCoder_Name();

	/**
	 * Returns the meta object for the attribute '{@link net.feichti.codingcontest.Coder#getAge <em>Age</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Age</em>'.
	 * @see net.feichti.codingcontest.Coder#getAge()
	 * @see #getCoder()
	 * @generated
	 */
	EAttribute getCoder_Age();

	/**
	 * Returns the meta object for class '{@link net.feichti.codingcontest.Contest <em>Contest</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contest</em>'.
	 * @see net.feichti.codingcontest.Contest
	 * @generated
	 */
	EClass getContest();

	/**
	 * Returns the meta object for the attribute '{@link net.feichti.codingcontest.Contest#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see net.feichti.codingcontest.Contest#getId()
	 * @see #getContest()
	 * @generated
	 */
	EAttribute getContest_Id();

	/**
	 * Returns the meta object for the attribute '{@link net.feichti.codingcontest.Contest#getTheme <em>Theme</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Theme</em>'.
	 * @see net.feichti.codingcontest.Contest#getTheme()
	 * @see #getContest()
	 * @generated
	 */
	EAttribute getContest_Theme();

	/**
	 * Returns the meta object for the containment reference list '{@link net.feichti.codingcontest.Contest#getLocations <em>Locations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Locations</em>'.
	 * @see net.feichti.codingcontest.Contest#getLocations()
	 * @see #getContest()
	 * @generated
	 */
	EReference getContest_Locations();

	/**
	 * Returns the meta object for the containment reference list '{@link net.feichti.codingcontest.Contest#getLevels <em>Levels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Levels</em>'.
	 * @see net.feichti.codingcontest.Contest#getLevels()
	 * @see #getContest()
	 * @generated
	 */
	EReference getContest_Levels();

	/**
	 * Returns the meta object for the containment reference list '{@link net.feichti.codingcontest.Contest#getEntries <em>Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entries</em>'.
	 * @see net.feichti.codingcontest.Contest#getEntries()
	 * @see #getContest()
	 * @generated
	 */
	EReference getContest_Entries();

	/**
	 * Returns the meta object for the containment reference '{@link net.feichti.codingcontest.Contest#getOrganizer <em>Organizer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Organizer</em>'.
	 * @see net.feichti.codingcontest.Contest#getOrganizer()
	 * @see #getContest()
	 * @generated
	 */
	EReference getContest_Organizer();

	/**
	 * Returns the meta object for the containment reference list '{@link net.feichti.codingcontest.Contest#getProblems <em>Problems</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Problems</em>'.
	 * @see net.feichti.codingcontest.Contest#getProblems()
	 * @see #getContest()
	 * @generated
	 */
	EReference getContest_Problems();

	/**
	 * Returns the meta object for class '{@link net.feichti.codingcontest.Location <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Location</em>'.
	 * @see net.feichti.codingcontest.Location
	 * @generated
	 */
	EClass getLocation();

	/**
	 * Returns the meta object for the attribute '{@link net.feichti.codingcontest.Location#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see net.feichti.codingcontest.Location#getName()
	 * @see #getLocation()
	 * @generated
	 */
	EAttribute getLocation_Name();

	/**
	 * Returns the meta object for the attribute '{@link net.feichti.codingcontest.Location#getAddress <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Address</em>'.
	 * @see net.feichti.codingcontest.Location#getAddress()
	 * @see #getLocation()
	 * @generated
	 */
	EAttribute getLocation_Address();

	/**
	 * Returns the meta object for the attribute '{@link net.feichti.codingcontest.Location#getCountry <em>Country</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Country</em>'.
	 * @see net.feichti.codingcontest.Location#getCountry()
	 * @see #getLocation()
	 * @generated
	 */
	EAttribute getLocation_Country();

	/**
	 * Returns the meta object for the attribute '{@link net.feichti.codingcontest.Location#getLocalDate <em>Local Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Local Date</em>'.
	 * @see net.feichti.codingcontest.Location#getLocalDate()
	 * @see #getLocation()
	 * @generated
	 */
	EAttribute getLocation_LocalDate();

	/**
	 * Returns the meta object for class '{@link net.feichti.codingcontest.Team <em>Team</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Team</em>'.
	 * @see net.feichti.codingcontest.Team
	 * @generated
	 */
	EClass getTeam();

	/**
	 * Returns the meta object for the containment reference list '{@link net.feichti.codingcontest.Team#getCoders <em>Coders</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Coders</em>'.
	 * @see net.feichti.codingcontest.Team#getCoders()
	 * @see #getTeam()
	 * @generated
	 */
	EReference getTeam_Coders();

	/**
	 * Returns the meta object for the reference '{@link net.feichti.codingcontest.Team#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Location</em>'.
	 * @see net.feichti.codingcontest.Team#getLocation()
	 * @see #getTeam()
	 * @generated
	 */
	EReference getTeam_Location();

	/**
	 * Returns the meta object for the attribute '{@link net.feichti.codingcontest.Team#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see net.feichti.codingcontest.Team#getName()
	 * @see #getTeam()
	 * @generated
	 */
	EAttribute getTeam_Name();

	/**
	 * Returns the meta object for the attribute '{@link net.feichti.codingcontest.Team#getLanguage <em>Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Language</em>'.
	 * @see net.feichti.codingcontest.Team#getLanguage()
	 * @see #getTeam()
	 * @generated
	 */
	EAttribute getTeam_Language();

	/**
	 * Returns the meta object for class '{@link net.feichti.codingcontest.Organizer <em>Organizer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Organizer</em>'.
	 * @see net.feichti.codingcontest.Organizer
	 * @generated
	 */
	EClass getOrganizer();

	/**
	 * Returns the meta object for the attribute '{@link net.feichti.codingcontest.Organizer#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see net.feichti.codingcontest.Organizer#getName()
	 * @see #getOrganizer()
	 * @generated
	 */
	EAttribute getOrganizer_Name();

	/**
	 * Returns the meta object for the attribute '{@link net.feichti.codingcontest.Organizer#getWebsite <em>Website</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Website</em>'.
	 * @see net.feichti.codingcontest.Organizer#getWebsite()
	 * @see #getOrganizer()
	 * @generated
	 */
	EAttribute getOrganizer_Website();

	/**
	 * Returns the meta object for class '{@link net.feichti.codingcontest.Level <em>Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Level</em>'.
	 * @see net.feichti.codingcontest.Level
	 * @generated
	 */
	EClass getLevel();

	/**
	 * Returns the meta object for the attribute '{@link net.feichti.codingcontest.Level#getNumber <em>Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number</em>'.
	 * @see net.feichti.codingcontest.Level#getNumber()
	 * @see #getLevel()
	 * @generated
	 */
	EAttribute getLevel_Number();

	/**
	 * Returns the meta object for the attribute '{@link net.feichti.codingcontest.Level#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see net.feichti.codingcontest.Level#getTitle()
	 * @see #getLevel()
	 * @generated
	 */
	EAttribute getLevel_Title();

	/**
	 * Returns the meta object for the map '{@link net.feichti.codingcontest.Level#getProblems <em>Problems</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Problems</em>'.
	 * @see net.feichti.codingcontest.Level#getProblems()
	 * @see #getLevel()
	 * @generated
	 */
	EReference getLevel_Problems();

	/**
	 * Returns the meta object for class '{@link net.feichti.codingcontest.Problem <em>Problem</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Problem</em>'.
	 * @see net.feichti.codingcontest.Problem
	 * @generated
	 */
	EClass getProblem();

	/**
	 * Returns the meta object for the attribute '{@link net.feichti.codingcontest.Problem#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see net.feichti.codingcontest.Problem#getTitle()
	 * @see #getProblem()
	 * @generated
	 */
	EAttribute getProblem_Title();

	/**
	 * Returns the meta object for the attribute '{@link net.feichti.codingcontest.Problem#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see net.feichti.codingcontest.Problem#getDescription()
	 * @see #getProblem()
	 * @generated
	 */
	EAttribute getProblem_Description();

	/**
	 * Returns the meta object for the attribute '{@link net.feichti.codingcontest.Problem#getResult <em>Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Result</em>'.
	 * @see net.feichti.codingcontest.Problem#getResult()
	 * @see #getProblem()
	 * @generated
	 */
	EAttribute getProblem_Result();

	/**
	 * Returns the meta object for class '{@link java.util.Map.Entry <em>Language To Problem Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Language To Problem Map</em>'.
	 * @see java.util.Map.Entry
	 * @model keyDataType="org.eclipse.emf.ecore.xml.type.Language" keyRequired="true"
	 *        valueType="net.feichti.codingcontest.Problem" valueResolveProxies="false" valueRequired="true" valueOrdered="false"
	 * @generated
	 */
	EClass getLanguageToProblemMap();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see java.util.Map.Entry
	 * @see #getLanguageToProblemMap()
	 * @generated
	 */
	EAttribute getLanguageToProblemMap_Key();

	/**
	 * Returns the meta object for the reference '{@link java.util.Map.Entry <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see java.util.Map.Entry
	 * @see #getLanguageToProblemMap()
	 * @generated
	 */
	EReference getLanguageToProblemMap_Value();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CodingcontestFactory getCodingcontestFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals
	{
		/**
		 * The meta object literal for the '{@link net.feichti.codingcontest.impl.CoderImpl <em>Coder</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.feichti.codingcontest.impl.CoderImpl
		 * @see net.feichti.codingcontest.impl.CodingcontestPackageImpl#getCoder()
		 * @generated
		 */
		EClass CODER = eINSTANCE.getCoder();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CODER__NAME = eINSTANCE.getCoder_Name();

		/**
		 * The meta object literal for the '<em><b>Age</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CODER__AGE = eINSTANCE.getCoder_Age();

		/**
		 * The meta object literal for the '{@link net.feichti.codingcontest.impl.ContestImpl <em>Contest</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.feichti.codingcontest.impl.ContestImpl
		 * @see net.feichti.codingcontest.impl.CodingcontestPackageImpl#getContest()
		 * @generated
		 */
		EClass CONTEST = eINSTANCE.getContest();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTEST__ID = eINSTANCE.getContest_Id();

		/**
		 * The meta object literal for the '<em><b>Theme</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTEST__THEME = eINSTANCE.getContest_Theme();

		/**
		 * The meta object literal for the '<em><b>Locations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTEST__LOCATIONS = eINSTANCE.getContest_Locations();

		/**
		 * The meta object literal for the '<em><b>Levels</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTEST__LEVELS = eINSTANCE.getContest_Levels();

		/**
		 * The meta object literal for the '<em><b>Entries</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTEST__ENTRIES = eINSTANCE.getContest_Entries();

		/**
		 * The meta object literal for the '<em><b>Organizer</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTEST__ORGANIZER = eINSTANCE.getContest_Organizer();

		/**
		 * The meta object literal for the '<em><b>Problems</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTEST__PROBLEMS = eINSTANCE.getContest_Problems();

		/**
		 * The meta object literal for the '{@link net.feichti.codingcontest.impl.LocationImpl <em>Location</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.feichti.codingcontest.impl.LocationImpl
		 * @see net.feichti.codingcontest.impl.CodingcontestPackageImpl#getLocation()
		 * @generated
		 */
		EClass LOCATION = eINSTANCE.getLocation();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCATION__NAME = eINSTANCE.getLocation_Name();

		/**
		 * The meta object literal for the '<em><b>Address</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCATION__ADDRESS = eINSTANCE.getLocation_Address();

		/**
		 * The meta object literal for the '<em><b>Country</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCATION__COUNTRY = eINSTANCE.getLocation_Country();

		/**
		 * The meta object literal for the '<em><b>Local Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCATION__LOCAL_DATE = eINSTANCE.getLocation_LocalDate();

		/**
		 * The meta object literal for the '{@link net.feichti.codingcontest.impl.TeamImpl <em>Team</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.feichti.codingcontest.impl.TeamImpl
		 * @see net.feichti.codingcontest.impl.CodingcontestPackageImpl#getTeam()
		 * @generated
		 */
		EClass TEAM = eINSTANCE.getTeam();

		/**
		 * The meta object literal for the '<em><b>Coders</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEAM__CODERS = eINSTANCE.getTeam_Coders();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEAM__LOCATION = eINSTANCE.getTeam_Location();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEAM__NAME = eINSTANCE.getTeam_Name();

		/**
		 * The meta object literal for the '<em><b>Language</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEAM__LANGUAGE = eINSTANCE.getTeam_Language();

		/**
		 * The meta object literal for the '{@link net.feichti.codingcontest.impl.OrganizerImpl <em>Organizer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.feichti.codingcontest.impl.OrganizerImpl
		 * @see net.feichti.codingcontest.impl.CodingcontestPackageImpl#getOrganizer()
		 * @generated
		 */
		EClass ORGANIZER = eINSTANCE.getOrganizer();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORGANIZER__NAME = eINSTANCE.getOrganizer_Name();

		/**
		 * The meta object literal for the '<em><b>Website</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORGANIZER__WEBSITE = eINSTANCE.getOrganizer_Website();

		/**
		 * The meta object literal for the '{@link net.feichti.codingcontest.impl.LevelImpl <em>Level</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.feichti.codingcontest.impl.LevelImpl
		 * @see net.feichti.codingcontest.impl.CodingcontestPackageImpl#getLevel()
		 * @generated
		 */
		EClass LEVEL = eINSTANCE.getLevel();

		/**
		 * The meta object literal for the '<em><b>Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEVEL__NUMBER = eINSTANCE.getLevel_Number();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEVEL__TITLE = eINSTANCE.getLevel_Title();

		/**
		 * The meta object literal for the '<em><b>Problems</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LEVEL__PROBLEMS = eINSTANCE.getLevel_Problems();

		/**
		 * The meta object literal for the '{@link net.feichti.codingcontest.impl.ProblemImpl <em>Problem</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.feichti.codingcontest.impl.ProblemImpl
		 * @see net.feichti.codingcontest.impl.CodingcontestPackageImpl#getProblem()
		 * @generated
		 */
		EClass PROBLEM = eINSTANCE.getProblem();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROBLEM__TITLE = eINSTANCE.getProblem_Title();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROBLEM__DESCRIPTION = eINSTANCE.getProblem_Description();

		/**
		 * The meta object literal for the '<em><b>Result</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROBLEM__RESULT = eINSTANCE.getProblem_Result();

		/**
		 * The meta object literal for the '{@link net.feichti.codingcontest.impl.LanguageToProblemMapImpl <em>Language To Problem Map</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.feichti.codingcontest.impl.LanguageToProblemMapImpl
		 * @see net.feichti.codingcontest.impl.CodingcontestPackageImpl#getLanguageToProblemMap()
		 * @generated
		 */
		EClass LANGUAGE_TO_PROBLEM_MAP = eINSTANCE.getLanguageToProblemMap();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LANGUAGE_TO_PROBLEM_MAP__KEY = eINSTANCE.getLanguageToProblemMap_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LANGUAGE_TO_PROBLEM_MAP__VALUE = eINSTANCE.getLanguageToProblemMap_Value();

	}

} //CodingcontestPackage
