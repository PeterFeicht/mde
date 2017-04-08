package net.feichti.codingcontest.diagram.providers;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gmf.runtime.notation.View;

import net.feichti.codingcontest.diagram.edit.parts.ContestEditPart;
import net.feichti.codingcontest.diagram.part.CodingcontestDiagramEditorPlugin;
import net.feichti.codingcontest.diagram.part.CodingcontestVisualIDRegistry;

/**
 * @generated
 */
public class CodingcontestValidationProvider
{
	
	/**
	* @generated
	*/
	private static boolean constraintsActive = false;
	
	/**
	* @generated
	*/
	public static boolean shouldConstraintsBePrivate() {
		return false;
	}
	
	/**
	* @generated
	*/
	public static void runWithConstraints(TransactionalEditingDomain editingDomain, Runnable operation) {
		final Runnable op = operation;
		Runnable task = new Runnable() {
			public void run() {
				try {
					constraintsActive = true;
					op.run();
				} finally {
					constraintsActive = false;
				}
			}
		};
		if(editingDomain != null) {
			try {
				editingDomain.runExclusive(task);
			} catch(Exception e) {
				CodingcontestDiagramEditorPlugin.getInstance().logError("Validation failed", e);  //$NON-NLS-1$
			}
		} else {
			task.run();
		}
	}
	
	/**
	* @generated
	*/
	static boolean isInDefaultEditorContext(Object object) {
		if(shouldConstraintsBePrivate() && !constraintsActive) {
			return false;
		}
		if(object instanceof View) {
			return constraintsActive &&
					ContestEditPart.MODEL_ID.equals(CodingcontestVisualIDRegistry.getModelID((View) object));
		}
		return true;
	}
	
}
