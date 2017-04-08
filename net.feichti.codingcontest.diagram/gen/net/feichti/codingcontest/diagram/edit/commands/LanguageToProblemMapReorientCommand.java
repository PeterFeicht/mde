package net.feichti.codingcontest.diagram.edit.commands;

import java.util.Map;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;

import net.feichti.codingcontest.CodingcontestPackage;
import net.feichti.codingcontest.Level;
import net.feichti.codingcontest.Problem;
import net.feichti.codingcontest.diagram.edit.policies.CodingcontestBaseItemSemanticEditPolicy;

/**
 * @generated
 */
public class LanguageToProblemMapReorientCommand extends EditElementCommand
{
	
	/**
	* @generated
	*/
	private final int reorientDirection;
	
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
	public LanguageToProblemMapReorientCommand(ReorientRelationshipRequest request) {
		super(request.getLabel(), request.getRelationship(), request);
		reorientDirection = request.getDirection();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}
	
	/**
	* @generated
	*/
	public boolean canExecute() {
		if(false == getElementToEdit() instanceof Map.Entry) {
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
		if(!(oldEnd instanceof Level && newEnd instanceof Level)) {
			return false;
		}
		Problem target =
				((Problem) ((EObject) getLink()).eGet(CodingcontestPackage.eINSTANCE.getLanguageToProblemMap_Value()));
		return CodingcontestBaseItemSemanticEditPolicy.getLinkConstraints().canExistLanguageToProblemMap_4001(getLink(),
				getNewSource(), target);
	}
	
	/**
	* @generated
	*/
	protected boolean canReorientTarget() {
		if(!(oldEnd instanceof Problem && newEnd instanceof Problem)) {
			return false;
		}
		if(!(((EObject) getLink()).eContainer() instanceof Level)) {
			return false;
		}
		Level source = (Level) ((EObject) getLink()).eContainer();
		return CodingcontestBaseItemSemanticEditPolicy.getLinkConstraints().canExistLanguageToProblemMap_4001(getLink(),
				source, getNewTarget());
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
		getOldSource().getProblems().remove(getLink());
		getNewSource().getProblems().add(getLink());
		return CommandResult.newOKCommandResult(getLink());
	}
	
	/**
	* @generated
	*/
	protected CommandResult reorientTarget() throws ExecutionException {
		((EObject) getLink()).eSet(CodingcontestPackage.eINSTANCE.getLanguageToProblemMap_Value(), getNewTarget());
		return CommandResult.newOKCommandResult(getLink());
	}
	
	/**
	* @generated
	*/
	protected Map.Entry getLink() {
		return (Map.Entry) getElementToEdit();
	}
	
	/**
	* @generated
	*/
	protected Level getOldSource() {
		return (Level) oldEnd;
	}
	
	/**
	* @generated
	*/
	protected Level getNewSource() {
		return (Level) newEnd;
	}
	
	/**
	* @generated
	*/
	protected Problem getOldTarget() {
		return (Problem) oldEnd;
	}
	
	/**
	* @generated
	*/
	protected Problem getNewTarget() {
		return (Problem) newEnd;
	}
}
