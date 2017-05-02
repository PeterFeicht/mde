/**
 */
package at.jku.isse.mde.betting.manager.impl;

import at.jku.isse.mde.betting.manager.Group;
import at.jku.isse.mde.betting.manager.ManagerPackage;
import at.jku.isse.mde.betting.manager.Match;
import at.jku.isse.mde.betting.manager.Opponent;
import at.jku.isse.mde.betting.manager.Result;
import at.jku.isse.mde.betting.manager.ResultType;

import java.util.Collection;
import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Match</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link at.jku.isse.mde.betting.manager.impl.MatchImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link at.jku.isse.mde.betting.manager.impl.MatchImpl#getSortRank <em>Sort Rank</em>}</li>
 *   <li>{@link at.jku.isse.mde.betting.manager.impl.MatchImpl#getResultType <em>Result Type</em>}</li>
 *   <li>{@link at.jku.isse.mde.betting.manager.impl.MatchImpl#isResolved <em>Resolved</em>}</li>
 *   <li>{@link at.jku.isse.mde.betting.manager.impl.MatchImpl#getDate <em>Date</em>}</li>
 *   <li>{@link at.jku.isse.mde.betting.manager.impl.MatchImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link at.jku.isse.mde.betting.manager.impl.MatchImpl#getOpponents <em>Opponents</em>}</li>
 *   <li>{@link at.jku.isse.mde.betting.manager.impl.MatchImpl#getResult <em>Result</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MatchImpl extends IdElementImpl implements Match
{
	/**
	 * The default value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String TITLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected String title = TITLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSortRank() <em>Sort Rank</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSortRank()
	 * @generated
	 * @ordered
	 */
	protected static final int SORT_RANK_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSortRank() <em>Sort Rank</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSortRank()
	 * @generated
	 * @ordered
	 */
	protected int sortRank = SORT_RANK_EDEFAULT;

	/**
	 * The default value of the '{@link #getResultType() <em>Result Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResultType()
	 * @generated
	 * @ordered
	 */
	protected static final ResultType RESULT_TYPE_EDEFAULT = ResultType.SINGLE;

	/**
	 * The cached value of the '{@link #getResultType() <em>Result Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResultType()
	 * @generated
	 * @ordered
	 */
	protected ResultType resultType = RESULT_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #isResolved() <em>Resolved</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isResolved()
	 * @generated
	 * @ordered
	 */
	protected static final boolean RESOLVED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isResolved() <em>Resolved</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isResolved()
	 * @generated
	 * @ordered
	 */
	protected boolean resolved = RESOLVED_EDEFAULT;

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
	 * The cached value of the '{@link #getOpponents() <em>Opponents</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOpponents()
	 * @generated
	 * @ordered
	 */
	protected EList<Opponent> opponents;

	/**
	 * The cached value of the '{@link #getResult() <em>Result</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResult()
	 * @generated
	 * @ordered
	 */
	protected Result result;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MatchImpl()
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
		return ManagerPackage.Literals.MATCH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTitle()
	{
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTitle(String newTitle)
	{
		String oldTitle = title;
		title = newTitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ManagerPackage.MATCH__TITLE, oldTitle, title));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSortRank()
	{
		return sortRank;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSortRank(int newSortRank)
	{
		int oldSortRank = sortRank;
		sortRank = newSortRank;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ManagerPackage.MATCH__SORT_RANK, oldSortRank, sortRank));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResultType getResultType()
	{
		return resultType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResultType(ResultType newResultType)
	{
		ResultType oldResultType = resultType;
		resultType = newResultType == null ? RESULT_TYPE_EDEFAULT : newResultType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ManagerPackage.MATCH__RESULT_TYPE, oldResultType, resultType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isResolved()
	{
		return resolved;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResolved(boolean newResolved)
	{
		boolean oldResolved = resolved;
		resolved = newResolved;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ManagerPackage.MATCH__RESOLVED, oldResolved, resolved));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ManagerPackage.MATCH__DATE, oldDate, date));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Group getGroup()
	{
		if (eContainerFeatureID() != ManagerPackage.MATCH__GROUP) return null;
		return (Group)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGroup(Group newGroup, NotificationChain msgs)
	{
		msgs = eBasicSetContainer((InternalEObject)newGroup, ManagerPackage.MATCH__GROUP, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGroup(Group newGroup)
	{
		if (newGroup != eInternalContainer() || (eContainerFeatureID() != ManagerPackage.MATCH__GROUP && newGroup != null))
		{
			if (EcoreUtil.isAncestor(this, newGroup))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newGroup != null)
				msgs = ((InternalEObject)newGroup).eInverseAdd(this, ManagerPackage.GROUP__MATCHES, Group.class, msgs);
			msgs = basicSetGroup(newGroup, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ManagerPackage.MATCH__GROUP, newGroup, newGroup));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Opponent> getOpponents()
	{
		if (opponents == null)
		{
			opponents = new EObjectContainmentEList<Opponent>(Opponent.class, this, ManagerPackage.MATCH__OPPONENTS);
		}
		return opponents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Result getResult()
	{
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResult(Result newResult, NotificationChain msgs)
	{
		Result oldResult = result;
		result = newResult;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ManagerPackage.MATCH__RESULT, oldResult, newResult);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResult(Result newResult)
	{
		if (newResult != result)
		{
			NotificationChain msgs = null;
			if (result != null)
				msgs = ((InternalEObject)result).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ManagerPackage.MATCH__RESULT, null, msgs);
			if (newResult != null)
				msgs = ((InternalEObject)newResult).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ManagerPackage.MATCH__RESULT, null, msgs);
			msgs = basicSetResult(newResult, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ManagerPackage.MATCH__RESULT, newResult, newResult));
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
			case ManagerPackage.MATCH__GROUP:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetGroup((Group)otherEnd, msgs);
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
			case ManagerPackage.MATCH__GROUP:
				return basicSetGroup(null, msgs);
			case ManagerPackage.MATCH__OPPONENTS:
				return ((InternalEList<?>)getOpponents()).basicRemove(otherEnd, msgs);
			case ManagerPackage.MATCH__RESULT:
				return basicSetResult(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs)
	{
		switch (eContainerFeatureID())
		{
			case ManagerPackage.MATCH__GROUP:
				return eInternalContainer().eInverseRemove(this, ManagerPackage.GROUP__MATCHES, Group.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
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
			case ManagerPackage.MATCH__TITLE:
				return getTitle();
			case ManagerPackage.MATCH__SORT_RANK:
				return getSortRank();
			case ManagerPackage.MATCH__RESULT_TYPE:
				return getResultType();
			case ManagerPackage.MATCH__RESOLVED:
				return isResolved();
			case ManagerPackage.MATCH__DATE:
				return getDate();
			case ManagerPackage.MATCH__GROUP:
				return getGroup();
			case ManagerPackage.MATCH__OPPONENTS:
				return getOpponents();
			case ManagerPackage.MATCH__RESULT:
				return getResult();
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
			case ManagerPackage.MATCH__TITLE:
				setTitle((String)newValue);
				return;
			case ManagerPackage.MATCH__SORT_RANK:
				setSortRank((Integer)newValue);
				return;
			case ManagerPackage.MATCH__RESULT_TYPE:
				setResultType((ResultType)newValue);
				return;
			case ManagerPackage.MATCH__RESOLVED:
				setResolved((Boolean)newValue);
				return;
			case ManagerPackage.MATCH__DATE:
				setDate((Date)newValue);
				return;
			case ManagerPackage.MATCH__GROUP:
				setGroup((Group)newValue);
				return;
			case ManagerPackage.MATCH__OPPONENTS:
				getOpponents().clear();
				getOpponents().addAll((Collection<? extends Opponent>)newValue);
				return;
			case ManagerPackage.MATCH__RESULT:
				setResult((Result)newValue);
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
			case ManagerPackage.MATCH__TITLE:
				setTitle(TITLE_EDEFAULT);
				return;
			case ManagerPackage.MATCH__SORT_RANK:
				setSortRank(SORT_RANK_EDEFAULT);
				return;
			case ManagerPackage.MATCH__RESULT_TYPE:
				setResultType(RESULT_TYPE_EDEFAULT);
				return;
			case ManagerPackage.MATCH__RESOLVED:
				setResolved(RESOLVED_EDEFAULT);
				return;
			case ManagerPackage.MATCH__DATE:
				setDate(DATE_EDEFAULT);
				return;
			case ManagerPackage.MATCH__GROUP:
				setGroup((Group)null);
				return;
			case ManagerPackage.MATCH__OPPONENTS:
				getOpponents().clear();
				return;
			case ManagerPackage.MATCH__RESULT:
				setResult((Result)null);
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
			case ManagerPackage.MATCH__TITLE:
				return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
			case ManagerPackage.MATCH__SORT_RANK:
				return sortRank != SORT_RANK_EDEFAULT;
			case ManagerPackage.MATCH__RESULT_TYPE:
				return resultType != RESULT_TYPE_EDEFAULT;
			case ManagerPackage.MATCH__RESOLVED:
				return resolved != RESOLVED_EDEFAULT;
			case ManagerPackage.MATCH__DATE:
				return DATE_EDEFAULT == null ? date != null : !DATE_EDEFAULT.equals(date);
			case ManagerPackage.MATCH__GROUP:
				return getGroup() != null;
			case ManagerPackage.MATCH__OPPONENTS:
				return opponents != null && !opponents.isEmpty();
			case ManagerPackage.MATCH__RESULT:
				return result != null;
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
		result.append(" (title: ");
		result.append(title);
		result.append(", sortRank: ");
		result.append(sortRank);
		result.append(", resultType: ");
		result.append(resultType);
		result.append(", resolved: ");
		result.append(resolved);
		result.append(", date: ");
		result.append(date);
		result.append(')');
		return result.toString();
	}

} //MatchImpl
