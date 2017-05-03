/**
 */
package at.jku.isse.mde.betting.manager.impl;

import at.jku.isse.mde.betting.manager.ManagerPackage;
import at.jku.isse.mde.betting.manager.Opponent;
import at.jku.isse.mde.betting.manager.PositionResult;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Position Result</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link at.jku.isse.mde.betting.manager.impl.PositionResultImpl#getOrder <em>Order</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PositionResultImpl extends ResultImpl implements PositionResult
{
	/**
	 * The cached value of the '{@link #getOrder() <em>Order</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrder()
	 * @generated
	 * @ordered
	 */
	protected EList<Opponent> order;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PositionResultImpl()
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
		return ManagerPackage.Literals.POSITION_RESULT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Opponent> getOrder()
	{
		if (order == null)
		{
			order = new EObjectResolvingEList<Opponent>(Opponent.class, this, ManagerPackage.POSITION_RESULT__ORDER);
		}
		return order;
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
			case ManagerPackage.POSITION_RESULT__ORDER:
				return getOrder();
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
			case ManagerPackage.POSITION_RESULT__ORDER:
				getOrder().clear();
				getOrder().addAll((Collection<? extends Opponent>)newValue);
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
			case ManagerPackage.POSITION_RESULT__ORDER:
				getOrder().clear();
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
			case ManagerPackage.POSITION_RESULT__ORDER:
				return order != null && !order.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PositionResultImpl
