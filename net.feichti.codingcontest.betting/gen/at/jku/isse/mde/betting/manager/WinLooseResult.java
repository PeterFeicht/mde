/**
 */
package at.jku.isse.mde.betting.manager;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Win Loose Result</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A WinLooseResult specifies a result in which a win, loose or draw can 
 * happen. 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link at.jku.isse.mde.betting.manager.WinLooseResult#getIsDraw <em>Is Draw</em>}</li>
 *   <li>{@link at.jku.isse.mde.betting.manager.WinLooseResult#getWinner <em>Winner</em>}</li>
 * </ul>
 *
 * @see at.jku.isse.mde.betting.manager.ManagerPackage#getWinLooseResult()
 * @model
 * @generated
 */
public interface WinLooseResult extends Result
{
	/**
	 * Returns the value of the '<em><b>Is Draw</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates that the event's result was a draw.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Draw</em>' attribute.
	 * @see #setIsDraw(Boolean)
	 * @see at.jku.isse.mde.betting.manager.ManagerPackage#getWinLooseResult_IsDraw()
	 * @model
	 * @generated
	 */
	Boolean getIsDraw();

	/**
	 * Sets the value of the '{@link at.jku.isse.mde.betting.manager.WinLooseResult#getIsDraw <em>Is Draw</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Draw</em>' attribute.
	 * @see #getIsDraw()
	 * @generated
	 */
	void setIsDraw(Boolean value);

	/**
	 * Returns the value of the '<em><b>Winner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates the opponent that won the event.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Winner</em>' reference.
	 * @see #setWinner(Opponent)
	 * @see at.jku.isse.mde.betting.manager.ManagerPackage#getWinLooseResult_Winner()
	 * @model
	 * @generated
	 */
	Opponent getWinner();

	/**
	 * Sets the value of the '{@link at.jku.isse.mde.betting.manager.WinLooseResult#getWinner <em>Winner</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Winner</em>' reference.
	 * @see #getWinner()
	 * @generated
	 */
	void setWinner(Opponent value);

} // WinLooseResult
