package net.feichti.codingcontest.diagram.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientReferenceRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;

import net.feichti.codingcontest.Entry;
import net.feichti.codingcontest.Location;
import net.feichti.codingcontest.diagram.edit.policies.CodingcontestBaseItemSemanticEditPolicy;

/**
 * @generated
 */
public class EntryLocationReorientCommand extends EditElementCommand
{
	
	/**
	* @generated
	*/
	private final int reorientDirection;
	
	/**
	* @generated
	*/
	private final EObject referenceOwner;
	
	/**
	* @generated
	*/
	private final EObject oldEnd;
	
	/**
	* @generated
	*/
	private final EObject newEnd;
	
	/**
	* @generated
	*/
	public EntryLocationReorientCommand(ReorientReferenceRelationshipRequest request) {
		super(request.getLabel(), null, request);
		reorientDirection = request.getDirection();
		referenceOwner = request.getReferenceOwner();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}
	
	/**
	* @generated
	*/
	public boolean canExecute() {
		if(false == referenceOwner instanceof Entry) {
			return false;
		}
		if(reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return canReorientSource();
		}
		if(reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return canReorientTarget();
		}
		return false;
	}
	
	/**
	* @generated
	*/
	protected boolean canReorientSource() {
		if(!(oldEnd instanceof Location && newEnd instanceof Entry)) {
			return false;
		}
		return CodingcontestBaseItemSemanticEditPolicy.getLinkConstraints().canExistEntryLocation_4002(getNewSource(),
				getOldTarget());
	}
	
	/**
	* @generated
	*/
	protected boolean canReorientTarget() {
		if(!(oldEnd instanceof Location && newEnd instanceof Location)) {
			return false;
		}
		return CodingcontestBaseItemSemanticEditPolicy.getLinkConstraints().canExistEntryLocation_4002(getOldSource(),
				getNewTarget());
	}
	
	/**
	* @generated
	*/
	protected CommandResult doExecuteWithResult(
			IProgressMonitor monitor, IAdaptable info)
			throws ExecutionException {
		if(!canExecute()) {
			throw new ExecutionException("Invalid arguments in reorient link command");  //$NON-NLS-1$
		}
		if(reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return reorientSource();
		}
		if(reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return reorientTarget();
		}
		throw new IllegalStateException();
	}
	
	/**
	* @generated
	*/
	protected CommandResult reorientSource() throws ExecutionException {
		getOldSource().setLocation(null);
		getNewSource().setLocation(getOldTarget());
		return CommandResult.newOKCommandResult(referenceOwner);
	}
	
	/**
	* @generated
	*/
	protected CommandResult reorientTarget() throws ExecutionException {
		getOldSource().setLocation(getNewTarget());
		return CommandResult.newOKCommandResult(referenceOwner);
	}
	
	/**
	* @generated
	*/
	protected Entry getOldSource() {
		return (Entry) referenceOwner;
	}
	
	/**
	* @generated
	*/
	protected Entry getNewSource() {
		return (Entry) newEnd;
	}
	
	/**
	* @generated
	*/
	protected Location getOldTarget() {
		return (Location) oldEnd;
	}
	
	/**
	* @generated
	*/
	protected Location getNewTarget() {
		return (Location) newEnd;
	}
}
