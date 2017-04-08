/**
 */
package net.feichti.codingcontest.impl;

import java.util.Collection;
import java.util.Date;

import net.feichti.codingcontest.CodingcontestPackage;
import net.feichti.codingcontest.Contest;
import net.feichti.codingcontest.Entry;
import net.feichti.codingcontest.Level;
import net.feichti.codingcontest.Location;
import net.feichti.codingcontest.Organizer;
import net.feichti.codingcontest.Problem;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Contest</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link net.feichti.codingcontest.impl.ContestImpl#getId <em>Id</em>}</li>
 *   <li>{@link net.feichti.codingcontest.impl.ContestImpl#getTheme <em>Theme</em>}</li>
 *   <li>{@link net.feichti.codingcontest.impl.ContestImpl#getLocalDate <em>Local Date</em>}</li>
 *   <li>{@link net.feichti.codingcontest.impl.ContestImpl#getLocations <em>Locations</em>}</li>
 *   <li>{@link net.feichti.codingcontest.impl.ContestImpl#getLevels <em>Levels</em>}</li>
 *   <li>{@link net.feichti.codingcontest.impl.ContestImpl#getEntries <em>Entries</em>}</li>
 *   <li>{@link net.feichti.codingcontest.impl.ContestImpl#getOrganizer <em>Organizer</em>}</li>
 *   <li>{@link net.feichti.codingcontest.impl.ContestImpl#getProblems <em>Problems</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContestImpl extends MinimalEObjectImpl.Container implements Contest
{
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getTheme() <em>Theme</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTheme()
	 * @generated
	 * @ordered
	 */
	protected static final String THEME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTheme() <em>Theme</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTheme()
	 * @generated
	 * @ordered
	 */
	protected String theme = THEME_EDEFAULT;

	/**
	 * The default value of the '{@link #getLocalDate() <em>Local Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date LOCAL_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLocalDate() <em>Local Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalDate()
	 * @generated
	 * @ordered
	 */
	protected Date localDate = LOCAL_DATE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLocations() <em>Locations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocations()
	 * @generated
	 * @ordered
	 */
	protected EList<Location> locations;

	/**
	 * The cached value of the '{@link #getLevels() <em>Levels</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevels()
	 * @generated
	 * @ordered
	 */
	protected EList<Level> levels;

	/**
	 * The cached value of the '{@link #getEntries() <em>Entries</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntries()
	 * @generated
	 * @ordered
	 */
	protected EList<Entry> entries;

	/**
	 * The cached value of the '{@link #getOrganizer() <em>Organizer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrganizer()
	 * @generated
	 * @ordered
	 */
	protected Organizer organizer;

	/**
	 * The cached value of the '{@link #getProblems() <em>Problems</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProblems()
	 * @generated
	 * @ordered
	 */
	protected EList<Problem> problems;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContestImpl()
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
		return CodingcontestPackage.Literals.CONTEST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId()
	{
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId)
	{
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CodingcontestPackage.CONTEST__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTheme()
	{
		return theme;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTheme(String newTheme)
	{
		String oldTheme = theme;
		theme = newTheme;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CodingcontestPackage.CONTEST__THEME, oldTheme, theme));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getLocalDate()
	{
		return localDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocalDate(Date newLocalDate)
	{
		Date oldLocalDate = localDate;
		localDate = newLocalDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CodingcontestPackage.CONTEST__LOCAL_DATE, oldLocalDate, localDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Location> getLocations()
	{
		if (locations == null)
		{
			locations = new EObjectContainmentEList<Location>(Location.class, this, CodingcontestPackage.CONTEST__LOCATIONS);
		}
		return locations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Level> getLevels()
	{
		if (levels == null)
		{
			levels = new EObjectContainmentEList<Level>(Level.class, this, CodingcontestPackage.CONTEST__LEVELS);
		}
		return levels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Entry> getEntries()
	{
		if (entries == null)
		{
			entries = new EObjectContainmentEList<Entry>(Entry.class, this, CodingcontestPackage.CONTEST__ENTRIES);
		}
		return entries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Organizer getOrganizer()
	{
		return organizer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOrganizer(Organizer newOrganizer, NotificationChain msgs)
	{
		Organizer oldOrganizer = organizer;
		organizer = newOrganizer;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CodingcontestPackage.CONTEST__ORGANIZER, oldOrganizer, newOrganizer);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrganizer(Organizer newOrganizer)
	{
		if (newOrganizer != organizer)
		{
			NotificationChain msgs = null;
			if (organizer != null)
				msgs = ((InternalEObject)organizer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CodingcontestPackage.CONTEST__ORGANIZER, null, msgs);
			if (newOrganizer != null)
				msgs = ((InternalEObject)newOrganizer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CodingcontestPackage.CONTEST__ORGANIZER, null, msgs);
			msgs = basicSetOrganizer(newOrganizer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CodingcontestPackage.CONTEST__ORGANIZER, newOrganizer, newOrganizer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Problem> getProblems()
	{
		if (problems == null)
		{
			problems = new EObjectContainmentEList<Problem>(Problem.class, this, CodingcontestPackage.CONTEST__PROBLEMS);
		}
		return problems;
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
			case CodingcontestPackage.CONTEST__LOCATIONS:
				return ((InternalEList<?>)getLocations()).basicRemove(otherEnd, msgs);
			case CodingcontestPackage.CONTEST__LEVELS:
				return ((InternalEList<?>)getLevels()).basicRemove(otherEnd, msgs);
			case CodingcontestPackage.CONTEST__ENTRIES:
				return ((InternalEList<?>)getEntries()).basicRemove(otherEnd, msgs);
			case CodingcontestPackage.CONTEST__ORGANIZER:
				return basicSetOrganizer(null, msgs);
			case CodingcontestPackage.CONTEST__PROBLEMS:
				return ((InternalEList<?>)getProblems()).basicRemove(otherEnd, msgs);
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
			case CodingcontestPackage.CONTEST__ID:
				return getId();
			case CodingcontestPackage.CONTEST__THEME:
				return getTheme();
			case CodingcontestPackage.CONTEST__LOCAL_DATE:
				return getLocalDate();
			case CodingcontestPackage.CONTEST__LOCATIONS:
				return getLocations();
			case CodingcontestPackage.CONTEST__LEVELS:
				return getLevels();
			case CodingcontestPackage.CONTEST__ENTRIES:
				return getEntries();
			case CodingcontestPackage.CONTEST__ORGANIZER:
				return getOrganizer();
			case CodingcontestPackage.CONTEST__PROBLEMS:
				return getProblems();
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
			case CodingcontestPackage.CONTEST__ID:
				setId((String)newValue);
				return;
			case CodingcontestPackage.CONTEST__THEME:
				setTheme((String)newValue);
				return;
			case CodingcontestPackage.CONTEST__LOCAL_DATE:
				setLocalDate((Date)newValue);
				return;
			case CodingcontestPackage.CONTEST__LOCATIONS:
				getLocations().clear();
				getLocations().addAll((Collection<? extends Location>)newValue);
				return;
			case CodingcontestPackage.CONTEST__LEVELS:
				getLevels().clear();
				getLevels().addAll((Collection<? extends Level>)newValue);
				return;
			case CodingcontestPackage.CONTEST__ENTRIES:
				getEntries().clear();
				getEntries().addAll((Collection<? extends Entry>)newValue);
				return;
			case CodingcontestPackage.CONTEST__ORGANIZER:
				setOrganizer((Organizer)newValue);
				return;
			case CodingcontestPackage.CONTEST__PROBLEMS:
				getProblems().clear();
				getProblems().addAll((Collection<? extends Problem>)newValue);
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
			case CodingcontestPackage.CONTEST__ID:
				setId(ID_EDEFAULT);
				return;
			case CodingcontestPackage.CONTEST__THEME:
				setTheme(THEME_EDEFAULT);
				return;
			case CodingcontestPackage.CONTEST__LOCAL_DATE:
				setLocalDate(LOCAL_DATE_EDEFAULT);
				return;
			case CodingcontestPackage.CONTEST__LOCATIONS:
				getLocations().clear();
				return;
			case CodingcontestPackage.CONTEST__LEVELS:
				getLevels().clear();
				return;
			case CodingcontestPackage.CONTEST__ENTRIES:
				getEntries().clear();
				return;
			case CodingcontestPackage.CONTEST__ORGANIZER:
				setOrganizer((Organizer)null);
				return;
			case CodingcontestPackage.CONTEST__PROBLEMS:
				getProblems().clear();
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
			case CodingcontestPackage.CONTEST__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case CodingcontestPackage.CONTEST__THEME:
				return THEME_EDEFAULT == null ? theme != null : !THEME_EDEFAULT.equals(theme);
			case CodingcontestPackage.CONTEST__LOCAL_DATE:
				return LOCAL_DATE_EDEFAULT == null ? localDate != null : !LOCAL_DATE_EDEFAULT.equals(localDate);
			case CodingcontestPackage.CONTEST__LOCATIONS:
				return locations != null && !locations.isEmpty();
			case CodingcontestPackage.CONTEST__LEVELS:
				return levels != null && !levels.isEmpty();
			case CodingcontestPackage.CONTEST__ENTRIES:
				return entries != null && !entries.isEmpty();
			case CodingcontestPackage.CONTEST__ORGANIZER:
				return organizer != null;
			case CodingcontestPackage.CONTEST__PROBLEMS:
				return problems != null && !problems.isEmpty();
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
		result.append(" (id: ");
		result.append(id);
		result.append(", theme: ");
		result.append(theme);
		result.append(", localDate: ");
		result.append(localDate);
		result.append(')');
		return result.toString();
	}

} //ContestImpl
