package net.feichti.codingcontest.diagram.part;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.update.DiagramUpdater;

import net.feichti.codingcontest.Coder;
import net.feichti.codingcontest.CodingcontestPackage;
import net.feichti.codingcontest.Contest;
import net.feichti.codingcontest.Level;
import net.feichti.codingcontest.Location;
import net.feichti.codingcontest.Organizer;
import net.feichti.codingcontest.Problem;
import net.feichti.codingcontest.Team;
import net.feichti.codingcontest.diagram.edit.parts.CoderEditPart;
import net.feichti.codingcontest.diagram.edit.parts.ContestEditPart;
import net.feichti.codingcontest.diagram.edit.parts.LanguageToProblemMapEditPart;
import net.feichti.codingcontest.diagram.edit.parts.LevelEditPart;
import net.feichti.codingcontest.diagram.edit.parts.LocationEditPart;
import net.feichti.codingcontest.diagram.edit.parts.OrganizerEditPart;
import net.feichti.codingcontest.diagram.edit.parts.ProblemEditPart;
import net.feichti.codingcontest.diagram.edit.parts.TeamEditPart;
import net.feichti.codingcontest.diagram.edit.parts.TeamLocationEditPart;
import net.feichti.codingcontest.diagram.providers.CodingcontestElementTypes;

/**
 * @generated
 */
public class CodingcontestDiagramUpdater
{
	
	/**
	* @generated
	*/
	public static List<CodingcontestNodeDescriptor> getSemanticChildren(View view) {
		switch(CodingcontestVisualIDRegistry.getVisualID(view)) {
			case ContestEditPart.VISUAL_ID:
				return getContest_1000SemanticChildren(view);
			case TeamEditPart.VISUAL_ID:
				return getTeam_2006SemanticChildren(view);
		}
		return Collections.emptyList();
	}
	
	/**
	* @generated
	*/
	public static List<CodingcontestNodeDescriptor> getContest_1000SemanticChildren(View view) {
		if(!view.isSetElement()) {
			return Collections.emptyList();
		}
		Contest modelElement = (Contest) view.getElement();
		LinkedList<CodingcontestNodeDescriptor> result = new LinkedList<CodingcontestNodeDescriptor>();
		for(Iterator<?> it = modelElement.getLevels().iterator(); it.hasNext();) {
			Level childElement = (Level) it.next();
			int visualID = CodingcontestVisualIDRegistry.getNodeVisualID(view, childElement);
			if(visualID == LevelEditPart.VISUAL_ID) {
				result.add(new CodingcontestNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		{
			Organizer childElement = modelElement.getOrganizer();
			int visualID = CodingcontestVisualIDRegistry.getNodeVisualID(view, childElement);
			if(visualID == OrganizerEditPart.VISUAL_ID) {
				result.add(new CodingcontestNodeDescriptor(childElement, visualID));
			}
		}
		for(Iterator<?> it = modelElement.getLocations().iterator(); it.hasNext();) {
			Location childElement = (Location) it.next();
			int visualID = CodingcontestVisualIDRegistry.getNodeVisualID(view, childElement);
			if(visualID == LocationEditPart.VISUAL_ID) {
				result.add(new CodingcontestNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for(Iterator<?> it = modelElement.getEntries().iterator(); it.hasNext();) {
			Team childElement = (Team) it.next();
			int visualID = CodingcontestVisualIDRegistry.getNodeVisualID(view, childElement);
			if(visualID == TeamEditPart.VISUAL_ID) {
				result.add(new CodingcontestNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for(Iterator<?> it = modelElement.getProblems().iterator(); it.hasNext();) {
			Problem childElement = (Problem) it.next();
			int visualID = CodingcontestVisualIDRegistry.getNodeVisualID(view, childElement);
			if(visualID == ProblemEditPart.VISUAL_ID) {
				result.add(new CodingcontestNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}
	
	/**
	* @generated
	*/
	public static List<CodingcontestNodeDescriptor> getTeam_2006SemanticChildren(View view) {
		if(!view.isSetElement()) {
			return Collections.emptyList();
		}
		Team modelElement = (Team) view.getElement();
		LinkedList<CodingcontestNodeDescriptor> result = new LinkedList<CodingcontestNodeDescriptor>();
		for(Iterator<?> it = modelElement.getCoders().iterator(); it.hasNext();) {
			Coder childElement = (Coder) it.next();
			int visualID = CodingcontestVisualIDRegistry.getNodeVisualID(view, childElement);
			if(visualID == CoderEditPart.VISUAL_ID) {
				result.add(new CodingcontestNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}
	
	/**
	* @generated
	*/
	public static List<CodingcontestLinkDescriptor> getContainedLinks(View view) {
		switch(CodingcontestVisualIDRegistry.getVisualID(view)) {
			case ContestEditPart.VISUAL_ID:
				return getContest_1000ContainedLinks(view);
			case LevelEditPart.VISUAL_ID:
				return getLevel_2001ContainedLinks(view);
			case OrganizerEditPart.VISUAL_ID:
				return getOrganizer_2002ContainedLinks(view);
			case LocationEditPart.VISUAL_ID:
				return getLocation_2003ContainedLinks(view);
			case TeamEditPart.VISUAL_ID:
				return getTeam_2006ContainedLinks(view);
			case ProblemEditPart.VISUAL_ID:
				return getProblem_2005ContainedLinks(view);
			case CoderEditPart.VISUAL_ID:
				return getCoder_3002ContainedLinks(view);
			case LanguageToProblemMapEditPart.VISUAL_ID:
				return getLanguageToProblemMap_4001ContainedLinks(view);
		}
		return Collections.emptyList();
	}
	
	/**
	* @generated
	*/
	public static List<CodingcontestLinkDescriptor> getIncomingLinks(View view) {
		switch(CodingcontestVisualIDRegistry.getVisualID(view)) {
			case LevelEditPart.VISUAL_ID:
				return getLevel_2001IncomingLinks(view);
			case OrganizerEditPart.VISUAL_ID:
				return getOrganizer_2002IncomingLinks(view);
			case LocationEditPart.VISUAL_ID:
				return getLocation_2003IncomingLinks(view);
			case TeamEditPart.VISUAL_ID:
				return getTeam_2006IncomingLinks(view);
			case ProblemEditPart.VISUAL_ID:
				return getProblem_2005IncomingLinks(view);
			case CoderEditPart.VISUAL_ID:
				return getCoder_3002IncomingLinks(view);
			case LanguageToProblemMapEditPart.VISUAL_ID:
				return getLanguageToProblemMap_4001IncomingLinks(view);
		}
		return Collections.emptyList();
	}
	
	/**
	* @generated
	*/
	public static List<CodingcontestLinkDescriptor> getOutgoingLinks(View view) {
		switch(CodingcontestVisualIDRegistry.getVisualID(view)) {
			case LevelEditPart.VISUAL_ID:
				return getLevel_2001OutgoingLinks(view);
			case OrganizerEditPart.VISUAL_ID:
				return getOrganizer_2002OutgoingLinks(view);
			case LocationEditPart.VISUAL_ID:
				return getLocation_2003OutgoingLinks(view);
			case TeamEditPart.VISUAL_ID:
				return getTeam_2006OutgoingLinks(view);
			case ProblemEditPart.VISUAL_ID:
				return getProblem_2005OutgoingLinks(view);
			case CoderEditPart.VISUAL_ID:
				return getCoder_3002OutgoingLinks(view);
			case LanguageToProblemMapEditPart.VISUAL_ID:
				return getLanguageToProblemMap_4001OutgoingLinks(view);
		}
		return Collections.emptyList();
	}
	
	/**
	 * @generated
	 */
	public static List<CodingcontestLinkDescriptor> getContest_1000ContainedLinks(View view) {
		return Collections.emptyList();
	}
	
	/**
	 * @generated
	 */
	public static List<CodingcontestLinkDescriptor> getLevel_2001ContainedLinks(View view) {
		Level modelElement = (Level) view.getElement();
		LinkedList<CodingcontestLinkDescriptor> result = new LinkedList<CodingcontestLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_LanguageToProblemMap_4001(modelElement));
		return result;
	}
	
	/**
	 * @generated
	 */
	public static List<CodingcontestLinkDescriptor> getOrganizer_2002ContainedLinks(View view) {
		return Collections.emptyList();
	}
	
	/**
	 * @generated
	 */
	public static List<CodingcontestLinkDescriptor> getLocation_2003ContainedLinks(View view) {
		return Collections.emptyList();
	}
	
	/**
	* @generated
	*/
	public static List<CodingcontestLinkDescriptor> getTeam_2006ContainedLinks(View view) {
		Team modelElement = (Team) view.getElement();
		LinkedList<CodingcontestLinkDescriptor> result = new LinkedList<CodingcontestLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Team_Location_4003(modelElement));
		return result;
	}
	
	/**
	 * @generated
	 */
	public static List<CodingcontestLinkDescriptor> getProblem_2005ContainedLinks(View view) {
		return Collections.emptyList();
	}
	
	/**
	* @generated
	*/
	public static List<CodingcontestLinkDescriptor> getCoder_3002ContainedLinks(View view) {
		return Collections.emptyList();
	}
	
	/**
	 * @generated
	 */
	public static List<CodingcontestLinkDescriptor> getLanguageToProblemMap_4001ContainedLinks(View view) {
		return Collections.emptyList();
	}
	
	/**
	 * @generated
	 */
	public static List<CodingcontestLinkDescriptor> getLevel_2001IncomingLinks(View view) {
		return Collections.emptyList();
	}
	
	/**
	 * @generated
	 */
	public static List<CodingcontestLinkDescriptor> getOrganizer_2002IncomingLinks(View view) {
		return Collections.emptyList();
	}
	
	/**
	 * @generated
	 */
	public static List<CodingcontestLinkDescriptor> getLocation_2003IncomingLinks(View view) {
		Location modelElement = (Location) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences =
				EcoreUtil.CrossReferencer.find(view.eResource().getResourceSet().getResources());
		LinkedList<CodingcontestLinkDescriptor> result = new LinkedList<CodingcontestLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Team_Location_4003(modelElement, crossReferences));
		return result;
	}
	
	/**
	* @generated
	*/
	public static List<CodingcontestLinkDescriptor> getTeam_2006IncomingLinks(View view) {
		return Collections.emptyList();
	}
	
	/**
	 * @generated
	 */
	public static List<CodingcontestLinkDescriptor> getProblem_2005IncomingLinks(View view) {
		Problem modelElement = (Problem) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences =
				EcoreUtil.CrossReferencer.find(view.eResource().getResourceSet().getResources());
		LinkedList<CodingcontestLinkDescriptor> result = new LinkedList<CodingcontestLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_LanguageToProblemMap_4001(modelElement, crossReferences));
		return result;
	}
	
	/**
	* @generated
	*/
	public static List<CodingcontestLinkDescriptor> getCoder_3002IncomingLinks(View view) {
		return Collections.emptyList();
	}
	
	/**
	 * @generated
	 */
	public static List<CodingcontestLinkDescriptor> getLanguageToProblemMap_4001IncomingLinks(View view) {
		return Collections.emptyList();
	}
	
	/**
	 * @generated
	 */
	public static List<CodingcontestLinkDescriptor> getLevel_2001OutgoingLinks(View view) {
		Level modelElement = (Level) view.getElement();
		LinkedList<CodingcontestLinkDescriptor> result = new LinkedList<CodingcontestLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_LanguageToProblemMap_4001(modelElement));
		return result;
	}
	
	/**
	 * @generated
	 */
	public static List<CodingcontestLinkDescriptor> getOrganizer_2002OutgoingLinks(View view) {
		return Collections.emptyList();
	}
	
	/**
	 * @generated
	 */
	public static List<CodingcontestLinkDescriptor> getLocation_2003OutgoingLinks(View view) {
		return Collections.emptyList();
	}
	
	/**
	* @generated
	*/
	public static List<CodingcontestLinkDescriptor> getTeam_2006OutgoingLinks(View view) {
		Team modelElement = (Team) view.getElement();
		LinkedList<CodingcontestLinkDescriptor> result = new LinkedList<CodingcontestLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Team_Location_4003(modelElement));
		return result;
	}
	
	/**
	 * @generated
	 */
	public static List<CodingcontestLinkDescriptor> getProblem_2005OutgoingLinks(View view) {
		return Collections.emptyList();
	}
	
	/**
	* @generated
	*/
	public static List<CodingcontestLinkDescriptor> getCoder_3002OutgoingLinks(View view) {
		return Collections.emptyList();
	}
	
	/**
	 * @generated
	 */
	public static List<CodingcontestLinkDescriptor> getLanguageToProblemMap_4001OutgoingLinks(View view) {
		return Collections.emptyList();
	}
	
	/**
	* @generated
	*/
	private static Collection<CodingcontestLinkDescriptor> getContainedTypeModelFacetLinks_LanguageToProblemMap_4001(
			Level container) {
		LinkedList<CodingcontestLinkDescriptor> result = new LinkedList<CodingcontestLinkDescriptor>();
		for(Iterator<?> links = container.getProblems().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if(false == linkObject instanceof Map.Entry) {
				continue;
			}
			Map.Entry link = (Map.Entry) linkObject;
			if(LanguageToProblemMapEditPart.VISUAL_ID != CodingcontestVisualIDRegistry
					.getLinkWithClassVisualID((EObject) link)) {
				continue;
			}
			Problem dst =
					((Problem) ((EObject) link).eGet(CodingcontestPackage.eINSTANCE.getLanguageToProblemMap_Value()));
			result.add(new CodingcontestLinkDescriptor(container, dst, (EObject) link,
					CodingcontestElementTypes.LanguageToProblemMap_4001, LanguageToProblemMapEditPart.VISUAL_ID));
		}
		return result;
	}
	
	/**
	 * @generated
	 */
	private static Collection<CodingcontestLinkDescriptor> getIncomingTypeModelFacetLinks_LanguageToProblemMap_4001(
			Problem target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<CodingcontestLinkDescriptor> result = new LinkedList<CodingcontestLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for(EStructuralFeature.Setting setting : settings) {
			if(setting.getEStructuralFeature() != CodingcontestPackage.eINSTANCE.getLanguageToProblemMap_Value() ||
					false == setting.getEObject() instanceof Map.Entry) {
				continue;
			}
			Map.Entry link = (Map.Entry) setting.getEObject();
			if(LanguageToProblemMapEditPart.VISUAL_ID != CodingcontestVisualIDRegistry
					.getLinkWithClassVisualID((EObject) link)) {
				continue;
			}
			if(false == ((EObject) link).eContainer() instanceof Level) {
				continue;
			}
			Level container = (Level) ((EObject) link).eContainer();
			result.add(new CodingcontestLinkDescriptor(container, target, (EObject) link,
					CodingcontestElementTypes.LanguageToProblemMap_4001, LanguageToProblemMapEditPart.VISUAL_ID));
			
		}
		return result;
	}
	
	/**
	* @generated
	*/
	private static Collection<CodingcontestLinkDescriptor> getIncomingFeatureModelFacetLinks_Team_Location_4003(
			Location target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<CodingcontestLinkDescriptor> result = new LinkedList<CodingcontestLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for(EStructuralFeature.Setting setting : settings) {
			if(setting.getEStructuralFeature() == CodingcontestPackage.eINSTANCE.getTeam_Location()) {
				result.add(new CodingcontestLinkDescriptor(setting.getEObject(), target,
						CodingcontestElementTypes.TeamLocation_4003, TeamLocationEditPart.VISUAL_ID));
			}
		}
		return result;
	}
	
	/**
	* @generated
	*/
	private static Collection<CodingcontestLinkDescriptor> getOutgoingFeatureModelFacetLinks_Team_Location_4003(
			Team source) {
		LinkedList<CodingcontestLinkDescriptor> result = new LinkedList<CodingcontestLinkDescriptor>();
		Location destination = source.getLocation();
		if(destination == null) {
			return result;
		}
		result.add(new CodingcontestLinkDescriptor(source, destination, CodingcontestElementTypes.TeamLocation_4003,
				TeamLocationEditPart.VISUAL_ID));
		return result;
	}
	
	/**
	* @generated
	*/
	public static final DiagramUpdater TYPED_INSTANCE = new DiagramUpdater() {
		/**
		* @generated
		*/
		@Override
		
		public List<CodingcontestNodeDescriptor> getSemanticChildren(View view) {
			return CodingcontestDiagramUpdater.getSemanticChildren(view);
		}
		
		/**
		* @generated
		*/
		@Override
		
		public List<CodingcontestLinkDescriptor> getContainedLinks(View view) {
			return CodingcontestDiagramUpdater.getContainedLinks(view);
		}
		
		/**
		* @generated
		*/
		@Override
		
		public List<CodingcontestLinkDescriptor> getIncomingLinks(View view) {
			return CodingcontestDiagramUpdater.getIncomingLinks(view);
		}
		
		/**
		* @generated
		*/
		@Override
		
		public List<CodingcontestLinkDescriptor> getOutgoingLinks(View view) {
			return CodingcontestDiagramUpdater.getOutgoingLinks(view);
		}
	};
	
}
