/**
 */
package at.jku.isse.mde.betting.manager.impl;

import at.jku.isse.mde.betting.manager.ManagerPackage;
import at.jku.isse.mde.betting.manager.Opponent;
import at.jku.isse.mde.betting.manager.WinLooseResult;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Win Loose Result</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link at.jku.isse.mde.betting.manager.impl.WinLooseResultImpl#getIsDraw <em>Is Draw</em>}</li>
 *   <li>{@link at.jku.isse.mde.betting.manager.impl.WinLooseResultImpl#getWinner <em>Winner</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WinLooseResultImpl extends ResultImpl implements WinLooseResult
{
	/**
	 * The default value of the '{@link #getIsDraw() <em>Is Draw</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsDraw()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_DRAW_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsDraw() <em>Is Draw</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsDraw()
	 * @generated
	 * @ordered
	 */
	protected Boolean isDraw = IS_DRAW_EDEFAULT;

	/**
	 * The cached value of the '{@link #getWinner() <em>Winner</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWinner()
	 * @generated
	 * @ordered
	 */
	protected Opponent winner;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WinLooseResultImpl()
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
		return ManagerPackage.Literals.WIN_LOOSE_RESULT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsDraw()
	{
		return isDraw;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsDraw(Boolean newIsDraw)
	{
		Boolean oldIsDraw = isDraw;
		isDraw = newIsDraw;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ManagerPackage.WIN_LOOSE_RESULT__IS_DRAW, oldIsDraw, isDraw));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Opponent getWinner()
	{
		if (winner != null && winner.eIsProxy())
		{
			InternalEObject oldWinner = (InternalEObject)winner;
			winner = (Opponent)eResolveProxy(oldWinner);
			if (winner != oldWinner)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ManagerPackage.WIN_LOOSE_RESULT__WINNER, oldWinner, winner));
			}
		}
		return winner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Opponent basicGetWinner()
	{
		return winner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWinner(Opponent newWinner)
	{
		Opponent oldWinner = winner;
		winner = newWinner;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ManagerPackage.WIN_LOOSE_RESULT__WINNER, oldWinner, winner));
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
			case ManagerPackage.WIN_LOOSE_RESULT__IS_DRAW:
				return getIsDraw();
			case ManagerPackage.WIN_LOOSE_RESULT__WINNER:
				if (resolve) return getWinner();
				return basicGetWinner();
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
			case ManagerPackage.WIN_LOOSE_RESULT__IS_DRAW:
				setIsDraw((Boolean)newValue);
				return;
			case ManagerPackage.WIN_LOOSE_RESULT__WINNER:
				setWinner((Opponent)newValue);
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
			case ManagerPackage.WIN_LOOSE_RESULT__IS_DRAW:
				setIsDraw(IS_DRAW_EDEFAULT);
				return;
			case ManagerPackage.WIN_LOOSE_RESULT__WINNER:
				setWinner((Opponent)null);
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
			case ManagerPackage.WIN_LOOSE_RESULT__IS_DRAW:
				return IS_DRAW_EDEFAULT == null ? isDraw != null : !IS_DRAW_EDEFAULT.equals(isDraw);
			case ManagerPackage.WIN_LOOSE_RESULT__WINNER:
				return winner != null;
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
		result.append(" (isDraw: ");
		result.append(isDraw);
		result.append(')');
		return result.toString();
	}

} //WinLooseResultImpl
