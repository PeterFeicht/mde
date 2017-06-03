package net.feichti.codingcontest.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyReferenceCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;

import net.feichti.codingcontest.diagram.providers.CodingcontestElementTypes;

/**
 * @generated
 */
public class TeamLocationItemSemanticEditPolicy extends CodingcontestBaseItemSemanticEditPolicy
{
	
	/**
	* @generated
	*/
	public TeamLocationItemSemanticEditPolicy() {
		super(CodingcontestElementTypes.TeamLocation_4003);
	}
	
	/**
	* @generated
	*/
	protected Command getDestroyReferenceCommand(DestroyReferenceRequest req) {
		return getGEFWrapper(new DestroyReferenceCommand(req));
	}
	
}
