/**
 */
package at.jku.isse.mde.betting.manager.util;

import at.jku.isse.mde.betting.manager.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see at.jku.isse.mde.betting.manager.ManagerPackage
 * @generated
 */
public class ManagerAdapterFactory extends AdapterFactoryImpl
{
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ManagerPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ManagerAdapterFactory()
	{
		if (modelPackage == null)
		{
			modelPackage = ManagerPackage.eINSTANCE;
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
	protected ManagerSwitch<Adapter> modelSwitch =
		new ManagerSwitch<Adapter>()
		{
			@Override
			public Adapter caseIdElement(IdElement object)
			{
				return createIdElementAdapter();
			}
			@Override
			public Adapter caseManager(Manager object)
			{
				return createManagerAdapter();
			}
			@Override
			public Adapter caseCategory(Category object)
			{
				return createCategoryAdapter();
			}
			@Override
			public Adapter caseGroup(Group object)
			{
				return createGroupAdapter();
			}
			@Override
			public Adapter caseMatch(Match object)
			{
				return createMatchAdapter();
			}
			@Override
			public Adapter caseOpponent(Opponent object)
			{
				return createOpponentAdapter();
			}
			@Override
			public Adapter caseResult(Result object)
			{
				return createResultAdapter();
			}
			@Override
			public Adapter caseWinLooseResult(WinLooseResult object)
			{
				return createWinLooseResultAdapter();
			}
			@Override
			public Adapter casePositionResult(PositionResult object)
			{
				return createPositionResultAdapter();
			}
			@Override
			public Adapter caseBet(Bet object)
			{
				return createBetAdapter();
			}
			@Override
			public Adapter caseUser(User object)
			{
				return createUserAdapter();
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
	 * Creates a new adapter for an object of class '{@link at.jku.isse.mde.betting.manager.Manager <em>Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.jku.isse.mde.betting.manager.Manager
	 * @generated
	 */
	public Adapter createManagerAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.jku.isse.mde.betting.manager.IdElement <em>Id Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.jku.isse.mde.betting.manager.IdElement
	 * @generated
	 */
	public Adapter createIdElementAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.jku.isse.mde.betting.manager.Category <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.jku.isse.mde.betting.manager.Category
	 * @generated
	 */
	public Adapter createCategoryAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.jku.isse.mde.betting.manager.Group <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.jku.isse.mde.betting.manager.Group
	 * @generated
	 */
	public Adapter createGroupAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.jku.isse.mde.betting.manager.Match <em>Match</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.jku.isse.mde.betting.manager.Match
	 * @generated
	 */
	public Adapter createMatchAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.jku.isse.mde.betting.manager.Opponent <em>Opponent</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.jku.isse.mde.betting.manager.Opponent
	 * @generated
	 */
	public Adapter createOpponentAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.jku.isse.mde.betting.manager.Result <em>Result</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.jku.isse.mde.betting.manager.Result
	 * @generated
	 */
	public Adapter createResultAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.jku.isse.mde.betting.manager.WinLooseResult <em>Win Loose Result</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.jku.isse.mde.betting.manager.WinLooseResult
	 * @generated
	 */
	public Adapter createWinLooseResultAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.jku.isse.mde.betting.manager.PositionResult <em>Position Result</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.jku.isse.mde.betting.manager.PositionResult
	 * @generated
	 */
	public Adapter createPositionResultAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.jku.isse.mde.betting.manager.Bet <em>Bet</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.jku.isse.mde.betting.manager.Bet
	 * @generated
	 */
	public Adapter createBetAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.jku.isse.mde.betting.manager.User <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.jku.isse.mde.betting.manager.User
	 * @generated
	 */
	public Adapter createUserAdapter()
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

} //ManagerAdapterFactory
