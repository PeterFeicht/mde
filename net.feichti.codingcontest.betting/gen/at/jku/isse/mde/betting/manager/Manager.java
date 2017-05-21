/**
 */
package at.jku.isse.mde.betting.manager;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Manager</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The Manager is responsible for the lifecycle of Categories/Groups/Matches, 
 * Users, and other model elements. 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link at.jku.isse.mde.betting.manager.Manager#getCategories <em>Categories</em>}</li>
 *   <li>{@link at.jku.isse.mde.betting.manager.Manager#getBets <em>Bets</em>}</li>
 *   <li>{@link at.jku.isse.mde.betting.manager.Manager#getUsers <em>Users</em>}</li>
 * </ul>
 *
 * @see at.jku.isse.mde.betting.manager.ManagerPackage#getManager()
 * @model
 * @generated
 */
public interface Manager extends IdElement
{
	/**
	 * Returns the value of the '<em><b>Categories</b></em>' containment reference list.
	 * The list contents are of type {@link at.jku.isse.mde.betting.manager.Category}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An optional set of categories that are known to this manager
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Categories</em>' containment reference list.
	 * @see at.jku.isse.mde.betting.manager.ManagerPackage#getManager_Categories()
	 * @model containment="true"
	 * @generated
	 */
	EList<Category> getCategories();

	/**
	 * Returns the value of the '<em><b>Bets</b></em>' containment reference list.
	 * The list contents are of type {@link at.jku.isse.mde.betting.manager.Bet}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An optional list of bets for which this manager is responsible.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bets</em>' containment reference list.
	 * @see at.jku.isse.mde.betting.manager.ManagerPackage#getManager_Bets()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Bet> getBets();

	/**
	 * Returns the value of the '<em><b>Users</b></em>' containment reference list.
	 * The list contents are of type {@link at.jku.isse.mde.betting.manager.User}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An optional list of users for which this manager is responsible.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Users</em>' containment reference list.
	 * @see at.jku.isse.mde.betting.manager.ManagerPackage#getManager_Users()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<User> getUsers();

} // Manager
