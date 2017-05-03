/**
 */
package at.jku.isse.mde.betting.manager;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Category</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A category is a broad gruping for events in a competitive activity. For
 * example, a categories can be used to separete events by age or by gender. Ranks can be used to
 * model more complex structures, for example, to rank separate junior leage male/female categories
 * at the same lavel.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link at.jku.isse.mde.betting.manager.Category#getName <em>Name</em>}</li>
 *   <li>{@link at.jku.isse.mde.betting.manager.Category#getSortRank <em>Sort Rank</em>}</li>
 *   <li>{@link at.jku.isse.mde.betting.manager.Category#getGroups <em>Groups</em>}</li>
 * </ul>
 *
 * @see at.jku.isse.mde.betting.manager.ManagerPackage#getCategory()
 * @model
 * @generated
 */
public interface Category extends IdElement
{
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The name of the category.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see at.jku.isse.mde.betting.manager.ManagerPackage#getCategory_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link at.jku.isse.mde.betting.manager.Category#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Sort Rank</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The rank assigned to the category.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sort Rank</em>' attribute.
	 * @see #setSortRank(int)
	 * @see at.jku.isse.mde.betting.manager.ManagerPackage#getCategory_SortRank()
	 * @model
	 * @generated
	 */
	int getSortRank();

	/**
	 * Sets the value of the '{@link at.jku.isse.mde.betting.manager.Category#getSortRank <em>Sort Rank</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sort Rank</em>' attribute.
	 * @see #getSortRank()
	 * @generated
	 */
	void setSortRank(int value);

	/**
	 * Returns the value of the '<em><b>Groups</b></em>' containment reference list.
	 * The list contents are of type {@link at.jku.isse.mde.betting.manager.Group}.
	 * It is bidirectional and its opposite is '{@link at.jku.isse.mde.betting.manager.Group#getCategory <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The groups that belong to this category.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Groups</em>' containment reference list.
	 * @see at.jku.isse.mde.betting.manager.ManagerPackage#getCategory_Groups()
	 * @see at.jku.isse.mde.betting.manager.Group#getCategory
	 * @model opposite="category" containment="true" ordered="false"
	 * @generated
	 */
	EList<Group> getGroups();

} // Category
