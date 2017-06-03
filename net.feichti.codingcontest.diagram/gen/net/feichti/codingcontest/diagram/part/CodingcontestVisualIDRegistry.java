package net.feichti.codingcontest.diagram.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.structure.DiagramStructure;

import net.feichti.codingcontest.CodingcontestPackage;
import net.feichti.codingcontest.Contest;
import net.feichti.codingcontest.diagram.edit.parts.CoderEditPart;
import net.feichti.codingcontest.diagram.edit.parts.CoderNameEditPart;
import net.feichti.codingcontest.diagram.edit.parts.ContestEditPart;
import net.feichti.codingcontest.diagram.edit.parts.LanguageToProblemMapEditPart;
import net.feichti.codingcontest.diagram.edit.parts.LanguageToProblemMapKeyEditPart;
import net.feichti.codingcontest.diagram.edit.parts.LevelEditPart;
import net.feichti.codingcontest.diagram.edit.parts.LevelNumberEditPart;
import net.feichti.codingcontest.diagram.edit.parts.LocationEditPart;
import net.feichti.codingcontest.diagram.edit.parts.LocationNameEditPart;
import net.feichti.codingcontest.diagram.edit.parts.OrganizerEditPart;
import net.feichti.codingcontest.diagram.edit.parts.OrganizerNameEditPart;
import net.feichti.codingcontest.diagram.edit.parts.ProblemEditPart;
import net.feichti.codingcontest.diagram.edit.parts.ProblemTitleEditPart;
import net.feichti.codingcontest.diagram.edit.parts.TeamEditPart;
import net.feichti.codingcontest.diagram.edit.parts.TeamNameEditPart;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class CodingcontestVisualIDRegistry
{
	
	/**
	* @generated
	*/
	private static final String DEBUG_KEY = "net.feichti.codingcontest.diagram/debug/visualID";  //$NON-NLS-1$
	
	/**
	* @generated
	*/
	public static int getVisualID(View view) {
		if(view instanceof Diagram) {
			if(ContestEditPart.MODEL_ID.equals(view.getType())) {
				return ContestEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return net.feichti.codingcontest.diagram.part.CodingcontestVisualIDRegistry.getVisualID(view.getType());
	}
	
	/**
	* @generated
	*/
	public static String getModelID(View view) {
		View diagram = view.getDiagram();
		while(view != diagram) {
			EAnnotation annotation = view.getEAnnotation("Shortcut");  //$NON-NLS-1$
			if(annotation != null) {
				return (String) annotation.getDetails().get("modelID");  //$NON-NLS-1$
			}
			view = (View) view.eContainer();
		}
		return diagram != null ? diagram.getType() : null;
	}
	
	/**
	* @generated
	*/
	public static int getVisualID(String type) {
		try {
			return Integer.parseInt(type);
		} catch(NumberFormatException e) {
			if(Boolean.TRUE.toString().equalsIgnoreCase(Platform.getDebugOption(DEBUG_KEY))) {
				CodingcontestDiagramEditorPlugin.getInstance()
						.logError("Unable to parse view type as a visualID number: " + type);
			}
		}
		return -1;
	}
	
	/**
	* @generated
	*/
	public static String getType(int visualID) {
		return Integer.toString(visualID);
	}
	
	/**
	* @generated
	*/
	public static int getDiagramVisualID(EObject domainElement) {
		if(domainElement == null) {
			return -1;
		}
		if(CodingcontestPackage.eINSTANCE.getContest().isSuperTypeOf(domainElement.eClass()) &&
				isDiagram((Contest) domainElement)) {
			return ContestEditPart.VISUAL_ID;
		}
		return -1;
	}
	
	/**
	* @generated
	*/
	public static int getNodeVisualID(View containerView, EObject domainElement) {
		if(domainElement == null) {
			return -1;
		}
		String containerModelID =
				net.feichti.codingcontest.diagram.part.CodingcontestVisualIDRegistry.getModelID(containerView);
		if(!ContestEditPart.MODEL_ID.equals(containerModelID)) {
			return -1;
		}
		int containerVisualID;
		if(ContestEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID =
					net.feichti.codingcontest.diagram.part.CodingcontestVisualIDRegistry.getVisualID(containerView);
		} else {
			if(containerView instanceof Diagram) {
				containerVisualID = ContestEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch(containerVisualID) {
			case ContestEditPart.VISUAL_ID:
				if(CodingcontestPackage.eINSTANCE.getLevel().isSuperTypeOf(domainElement.eClass())) {
					return LevelEditPart.VISUAL_ID;
				}
				if(CodingcontestPackage.eINSTANCE.getOrganizer().isSuperTypeOf(domainElement.eClass())) {
					return OrganizerEditPart.VISUAL_ID;
				}
				if(CodingcontestPackage.eINSTANCE.getLocation().isSuperTypeOf(domainElement.eClass())) {
					return LocationEditPart.VISUAL_ID;
				}
				if(CodingcontestPackage.eINSTANCE.getTeam().isSuperTypeOf(domainElement.eClass())) {
					return TeamEditPart.VISUAL_ID;
				}
				if(CodingcontestPackage.eINSTANCE.getProblem().isSuperTypeOf(domainElement.eClass())) {
					return ProblemEditPart.VISUAL_ID;
				}
				break;
			case TeamEditPart.VISUAL_ID:
				if(CodingcontestPackage.eINSTANCE.getCoder().isSuperTypeOf(domainElement.eClass())) {
					return CoderEditPart.VISUAL_ID;
				}
				break;
		}
		return -1;
	}
	
	/**
	* @generated
	*/
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID =
				net.feichti.codingcontest.diagram.part.CodingcontestVisualIDRegistry.getModelID(containerView);
		if(!ContestEditPart.MODEL_ID.equals(containerModelID)) {
			return false;
		}
		int containerVisualID;
		if(ContestEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID =
					net.feichti.codingcontest.diagram.part.CodingcontestVisualIDRegistry.getVisualID(containerView);
		} else {
			if(containerView instanceof Diagram) {
				containerVisualID = ContestEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch(containerVisualID) {
			case ContestEditPart.VISUAL_ID:
				if(LevelEditPart.VISUAL_ID == nodeVisualID) {
					return true;
				}
				if(OrganizerEditPart.VISUAL_ID == nodeVisualID) {
					return true;
				}
				if(LocationEditPart.VISUAL_ID == nodeVisualID) {
					return true;
				}
				if(TeamEditPart.VISUAL_ID == nodeVisualID) {
					return true;
				}
				if(ProblemEditPart.VISUAL_ID == nodeVisualID) {
					return true;
				}
				break;
			case LevelEditPart.VISUAL_ID:
				if(LevelNumberEditPart.VISUAL_ID == nodeVisualID) {
					return true;
				}
				break;
			case OrganizerEditPart.VISUAL_ID:
				if(OrganizerNameEditPart.VISUAL_ID == nodeVisualID) {
					return true;
				}
				break;
			case LocationEditPart.VISUAL_ID:
				if(LocationNameEditPart.VISUAL_ID == nodeVisualID) {
					return true;
				}
				break;
			case TeamEditPart.VISUAL_ID:
				if(TeamNameEditPart.VISUAL_ID == nodeVisualID) {
					return true;
				}
				if(CoderEditPart.VISUAL_ID == nodeVisualID) {
					return true;
				}
				break;
			case ProblemEditPart.VISUAL_ID:
				if(ProblemTitleEditPart.VISUAL_ID == nodeVisualID) {
					return true;
				}
				break;
			case CoderEditPart.VISUAL_ID:
				if(CoderNameEditPart.VISUAL_ID == nodeVisualID) {
					return true;
				}
				break;
			case LanguageToProblemMapEditPart.VISUAL_ID:
				if(LanguageToProblemMapKeyEditPart.VISUAL_ID == nodeVisualID) {
					return true;
				}
				break;
		}
		return false;
	}
	
	/**
	* @generated
	*/
	public static int getLinkWithClassVisualID(EObject domainElement) {
		if(domainElement == null) {
			return -1;
		}
		if(CodingcontestPackage.eINSTANCE.getLanguageToProblemMap().isSuperTypeOf(domainElement.eClass())) {
			return LanguageToProblemMapEditPart.VISUAL_ID;
		}
		return -1;
	}
	
	/**
	* User can change implementation of this method to handle some specific
	* situations not covered by default logic.
	* 
	* @generated
	*/
	private static boolean isDiagram(Contest element) {
		return true;
	}
	
	/**
	* @generated
	*/
	public static boolean checkNodeVisualID(View containerView, EObject domainElement, int candidate) {
		if(candidate == -1) {
			//unrecognized id is always bad
			return false;
		}
		int basic = getNodeVisualID(containerView, domainElement);
		return basic == candidate;
	}
	
	/**
	* @generated
	*/
	public static boolean isCompartmentVisualID(int visualID) {
		return false;
	}
	
	/**
	* @generated
	*/
	public static boolean isSemanticLeafVisualID(int visualID) {
		switch(visualID) {
			case ContestEditPart.VISUAL_ID:
				return false;
			case LevelEditPart.VISUAL_ID:
			case OrganizerEditPart.VISUAL_ID:
			case LocationEditPart.VISUAL_ID:
			case ProblemEditPart.VISUAL_ID:
			case CoderEditPart.VISUAL_ID:
				return true;
			default:
				break;
		}
		return false;
	}
	
	/**
	* @generated
	*/
	public static final DiagramStructure TYPED_INSTANCE = new DiagramStructure() {
		/**
		* @generated
		*/
		@Override
		
		public int getVisualID(View view) {
			return net.feichti.codingcontest.diagram.part.CodingcontestVisualIDRegistry.getVisualID(view);
		}
		
		/**
		* @generated
		*/
		@Override
		
		public String getModelID(View view) {
			return net.feichti.codingcontest.diagram.part.CodingcontestVisualIDRegistry.getModelID(view);
		}
		
		/**
		* @generated
		*/
		@Override
		
		public int getNodeVisualID(View containerView, EObject domainElement) {
			return net.feichti.codingcontest.diagram.part.CodingcontestVisualIDRegistry.getNodeVisualID(containerView,
					domainElement);
		}
		
		/**
		* @generated
		*/
		@Override
		
		public boolean checkNodeVisualID(View containerView, EObject domainElement, int candidate) {
			return net.feichti.codingcontest.diagram.part.CodingcontestVisualIDRegistry.checkNodeVisualID(containerView,
					domainElement, candidate);
		}
		
		/**
		* @generated
		*/
		@Override
		
		public boolean isCompartmentVisualID(int visualID) {
			return net.feichti.codingcontest.diagram.part.CodingcontestVisualIDRegistry.isCompartmentVisualID(visualID);
		}
		
		/**
		* @generated
		*/
		@Override
		
		public boolean isSemanticLeafVisualID(int visualID) {
			return net.feichti.codingcontest.diagram.part.CodingcontestVisualIDRegistry
					.isSemanticLeafVisualID(visualID);
		}
	};
	
}
