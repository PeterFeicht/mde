/**
 */
package at.jku.isse.mde.betting.manager;

import java.util.Date;


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
 *   <li>{@link at.jku.isse.mde.betting.manager.Bet#getDate <em>Date</em>}</li>
 *   <li>{@link at.jku.isse.mde.betting.manager.Bet#isPayed <em>Payed</em>}</li>
 *   <li>{@link at.jku.isse.mde.betting.manager.Bet#getPositionBetType <em>Position Bet Type</em>}</li>
 *   <li>{@link at.jku.isse.mde.betting.manager.Bet#getBetOn <em>Bet On</em>}</li>
 *   <li>{@link at.jku.isse.mde.betting.manager.Bet#getExpectedResult <em>Expected Result</em>}</li>
 *   <li>{@link at.jku.isse.mde.betting.manager.Bet#getUser <em>User</em>}</li>
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
	 * @see #setAmount(double)
	 * @see at.jku.isse.mde.betting.manager.ManagerPackage#getBet_Amount()
	 * @model required="true"
	 * @generated
	 */
	double getAmount();

	/**
	 * Sets the value of the '{@link at.jku.isse.mde.betting.manager.Bet#getAmount <em>Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Amount</em>' attribute.
	 * @see #getAmount()
	 * @generated
	 */
	void setAmount(double value);

	/**
	 * Returns the value of the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The date in which the bet was placed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Date</em>' attribute.
	 * @see #setDate(Date)
	 * @see at.jku.isse.mde.betting.manager.ManagerPackage#getBet_Date()
	 * @model required="true"
	 * @generated
	 */
	Date getDate();

	/**
	 * Sets the value of the '{@link at.jku.isse.mde.betting.manager.Bet#getDate <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date</em>' attribute.
	 * @see #getDate()
	 * @generated
	 */
	void setDate(Date value);

	/**
	 * Returns the value of the '<em><b>Payed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Determines if the bet has been payed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Payed</em>' attribute.
	 * @see #setPayed(boolean)
	 * @see at.jku.isse.mde.betting.manager.ManagerPackage#getBet_Payed()
	 * @model required="true"
	 * @generated
	 */
	boolean isPayed();

	/**
	 * Sets the value of the '{@link at.jku.isse.mde.betting.manager.Bet#isPayed <em>Payed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Payed</em>' attribute.
	 * @see #isPayed()
	 * @generated
	 */
	void setPayed(boolean value);

	/**
	 * Returns the value of the '<em><b>Position Bet Type</b></em>' attribute.
	 * The literals are from the enumeration {@link at.jku.isse.mde.betting.manager.PositionBetType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * For bets on position results, the type of bet.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Position Bet Type</em>' attribute.
	 * @see at.jku.isse.mde.betting.manager.PositionBetType
	 * @see #setPositionBetType(PositionBetType)
	 * @see at.jku.isse.mde.betting.manager.ManagerPackage#getBet_PositionBetType()
	 * @model
	 * @generated
	 */
	PositionBetType getPositionBetType();

	/**
	 * Sets the value of the '{@link at.jku.isse.mde.betting.manager.Bet#getPositionBetType <em>Position Bet Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Position Bet Type</em>' attribute.
	 * @see at.jku.isse.mde.betting.manager.PositionBetType
	 * @see #getPositionBetType()
	 * @generated
	 */
	void setPositionBetType(PositionBetType value);

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
	 * The result that the bet pays. For a bet to be paid, the expectedResult must match the Match's result.
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

	/**
	 * Returns the value of the '<em><b>User</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link at.jku.isse.mde.betting.manager.User#getBets <em>Bets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The user placing the bet.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>User</em>' reference.
	 * @see #setUser(User)
	 * @see at.jku.isse.mde.betting.manager.ManagerPackage#getBet_User()
	 * @see at.jku.isse.mde.betting.manager.User#getBets
	 * @model opposite="bets" required="true"
	 * @generated
	 */
	User getUser();

	/**
	 * Sets the value of the '{@link at.jku.isse.mde.betting.manager.Bet#getUser <em>User</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User</em>' reference.
	 * @see #getUser()
	 * @generated
	 */
	void setUser(User value);

} // Bet
