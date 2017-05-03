/**
 */
package at.jku.isse.mde.betting.manager;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Position Result</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A PositionResult specifies a result in which a opponents are assigned a 
 * finishing order.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link at.jku.isse.mde.betting.manager.PositionResult#getOrder <em>Order</em>}</li>
 * </ul>
 *
 * @see at.jku.isse.mde.betting.manager.ManagerPackage#getPositionResult()
 * @model
 * @generated
 */
public interface PositionResult extends Result
{
	/**
	 * Returns the value of the '<em><b>Order</b></em>' reference list.
	 * The list contents are of type {@link at.jku.isse.mde.betting.manager.Opponent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Opponents in the event in finishing order.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Order</em>' reference list.
	 * @see at.jku.isse.mde.betting.manager.ManagerPackage#getPositionResult_Order()
	 * @model required="true"
	 * @generated
	 */
	EList<Opponent> getOrder();

} // PositionResult
