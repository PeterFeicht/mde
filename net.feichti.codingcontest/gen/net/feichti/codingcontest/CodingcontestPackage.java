/**
 */
package net.feichti.codingcontest;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODER__CATEGORY = 2;

	/**
	 * The number of structural features of the '<em>Coder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODER_FEATURE_COUNT = 3;

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
	 * The feature id for the '<em><b>Local Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEST__LOCAL_DATE = 2;

	/**
	 * The feature id for the '<em><b>Location</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEST__LOCATION = 3;

	/**
	 * The feature id for the '<em><b>Level</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEST__LEVEL = 4;

	/**
	 * The feature id for the '<em><b>Entry</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEST__ENTRY = 5;

	/**
	 * The feature id for the '<em><b>Organizer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEST__ORGANIZER = 6;

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
	 * The number of structural features of the '<em>Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link net.feichti.codingcontest.impl.EntryImpl <em>Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.feichti.codingcontest.impl.EntryImpl
	 * @see net.feichti.codingcontest.impl.CodingcontestPackageImpl#getEntry()
	 * @generated
	 */
	int ENTRY = 3;

	/**
	 * The feature id for the '<em><b>Coder</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY__CODER = 0;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY__LOCATION = 1;

	/**
	 * The feature id for the '<em><b>Team Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY__TEAM_NAME = 2;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY__LANGUAGE = 3;

	/**
	 * The number of structural features of the '<em>Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_FEATURE_COUNT = 4;

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
	 * The feature id for the '<em><b>Problem</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEVEL__PROBLEM = 2;

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
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
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
	 * The meta object id for the '{@link net.feichti.codingcontest.Category <em>Category</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.feichti.codingcontest.Category
	 * @see net.feichti.codingcontest.impl.CodingcontestPackageImpl#getCategory()
	 * @generated
	 */
	int CATEGORY = 8;


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
	 * Returns the meta object for the attribute '{@link net.feichti.codingcontest.Coder#getCategory <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Category</em>'.
	 * @see net.feichti.codingcontest.Coder#getCategory()
	 * @see #getCoder()
	 * @generated
	 */
	EAttribute getCoder_Category();

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
	 * Returns the meta object for the attribute '{@link net.feichti.codingcontest.Contest#getLocalDate <em>Local Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Local Date</em>'.
	 * @see net.feichti.codingcontest.Contest#getLocalDate()
	 * @see #getContest()
	 * @generated
	 */
	EAttribute getContest_LocalDate();

	/**
	 * Returns the meta object for the containment reference list '{@link net.feichti.codingcontest.Contest#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Location</em>'.
	 * @see net.feichti.codingcontest.Contest#getLocation()
	 * @see #getContest()
	 * @generated
	 */
	EReference getContest_Location();

	/**
	 * Returns the meta object for the containment reference list '{@link net.feichti.codingcontest.Contest#getLevel <em>Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Level</em>'.
	 * @see net.feichti.codingcontest.Contest#getLevel()
	 * @see #getContest()
	 * @generated
	 */
	EReference getContest_Level();

	/**
	 * Returns the meta object for the containment reference list '{@link net.feichti.codingcontest.Contest#getEntry <em>Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entry</em>'.
	 * @see net.feichti.codingcontest.Contest#getEntry()
	 * @see #getContest()
	 * @generated
	 */
	EReference getContest_Entry();

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
	 * Returns the meta object for class '{@link net.feichti.codingcontest.Entry <em>Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entry</em>'.
	 * @see net.feichti.codingcontest.Entry
	 * @generated
	 */
	EClass getEntry();

	/**
	 * Returns the meta object for the containment reference list '{@link net.feichti.codingcontest.Entry#getCoder <em>Coder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Coder</em>'.
	 * @see net.feichti.codingcontest.Entry#getCoder()
	 * @see #getEntry()
	 * @generated
	 */
	EReference getEntry_Coder();

	/**
	 * Returns the meta object for the reference '{@link net.feichti.codingcontest.Entry#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Location</em>'.
	 * @see net.feichti.codingcontest.Entry#getLocation()
	 * @see #getEntry()
	 * @generated
	 */
	EReference getEntry_Location();

	/**
	 * Returns the meta object for the attribute '{@link net.feichti.codingcontest.Entry#getTeamName <em>Team Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Team Name</em>'.
	 * @see net.feichti.codingcontest.Entry#getTeamName()
	 * @see #getEntry()
	 * @generated
	 */
	EAttribute getEntry_TeamName();

	/**
	 * Returns the meta object for the attribute '{@link net.feichti.codingcontest.Entry#getLanguage <em>Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Language</em>'.
	 * @see net.feichti.codingcontest.Entry#getLanguage()
	 * @see #getEntry()
	 * @generated
	 */
	EAttribute getEntry_Language();

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
	 * Returns the meta object for the map '{@link net.feichti.codingcontest.Level#getProblem <em>Problem</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Problem</em>'.
	 * @see net.feichti.codingcontest.Level#getProblem()
	 * @see #getLevel()
	 * @generated
	 */
	EReference getLevel_Problem();

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
	 * @model keyId="true" keyDataType="org.eclipse.emf.ecore.xml.type.Language"
	 *        valueType="net.feichti.codingcontest.Problem" valueContainment="true" valueRequired="true" valueOrdered="false"
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
	 * Returns the meta object for the containment reference '{@link java.util.Map.Entry <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see java.util.Map.Entry
	 * @see #getLanguageToProblemMap()
	 * @generated
	 */
	EReference getLanguageToProblemMap_Value();

	/**
	 * Returns the meta object for enum '{@link net.feichti.codingcontest.Category <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Category</em>'.
	 * @see net.feichti.codingcontest.Category
	 * @generated
	 */
	EEnum getCategory();

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
		 * The meta object literal for the '<em><b>Category</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CODER__CATEGORY = eINSTANCE.getCoder_Category();

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
		 * The meta object literal for the '<em><b>Local Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTEST__LOCAL_DATE = eINSTANCE.getContest_LocalDate();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTEST__LOCATION = eINSTANCE.getContest_Location();

		/**
		 * The meta object literal for the '<em><b>Level</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTEST__LEVEL = eINSTANCE.getContest_Level();

		/**
		 * The meta object literal for the '<em><b>Entry</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTEST__ENTRY = eINSTANCE.getContest_Entry();

		/**
		 * The meta object literal for the '<em><b>Organizer</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTEST__ORGANIZER = eINSTANCE.getContest_Organizer();

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
		 * The meta object literal for the '{@link net.feichti.codingcontest.impl.EntryImpl <em>Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.feichti.codingcontest.impl.EntryImpl
		 * @see net.feichti.codingcontest.impl.CodingcontestPackageImpl#getEntry()
		 * @generated
		 */
		EClass ENTRY = eINSTANCE.getEntry();

		/**
		 * The meta object literal for the '<em><b>Coder</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTRY__CODER = eINSTANCE.getEntry_Coder();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTRY__LOCATION = eINSTANCE.getEntry_Location();

		/**
		 * The meta object literal for the '<em><b>Team Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTRY__TEAM_NAME = eINSTANCE.getEntry_TeamName();

		/**
		 * The meta object literal for the '<em><b>Language</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTRY__LANGUAGE = eINSTANCE.getEntry_Language();

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
		 * The meta object literal for the '<em><b>Problem</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LEVEL__PROBLEM = eINSTANCE.getLevel_Problem();

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
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LANGUAGE_TO_PROBLEM_MAP__VALUE = eINSTANCE.getLanguageToProblemMap_Value();

		/**
		 * The meta object literal for the '{@link net.feichti.codingcontest.Category <em>Category</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.feichti.codingcontest.Category
		 * @see net.feichti.codingcontest.impl.CodingcontestPackageImpl#getCategory()
		 * @generated
		 */
		EEnum CATEGORY = eINSTANCE.getCategory();

	}

} //CodingcontestPackage
