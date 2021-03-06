/**
 */
package at.jku.isse.mde.betting.manager.impl;

import at.jku.isse.mde.betting.manager.Bet;
import at.jku.isse.mde.betting.manager.ManagerPackage;
import at.jku.isse.mde.betting.manager.User;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>User</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link at.jku.isse.mde.betting.manager.impl.UserImpl#getEmail <em>Email</em>}</li>
 *   <li>{@link at.jku.isse.mde.betting.manager.impl.UserImpl#getPassword <em>Password</em>}</li>
 *   <li>{@link at.jku.isse.mde.betting.manager.impl.UserImpl#getBalance <em>Balance</em>}</li>
 *   <li>{@link at.jku.isse.mde.betting.manager.impl.UserImpl#getBets <em>Bets</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UserImpl extends IdElementImpl implements User
{
	/**
	 * The default value of the '{@link #getEmail() <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmail()
	 * @generated
	 * @ordered
	 */
	protected static final String EMAIL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEmail() <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmail()
	 * @generated
	 * @ordered
	 */
	protected String email = EMAIL_EDEFAULT;

	/**
	 * The default value of the '{@link #getPassword() <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassword()
	 * @generated
	 * @ordered
	 */
	protected static final String PASSWORD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPassword() <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassword()
	 * @generated
	 * @ordered
	 */
	protected String password = PASSWORD_EDEFAULT;

	/**
	 * The default value of the '{@link #getBalance() <em>Balance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBalance()
	 * @generated
	 * @ordered
	 */
	protected static final double BALANCE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getBalance() <em>Balance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBalance()
	 * @generated
	 * @ordered
	 */
	protected double balance = BALANCE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBets() <em>Bets</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBets()
	 * @generated
	 * @ordered
	 */
	protected EList<Bet> bets;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UserImpl()
	{
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass()
	{
		return ManagerPackage.Literals.USER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEmail()
	{
		return email;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEmail(String newEmail)
	{
		String oldEmail = email;
		email = newEmail;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ManagerPackage.USER__EMAIL, oldEmail, email));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPassword()
	{
		return password;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPassword(String newPassword)
	{
		String oldPassword = password;
		password = newPassword;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ManagerPackage.USER__PASSWORD, oldPassword, password));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getBalance()
	{
		return balance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBalance(double newBalance)
	{
		double oldBalance = balance;
		balance = newBalance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ManagerPackage.USER__BALANCE, oldBalance, balance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Bet> getBets()
	{
		if (bets == null)
		{
			bets = new EObjectWithInverseResolvingEList<Bet>(Bet.class, this, ManagerPackage.USER__BETS, ManagerPackage.BET__USER);
		}
		return bets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs)
	{
		switch (featureID)
		{
			case ManagerPackage.USER__BETS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getBets()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
	{
		switch (featureID)
		{
			case ManagerPackage.USER__BETS:
				return ((InternalEList<?>)getBets()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType)
	{
		switch (featureID)
		{
			case ManagerPackage.USER__EMAIL:
				return getEmail();
			case ManagerPackage.USER__PASSWORD:
				return getPassword();
			case ManagerPackage.USER__BALANCE:
				return getBalance();
			case ManagerPackage.USER__BETS:
				return getBets();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue)
	{
		switch (featureID)
		{
			case ManagerPackage.USER__EMAIL:
				setEmail((String)newValue);
				return;
			case ManagerPackage.USER__PASSWORD:
				setPassword((String)newValue);
				return;
			case ManagerPackage.USER__BALANCE:
				setBalance((Double)newValue);
				return;
			case ManagerPackage.USER__BETS:
				getBets().clear();
				getBets().addAll((Collection<? extends Bet>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID)
	{
		switch (featureID)
		{
			case ManagerPackage.USER__EMAIL:
				setEmail(EMAIL_EDEFAULT);
				return;
			case ManagerPackage.USER__PASSWORD:
				setPassword(PASSWORD_EDEFAULT);
				return;
			case ManagerPackage.USER__BALANCE:
				setBalance(BALANCE_EDEFAULT);
				return;
			case ManagerPackage.USER__BETS:
				getBets().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID)
	{
		switch (featureID)
		{
			case ManagerPackage.USER__EMAIL:
				return EMAIL_EDEFAULT == null ? email != null : !EMAIL_EDEFAULT.equals(email);
			case ManagerPackage.USER__PASSWORD:
				return PASSWORD_EDEFAULT == null ? password != null : !PASSWORD_EDEFAULT.equals(password);
			case ManagerPackage.USER__BALANCE:
				return balance != BALANCE_EDEFAULT;
			case ManagerPackage.USER__BETS:
				return bets != null && !bets.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString()
	{
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (email: ");
		result.append(email);
		result.append(", password: ");
		result.append(password);
		result.append(", balance: ");
		result.append(balance);
		result.append(')');
		return result.toString();
	}

} //UserImpl
