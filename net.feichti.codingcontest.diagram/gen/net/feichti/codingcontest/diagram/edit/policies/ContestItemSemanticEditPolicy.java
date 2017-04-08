package net.feichti.codingcontest.diagram.edit.policies;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.commands.core.commands.DuplicateEObjectsCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DuplicateElementsRequest;

import net.feichti.codingcontest.diagram.edit.commands.EntryCreateCommand;
import net.feichti.codingcontest.diagram.edit.commands.LevelCreateCommand;
import net.feichti.codingcontest.diagram.edit.commands.LocationCreateCommand;
import net.feichti.codingcontest.diagram.edit.commands.OrganizerCreateCommand;
import net.feichti.codingcontest.diagram.edit.commands.ProblemCreateCommand;
import net.feichti.codingcontest.diagram.providers.CodingcontestElementTypes;

/**
 * @generated
 */
public class ContestItemSemanticEditPolicy extends CodingcontestBaseItemSemanticEditPolicy
{
	
	/**
	* @generated
	*/
	public ContestItemSemanticEditPolicy() {
		super(CodingcontestElementTypes.Contest_1000);
	}
	
	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if(CodingcontestElementTypes.Level_2001 == req.getElementType()) {
			return getGEFWrapper(new LevelCreateCommand(req));
		}
		if(CodingcontestElementTypes.Organizer_2002 == req.getElementType()) {
			return getGEFWrapper(new OrganizerCreateCommand(req));
		}
		if(CodingcontestElementTypes.Location_2003 == req.getElementType()) {
			return getGEFWrapper(new LocationCreateCommand(req));
		}
		if(CodingcontestElementTypes.Entry_2004 == req.getElementType()) {
			return getGEFWrapper(new EntryCreateCommand(req));
		}
		if(CodingcontestElementTypes.Problem_2005 == req.getElementType()) {
			return getGEFWrapper(new ProblemCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}
	
	/**
	* @generated
	*/
	protected Command getDuplicateCommand(DuplicateElementsRequest req) {
		TransactionalEditingDomain editingDomain = ((IGraphicalEditPart) getHost()).getEditingDomain();
		return getGEFWrapper(new DuplicateAnythingCommand(editingDomain, req));
	}
	
	/**
	* @generated
	*/
	private static class DuplicateAnythingCommand extends DuplicateEObjectsCommand
	{
		
		/**
		* @generated
		*/
		public DuplicateAnythingCommand(TransactionalEditingDomain editingDomain, DuplicateElementsRequest req) {
			super(editingDomain, req.getLabel(), req.getElementsToBeDuplicated(), req.getAllDuplicatedElementsMap());
		}
		
	}
	
}
