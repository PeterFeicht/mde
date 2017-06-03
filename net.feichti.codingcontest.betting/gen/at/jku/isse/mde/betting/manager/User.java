/**
 */
package at.jku.isse.mde.betting.manager;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>User</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A user defines a person that can place bets on the system. 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link at.jku.isse.mde.betting.manager.User#getEmail <em>Email</em>}</li>
 *   <li>{@link at.jku.isse.mde.betting.manager.User#getPassword <em>Password</em>}</li>
 *   <li>{@link at.jku.isse.mde.betting.manager.User#getBalance <em>Balance</em>}</li>
 *   <li>{@link at.jku.isse.mde.betting.manager.User#getBets <em>Bets</em>}</li>
 * </ul>
 *
 * @see at.jku.isse.mde.betting.manager.ManagerPackage#getUser()
 * @model annotation="Table uniqueConstraints='@UniqueConstraint(columnNames = \'email\')'"
 * @generated
 */
public interface User extends IdElement
{
	/**
	 * Returns the value of the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The username that identifies the user.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Email</em>' attribute.
	 * @see #setEmail(String)
	 * @see at.jku.isse.mde.betting.manager.ManagerPackage#getUser_Email()
	 * @model
	 * @generated
	 */
	String getEmail();

	/**
	 * Sets the value of the '{@link at.jku.isse.mde.betting.manager.User#getEmail <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Email</em>' attribute.
	 * @see #getEmail()
	 * @generated
	 */
	void setEmail(String value);

	/**
	 * Returns the value of the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The password to authenticate the user.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Password</em>' attribute.
	 * @see #setPassword(String)
	 * @see at.jku.isse.mde.betting.manager.ManagerPackage#getUser_Password()
	 * @model
	 * @generated
	 */
	String getPassword();

	/**
	 * Sets the value of the '{@link at.jku.isse.mde.betting.manager.User#getPassword <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Password</em>' attribute.
	 * @see #getPassword()
	 * @generated
	 */
	void setPassword(String value);

	/**
	 * Returns the value of the '<em><b>Balance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The current balance of the user. Bets can only be placed if the user 
	 *   has sufficient credit.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Balance</em>' attribute.
	 * @see #setBalance(double)
	 * @see at.jku.isse.mde.betting.manager.ManagerPackage#getUser_Balance()
	 * @model
	 * @generated
	 */
	double getBalance();

	/**
	 * Sets the value of the '{@link at.jku.isse.mde.betting.manager.User#getBalance <em>Balance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Balance</em>' attribute.
	 * @see #getBalance()
	 * @generated
	 */
	void setBalance(double value);

	/**
	 * Returns the value of the '<em><b>Bets</b></em>' reference list.
	 * The list contents are of type {@link at.jku.isse.mde.betting.manager.Bet}.
	 * It is bidirectional and its opposite is '{@link at.jku.isse.mde.betting.manager.Bet#getUser <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The bets placed by the user.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bets</em>' reference list.
	 * @see at.jku.isse.mde.betting.manager.ManagerPackage#getUser_Bets()
	 * @see at.jku.isse.mde.betting.manager.Bet#getUser
	 * @model opposite="user"
	 * @generated
	 */
	EList<Bet> getBets();

} // User
