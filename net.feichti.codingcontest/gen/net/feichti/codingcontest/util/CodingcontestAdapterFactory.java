/**
 */
package net.feichti.codingcontest.util;

import java.util.Map;

import net.feichti.codingcontest.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see net.feichti.codingcontest.CodingcontestPackage
 * @generated
 */
public class CodingcontestAdapterFactory extends AdapterFactoryImpl
{
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CodingcontestPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodingcontestAdapterFactory()
	{
		if (modelPackage == null)
		{
			modelPackage = CodingcontestPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object)
	{
		if (object == modelPackage)
		{
			return true;
		}
		if (object instanceof EObject)
		{
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CodingcontestSwitch<Adapter> modelSwitch =
		new CodingcontestSwitch<Adapter>()
		{
			@Override
			public Adapter caseCoder(Coder object)
			{
				return createCoderAdapter();
			}
			@Override
			public Adapter caseContest(Contest object)
			{
				return createContestAdapter();
			}
			@Override
			public Adapter caseLocation(Location object)
			{
				return createLocationAdapter();
			}
			@Override
			public Adapter caseEntry(Entry object)
			{
				return createEntryAdapter();
			}
			@Override
			public Adapter caseOrganizer(Organizer object)
			{
				return createOrganizerAdapter();
			}
			@Override
			public Adapter caseLevel(Level object)
			{
				return createLevelAdapter();
			}
			@Override
			public Adapter caseProblem(Problem object)
			{
				return createProblemAdapter();
			}
			@Override
			public Adapter caseLanguageToProblemMap(Map.Entry<String, Problem> object)
			{
				return createLanguageToProblemMapAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object)
			{
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target)
	{
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link net.feichti.codingcontest.Coder <em>Coder</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.feichti.codingcontest.Coder
	 * @generated
	 */
	public Adapter createCoderAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.feichti.codingcontest.Contest <em>Contest</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.feichti.codingcontest.Contest
	 * @generated
	 */
	public Adapter createContestAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.feichti.codingcontest.Location <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.feichti.codingcontest.Location
	 * @generated
	 */
	public Adapter createLocationAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.feichti.codingcontest.Entry <em>Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.feichti.codingcontest.Entry
	 * @generated
	 */
	public Adapter createEntryAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.feichti.codingcontest.Organizer <em>Organizer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.feichti.codingcontest.Organizer
	 * @generated
	 */
	public Adapter createOrganizerAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.feichti.codingcontest.Level <em>Level</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.feichti.codingcontest.Level
	 * @generated
	 */
	public Adapter createLevelAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.feichti.codingcontest.Problem <em>Problem</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.feichti.codingcontest.Problem
	 * @generated
	 */
	public Adapter createProblemAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link java.util.Map.Entry <em>Language To Problem Map</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see java.util.Map.Entry
	 * @generated
	 */
	public Adapter createLanguageToProblemMapAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter()
	{
		return null;
	}

} //CodingcontestAdapterFactory
