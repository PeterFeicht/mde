/**
 */
package at.jku.isse.mde.betting.manager;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A group gathers a set of events of the competitive activity. The group has
 * a tittle and a pair of (start, end) dates that define when the events in the group take place. Bets
 * are only allowed on events that have not taken place and are paid only on events that have taken
 * place.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link at.jku.isse.mde.betting.manager.Group#getTitle <em>Title</em>}</li>
 *   <li>{@link at.jku.isse.mde.betting.manager.Group#getDescription <em>Description</em>}</li>
 *   <li>{@link at.jku.isse.mde.betting.manager.Group#getStartDate <em>Start Date</em>}</li>
 *   <li>{@link at.jku.isse.mde.betting.manager.Group#getEndDate <em>End Date</em>}</li>
 *   <li>{@link at.jku.isse.mde.betting.manager.Group#isResolved <em>Resolved</em>}</li>
 *   <li>{@link at.jku.isse.mde.betting.manager.Group#getCategory <em>Category</em>}</li>
 *   <li>{@link at.jku.isse.mde.betting.manager.Group#getMatches <em>Matches</em>}</li>
 * </ul>
 *
 * @see at.jku.isse.mde.betting.manager.ManagerPackage#getGroup()
 * @model
 * @generated
 */
public interface Group extends IdElement
{
	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The title of the group.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see at.jku.isse.mde.betting.manager.ManagerPackage#getGroup_Title()
	 * @model
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link at.jku.isse.mde.betting.manager.Group#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The description of the group.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see at.jku.isse.mde.betting.manager.ManagerPackage#getGroup_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link at.jku.isse.mde.betting.manager.Group#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The start date for events in the group.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Start Date</em>' attribute.
	 * @see #setStartDate(Date)
	 * @see at.jku.isse.mde.betting.manager.ManagerPackage#getGroup_StartDate()
	 * @model
	 * @generated
	 */
	Date getStartDate();

	/**
	 * Sets the value of the '{@link at.jku.isse.mde.betting.manager.Group#getStartDate <em>Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Date</em>' attribute.
	 * @see #getStartDate()
	 * @generated
	 */
	void setStartDate(Date value);

	/**
	 * Returns the value of the '<em><b>End Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The end date for events in the group.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>End Date</em>' attribute.
	 * @see #setEndDate(Date)
	 * @see at.jku.isse.mde.betting.manager.ManagerPackage#getGroup_EndDate()
	 * @model
	 * @generated
	 */
	Date getEndDate();

	/**
	 * Sets the value of the '{@link at.jku.isse.mde.betting.manager.Group#getEndDate <em>End Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Date</em>' attribute.
	 * @see #getEndDate()
	 * @generated
	 */
	void setEndDate(Date value);

	/**
	 * Returns the value of the '<em><b>Resolved</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates that the group has been resolved, i.e. it has occured.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Resolved</em>' attribute.
	 * @see #setResolved(boolean)
	 * @see at.jku.isse.mde.betting.manager.ManagerPackage#getGroup_Resolved()
	 * @model
	 * @generated
	 */
	boolean isResolved();

	/**
	 * Sets the value of the '{@link at.jku.isse.mde.betting.manager.Group#isResolved <em>Resolved</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resolved</em>' attribute.
	 * @see #isResolved()
	 * @generated
	 */
	void setResolved(boolean value);

	/**
	 * Returns the value of the '<em><b>Category</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link at.jku.isse.mde.betting.manager.Category#getGroups <em>Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The category to which this group belongs.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Category</em>' container reference.
	 * @see #setCategory(Category)
	 * @see at.jku.isse.mde.betting.manager.ManagerPackage#getGroup_Category()
	 * @see at.jku.isse.mde.betting.manager.Category#getGroups
	 * @model opposite="groups" required="true" transient="false"
	 * @generated
	 */
	Category getCategory();

	/**
	 * Sets the value of the '{@link at.jku.isse.mde.betting.manager.Group#getCategory <em>Category</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Category</em>' container reference.
	 * @see #getCategory()
	 * @generated
	 */
	void setCategory(Category value);

	/**
	 * Returns the value of the '<em><b>Matches</b></em>' containment reference list.
	 * The list contents are of type {@link at.jku.isse.mde.betting.manager.Match}.
	 * It is bidirectional and its opposite is '{@link at.jku.isse.mde.betting.manager.Match#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The matches that belong to this category.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Matches</em>' containment reference list.
	 * @see at.jku.isse.mde.betting.manager.ManagerPackage#getGroup_Matches()
	 * @see at.jku.isse.mde.betting.manager.Match#getGroup
	 * @model opposite="group" containment="true" ordered="false"
	 * @generated
	 */
	EList<Match> getMatches();

} // Group
