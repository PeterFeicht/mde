/**
 */
package at.jku.isse.mde.betting.manager.impl;

import at.jku.isse.mde.betting.manager.Bet;
import at.jku.isse.mde.betting.manager.ManagerPackage;
import at.jku.isse.mde.betting.manager.Match;
import at.jku.isse.mde.betting.manager.PositionBetType;
import at.jku.isse.mde.betting.manager.Result;

import at.jku.isse.mde.betting.manager.User;
import java.util.Date;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bet</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link at.jku.isse.mde.betting.manager.impl.BetImpl#getAmount <em>Amount</em>}</li>
 *   <li>{@link at.jku.isse.mde.betting.manager.impl.BetImpl#getDate <em>Date</em>}</li>
 *   <li>{@link at.jku.isse.mde.betting.manager.impl.BetImpl#isPayed <em>Payed</em>}</li>
 *   <li>{@link at.jku.isse.mde.betting.manager.impl.BetImpl#getPositionBetType <em>Position Bet Type</em>}</li>
 *   <li>{@link at.jku.isse.mde.betting.manager.impl.BetImpl#getBetOn <em>Bet On</em>}</li>
 *   <li>{@link at.jku.isse.mde.betting.manager.impl.BetImpl#getExpectedResult <em>Expected Result</em>}</li>
 *   <li>{@link at.jku.isse.mde.betting.manager.impl.BetImpl#getUser <em>User</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BetImpl extends IdElementImpl implements Bet
{
	/**
	 * The default value of the '{@link #getAmount() <em>Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmount()
	 * @generated
	 * @ordered
	 */
	protected static final double AMOUNT_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getAmount() <em>Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmount()
	 * @generated
	 * @ordered
	 */
	protected double amount = AMOUNT_EDEFAULT;

	/**
	 * The default value of the '{@link #getDate() <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDate() <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected Date date = DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #isPayed() <em>Payed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPayed()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PAYED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isPayed() <em>Payed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPayed()
	 * @generated
	 * @ordered
	 */
	protected boolean payed = PAYED_EDEFAULT;

	/**
	 * The default value of the '{@link #getPositionBetType() <em>Position Bet Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPositionBetType()
	 * @generated
	 * @ordered
	 */
	protected static final PositionBetType POSITION_BET_TYPE_EDEFAULT = PositionBetType.WIN;

	/**
	 * The cached value of the '{@link #getPositionBetType() <em>Position Bet Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPositionBetType()
	 * @generated
	 * @ordered
	 */
	protected PositionBetType positionBetType = POSITION_BET_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBetOn() <em>Bet On</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBetOn()
	 * @generated
	 * @ordered
	 */
	protected Match betOn;

	/**
	 * The cached value of the '{@link #getExpectedResult() <em>Expected Result</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpectedResult()
	 * @generated
	 * @ordered
	 */
	protected Result expectedResult;

	/**
	 * The cached value of the '{@link #getUser() <em>User</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUser()
	 * @generated
	 * @ordered
	 */
	protected User user;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BetImpl()
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
		return ManagerPackage.Literals.BET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getAmount()
	{
		return amount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAmount(double newAmount)
	{
		double oldAmount = amount;
		amount = newAmount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ManagerPackage.BET__AMOUNT, oldAmount, amount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getDate()
	{
		return date;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDate(Date newDate)
	{
		Date oldDate = date;
		date = newDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ManagerPackage.BET__DATE, oldDate, date));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isPayed()
	{
		return payed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPayed(boolean newPayed)
	{
		boolean oldPayed = payed;
		payed = newPayed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ManagerPackage.BET__PAYED, oldPayed, payed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PositionBetType getPositionBetType()
	{
		return positionBetType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPositionBetType(PositionBetType newPositionBetType)
	{
		PositionBetType oldPositionBetType = positionBetType;
		positionBetType = newPositionBetType == null ? POSITION_BET_TYPE_EDEFAULT : newPositionBetType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ManagerPackage.BET__POSITION_BET_TYPE, oldPositionBetType, positionBetType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Match getBetOn()
	{
		if (betOn != null && betOn.eIsProxy())
		{
			InternalEObject oldBetOn = (InternalEObject)betOn;
			betOn = (Match)eResolveProxy(oldBetOn);
			if (betOn != oldBetOn)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ManagerPackage.BET__BET_ON, oldBetOn, betOn));
			}
		}
		return betOn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Match basicGetBetOn()
	{
		return betOn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBetOn(Match newBetOn)
	{
		Match oldBetOn = betOn;
		betOn = newBetOn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ManagerPackage.BET__BET_ON, oldBetOn, betOn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Result getExpectedResult()
	{
		return expectedResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExpectedResult(Result newExpectedResult, NotificationChain msgs)
	{
		Result oldExpectedResult = expectedResult;
		expectedResult = newExpectedResult;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ManagerPackage.BET__EXPECTED_RESULT, oldExpectedResult, newExpectedResult);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpectedResult(Result newExpectedResult)
	{
		if (newExpectedResult != expectedResult)
		{
			NotificationChain msgs = null;
			if (expectedResult != null)
				msgs = ((InternalEObject)expectedResult).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ManagerPackage.BET__EXPECTED_RESULT, null, msgs);
			if (newExpectedResult != null)
				msgs = ((InternalEObject)newExpectedResult).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ManagerPackage.BET__EXPECTED_RESULT, null, msgs);
			msgs = basicSetExpectedResult(newExpectedResult, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ManagerPackage.BET__EXPECTED_RESULT, newExpectedResult, newExpectedResult));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public User getUser()
	{
		if (user != null && user.eIsProxy())
		{
			InternalEObject oldUser = (InternalEObject)user;
			user = (User)eResolveProxy(oldUser);
			if (user != oldUser)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ManagerPackage.BET__USER, oldUser, user));
			}
		}
		return user;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public User basicGetUser()
	{
		return user;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUser(User newUser, NotificationChain msgs)
	{
		User oldUser = user;
		user = newUser;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ManagerPackage.BET__USER, oldUser, newUser);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUser(User newUser)
	{
		if (newUser != user)
		{
			NotificationChain msgs = null;
			if (user != null)
				msgs = ((InternalEObject)user).eInverseRemove(this, ManagerPackage.USER__BETS, User.class, msgs);
			if (newUser != null)
				msgs = ((InternalEObject)newUser).eInverseAdd(this, ManagerPackage.USER__BETS, User.class, msgs);
			msgs = basicSetUser(newUser, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ManagerPackage.BET__USER, newUser, newUser));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs)
	{
		switch (featureID)
		{
			case ManagerPackage.BET__USER:
				if (user != null)
					msgs = ((InternalEObject)user).eInverseRemove(this, ManagerPackage.USER__BETS, User.class, msgs);
				return basicSetUser((User)otherEnd, msgs);
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
			case ManagerPackage.BET__EXPECTED_RESULT:
				return basicSetExpectedResult(null, msgs);
			case ManagerPackage.BET__USER:
				return basicSetUser(null, msgs);
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
			case ManagerPackage.BET__AMOUNT:
				return getAmount();
			case ManagerPackage.BET__DATE:
				return getDate();
			case ManagerPackage.BET__PAYED:
				return isPayed();
			case ManagerPackage.BET__POSITION_BET_TYPE:
				return getPositionBetType();
			case ManagerPackage.BET__BET_ON:
				if (resolve) return getBetOn();
				return basicGetBetOn();
			case ManagerPackage.BET__EXPECTED_RESULT:
				return getExpectedResult();
			case ManagerPackage.BET__USER:
				if (resolve) return getUser();
				return basicGetUser();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue)
	{
		switch (featureID)
		{
			case ManagerPackage.BET__AMOUNT:
				setAmount((Double)newValue);
				return;
			case ManagerPackage.BET__DATE:
				setDate((Date)newValue);
				return;
			case ManagerPackage.BET__PAYED:
				setPayed((Boolean)newValue);
				return;
			case ManagerPackage.BET__POSITION_BET_TYPE:
				setPositionBetType((PositionBetType)newValue);
				return;
			case ManagerPackage.BET__BET_ON:
				setBetOn((Match)newValue);
				return;
			case ManagerPackage.BET__EXPECTED_RESULT:
				setExpectedResult((Result)newValue);
				return;
			case ManagerPackage.BET__USER:
				setUser((User)newValue);
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
			case ManagerPackage.BET__AMOUNT:
				setAmount(AMOUNT_EDEFAULT);
				return;
			case ManagerPackage.BET__DATE:
				setDate(DATE_EDEFAULT);
				return;
			case ManagerPackage.BET__PAYED:
				setPayed(PAYED_EDEFAULT);
				return;
			case ManagerPackage.BET__POSITION_BET_TYPE:
				setPositionBetType(POSITION_BET_TYPE_EDEFAULT);
				return;
			case ManagerPackage.BET__BET_ON:
				setBetOn((Match)null);
				return;
			case ManagerPackage.BET__EXPECTED_RESULT:
				setExpectedResult((Result)null);
				return;
			case ManagerPackage.BET__USER:
				setUser((User)null);
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
			case ManagerPackage.BET__AMOUNT:
				return amount != AMOUNT_EDEFAULT;
			case ManagerPackage.BET__DATE:
				return DATE_EDEFAULT == null ? date != null : !DATE_EDEFAULT.equals(date);
			case ManagerPackage.BET__PAYED:
				return payed != PAYED_EDEFAULT;
			case ManagerPackage.BET__POSITION_BET_TYPE:
				return positionBetType != POSITION_BET_TYPE_EDEFAULT;
			case ManagerPackage.BET__BET_ON:
				return betOn != null;
			case ManagerPackage.BET__EXPECTED_RESULT:
				return expectedResult != null;
			case ManagerPackage.BET__USER:
				return user != null;
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
		result.append(" (amount: ");
		result.append(amount);
		result.append(", date: ");
		result.append(date);
		result.append(", payed: ");
		result.append(payed);
		result.append(", positionBetType: ");
		result.append(positionBetType);
		result.append(')');
		return result.toString();
	}

} //BetImpl
