package net.feichti.codingcontest.diagram.navigator;

import org.eclipse.jface.viewers.ViewerSorter;

import net.feichti.codingcontest.diagram.part.CodingcontestVisualIDRegistry;

/**
 * @generated
 */
public class CodingcontestNavigatorSorter extends ViewerSorter
{
	
	/**
	* @generated
	*/
	private static final int GROUP_CATEGORY = 4004;
	
	/**
	* @generated
	*/
	public int category(Object element) {
		if(element instanceof CodingcontestNavigatorItem) {
			CodingcontestNavigatorItem item = (CodingcontestNavigatorItem) element;
			return CodingcontestVisualIDRegistry.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}
	
}
