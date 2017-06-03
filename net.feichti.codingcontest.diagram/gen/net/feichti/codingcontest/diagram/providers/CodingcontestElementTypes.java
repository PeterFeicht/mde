package net.feichti.codingcontest.diagram.providers;

import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypeImages;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypes;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;

import net.feichti.codingcontest.CodingcontestPackage;
import net.feichti.codingcontest.diagram.edit.parts.CoderEditPart;
import net.feichti.codingcontest.diagram.edit.parts.ContestEditPart;
import net.feichti.codingcontest.diagram.edit.parts.LanguageToProblemMapEditPart;
import net.feichti.codingcontest.diagram.edit.parts.LevelEditPart;
import net.feichti.codingcontest.diagram.edit.parts.LocationEditPart;
import net.feichti.codingcontest.diagram.edit.parts.OrganizerEditPart;
import net.feichti.codingcontest.diagram.edit.parts.ProblemEditPart;
import net.feichti.codingcontest.diagram.edit.parts.TeamEditPart;
import net.feichti.codingcontest.diagram.edit.parts.TeamLocationEditPart;
import net.feichti.codingcontest.diagram.part.CodingcontestDiagramEditorPlugin;

/**
 * @generated
 */
public class CodingcontestElementTypes
{
	
	/**
	* @generated
	*/
	private CodingcontestElementTypes() {
	}
	
	/**
	* @generated
	*/
	private static Map<IElementType, ENamedElement> elements;
	
	/**
	* @generated
	*/
	private static DiagramElementTypeImages elementTypeImages = new DiagramElementTypeImages(
			CodingcontestDiagramEditorPlugin.getInstance().getItemProvidersAdapterFactory());
	
	/**
	* @generated
	*/
	private static Set<IElementType> KNOWN_ELEMENT_TYPES;
	
	/**
	* @generated
	*/
	public static final IElementType Contest_1000 = getElementType("net.feichti.codingcontest.diagram.Contest_1000");  //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Level_2001 = getElementType("net.feichti.codingcontest.diagram.Level_2001");  //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Organizer_2002 =
			getElementType("net.feichti.codingcontest.diagram.Organizer_2002");  //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Location_2003 = getElementType("net.feichti.codingcontest.diagram.Location_2003");  //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Team_2006 = getElementType("net.feichti.codingcontest.diagram.Team_2006");  //$NON-NLS-1$
	
	/**
	* @generated
	*/
	public static final IElementType Problem_2005 = getElementType("net.feichti.codingcontest.diagram.Problem_2005");  //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Coder_3002 = getElementType("net.feichti.codingcontest.diagram.Coder_3002");  //$NON-NLS-1$
	
	/**
	* @generated
	*/
	public static final IElementType LanguageToProblemMap_4001 =
			getElementType("net.feichti.codingcontest.diagram.LanguageToProblemMap_4001");  //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType TeamLocation_4003 =
			getElementType("net.feichti.codingcontest.diagram.TeamLocation_4003");  //$NON-NLS-1$
	
	/**
	* @generated
	*/
	public static ImageDescriptor getImageDescriptor(ENamedElement element) {
		return elementTypeImages.getImageDescriptor(element);
	}
	
	/**
	* @generated
	*/
	public static Image getImage(ENamedElement element) {
		return elementTypeImages.getImage(element);
	}
	
	/**
	* @generated
	*/
	public static ImageDescriptor getImageDescriptor(IAdaptable hint) {
		return getImageDescriptor(getElement(hint));
	}
	
	/**
	* @generated
	*/
	public static Image getImage(IAdaptable hint) {
		return getImage(getElement(hint));
	}
	
	/**
	* Returns 'type' of the ecore object associated with the hint.
	* 
	* @generated
	*/
	public static ENamedElement getElement(IAdaptable hint) {
		Object type = hint.getAdapter(IElementType.class);
		if(elements == null) {
			elements = new IdentityHashMap<IElementType, ENamedElement>();
			
			elements.put(Contest_1000, CodingcontestPackage.eINSTANCE.getContest());
			
			elements.put(Level_2001, CodingcontestPackage.eINSTANCE.getLevel());
			
			elements.put(Organizer_2002, CodingcontestPackage.eINSTANCE.getOrganizer());
			
			elements.put(Location_2003, CodingcontestPackage.eINSTANCE.getLocation());
			
			elements.put(Team_2006, CodingcontestPackage.eINSTANCE.getTeam());
			
			elements.put(Problem_2005, CodingcontestPackage.eINSTANCE.getProblem());
			
			elements.put(Coder_3002, CodingcontestPackage.eINSTANCE.getCoder());
			
			elements.put(LanguageToProblemMap_4001, CodingcontestPackage.eINSTANCE.getLanguageToProblemMap());
			
			elements.put(TeamLocation_4003, CodingcontestPackage.eINSTANCE.getTeam_Location());
		}
		return (ENamedElement) elements.get(type);
	}
	
	/**
	* @generated
	*/
	private static IElementType getElementType(String id) {
		return ElementTypeRegistry.getInstance().getType(id);
	}
	
	/**
	* @generated
	*/
	public static boolean isKnownElementType(IElementType elementType) {
		if(KNOWN_ELEMENT_TYPES == null) {
			KNOWN_ELEMENT_TYPES = new HashSet<IElementType>();
			KNOWN_ELEMENT_TYPES.add(Contest_1000);
			KNOWN_ELEMENT_TYPES.add(Level_2001);
			KNOWN_ELEMENT_TYPES.add(Organizer_2002);
			KNOWN_ELEMENT_TYPES.add(Location_2003);
			KNOWN_ELEMENT_TYPES.add(Team_2006);
			KNOWN_ELEMENT_TYPES.add(Problem_2005);
			KNOWN_ELEMENT_TYPES.add(Coder_3002);
			KNOWN_ELEMENT_TYPES.add(LanguageToProblemMap_4001);
			KNOWN_ELEMENT_TYPES.add(TeamLocation_4003);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}
	
	/**
	* @generated
	*/
	public static IElementType getElementType(int visualID) {
		switch(visualID) {
			case ContestEditPart.VISUAL_ID:
				return Contest_1000;
			case LevelEditPart.VISUAL_ID:
				return Level_2001;
			case OrganizerEditPart.VISUAL_ID:
				return Organizer_2002;
			case LocationEditPart.VISUAL_ID:
				return Location_2003;
			case TeamEditPart.VISUAL_ID:
				return Team_2006;
			case ProblemEditPart.VISUAL_ID:
				return Problem_2005;
			case CoderEditPart.VISUAL_ID:
				return Coder_3002;
			case LanguageToProblemMapEditPart.VISUAL_ID:
				return LanguageToProblemMap_4001;
			case TeamLocationEditPart.VISUAL_ID:
				return TeamLocation_4003;
		}
		return null;
	}
	
	/**
	* @generated
	*/
	public static final DiagramElementTypes TYPED_INSTANCE = new DiagramElementTypes(elementTypeImages) {
		
		/**
		* @generated
		*/
		@Override
		
		public boolean isKnownElementType(IElementType elementType) {
			return net.feichti.codingcontest.diagram.providers.CodingcontestElementTypes
					.isKnownElementType(elementType);
		}
		
		/**
		* @generated
		*/
		@Override
		
		public IElementType getElementTypeForVisualId(int visualID) {
			return net.feichti.codingcontest.diagram.providers.CodingcontestElementTypes.getElementType(visualID);
		}
		
		/**
		* @generated
		*/
		@Override
		
		public ENamedElement getDefiningNamedElement(IAdaptable elementTypeAdapter) {
			return net.feichti.codingcontest.diagram.providers.CodingcontestElementTypes.getElement(elementTypeAdapter);
		}
	};
	
}
