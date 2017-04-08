package net.feichti.codingcontest.diagram.edit.commands;

import java.util.Map;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ConfigureRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;

import net.feichti.codingcontest.CodingcontestFactory;
import net.feichti.codingcontest.CodingcontestPackage;
import net.feichti.codingcontest.Level;
import net.feichti.codingcontest.Problem;
import net.feichti.codingcontest.diagram.edit.policies.CodingcontestBaseItemSemanticEditPolicy;

/**
 * @generated
 */
public class LanguageToProblemMapCreateCommand extends EditElementCommand
{
	
	/**
	* @generated
	*/
	private final EObject source;
	
	/**
	* @generated
	*/
	private final EObject target;
	
	/**
	* @generated
	*/
	public LanguageToProblemMapCreateCommand(CreateRelationshipRequest request, EObject source, EObject target) {
		super(request.getLabel(), null, request);
		this.source = source;
		this.target = target;
	}
	
	/**
	* @generated
	*/
	public boolean canExecute() {
		if(source == null && target == null) {
			return false;
		}
		if(source != null && false == source instanceof Level) {
			return false;
		}
		if(target != null && false == target instanceof Problem) {
			return false;
		}
		if(getSource() == null) {
			return true; // link creation is in progress; source is not defined yet
		}
		// target may be null here but it's possible to check constraint
		return CodingcontestBaseItemSemanticEditPolicy.getLinkConstraints()
				.canCreateLanguageToProblemMap_4001(getSource(), getTarget());
	}
	
	/**
	* @generated
	*/
	protected CommandResult doExecuteWithResult(IProgressMonitor monitor, IAdaptable info) throws ExecutionException {
		if(!canExecute()) {
			throw new ExecutionException("Invalid arguments in create link command"); //$NON-NLS-1$
		}
		
		Map.Entry newElement = (Map.Entry) CodingcontestFactory.eINSTANCE
				.create(CodingcontestPackage.eINSTANCE.getLanguageToProblemMap());
		getSource().getProblems().add(newElement);
		((EObject) newElement).eSet(CodingcontestPackage.eINSTANCE.getLanguageToProblemMap_Value(), getTarget());
		doConfigure(newElement, monitor, info);
		((CreateElementRequest) getRequest()).setNewElement((EObject) newElement);
		return CommandResult.newOKCommandResult(newElement);
		
	}
	
	/**
	* @generated
	*/
	protected void doConfigure(Map.Entry newElement, IProgressMonitor monitor, IAdaptable info)
			throws ExecutionException {
		IElementType elementType = ((CreateElementRequest) getRequest()).getElementType();
		ConfigureRequest configureRequest = new ConfigureRequest(getEditingDomain(), (EObject) newElement, elementType);
		configureRequest.setClientContext(((CreateElementRequest) getRequest()).getClientContext());
		configureRequest.addParameters(getRequest().getParameters());
		configureRequest.setParameter(CreateRelationshipRequest.SOURCE, getSource());
		configureRequest.setParameter(CreateRelationshipRequest.TARGET, getTarget());
		ICommand configureCommand = elementType.getEditCommand(configureRequest);
		if(configureCommand != null && configureCommand.canExecute()) {
			configureCommand.execute(monitor, info);
		}
	}
	
	/**
	* @generated
	*/
	protected void setElementToEdit(EObject element) {
		throw new UnsupportedOperationException();
	}
	
	/**
	* @generated
	*/
	protected Level getSource() {
		return (Level) source;
	}
	
	/**
	* @generated
	*/
	protected Problem getTarget() {
		return (Problem) target;
	}
	
}
