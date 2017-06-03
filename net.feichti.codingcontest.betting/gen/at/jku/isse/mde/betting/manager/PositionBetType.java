/**
 */
package at.jku.isse.mde.betting.manager;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Position Bet Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Type of bet placed on the opponent in a Position match.
 * <!-- end-model-doc -->
 * @see at.jku.isse.mde.betting.manager.ManagerPackage#getPositionBetType()
 * @model
 * @generated
 */
public enum PositionBetType implements Enumerator
{
	/**
	 * The '<em><b>Win</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WIN_VALUE
	 * @generated
	 * @ordered
	 */
	WIN(1, "Win", "Win"),

	/**
	 * The '<em><b>Show</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SHOW_VALUE
	 * @generated
	 * @ordered
	 */
	SHOW(2, "Show", "Show"),

	/**
	 * The '<em><b>Place</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PLACE_VALUE
	 * @generated
	 * @ordered
	 */
	PLACE(3, "Place", "Place");

	/**
	 * The '<em><b>Win</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Bet the opponent to win, and if he finishes first, you collect.
	 * <!-- end-model-doc -->
	 * @see #WIN
	 * @model name="Win"
	 * @generated
	 * @ordered
	 */
	public static final int WIN_VALUE = 1;

	/**
	 * The '<em><b>Show</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Bet the opponent to place, and if he finishes first or second, you collect.
	 * <!-- end-model-doc -->
	 * @see #SHOW
	 * @model name="Show"
	 * @generated
	 * @ordered
	 */
	public static final int SHOW_VALUE = 2;

	/**
	 * The '<em><b>Place</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Bet a horse to show, and if he finishes first or second, or third, you collect.
	 * <!-- end-model-doc -->
	 * @see #PLACE
	 * @model name="Place"
	 * @generated
	 * @ordered
	 */
	public static final int PLACE_VALUE = 3;

	/**
	 * An array of all the '<em><b>Position Bet Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final PositionBetType[] VALUES_ARRAY =
		new PositionBetType[]
		{
			WIN,
			SHOW,
			PLACE,
		};

	/**
	 * A public read-only list of all the '<em><b>Position Bet Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<PositionBetType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Position Bet Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PositionBetType get(String literal)
	{
		for (int i = 0; i < VALUES_ARRAY.length; ++i)
		{
			PositionBetType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal))
			{
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Position Bet Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PositionBetType getByName(String name)
	{
		for (int i = 0; i < VALUES_ARRAY.length; ++i)
		{
			PositionBetType result = VALUES_ARRAY[i];
			if (result.getName().equals(name))
			{
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Position Bet Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PositionBetType get(int value)
	{
		switch (value)
		{
			case WIN_VALUE: return WIN;
			case SHOW_VALUE: return SHOW;
			case PLACE_VALUE: return PLACE;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private PositionBetType(int value, String name, String literal)
	{
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue()
	{
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName()
	{
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral()
	{
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString()
	{
		return literal;
	}
	
} //PositionBetType
