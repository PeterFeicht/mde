/**
 */
package at.jku.isse.mde.betting.manager;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bet</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A bet defines an amount of credits to be placed on a result for a given 
 * match.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link at.jku.isse.mde.betting.manager.Bet#getAmount <em>Amount</em>}</li>
 *   <li>{@link at.jku.isse.mde.betting.manager.Bet#getBetOn <em>Bet On</em>}</li>
 *   <li>{@link at.jku.isse.mde.betting.manager.Bet#getExpectedResult <em>Expected Result</em>}</li>
 * </ul>
 *
 * @see at.jku.isse.mde.betting.manager.ManagerPackage#getBet()
 * @model
 * @generated
 */
public interface Bet extends IdElement
{
	/**
	 * Returns the value of the '<em><b>Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The amount placed on the bet.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Amount</em>' attribute.
	 * @see #setAmount(int)
	 * @see at.jku.isse.mde.betting.manager.ManagerPackage#getBet_Amount()
	 * @model required="true"
	 * @generated
	 */
	int getAmount();

	/**
	 * Sets the value of the '{@link at.jku.isse.mde.betting.manager.Bet#getAmount <em>Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Amount</em>' attribute.
	 * @see #getAmount()
	 * @generated
	 */
	void setAmount(int value);

	/**
	 * Returns the value of the '<em><b>Bet On</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The match that this bet is for.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bet On</em>' reference.
	 * @see #setBetOn(Match)
	 * @see at.jku.isse.mde.betting.manager.ManagerPackage#getBet_BetOn()
	 * @model required="true"
	 * @generated
	 */
	Match getBetOn();

	/**
	 * Sets the value of the '{@link at.jku.isse.mde.betting.manager.Bet#getBetOn <em>Bet On</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bet On</em>' reference.
	 * @see #getBetOn()
	 * @generated
	 */
	void setBetOn(Match value);

	/**
	 * Returns the value of the '<em><b>Expected Result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The result that the bet pays. For ResultType#Position results the bet 
	 *   can either be Win, Place or Show (as for horse races). For Win the expectedResult.order should
	 *   be [op], for Place it should be [op, op] and for Show [op, op, op].
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Expected Result</em>' containment reference.
	 * @see #setExpectedResult(Result)
	 * @see at.jku.isse.mde.betting.manager.ManagerPackage#getBet_ExpectedResult()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Result getExpectedResult();

	/**
	 * Sets the value of the '{@link at.jku.isse.mde.betting.manager.Bet#getExpectedResult <em>Expected Result</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expected Result</em>' containment reference.
	 * @see #getExpectedResult()
	 * @generated
	 */
	void setExpectedResult(Result value);

} // Bet
