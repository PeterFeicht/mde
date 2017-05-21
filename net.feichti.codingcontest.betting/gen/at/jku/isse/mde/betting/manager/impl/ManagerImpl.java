/**
 */
package at.jku.isse.mde.betting.manager.impl;

import at.jku.isse.mde.betting.manager.Bet;
import at.jku.isse.mde.betting.manager.Category;
import at.jku.isse.mde.betting.manager.Manager;
import at.jku.isse.mde.betting.manager.ManagerPackage;
import at.jku.isse.mde.betting.manager.User;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Manager</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link at.jku.isse.mde.betting.manager.impl.ManagerImpl#getCategories <em>Categories</em>}</li>
 *   <li>{@link at.jku.isse.mde.betting.manager.impl.ManagerImpl#getBets <em>Bets</em>}</li>
 *   <li>{@link at.jku.isse.mde.betting.manager.impl.ManagerImpl#getUsers <em>Users</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ManagerImpl extends IdElementImpl implements Manager
{
	/**
	 * The cached value of the '{@link #getCategories() <em>Categories</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategories()
	 * @generated
	 * @ordered
	 */
	protected EList<Category> categories;

	/**
	 * The cached value of the '{@link #getBets() <em>Bets</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBets()
	 * @generated
	 * @ordered
	 */
	protected EList<Bet> bets;

	/**
	 * The cached value of the '{@link #getUsers() <em>Users</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsers()
	 * @generated
	 * @ordered
	 */
	protected EList<User> users;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ManagerImpl()
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
		return ManagerPackage.Literals.MANAGER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Category> getCategories()
	{
		if (categories == null)
		{
			categories = new EObjectContainmentEList<Category>(Category.class, this, ManagerPackage.MANAGER__CATEGORIES);
		}
		return categories;
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
			bets = new EObjectContainmentEList<Bet>(Bet.class, this, ManagerPackage.MANAGER__BETS);
		}
		return bets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<User> getUsers()
	{
		if (users == null)
		{
			users = new EObjectContainmentEList<User>(User.class, this, ManagerPackage.MANAGER__USERS);
		}
		return users;
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
			case ManagerPackage.MANAGER__CATEGORIES:
				return ((InternalEList<?>)getCategories()).basicRemove(otherEnd, msgs);
			case ManagerPackage.MANAGER__BETS:
				return ((InternalEList<?>)getBets()).basicRemove(otherEnd, msgs);
			case ManagerPackage.MANAGER__USERS:
				return ((InternalEList<?>)getUsers()).basicRemove(otherEnd, msgs);
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
			case ManagerPackage.MANAGER__CATEGORIES:
				return getCategories();
			case ManagerPackage.MANAGER__BETS:
				return getBets();
			case ManagerPackage.MANAGER__USERS:
				return getUsers();
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
			case ManagerPackage.MANAGER__CATEGORIES:
				getCategories().clear();
				getCategories().addAll((Collection<? extends Category>)newValue);
				return;
			case ManagerPackage.MANAGER__BETS:
				getBets().clear();
				getBets().addAll((Collection<? extends Bet>)newValue);
				return;
			case ManagerPackage.MANAGER__USERS:
				getUsers().clear();
				getUsers().addAll((Collection<? extends User>)newValue);
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
			case ManagerPackage.MANAGER__CATEGORIES:
				getCategories().clear();
				return;
			case ManagerPackage.MANAGER__BETS:
				getBets().clear();
				return;
			case ManagerPackage.MANAGER__USERS:
				getUsers().clear();
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
			case ManagerPackage.MANAGER__CATEGORIES:
				return categories != null && !categories.isEmpty();
			case ManagerPackage.MANAGER__BETS:
				return bets != null && !bets.isEmpty();
			case ManagerPackage.MANAGER__USERS:
				return users != null && !users.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ManagerImpl
