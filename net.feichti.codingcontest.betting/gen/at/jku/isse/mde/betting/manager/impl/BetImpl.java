/**
 */
package at.jku.isse.mde.betting.manager.impl;

import at.jku.isse.mde.betting.manager.Bet;
import at.jku.isse.mde.betting.manager.ManagerPackage;
import at.jku.isse.mde.betting.manager.Match;
import at.jku.isse.mde.betting.manager.Result;

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
 *   <li>{@link at.jku.isse.mde.betting.manager.impl.BetImpl#getBetOn <em>Bet On</em>}</li>
 *   <li>{@link at.jku.isse.mde.betting.manager.impl.BetImpl#getExpectedResult <em>Expected Result</em>}</li>
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
	protected static final int AMOUNT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getAmount() <em>Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmount()
	 * @generated
	 * @ordered
	 */
	protected int amount = AMOUNT_EDEFAULT;

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
	public int getAmount()
	{
		return amount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAmount(int newAmount)
	{
		int oldAmount = amount;
		amount = newAmount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ManagerPackage.BET__AMOUNT, oldAmount, amount));
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
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
	{
		switch (featureID)
		{
			case ManagerPackage.BET__EXPECTED_RESULT:
				return basicSetExpectedResult(null, msgs);
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
			case ManagerPackage.BET__BET_ON:
				if (resolve) return getBetOn();
				return basicGetBetOn();
			case ManagerPackage.BET__EXPECTED_RESULT:
				return getExpectedResult();
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
				setAmount((Integer)newValue);
				return;
			case ManagerPackage.BET__BET_ON:
				setBetOn((Match)newValue);
				return;
			case ManagerPackage.BET__EXPECTED_RESULT:
				setExpectedResult((Result)newValue);
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
			case ManagerPackage.BET__BET_ON:
				setBetOn((Match)null);
				return;
			case ManagerPackage.BET__EXPECTED_RESULT:
				setExpectedResult((Result)null);
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
			case ManagerPackage.BET__BET_ON:
				return betOn != null;
			case ManagerPackage.BET__EXPECTED_RESULT:
				return expectedResult != null;
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
		result.append(')');
		return result.toString();
	}

} //BetImpl
