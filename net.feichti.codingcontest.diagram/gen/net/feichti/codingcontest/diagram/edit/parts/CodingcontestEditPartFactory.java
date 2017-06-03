package net.feichti.codingcontest.diagram.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.directedit.locator.CellEditorLocatorAccess;

import net.feichti.codingcontest.diagram.part.CodingcontestVisualIDRegistry;

/**
 * @generated
 */
public class CodingcontestEditPartFactory implements EditPartFactory
{
	
	/**
	* @generated
	*/
	public EditPart createEditPart(EditPart context, Object model) {
		if(model instanceof View) {
			View view = (View) model;
			switch(CodingcontestVisualIDRegistry.getVisualID(view)) {
				
				case ContestEditPart.VISUAL_ID:
					return new ContestEditPart(view);
				
				case LevelEditPart.VISUAL_ID:
					return new LevelEditPart(view);
				
				case LevelNumberEditPart.VISUAL_ID:
					return new LevelNumberEditPart(view);
				
				case OrganizerEditPart.VISUAL_ID:
					return new OrganizerEditPart(view);
				
				case OrganizerNameEditPart.VISUAL_ID:
					return new OrganizerNameEditPart(view);
				
				case LocationEditPart.VISUAL_ID:
					return new LocationEditPart(view);
				
				case LocationNameEditPart.VISUAL_ID:
					return new LocationNameEditPart(view);
				
				case TeamEditPart.VISUAL_ID:
					return new TeamEditPart(view);
				
				case TeamNameEditPart.VISUAL_ID:
					return new TeamNameEditPart(view);
				
				case ProblemEditPart.VISUAL_ID:
					return new ProblemEditPart(view);
				
				case ProblemTitleEditPart.VISUAL_ID:
					return new ProblemTitleEditPart(view);
				
				case CoderEditPart.VISUAL_ID:
					return new CoderEditPart(view);
				
				case CoderNameEditPart.VISUAL_ID:
					return new CoderNameEditPart(view);
				
				case LanguageToProblemMapEditPart.VISUAL_ID:
					return new LanguageToProblemMapEditPart(view);
				
				case LanguageToProblemMapKeyEditPart.VISUAL_ID:
					return new LanguageToProblemMapKeyEditPart(view);
				
				case TeamLocationEditPart.VISUAL_ID:
					return new TeamLocationEditPart(view);
				
			}
		}
		return createUnrecognizedEditPart(context, model);
	}
	
	/**
	* @generated
	*/
	private EditPart createUnrecognizedEditPart(EditPart context, Object model) {
		// Handle creation of unrecognized child node EditParts here
		return null;
	}
	
	/**
	* @generated
	*/
	public static CellEditorLocator getTextCellEditorLocator(
			ITextAwareEditPart source) {
		return CellEditorLocatorAccess.INSTANCE.getTextCellEditorLocator(source);
	}
	
}
