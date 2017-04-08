package net.feichti.codingcontest.diagram.edit.parts;

import org.eclipse.gmf.runtime.diagram.ui.editparts.DiagramEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.edit.policies.reparent.CreationEditPolicyWithCustomReparent;

import net.feichti.codingcontest.diagram.edit.policies.ContestCanonicalEditPolicy;
import net.feichti.codingcontest.diagram.edit.policies.ContestItemSemanticEditPolicy;
import net.feichti.codingcontest.diagram.part.CodingcontestVisualIDRegistry;

/**
 * @generated
 */
public class ContestEditPart extends DiagramEditPart
{
	
	/**
	* @generated
	*/
	public final static String MODEL_ID = "Codingcontest";  //$NON-NLS-1$
	
	/**
	* @generated
	*/
	public static final int VISUAL_ID = 1000;
	
	/**
	* @generated
	*/
	public ContestEditPart(View view) {
		super(view);
	}
	
	/**
	* @generated
	*/
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE, new ContestItemSemanticEditPolicy());
		installEditPolicy(EditPolicyRoles.CANONICAL_ROLE, new ContestCanonicalEditPolicy());
		installEditPolicy(EditPolicyRoles.CREATION_ROLE,
				new CreationEditPolicyWithCustomReparent(CodingcontestVisualIDRegistry.TYPED_INSTANCE));
		// removeEditPolicy(org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles.POPUPBAR_ROLE);
	}
	
}
