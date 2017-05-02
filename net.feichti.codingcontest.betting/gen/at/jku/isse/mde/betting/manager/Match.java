/**
 */
package at.jku.isse.mde.betting.manager;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Match</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A match represents an event in the competitive activity. Matches are
 * assumed to be held between 2 or more contestants. A match will be marked as resolved when a result
 * is provided. 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link at.jku.isse.mde.betting.manager.Match#getTitle <em>Title</em>}</li>
 *   <li>{@link at.jku.isse.mde.betting.manager.Match#getSortRank <em>Sort Rank</em>}</li>
 *   <li>{@link at.jku.isse.mde.betting.manager.Match#getResultType <em>Result Type</em>}</li>
 *   <li>{@link at.jku.isse.mde.betting.manager.Match#isResolved <em>Resolved</em>}</li>
 *   <li>{@link at.jku.isse.mde.betting.manager.Match#getDate <em>Date</em>}</li>
 *   <li>{@link at.jku.isse.mde.betting.manager.Match#getGroup <em>Group</em>}</li>
 *   <li>{@link at.jku.isse.mde.betting.manager.Match#getOpponents <em>Opponents</em>}</li>
 *   <li>{@link at.jku.isse.mde.betting.manager.Match#getResult <em>Result</em>}</li>
 * </ul>
 *
 * @see at.jku.isse.mde.betting.manager.ManagerPackage#getMatch()
 * @model
 * @generated
 */
public interface Match extends IdElement
{
	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The title of the match. It should help users identify the match, for 
	 *   example: WC2017-Semi-Japan_vs_Brazil.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see at.jku.isse.mde.betting.manager.ManagerPackage#getMatch_Title()
	 * @model
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link at.jku.isse.mde.betting.manager.Match#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

	/**
	 * Returns the value of the '<em><b>Sort Rank</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The rank assigned to the match, if any. A rank can be used to, for 
	 *   example, identify the sequence of matches between the same opponents.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sort Rank</em>' attribute.
	 * @see #setSortRank(int)
	 * @see at.jku.isse.mde.betting.manager.ManagerPackage#getMatch_SortRank()
	 * @model
	 * @generated
	 */
	int getSortRank();

	/**
	 * Sets the value of the '{@link at.jku.isse.mde.betting.manager.Match#getSortRank <em>Sort Rank</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sort Rank</em>' attribute.
	 * @see #getSortRank()
	 * @generated
	 */
	void setSortRank(int value);

	/**
	 * Returns the value of the '<em><b>Result Type</b></em>' attribute.
	 * The literals are from the enumeration {@link at.jku.isse.mde.betting.manager.ResultType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates the type of result.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Result Type</em>' attribute.
	 * @see at.jku.isse.mde.betting.manager.ResultType
	 * @see #setResultType(ResultType)
	 * @see at.jku.isse.mde.betting.manager.ManagerPackage#getMatch_ResultType()
	 * @model
	 * @generated
	 */
	ResultType getResultType();

	/**
	 * Sets the value of the '{@link at.jku.isse.mde.betting.manager.Match#getResultType <em>Result Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Result Type</em>' attribute.
	 * @see at.jku.isse.mde.betting.manager.ResultType
	 * @see #getResultType()
	 * @generated
	 */
	void setResultType(ResultType value);

	/**
	 * Returns the value of the '<em><b>Resolved</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates that the match has been played and the results added. After a
	 *   match has been marked as resolved, it can no longer be modified.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Resolved</em>' attribute.
	 * @see #setResolved(boolean)
	 * @see at.jku.isse.mde.betting.manager.ManagerPackage#getMatch_Resolved()
	 * @model
	 * @generated
	 */
	boolean isResolved();

	/**
	 * Sets the value of the '{@link at.jku.isse.mde.betting.manager.Match#isResolved <em>Resolved</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resolved</em>' attribute.
	 * @see #isResolved()
	 * @generated
	 */
	void setResolved(boolean value);

	/**
	 * Returns the value of the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates the date in which the match takes place. The date must be 
	 *   within the dates of the owner group.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Date</em>' attribute.
	 * @see #setDate(Date)
	 * @see at.jku.isse.mde.betting.manager.ManagerPackage#getMatch_Date()
	 * @model required="true"
	 * @generated
	 */
	Date getDate();

	/**
	 * Sets the value of the '{@link at.jku.isse.mde.betting.manager.Match#getDate <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date</em>' attribute.
	 * @see #getDate()
	 * @generated
	 */
	void setDate(Date value);

	/**
	 * Returns the value of the '<em><b>Group</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link at.jku.isse.mde.betting.manager.Group#getMatches <em>Matches</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The group that owns the match.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Group</em>' container reference.
	 * @see #setGroup(Group)
	 * @see at.jku.isse.mde.betting.manager.ManagerPackage#getMatch_Group()
	 * @see at.jku.isse.mde.betting.manager.Group#getMatches
	 * @model opposite="matches" required="true" transient="false"
	 * @generated
	 */
	Group getGroup();

	/**
	 * Sets the value of the '{@link at.jku.isse.mde.betting.manager.Match#getGroup <em>Group</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Group</em>' container reference.
	 * @see #getGroup()
	 * @generated
	 */
	void setGroup(Group value);

	/**
	 * Returns the value of the '<em><b>Opponents</b></em>' containment reference list.
	 * The list contents are of type {@link at.jku.isse.mde.betting.manager.Opponent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The contestants that participate in this match.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Opponents</em>' containment reference list.
	 * @see at.jku.isse.mde.betting.manager.ManagerPackage#getMatch_Opponents()
	 * @model containment="true" lower="2" ordered="false"
	 * @generated
	 */
	EList<Opponent> getOpponents();

	/**
	 * Returns the value of the '<em><b>Result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The result of the match, if any.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Result</em>' containment reference.
	 * @see #setResult(Result)
	 * @see at.jku.isse.mde.betting.manager.ManagerPackage#getMatch_Result()
	 * @model containment="true"
	 * @generated
	 */
	Result getResult();

	/**
	 * Sets the value of the '{@link at.jku.isse.mde.betting.manager.Match#getResult <em>Result</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Result</em>' containment reference.
	 * @see #getResult()
	 * @generated
	 */
	void setResult(Result value);

} // Match
