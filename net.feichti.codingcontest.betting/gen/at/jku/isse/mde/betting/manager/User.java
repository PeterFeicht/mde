/**
 */
package at.jku.isse.mde.betting.manager;


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
 * </ul>
 *
 * @see at.jku.isse.mde.betting.manager.ManagerPackage#getUser()
 * @model annotation="http://oracle.com/javax/persistence/Table uniqueConstraints='@UniqueConstraint(columnNames = \'email\')'"
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
	 * @see #setBalance(int)
	 * @see at.jku.isse.mde.betting.manager.ManagerPackage#getUser_Balance()
	 * @model
	 * @generated
	 */
	int getBalance();

	/**
	 * Sets the value of the '{@link at.jku.isse.mde.betting.manager.User#getBalance <em>Balance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Balance</em>' attribute.
	 * @see #getBalance()
	 * @generated
	 */
	void setBalance(int value);

} // User
