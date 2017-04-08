package net.feichti.codingcontest.diagram.edit.policies;

import java.util.Iterator;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.common.core.command.ICompositeCommand;
import org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand;
import org.eclipse.gmf.runtime.emf.commands.core.command.CompositeTransactionalCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyReferenceCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientReferenceRelationshipRequest;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;

import net.feichti.codingcontest.diagram.edit.commands.CoderCreateCommand;
import net.feichti.codingcontest.diagram.edit.commands.EntryLocationCreateCommand;
import net.feichti.codingcontest.diagram.edit.commands.EntryLocationReorientCommand;
import net.feichti.codingcontest.diagram.edit.parts.CoderEditPart;
import net.feichti.codingcontest.diagram.edit.parts.EntryLocationEditPart;
import net.feichti.codingcontest.diagram.part.CodingcontestVisualIDRegistry;
import net.feichti.codingcontest.diagram.providers.CodingcontestElementTypes;

/**
 * @generated
 */
public class EntryItemSemanticEditPolicy extends CodingcontestBaseItemSemanticEditPolicy
{
	
	/**
	* @generated
	*/
	public EntryItemSemanticEditPolicy() {
		super(CodingcontestElementTypes.Entry_2004);
	}
	
	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if(CodingcontestElementTypes.Coder_3001 == req.getElementType()) {
			return getGEFWrapper(new CoderCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}
	
	/**
	* @generated
	*/
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		View view = (View) getHost().getModel();
		CompositeTransactionalCommand cmd = new CompositeTransactionalCommand(getEditingDomain(), null);
		cmd.setTransactionNestingEnabled(false);
		for(Iterator<?> it = view.getSourceEdges().iterator(); it.hasNext();) {
			Edge outgoingLink = (Edge) it.next();
			if(CodingcontestVisualIDRegistry.getVisualID(outgoingLink) == EntryLocationEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(outgoingLink.getSource().getElement(), null,
						outgoingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
		}
		EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
		if(annotation == null) {
			// there are indirectly referenced children, need extra commands: false
			addDestroyChildNodesCommand(cmd);
			addDestroyShortcutsCommand(cmd, view);
			// delete host element
			cmd.add(new DestroyElementCommand(req));
		} else {
			cmd.add(new DeleteCommand(getEditingDomain(), view));
		}
		return getGEFWrapper(cmd.reduce());
	}
	
	/**
	* @generated
	*/
	private void addDestroyChildNodesCommand(ICompositeCommand cmd) {
		View view = (View) getHost().getModel();
		for(Iterator<?> nit = view.getChildren().iterator(); nit.hasNext();) {
			Node node = (Node) nit.next();
			switch(CodingcontestVisualIDRegistry.getVisualID(node)) {
				case CoderEditPart.VISUAL_ID:
					cmd.add(new DestroyElementCommand(
							new DestroyElementRequest(getEditingDomain(), node.getElement(), false))); // directlyOwned: true
					// don't need explicit deletion of node as parent's view deletion would clean child views as well 
					// cmd.add(new org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand(getEditingDomain(), node));
					break;
			}
		}
	}
	
	/**
	 * @generated
	 */
	protected Command getCreateRelationshipCommand(
			CreateRelationshipRequest req) {
		Command command = req.getTarget() == null ? getStartCreateRelationshipCommand(
				req) : getCompleteCreateRelationshipCommand(req);
		return command != null ? command : super.getCreateRelationshipCommand(req);
	}
	
	/**
	 * @generated
	 */
	protected Command getStartCreateRelationshipCommand(
			CreateRelationshipRequest req) {
		if(CodingcontestElementTypes.EntryLocation_4002 == req.getElementType()) {
			return getGEFWrapper(new EntryLocationCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		return null;
	}
	
	/**
	 * @generated
	 */
	protected Command getCompleteCreateRelationshipCommand(
			CreateRelationshipRequest req) {
		if(CodingcontestElementTypes.EntryLocation_4002 == req.getElementType()) {
			return null;
		}
		return null;
	}
	
	/**
	 * Returns command to reorient EReference based link. New link target or source
	 * should be the domain model element associated with this node.
	 * 
	 * @generated
	 */
	protected Command getReorientReferenceRelationshipCommand(
			ReorientReferenceRelationshipRequest req) {
		switch(getVisualID(req)) {
			case EntryLocationEditPart.VISUAL_ID:
				return getGEFWrapper(new EntryLocationReorientCommand(req));
		}
		return super.getReorientReferenceRelationshipCommand(req);
	}
	
}
