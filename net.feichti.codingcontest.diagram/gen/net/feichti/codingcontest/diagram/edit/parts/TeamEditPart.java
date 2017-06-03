package net.feichti.codingcontest.diagram.edit.parts;

import org.eclipse.draw2d.FlowLayout;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gef.requests.CreateRequest;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.DragDropEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.FlowLayoutEditPolicy;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.edit.policies.reparent.CreationEditPolicyWithCustomReparent;
import org.eclipse.swt.graphics.Color;

import net.feichti.codingcontest.diagram.edit.policies.TeamCanonicalEditPolicy;
import net.feichti.codingcontest.diagram.edit.policies.TeamItemSemanticEditPolicy;
import net.feichti.codingcontest.diagram.part.CodingcontestVisualIDRegistry;

/**
 * @generated
 */
public class TeamEditPart extends ShapeNodeEditPart
{
	
	/**
	* @generated
	*/
	public static final int VISUAL_ID = 2006;
	
	/**
	* @generated
	*/
	protected IFigure contentPane;
	
	/**
	* @generated
	*/
	protected IFigure primaryShape;
	
	/**
	* @generated
	*/
	public TeamEditPart(View view) {
		super(view);
	}
	
	/**
	* @generated
	*/
	protected void createDefaultEditPolicies() {
		installEditPolicy(EditPolicyRoles.CREATION_ROLE,
				new CreationEditPolicyWithCustomReparent(CodingcontestVisualIDRegistry.TYPED_INSTANCE));
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE, new TeamItemSemanticEditPolicy());
		installEditPolicy(EditPolicyRoles.DRAG_DROP_ROLE, new DragDropEditPolicy());
		installEditPolicy(EditPolicyRoles.CANONICAL_ROLE, new TeamCanonicalEditPolicy());
		installEditPolicy(EditPolicy.LAYOUT_ROLE, createLayoutEditPolicy());
		// XXX need an SCR to runtime to have another abstract superclass that would let children add reasonable editpolicies
		// removeEditPolicy(org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles.CONNECTION_HANDLES_ROLE);
	}
	
	/**
	* @generated
	*/
	protected LayoutEditPolicy createLayoutEditPolicy() {
		
		FlowLayoutEditPolicy lep = new FlowLayoutEditPolicy() {
			
			protected Command createAddCommand(EditPart child, EditPart after) {
				return null;
			}
			
			protected Command createMoveChildCommand(EditPart child, EditPart after) {
				return null;
			}
			
			protected Command getCreateCommand(CreateRequest request) {
				return null;
			}
		};
		return lep;
	}
	
	/**
	* @generated
	*/
	protected IFigure createNodeShape() {
		return primaryShape = new TeamFigure();
	}
	
	/**
	* @generated
	*/
	public TeamFigure getPrimaryShape() {
		return (TeamFigure) primaryShape;
	}
	
	/**
	* @generated
	*/
	protected boolean addFixedChild(EditPart childEditPart) {
		if(childEditPart instanceof TeamNameEditPart) {
			((TeamNameEditPart) childEditPart).setLabel(getPrimaryShape().getFigureTeamNameFigure());
			return true;
		}
		return false;
	}
	
	/**
	* @generated
	*/
	protected boolean removeFixedChild(EditPart childEditPart) {
		if(childEditPart instanceof TeamNameEditPart) {
			return true;
		}
		return false;
	}
	
	/**
	* @generated
	*/
	protected void addChildVisual(EditPart childEditPart, int index) {
		if(addFixedChild(childEditPart)) {
			return;
		}
		super.addChildVisual(childEditPart, -1);
	}
	
	/**
	* @generated
	*/
	protected void removeChildVisual(EditPart childEditPart) {
		if(removeFixedChild(childEditPart)) {
			return;
		}
		super.removeChildVisual(childEditPart);
	}
	
	/**
	* @generated
	*/
	protected IFigure getContentPaneFor(IGraphicalEditPart editPart) {
		return getContentPane();
	}
	
	/**
	* @generated
	*/
	protected NodeFigure createNodePlate() {
		DefaultSizeNodeFigure result = new DefaultSizeNodeFigure(40, 40);
		return result;
	}
	
	/**
	* Creates figure for this edit part.
	* 
	* Body of this method does not depend on settings in generation model
	* so you may safely remove <i>generated</i> tag and modify it.
	* 
	* @generated
	*/
	protected NodeFigure createNodeFigure() {
		NodeFigure figure = createNodePlate();
		figure.setLayoutManager(new StackLayout());
		IFigure shape = createNodeShape();
		figure.add(shape);
		contentPane = setupContentPane(shape);
		return figure;
	}
	
	/**
	* Default implementation treats passed figure as content pane.
	* Respects layout one may have set for generated figure.
	* @param nodeShape instance of generated figure class
	* @generated
	*/
	protected IFigure setupContentPane(IFigure nodeShape) {
		if(nodeShape.getLayoutManager() == null) {
			ConstrainedToolbarLayout layout = new ConstrainedToolbarLayout();
			layout.setSpacing(5);
			nodeShape.setLayoutManager(layout);
		}
		return nodeShape; // use nodeShape itself as contentPane
	}
	
	/**
	* @generated
	*/
	public IFigure getContentPane() {
		if(contentPane != null) {
			return contentPane;
		}
		return super.getContentPane();
	}
	
	/**
	* @generated
	*/
	protected void setForegroundColor(Color color) {
		if(primaryShape != null) {
			primaryShape.setForegroundColor(color);
		}
	}
	
	/**
	* @generated
	*/
	protected void setBackgroundColor(Color color) {
		if(primaryShape != null) {
			primaryShape.setBackgroundColor(color);
		}
	}
	
	/**
	* @generated
	*/
	protected void setLineWidth(int width) {
		if(primaryShape instanceof Shape) {
			((Shape) primaryShape).setLineWidth(width);
		}
	}
	
	/**
	* @generated
	*/
	protected void setLineType(int style) {
		if(primaryShape instanceof Shape) {
			((Shape) primaryShape).setLineStyle(style);
		}
	}
	
	/**
	* @generated
	*/
	public EditPart getPrimaryChildEditPart() {
		return getChildBySemanticHint(CodingcontestVisualIDRegistry.getType(TeamNameEditPart.VISUAL_ID));
	}
	
	/**
	 * @generated
	 */
	public class TeamFigure extends RectangleFigure
	{
		
		/**
		 * @generated
		 */
		private WrappingLabel fFigureTeamNameFigure;
		
		/**
		 * @generated
		 */
		public TeamFigure() {
			
			FlowLayout layoutThis = new FlowLayout();
			layoutThis.setStretchMinorAxis(false);
			layoutThis.setMinorAlignment(FlowLayout.ALIGN_LEFTTOP);
			
			layoutThis.setMajorAlignment(FlowLayout.ALIGN_LEFTTOP);
			layoutThis.setMajorSpacing(5);
			layoutThis.setMinorSpacing(5);
			layoutThis.setHorizontal(true);
			
			this.setLayoutManager(layoutThis);
			
			createContents();
		}
		
		/**
		 * @generated
		 */
		private void createContents() {
			
			fFigureTeamNameFigure = new WrappingLabel();
			
			fFigureTeamNameFigure.setText("<...>");
			
			this.add(fFigureTeamNameFigure);
			
		}
		
		/**
		 * @generated
		 */
		public WrappingLabel getFigureTeamNameFigure() {
			return fFigureTeamNameFigure;
		}
		
	}
	
}
