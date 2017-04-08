package net.feichti.codingcontest.diagram.providers;

import net.feichti.codingcontest.diagram.part.CodingcontestDiagramEditorPlugin;

/**
 * @generated
 */
public class ElementInitializers
{
	
	protected ElementInitializers() {
		// use #getInstance to access cached instance
	}
	
	/**
	* @generated
	*/
	public static ElementInitializers getInstance() {
		ElementInitializers cached = CodingcontestDiagramEditorPlugin.getInstance().getElementInitializers();
		if(cached == null) {
			CodingcontestDiagramEditorPlugin.getInstance().setElementInitializers(cached = new ElementInitializers());
		}
		return cached;
	}
}
