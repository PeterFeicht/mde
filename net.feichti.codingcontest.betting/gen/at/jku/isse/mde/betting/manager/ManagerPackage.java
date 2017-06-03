/**
 */
package at.jku.isse.mde.betting.manager;

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
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * This package contains the set of concepts to keep the
 * state of different competitive activities and allow users to place bets on the
 * events of these activities.
 * <!-- end-model-doc -->
 * @see at.jku.isse.mde.betting.manager.ManagerFactory
 * @model kind="package"
 * @generated
 */
public interface ManagerPackage extends EPackage
{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "manager";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.jku.at/isse/mde/betting/Manager.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "mgr";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ManagerPackage eINSTANCE = at.jku.isse.mde.betting.manager.impl.ManagerPackageImpl.init();

	/**
	 * The meta object id for the '{@link at.jku.isse.mde.betting.manager.impl.ManagerImpl <em>Manager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.jku.isse.mde.betting.manager.impl.ManagerImpl
	 * @see at.jku.isse.mde.betting.manager.impl.ManagerPackageImpl#getManager()
	 * @generated
	 */
	int MANAGER = 1;

	/**
	 * The meta object id for the '{@link at.jku.isse.mde.betting.manager.impl.IdElementImpl <em>Id Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.jku.isse.mde.betting.manager.impl.IdElementImpl
	 * @see at.jku.isse.mde.betting.manager.impl.ManagerPackageImpl#getIdElement()
	 * @generated
	 */
	int ID_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_ELEMENT__ID = 0;

	/**
	 * The number of structural features of the '<em>Id Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Id Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGER__ID = ID_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Categories</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGER__CATEGORIES = ID_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Bets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGER__BETS = ID_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Users</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGER__USERS = ID_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGER_FEATURE_COUNT = ID_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGER_OPERATION_COUNT = ID_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link at.jku.isse.mde.betting.manager.impl.CategoryImpl <em>Category</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.jku.isse.mde.betting.manager.impl.CategoryImpl
	 * @see at.jku.isse.mde.betting.manager.impl.ManagerPackageImpl#getCategory()
	 * @generated
	 */
	int CATEGORY = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__ID = ID_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__NAME = ID_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Sort Rank</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__SORT_RANK = ID_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__GROUPS = ID_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Category</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_FEATURE_COUNT = ID_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Category</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_OPERATION_COUNT = ID_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link at.jku.isse.mde.betting.manager.impl.GroupImpl <em>Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.jku.isse.mde.betting.manager.impl.GroupImpl
	 * @see at.jku.isse.mde.betting.manager.impl.ManagerPackageImpl#getGroup()
	 * @generated
	 */
	int GROUP = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__ID = ID_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__TITLE = ID_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__DESCRIPTION = ID_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__START_DATE = ID_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>End Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__END_DATE = ID_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Resolved</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__RESOLVED = ID_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Category</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__CATEGORY = ID_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Matches</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__MATCHES = ID_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_FEATURE_COUNT = ID_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_OPERATION_COUNT = ID_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link at.jku.isse.mde.betting.manager.impl.MatchImpl <em>Match</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.jku.isse.mde.betting.manager.impl.MatchImpl
	 * @see at.jku.isse.mde.betting.manager.impl.ManagerPackageImpl#getMatch()
	 * @generated
	 */
	int MATCH = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCH__ID = ID_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCH__TITLE = ID_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Sort Rank</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCH__SORT_RANK = ID_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Result Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCH__RESULT_TYPE = ID_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Resolved</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCH__RESOLVED = ID_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCH__DATE = ID_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Group</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCH__GROUP = ID_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Opponents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCH__OPPONENTS = ID_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCH__RESULT = ID_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Match</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCH_FEATURE_COUNT = ID_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>Match</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCH_OPERATION_COUNT = ID_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link at.jku.isse.mde.betting.manager.impl.OpponentImpl <em>Opponent</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.jku.isse.mde.betting.manager.impl.OpponentImpl
	 * @see at.jku.isse.mde.betting.manager.impl.ManagerPackageImpl#getOpponent()
	 * @generated
	 */
	int OPPONENT = 5;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPPONENT__REFERENCE = 0;

	/**
	 * The number of structural features of the '<em>Opponent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPPONENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Opponent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPPONENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link at.jku.isse.mde.betting.manager.impl.ResultImpl <em>Result</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.jku.isse.mde.betting.manager.impl.ResultImpl
	 * @see at.jku.isse.mde.betting.manager.impl.ManagerPackageImpl#getResult()
	 * @generated
	 */
	int RESULT = 6;

	/**
	 * The number of structural features of the '<em>Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link at.jku.isse.mde.betting.manager.impl.WinLooseResultImpl <em>Win Loose Result</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.jku.isse.mde.betting.manager.impl.WinLooseResultImpl
	 * @see at.jku.isse.mde.betting.manager.impl.ManagerPackageImpl#getWinLooseResult()
	 * @generated
	 */
	int WIN_LOOSE_RESULT = 7;

	/**
	 * The feature id for the '<em><b>Is Draw</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIN_LOOSE_RESULT__IS_DRAW = RESULT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Winner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIN_LOOSE_RESULT__WINNER = RESULT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Win Loose Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIN_LOOSE_RESULT_FEATURE_COUNT = RESULT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Win Loose Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIN_LOOSE_RESULT_OPERATION_COUNT = RESULT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link at.jku.isse.mde.betting.manager.impl.PositionResultImpl <em>Position Result</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.jku.isse.mde.betting.manager.impl.PositionResultImpl
	 * @see at.jku.isse.mde.betting.manager.impl.ManagerPackageImpl#getPositionResult()
	 * @generated
	 */
	int POSITION_RESULT = 8;

	/**
	 * The feature id for the '<em><b>Order</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_RESULT__ORDER = RESULT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Position Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_RESULT_FEATURE_COUNT = RESULT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Position Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_RESULT_OPERATION_COUNT = RESULT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link at.jku.isse.mde.betting.manager.impl.BetImpl <em>Bet</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.jku.isse.mde.betting.manager.impl.BetImpl
	 * @see at.jku.isse.mde.betting.manager.impl.ManagerPackageImpl#getBet()
	 * @generated
	 */
	int BET = 9;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BET__ID = ID_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BET__AMOUNT = ID_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BET__DATE = ID_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Payed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BET__PAYED = ID_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Position Bet Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BET__POSITION_BET_TYPE = ID_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Bet On</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BET__BET_ON = ID_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Expected Result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BET__EXPECTED_RESULT = ID_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>User</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BET__USER = ID_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Bet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BET_FEATURE_COUNT = ID_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Bet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BET_OPERATION_COUNT = ID_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link at.jku.isse.mde.betting.manager.impl.UserImpl <em>User</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.jku.isse.mde.betting.manager.impl.UserImpl
	 * @see at.jku.isse.mde.betting.manager.impl.ManagerPackageImpl#getUser()
	 * @generated
	 */
	int USER = 10;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__ID = ID_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__EMAIL = ID_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__PASSWORD = ID_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Balance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__BALANCE = ID_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Bets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__BETS = ID_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_FEATURE_COUNT = ID_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_OPERATION_COUNT = ID_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link at.jku.isse.mde.betting.manager.ResultType <em>Result Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.jku.isse.mde.betting.manager.ResultType
	 * @see at.jku.isse.mde.betting.manager.impl.ManagerPackageImpl#getResultType()
	 * @generated
	 */
	int RESULT_TYPE = 11;


	/**
	 * The meta object id for the '{@link at.jku.isse.mde.betting.manager.PositionBetType <em>Position Bet Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.jku.isse.mde.betting.manager.PositionBetType
	 * @see at.jku.isse.mde.betting.manager.impl.ManagerPackageImpl#getPositionBetType()
	 * @generated
	 */
	int POSITION_BET_TYPE = 12;


	/**
	 * Returns the meta object for class '{@link at.jku.isse.mde.betting.manager.Manager <em>Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Manager</em>'.
	 * @see at.jku.isse.mde.betting.manager.Manager
	 * @generated
	 */
	EClass getManager();

	/**
	 * Returns the meta object for the containment reference list '{@link at.jku.isse.mde.betting.manager.Manager#getCategories <em>Categories</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Categories</em>'.
	 * @see at.jku.isse.mde.betting.manager.Manager#getCategories()
	 * @see #getManager()
	 * @generated
	 */
	EReference getManager_Categories();

	/**
	 * Returns the meta object for the containment reference list '{@link at.jku.isse.mde.betting.manager.Manager#getBets <em>Bets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bets</em>'.
	 * @see at.jku.isse.mde.betting.manager.Manager#getBets()
	 * @see #getManager()
	 * @generated
	 */
	EReference getManager_Bets();

	/**
	 * Returns the meta object for the containment reference list '{@link at.jku.isse.mde.betting.manager.Manager#getUsers <em>Users</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Users</em>'.
	 * @see at.jku.isse.mde.betting.manager.Manager#getUsers()
	 * @see #getManager()
	 * @generated
	 */
	EReference getManager_Users();

	/**
	 * Returns the meta object for class '{@link at.jku.isse.mde.betting.manager.IdElement <em>Id Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Id Element</em>'.
	 * @see at.jku.isse.mde.betting.manager.IdElement
	 * @generated
	 */
	EClass getIdElement();

	/**
	 * Returns the meta object for the attribute '{@link at.jku.isse.mde.betting.manager.IdElement#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see at.jku.isse.mde.betting.manager.IdElement#getId()
	 * @see #getIdElement()
	 * @generated
	 */
	EAttribute getIdElement_Id();

	/**
	 * Returns the meta object for class '{@link at.jku.isse.mde.betting.manager.Category <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Category</em>'.
	 * @see at.jku.isse.mde.betting.manager.Category
	 * @generated
	 */
	EClass getCategory();

	/**
	 * Returns the meta object for the attribute '{@link at.jku.isse.mde.betting.manager.Category#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see at.jku.isse.mde.betting.manager.Category#getName()
	 * @see #getCategory()
	 * @generated
	 */
	EAttribute getCategory_Name();

	/**
	 * Returns the meta object for the attribute '{@link at.jku.isse.mde.betting.manager.Category#getSortRank <em>Sort Rank</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sort Rank</em>'.
	 * @see at.jku.isse.mde.betting.manager.Category#getSortRank()
	 * @see #getCategory()
	 * @generated
	 */
	EAttribute getCategory_SortRank();

	/**
	 * Returns the meta object for the containment reference list '{@link at.jku.isse.mde.betting.manager.Category#getGroups <em>Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Groups</em>'.
	 * @see at.jku.isse.mde.betting.manager.Category#getGroups()
	 * @see #getCategory()
	 * @generated
	 */
	EReference getCategory_Groups();

	/**
	 * Returns the meta object for class '{@link at.jku.isse.mde.betting.manager.Group <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Group</em>'.
	 * @see at.jku.isse.mde.betting.manager.Group
	 * @generated
	 */
	EClass getGroup();

	/**
	 * Returns the meta object for the attribute '{@link at.jku.isse.mde.betting.manager.Group#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see at.jku.isse.mde.betting.manager.Group#getTitle()
	 * @see #getGroup()
	 * @generated
	 */
	EAttribute getGroup_Title();

	/**
	 * Returns the meta object for the attribute '{@link at.jku.isse.mde.betting.manager.Group#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see at.jku.isse.mde.betting.manager.Group#getDescription()
	 * @see #getGroup()
	 * @generated
	 */
	EAttribute getGroup_Description();

	/**
	 * Returns the meta object for the attribute '{@link at.jku.isse.mde.betting.manager.Group#getStartDate <em>Start Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Date</em>'.
	 * @see at.jku.isse.mde.betting.manager.Group#getStartDate()
	 * @see #getGroup()
	 * @generated
	 */
	EAttribute getGroup_StartDate();

	/**
	 * Returns the meta object for the attribute '{@link at.jku.isse.mde.betting.manager.Group#getEndDate <em>End Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Date</em>'.
	 * @see at.jku.isse.mde.betting.manager.Group#getEndDate()
	 * @see #getGroup()
	 * @generated
	 */
	EAttribute getGroup_EndDate();

	/**
	 * Returns the meta object for the attribute '{@link at.jku.isse.mde.betting.manager.Group#isResolved <em>Resolved</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resolved</em>'.
	 * @see at.jku.isse.mde.betting.manager.Group#isResolved()
	 * @see #getGroup()
	 * @generated
	 */
	EAttribute getGroup_Resolved();

	/**
	 * Returns the meta object for the container reference '{@link at.jku.isse.mde.betting.manager.Group#getCategory <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Category</em>'.
	 * @see at.jku.isse.mde.betting.manager.Group#getCategory()
	 * @see #getGroup()
	 * @generated
	 */
	EReference getGroup_Category();

	/**
	 * Returns the meta object for the containment reference list '{@link at.jku.isse.mde.betting.manager.Group#getMatches <em>Matches</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Matches</em>'.
	 * @see at.jku.isse.mde.betting.manager.Group#getMatches()
	 * @see #getGroup()
	 * @generated
	 */
	EReference getGroup_Matches();

	/**
	 * Returns the meta object for class '{@link at.jku.isse.mde.betting.manager.Match <em>Match</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Match</em>'.
	 * @see at.jku.isse.mde.betting.manager.Match
	 * @generated
	 */
	EClass getMatch();

	/**
	 * Returns the meta object for the attribute '{@link at.jku.isse.mde.betting.manager.Match#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see at.jku.isse.mde.betting.manager.Match#getTitle()
	 * @see #getMatch()
	 * @generated
	 */
	EAttribute getMatch_Title();

	/**
	 * Returns the meta object for the attribute '{@link at.jku.isse.mde.betting.manager.Match#getSortRank <em>Sort Rank</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sort Rank</em>'.
	 * @see at.jku.isse.mde.betting.manager.Match#getSortRank()
	 * @see #getMatch()
	 * @generated
	 */
	EAttribute getMatch_SortRank();

	/**
	 * Returns the meta object for the attribute '{@link at.jku.isse.mde.betting.manager.Match#getResultType <em>Result Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Result Type</em>'.
	 * @see at.jku.isse.mde.betting.manager.Match#getResultType()
	 * @see #getMatch()
	 * @generated
	 */
	EAttribute getMatch_ResultType();

	/**
	 * Returns the meta object for the attribute '{@link at.jku.isse.mde.betting.manager.Match#isResolved <em>Resolved</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resolved</em>'.
	 * @see at.jku.isse.mde.betting.manager.Match#isResolved()
	 * @see #getMatch()
	 * @generated
	 */
	EAttribute getMatch_Resolved();

	/**
	 * Returns the meta object for the attribute '{@link at.jku.isse.mde.betting.manager.Match#getDate <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date</em>'.
	 * @see at.jku.isse.mde.betting.manager.Match#getDate()
	 * @see #getMatch()
	 * @generated
	 */
	EAttribute getMatch_Date();

	/**
	 * Returns the meta object for the container reference '{@link at.jku.isse.mde.betting.manager.Match#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Group</em>'.
	 * @see at.jku.isse.mde.betting.manager.Match#getGroup()
	 * @see #getMatch()
	 * @generated
	 */
	EReference getMatch_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link at.jku.isse.mde.betting.manager.Match#getOpponents <em>Opponents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Opponents</em>'.
	 * @see at.jku.isse.mde.betting.manager.Match#getOpponents()
	 * @see #getMatch()
	 * @generated
	 */
	EReference getMatch_Opponents();

	/**
	 * Returns the meta object for the containment reference '{@link at.jku.isse.mde.betting.manager.Match#getResult <em>Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Result</em>'.
	 * @see at.jku.isse.mde.betting.manager.Match#getResult()
	 * @see #getMatch()
	 * @generated
	 */
	EReference getMatch_Result();

	/**
	 * Returns the meta object for class '{@link at.jku.isse.mde.betting.manager.Opponent <em>Opponent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Opponent</em>'.
	 * @see at.jku.isse.mde.betting.manager.Opponent
	 * @generated
	 */
	EClass getOpponent();

	/**
	 * Returns the meta object for the attribute '{@link at.jku.isse.mde.betting.manager.Opponent#getReference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reference</em>'.
	 * @see at.jku.isse.mde.betting.manager.Opponent#getReference()
	 * @see #getOpponent()
	 * @generated
	 */
	EAttribute getOpponent_Reference();

	/**
	 * Returns the meta object for class '{@link at.jku.isse.mde.betting.manager.Result <em>Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Result</em>'.
	 * @see at.jku.isse.mde.betting.manager.Result
	 * @generated
	 */
	EClass getResult();

	/**
	 * Returns the meta object for class '{@link at.jku.isse.mde.betting.manager.WinLooseResult <em>Win Loose Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Win Loose Result</em>'.
	 * @see at.jku.isse.mde.betting.manager.WinLooseResult
	 * @generated
	 */
	EClass getWinLooseResult();

	/**
	 * Returns the meta object for the attribute '{@link at.jku.isse.mde.betting.manager.WinLooseResult#isIsDraw <em>Is Draw</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Draw</em>'.
	 * @see at.jku.isse.mde.betting.manager.WinLooseResult#isIsDraw()
	 * @see #getWinLooseResult()
	 * @generated
	 */
	EAttribute getWinLooseResult_IsDraw();

	/**
	 * Returns the meta object for the reference '{@link at.jku.isse.mde.betting.manager.WinLooseResult#getWinner <em>Winner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Winner</em>'.
	 * @see at.jku.isse.mde.betting.manager.WinLooseResult#getWinner()
	 * @see #getWinLooseResult()
	 * @generated
	 */
	EReference getWinLooseResult_Winner();

	/**
	 * Returns the meta object for class '{@link at.jku.isse.mde.betting.manager.PositionResult <em>Position Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Position Result</em>'.
	 * @see at.jku.isse.mde.betting.manager.PositionResult
	 * @generated
	 */
	EClass getPositionResult();

	/**
	 * Returns the meta object for the reference list '{@link at.jku.isse.mde.betting.manager.PositionResult#getOrder <em>Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Order</em>'.
	 * @see at.jku.isse.mde.betting.manager.PositionResult#getOrder()
	 * @see #getPositionResult()
	 * @generated
	 */
	EReference getPositionResult_Order();

	/**
	 * Returns the meta object for class '{@link at.jku.isse.mde.betting.manager.Bet <em>Bet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bet</em>'.
	 * @see at.jku.isse.mde.betting.manager.Bet
	 * @generated
	 */
	EClass getBet();

	/**
	 * Returns the meta object for the attribute '{@link at.jku.isse.mde.betting.manager.Bet#getAmount <em>Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Amount</em>'.
	 * @see at.jku.isse.mde.betting.manager.Bet#getAmount()
	 * @see #getBet()
	 * @generated
	 */
	EAttribute getBet_Amount();

	/**
	 * Returns the meta object for the attribute '{@link at.jku.isse.mde.betting.manager.Bet#getDate <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date</em>'.
	 * @see at.jku.isse.mde.betting.manager.Bet#getDate()
	 * @see #getBet()
	 * @generated
	 */
	EAttribute getBet_Date();

	/**
	 * Returns the meta object for the attribute '{@link at.jku.isse.mde.betting.manager.Bet#isPayed <em>Payed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Payed</em>'.
	 * @see at.jku.isse.mde.betting.manager.Bet#isPayed()
	 * @see #getBet()
	 * @generated
	 */
	EAttribute getBet_Payed();

	/**
	 * Returns the meta object for the attribute '{@link at.jku.isse.mde.betting.manager.Bet#getPositionBetType <em>Position Bet Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Position Bet Type</em>'.
	 * @see at.jku.isse.mde.betting.manager.Bet#getPositionBetType()
	 * @see #getBet()
	 * @generated
	 */
	EAttribute getBet_PositionBetType();

	/**
	 * Returns the meta object for the reference '{@link at.jku.isse.mde.betting.manager.Bet#getBetOn <em>Bet On</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Bet On</em>'.
	 * @see at.jku.isse.mde.betting.manager.Bet#getBetOn()
	 * @see #getBet()
	 * @generated
	 */
	EReference getBet_BetOn();

	/**
	 * Returns the meta object for the containment reference '{@link at.jku.isse.mde.betting.manager.Bet#getExpectedResult <em>Expected Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expected Result</em>'.
	 * @see at.jku.isse.mde.betting.manager.Bet#getExpectedResult()
	 * @see #getBet()
	 * @generated
	 */
	EReference getBet_ExpectedResult();

	/**
	 * Returns the meta object for the reference '{@link at.jku.isse.mde.betting.manager.Bet#getUser <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>User</em>'.
	 * @see at.jku.isse.mde.betting.manager.Bet#getUser()
	 * @see #getBet()
	 * @generated
	 */
	EReference getBet_User();

	/**
	 * Returns the meta object for class '{@link at.jku.isse.mde.betting.manager.User <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User</em>'.
	 * @see at.jku.isse.mde.betting.manager.User
	 * @generated
	 */
	EClass getUser();

	/**
	 * Returns the meta object for the attribute '{@link at.jku.isse.mde.betting.manager.User#getEmail <em>Email</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Email</em>'.
	 * @see at.jku.isse.mde.betting.manager.User#getEmail()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_Email();

	/**
	 * Returns the meta object for the attribute '{@link at.jku.isse.mde.betting.manager.User#getPassword <em>Password</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Password</em>'.
	 * @see at.jku.isse.mde.betting.manager.User#getPassword()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_Password();

	/**
	 * Returns the meta object for the attribute '{@link at.jku.isse.mde.betting.manager.User#getBalance <em>Balance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Balance</em>'.
	 * @see at.jku.isse.mde.betting.manager.User#getBalance()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_Balance();

	/**
	 * Returns the meta object for the reference list '{@link at.jku.isse.mde.betting.manager.User#getBets <em>Bets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Bets</em>'.
	 * @see at.jku.isse.mde.betting.manager.User#getBets()
	 * @see #getUser()
	 * @generated
	 */
	EReference getUser_Bets();

	/**
	 * Returns the meta object for enum '{@link at.jku.isse.mde.betting.manager.ResultType <em>Result Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Result Type</em>'.
	 * @see at.jku.isse.mde.betting.manager.ResultType
	 * @generated
	 */
	EEnum getResultType();

	/**
	 * Returns the meta object for enum '{@link at.jku.isse.mde.betting.manager.PositionBetType <em>Position Bet Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Position Bet Type</em>'.
	 * @see at.jku.isse.mde.betting.manager.PositionBetType
	 * @generated
	 */
	EEnum getPositionBetType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ManagerFactory getManagerFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals
	{
		/**
		 * The meta object literal for the '{@link at.jku.isse.mde.betting.manager.impl.ManagerImpl <em>Manager</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.jku.isse.mde.betting.manager.impl.ManagerImpl
		 * @see at.jku.isse.mde.betting.manager.impl.ManagerPackageImpl#getManager()
		 * @generated
		 */
		EClass MANAGER = eINSTANCE.getManager();

		/**
		 * The meta object literal for the '<em><b>Categories</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MANAGER__CATEGORIES = eINSTANCE.getManager_Categories();

		/**
		 * The meta object literal for the '<em><b>Bets</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MANAGER__BETS = eINSTANCE.getManager_Bets();

		/**
		 * The meta object literal for the '<em><b>Users</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MANAGER__USERS = eINSTANCE.getManager_Users();

		/**
		 * The meta object literal for the '{@link at.jku.isse.mde.betting.manager.impl.IdElementImpl <em>Id Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.jku.isse.mde.betting.manager.impl.IdElementImpl
		 * @see at.jku.isse.mde.betting.manager.impl.ManagerPackageImpl#getIdElement()
		 * @generated
		 */
		EClass ID_ELEMENT = eINSTANCE.getIdElement();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ID_ELEMENT__ID = eINSTANCE.getIdElement_Id();

		/**
		 * The meta object literal for the '{@link at.jku.isse.mde.betting.manager.impl.CategoryImpl <em>Category</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.jku.isse.mde.betting.manager.impl.CategoryImpl
		 * @see at.jku.isse.mde.betting.manager.impl.ManagerPackageImpl#getCategory()
		 * @generated
		 */
		EClass CATEGORY = eINSTANCE.getCategory();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CATEGORY__NAME = eINSTANCE.getCategory_Name();

		/**
		 * The meta object literal for the '<em><b>Sort Rank</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CATEGORY__SORT_RANK = eINSTANCE.getCategory_SortRank();

		/**
		 * The meta object literal for the '<em><b>Groups</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CATEGORY__GROUPS = eINSTANCE.getCategory_Groups();

		/**
		 * The meta object literal for the '{@link at.jku.isse.mde.betting.manager.impl.GroupImpl <em>Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.jku.isse.mde.betting.manager.impl.GroupImpl
		 * @see at.jku.isse.mde.betting.manager.impl.ManagerPackageImpl#getGroup()
		 * @generated
		 */
		EClass GROUP = eINSTANCE.getGroup();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GROUP__TITLE = eINSTANCE.getGroup_Title();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GROUP__DESCRIPTION = eINSTANCE.getGroup_Description();

		/**
		 * The meta object literal for the '<em><b>Start Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GROUP__START_DATE = eINSTANCE.getGroup_StartDate();

		/**
		 * The meta object literal for the '<em><b>End Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GROUP__END_DATE = eINSTANCE.getGroup_EndDate();

		/**
		 * The meta object literal for the '<em><b>Resolved</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GROUP__RESOLVED = eINSTANCE.getGroup_Resolved();

		/**
		 * The meta object literal for the '<em><b>Category</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GROUP__CATEGORY = eINSTANCE.getGroup_Category();

		/**
		 * The meta object literal for the '<em><b>Matches</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GROUP__MATCHES = eINSTANCE.getGroup_Matches();

		/**
		 * The meta object literal for the '{@link at.jku.isse.mde.betting.manager.impl.MatchImpl <em>Match</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.jku.isse.mde.betting.manager.impl.MatchImpl
		 * @see at.jku.isse.mde.betting.manager.impl.ManagerPackageImpl#getMatch()
		 * @generated
		 */
		EClass MATCH = eINSTANCE.getMatch();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MATCH__TITLE = eINSTANCE.getMatch_Title();

		/**
		 * The meta object literal for the '<em><b>Sort Rank</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MATCH__SORT_RANK = eINSTANCE.getMatch_SortRank();

		/**
		 * The meta object literal for the '<em><b>Result Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MATCH__RESULT_TYPE = eINSTANCE.getMatch_ResultType();

		/**
		 * The meta object literal for the '<em><b>Resolved</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MATCH__RESOLVED = eINSTANCE.getMatch_Resolved();

		/**
		 * The meta object literal for the '<em><b>Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MATCH__DATE = eINSTANCE.getMatch_Date();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MATCH__GROUP = eINSTANCE.getMatch_Group();

		/**
		 * The meta object literal for the '<em><b>Opponents</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MATCH__OPPONENTS = eINSTANCE.getMatch_Opponents();

		/**
		 * The meta object literal for the '<em><b>Result</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MATCH__RESULT = eINSTANCE.getMatch_Result();

		/**
		 * The meta object literal for the '{@link at.jku.isse.mde.betting.manager.impl.OpponentImpl <em>Opponent</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.jku.isse.mde.betting.manager.impl.OpponentImpl
		 * @see at.jku.isse.mde.betting.manager.impl.ManagerPackageImpl#getOpponent()
		 * @generated
		 */
		EClass OPPONENT = eINSTANCE.getOpponent();

		/**
		 * The meta object literal for the '<em><b>Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPPONENT__REFERENCE = eINSTANCE.getOpponent_Reference();

		/**
		 * The meta object literal for the '{@link at.jku.isse.mde.betting.manager.impl.ResultImpl <em>Result</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.jku.isse.mde.betting.manager.impl.ResultImpl
		 * @see at.jku.isse.mde.betting.manager.impl.ManagerPackageImpl#getResult()
		 * @generated
		 */
		EClass RESULT = eINSTANCE.getResult();

		/**
		 * The meta object literal for the '{@link at.jku.isse.mde.betting.manager.impl.WinLooseResultImpl <em>Win Loose Result</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.jku.isse.mde.betting.manager.impl.WinLooseResultImpl
		 * @see at.jku.isse.mde.betting.manager.impl.ManagerPackageImpl#getWinLooseResult()
		 * @generated
		 */
		EClass WIN_LOOSE_RESULT = eINSTANCE.getWinLooseResult();

		/**
		 * The meta object literal for the '<em><b>Is Draw</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WIN_LOOSE_RESULT__IS_DRAW = eINSTANCE.getWinLooseResult_IsDraw();

		/**
		 * The meta object literal for the '<em><b>Winner</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WIN_LOOSE_RESULT__WINNER = eINSTANCE.getWinLooseResult_Winner();

		/**
		 * The meta object literal for the '{@link at.jku.isse.mde.betting.manager.impl.PositionResultImpl <em>Position Result</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.jku.isse.mde.betting.manager.impl.PositionResultImpl
		 * @see at.jku.isse.mde.betting.manager.impl.ManagerPackageImpl#getPositionResult()
		 * @generated
		 */
		EClass POSITION_RESULT = eINSTANCE.getPositionResult();

		/**
		 * The meta object literal for the '<em><b>Order</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POSITION_RESULT__ORDER = eINSTANCE.getPositionResult_Order();

		/**
		 * The meta object literal for the '{@link at.jku.isse.mde.betting.manager.impl.BetImpl <em>Bet</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.jku.isse.mde.betting.manager.impl.BetImpl
		 * @see at.jku.isse.mde.betting.manager.impl.ManagerPackageImpl#getBet()
		 * @generated
		 */
		EClass BET = eINSTANCE.getBet();

		/**
		 * The meta object literal for the '<em><b>Amount</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BET__AMOUNT = eINSTANCE.getBet_Amount();

		/**
		 * The meta object literal for the '<em><b>Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BET__DATE = eINSTANCE.getBet_Date();

		/**
		 * The meta object literal for the '<em><b>Payed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BET__PAYED = eINSTANCE.getBet_Payed();

		/**
		 * The meta object literal for the '<em><b>Position Bet Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BET__POSITION_BET_TYPE = eINSTANCE.getBet_PositionBetType();

		/**
		 * The meta object literal for the '<em><b>Bet On</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BET__BET_ON = eINSTANCE.getBet_BetOn();

		/**
		 * The meta object literal for the '<em><b>Expected Result</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BET__EXPECTED_RESULT = eINSTANCE.getBet_ExpectedResult();

		/**
		 * The meta object literal for the '<em><b>User</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BET__USER = eINSTANCE.getBet_User();

		/**
		 * The meta object literal for the '{@link at.jku.isse.mde.betting.manager.impl.UserImpl <em>User</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.jku.isse.mde.betting.manager.impl.UserImpl
		 * @see at.jku.isse.mde.betting.manager.impl.ManagerPackageImpl#getUser()
		 * @generated
		 */
		EClass USER = eINSTANCE.getUser();

		/**
		 * The meta object literal for the '<em><b>Email</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__EMAIL = eINSTANCE.getUser_Email();

		/**
		 * The meta object literal for the '<em><b>Password</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__PASSWORD = eINSTANCE.getUser_Password();

		/**
		 * The meta object literal for the '<em><b>Balance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__BALANCE = eINSTANCE.getUser_Balance();

		/**
		 * The meta object literal for the '<em><b>Bets</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER__BETS = eINSTANCE.getUser_Bets();

		/**
		 * The meta object literal for the '{@link at.jku.isse.mde.betting.manager.ResultType <em>Result Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.jku.isse.mde.betting.manager.ResultType
		 * @see at.jku.isse.mde.betting.manager.impl.ManagerPackageImpl#getResultType()
		 * @generated
		 */
		EEnum RESULT_TYPE = eINSTANCE.getResultType();

		/**
		 * The meta object literal for the '{@link at.jku.isse.mde.betting.manager.PositionBetType <em>Position Bet Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.jku.isse.mde.betting.manager.PositionBetType
		 * @see at.jku.isse.mde.betting.manager.impl.ManagerPackageImpl#getPositionBetType()
		 * @generated
		 */
		EEnum POSITION_BET_TYPE = eINSTANCE.getPositionBetType();

	}

} //ManagerPackage
