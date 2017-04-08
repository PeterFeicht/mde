package net.feichti.codingcontest.diagram.part;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.actions.WorkspaceModifyOperation;

/**
 * @generated
 */
public class CodingcontestCreationWizard
		extends Wizard implements INewWizard
{
	
	/**
	* @generated
	*/
	private IWorkbench workbench;
	
	/**
	* @generated
	*/
	protected IStructuredSelection selection;
	
	/**
	* @generated
	*/
	protected CodingcontestCreationWizardPage diagramModelFilePage;
	
	/**
	* @generated
	*/
	protected CodingcontestCreationWizardPage domainModelFilePage;
	
	/**
	* @generated
	*/
	protected Resource diagram;
	
	/**
	* @generated
	*/
	private boolean openNewlyCreatedDiagramEditor = true;
	
	/**
	* @generated
	*/
	public IWorkbench getWorkbench() {
		return workbench;
	}
	
	/**
	* @generated
	*/
	public IStructuredSelection getSelection() {
		return selection;
	}
	
	/**
	* @generated
	*/
	public final Resource getDiagram() {
		return diagram;
	}
	
	/**
	* @generated
	*/
	public final boolean isOpenNewlyCreatedDiagramEditor() {
		return openNewlyCreatedDiagramEditor;
	}
	
	/**
	* @generated
	*/
	public void setOpenNewlyCreatedDiagramEditor(boolean openNewlyCreatedDiagramEditor) {
		this.openNewlyCreatedDiagramEditor = openNewlyCreatedDiagramEditor;
	}
	
	/**
	* @generated
	*/
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		this.workbench = workbench;
		this.selection = selection;
		setWindowTitle(Messages.CodingcontestCreationWizardTitle);
		setDefaultPageImageDescriptor(CodingcontestDiagramEditorPlugin.getBundledImageDescriptor(
				"icons/wizban/NewCodingcontestWizard.gif")); //$NON-NLS-1$
		setNeedsProgressMonitor(true);
	}
	
	/**
	* @generated
	*/
	public void addPages() {
		diagramModelFilePage = new CodingcontestCreationWizardPage(
				"DiagramModelFile", getSelection(), "fcc_diagram"); //$NON-NLS-1$ //$NON-NLS-2$
		diagramModelFilePage.setTitle(Messages.CodingcontestCreationWizard_DiagramModelFilePageTitle);
		diagramModelFilePage.setDescription(Messages.CodingcontestCreationWizard_DiagramModelFilePageDescription);
		addPage(diagramModelFilePage);
		
		domainModelFilePage = new CodingcontestCreationWizardPage(
				"DomainModelFile", getSelection(), "fcc") { //$NON-NLS-1$ //$NON-NLS-2$
			
			public void setVisible(boolean visible) {
				if(visible) {
					String fileName = diagramModelFilePage.getFileName();
					fileName = fileName.substring(0, fileName.length() - ".fcc_diagram".length()); //$NON-NLS-1$
					setFileName(CodingcontestDiagramEditorUtil.getUniqueFileName(
							getContainerFullPath(), fileName, "fcc")); //$NON-NLS-1$
				}
				super.setVisible(visible);
			}
		};
		domainModelFilePage.setTitle(Messages.CodingcontestCreationWizard_DomainModelFilePageTitle);
		domainModelFilePage.setDescription(Messages.CodingcontestCreationWizard_DomainModelFilePageDescription);
		addPage(domainModelFilePage);
	}
	
	/**
	* @generated
	*/
	public boolean performFinish() {
		IRunnableWithProgress op =
				new WorkspaceModifyOperation(null) {
					
					protected void execute(IProgressMonitor monitor)
							throws CoreException, InterruptedException {
						diagram = CodingcontestDiagramEditorUtil.createDiagram(diagramModelFilePage.getURI(),
								domainModelFilePage.getURI(),
								monitor);
						if(isOpenNewlyCreatedDiagramEditor() && diagram != null) {
							try {
								CodingcontestDiagramEditorUtil.openDiagram(diagram);
							} catch(PartInitException e) {
								ErrorDialog.openError(getContainer().getShell(),
										Messages.CodingcontestCreationWizardOpenEditorError, null, e.getStatus());
							}
						}
					}
				};
		try {
			getContainer().run(false, true, op);
		} catch(InterruptedException e) {
			return false;
		} catch(InvocationTargetException e) {
			if(e.getTargetException() instanceof CoreException) {
				ErrorDialog.openError(getContainer().getShell(),
						Messages.CodingcontestCreationWizardCreationError, null,
						((CoreException) e.getTargetException()).getStatus());
			} else {
				CodingcontestDiagramEditorPlugin.getInstance().logError(
						"Error creating diagram", e.getTargetException()); //$NON-NLS-1$
			}
			return false;
		}
		return diagram != null;
	}
}
