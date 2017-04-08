package net.feichti.codingcontest.diagram.navigator;

import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserOptions;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.viewers.ITreePathLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.ViewerLabel;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonLabelProvider;

import net.feichti.codingcontest.Contest;
import net.feichti.codingcontest.diagram.edit.parts.CoderEditPart;
import net.feichti.codingcontest.diagram.edit.parts.CoderNameEditPart;
import net.feichti.codingcontest.diagram.edit.parts.ContestEditPart;
import net.feichti.codingcontest.diagram.edit.parts.EntryEditPart;
import net.feichti.codingcontest.diagram.edit.parts.EntryLocationEditPart;
import net.feichti.codingcontest.diagram.edit.parts.EntryTeamNameEditPart;
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
import net.feichti.codingcontest.diagram.part.CodingcontestDiagramEditorPlugin;
import net.feichti.codingcontest.diagram.part.CodingcontestVisualIDRegistry;
import net.feichti.codingcontest.diagram.providers.CodingcontestElementTypes;
import net.feichti.codingcontest.diagram.providers.CodingcontestParserProvider;

/**
 * @generated
 */
public class CodingcontestNavigatorLabelProvider extends LabelProvider
		implements ICommonLabelProvider, ITreePathLabelProvider
{
	
	/**
	* @generated
	*/
	static {
		CodingcontestDiagramEditorPlugin.getInstance().getImageRegistry().put("Navigator?UnknownElement", //$NON-NLS-1$
				ImageDescriptor.getMissingImageDescriptor());  
		CodingcontestDiagramEditorPlugin.getInstance().getImageRegistry().put("Navigator?ImageNotFound", //$NON-NLS-1$
				ImageDescriptor.getMissingImageDescriptor());  
	}
	
	/**
	* @generated
	*/
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if(element instanceof CodingcontestNavigatorItem &&
				!isOwnView(((CodingcontestNavigatorItem) element).getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}
	
	/**
	* @generated
	*/
	public Image getImage(Object element) {
		if(element instanceof CodingcontestNavigatorGroup) {
			CodingcontestNavigatorGroup group = (CodingcontestNavigatorGroup) element;
			return CodingcontestDiagramEditorPlugin.getInstance().getBundledImage(group.getIcon());
		}
		
		if(element instanceof CodingcontestNavigatorItem) {
			CodingcontestNavigatorItem navigatorItem = (CodingcontestNavigatorItem) element;
			if(!isOwnView(navigatorItem.getView())) {
				return super.getImage(element);
			}
			return getImage(navigatorItem.getView());
		}
		
		return super.getImage(element);
	}
	
	/**
	* @generated
	*/
	public Image getImage(View view) {
		switch(CodingcontestVisualIDRegistry.getVisualID(view)) {
			case ContestEditPart.VISUAL_ID:
				return getImage("Navigator?Diagram?http://www.feichti.net/codingcontest?Contest", //$NON-NLS-1$
						CodingcontestElementTypes.Contest_1000); 
			case LevelEditPart.VISUAL_ID:
				return getImage("Navigator?TopLevelNode?http://www.feichti.net/codingcontest?Level", //$NON-NLS-1$
						CodingcontestElementTypes.Level_2001); 
			case OrganizerEditPart.VISUAL_ID:
				return getImage("Navigator?TopLevelNode?http://www.feichti.net/codingcontest?Organizer", //$NON-NLS-1$
						CodingcontestElementTypes.Organizer_2002); 
			case LocationEditPart.VISUAL_ID:
				return getImage("Navigator?TopLevelNode?http://www.feichti.net/codingcontest?Location", //$NON-NLS-1$
						CodingcontestElementTypes.Location_2003); 
			case EntryEditPart.VISUAL_ID:
				return getImage("Navigator?TopLevelNode?http://www.feichti.net/codingcontest?Entry", //$NON-NLS-1$
						CodingcontestElementTypes.Entry_2004); 
			case ProblemEditPart.VISUAL_ID:
				return getImage("Navigator?TopLevelNode?http://www.feichti.net/codingcontest?Problem", //$NON-NLS-1$
						CodingcontestElementTypes.Problem_2005); 
			case CoderEditPart.VISUAL_ID:
				return getImage("Navigator?Node?http://www.feichti.net/codingcontest?Coder", //$NON-NLS-1$
						CodingcontestElementTypes.Coder_3001); 
			case LanguageToProblemMapEditPart.VISUAL_ID:
				return getImage("Navigator?Link?http://www.feichti.net/codingcontest?LanguageToProblemMap", //$NON-NLS-1$
						CodingcontestElementTypes.LanguageToProblemMap_4001); 
			case EntryLocationEditPart.VISUAL_ID:
				return getImage("Navigator?Link?http://www.feichti.net/codingcontest?Entry?location", //$NON-NLS-1$
						CodingcontestElementTypes.EntryLocation_4002); 
		}
		return getImage("Navigator?UnknownElement", null);  //$NON-NLS-1$
	}
	
	/**
	* @generated
	*/
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = CodingcontestDiagramEditorPlugin.getInstance().getImageRegistry();
		Image image = imageRegistry.get(key);
		if(image == null && elementType != null && CodingcontestElementTypes.isKnownElementType(elementType)) {
			image = CodingcontestElementTypes.getImage(elementType);
			imageRegistry.put(key, image);
		}
		
		if(image == null) {
			image = imageRegistry.get("Navigator?ImageNotFound");  //$NON-NLS-1$
			imageRegistry.put(key, image);
		}
		return image;
	}
	
	/**
	* @generated
	*/
	public String getText(Object element) {
		if(element instanceof CodingcontestNavigatorGroup) {
			CodingcontestNavigatorGroup group = (CodingcontestNavigatorGroup) element;
			return group.getGroupName();
		}
		
		if(element instanceof CodingcontestNavigatorItem) {
			CodingcontestNavigatorItem navigatorItem = (CodingcontestNavigatorItem) element;
			if(!isOwnView(navigatorItem.getView())) {
				return null;
			}
			return getText(navigatorItem.getView());
		}
		
		return super.getText(element);
	}
	
	/**
	* @generated
	*/
	public String getText(View view) {
		if(view.getElement() != null && view.getElement().eIsProxy()) {
			return getUnresolvedDomainElementProxyText(view);
		}
		switch(CodingcontestVisualIDRegistry.getVisualID(view)) {
			case ContestEditPart.VISUAL_ID:
				return getContest_1000Text(view);
			case LevelEditPart.VISUAL_ID:
				return getLevel_2001Text(view);
			case OrganizerEditPart.VISUAL_ID:
				return getOrganizer_2002Text(view);
			case LocationEditPart.VISUAL_ID:
				return getLocation_2003Text(view);
			case EntryEditPart.VISUAL_ID:
				return getEntry_2004Text(view);
			case ProblemEditPart.VISUAL_ID:
				return getProblem_2005Text(view);
			case CoderEditPart.VISUAL_ID:
				return getCoder_3001Text(view);
			case LanguageToProblemMapEditPart.VISUAL_ID:
				return getLanguageToProblemMap_4001Text(view);
			case EntryLocationEditPart.VISUAL_ID:
				return getEntryLocation_4002Text(view);
		}
		return getUnknownElementText(view);
	}
	
	/**
	* @generated
	*/
	private String getContest_1000Text(View view) {
		Contest domainModelElement = (Contest) view.getElement();
		if(domainModelElement != null) {
			return domainModelElement.getId();
		} else {
			CodingcontestDiagramEditorPlugin.getInstance()
					.logError("No domain element for view with visualID = " + 1000);  //$NON-NLS-1$
			return "";  //$NON-NLS-1$
		}
	}
	
	/**
	* @generated
	*/
	private String getLevel_2001Text(View view) {
		IParser parser = CodingcontestParserProvider.getParser(CodingcontestElementTypes.Level_2001,
				view.getElement() != null ? view.getElement() : view,
				CodingcontestVisualIDRegistry.getType(LevelNumberEditPart.VISUAL_ID));
		if(parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CodingcontestDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5001); //$NON-NLS-1$
			return "";  //$NON-NLS-1$
		}
	}
	
	/**
	* @generated
	*/
	private String getOrganizer_2002Text(View view) {
		IParser parser = CodingcontestParserProvider.getParser(CodingcontestElementTypes.Organizer_2002,
				view.getElement() != null ? view.getElement() : view,
				CodingcontestVisualIDRegistry.getType(OrganizerNameEditPart.VISUAL_ID));
		if(parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CodingcontestDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5002); //$NON-NLS-1$
			return "";  //$NON-NLS-1$
		}
	}
	
	/**
	* @generated
	*/
	private String getLocation_2003Text(View view) {
		IParser parser = CodingcontestParserProvider.getParser(CodingcontestElementTypes.Location_2003,
				view.getElement() != null ? view.getElement() : view,
				CodingcontestVisualIDRegistry.getType(LocationNameEditPart.VISUAL_ID));
		if(parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CodingcontestDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5003); //$NON-NLS-1$
			return "";  //$NON-NLS-1$
		}
	}
	
	/**
	* @generated
	*/
	private String getEntry_2004Text(View view) {
		IParser parser = CodingcontestParserProvider.getParser(CodingcontestElementTypes.Entry_2004,
				view.getElement() != null ? view.getElement() : view,
				CodingcontestVisualIDRegistry.getType(EntryTeamNameEditPart.VISUAL_ID));
		if(parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CodingcontestDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5005); //$NON-NLS-1$
			return "";  //$NON-NLS-1$
		}
	}
	
	/**
	* @generated
	*/
	private String getProblem_2005Text(View view) {
		IParser parser = CodingcontestParserProvider.getParser(CodingcontestElementTypes.Problem_2005,
				view.getElement() != null ? view.getElement() : view,
				CodingcontestVisualIDRegistry.getType(ProblemTitleEditPart.VISUAL_ID));
		if(parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CodingcontestDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5006); //$NON-NLS-1$
			return "";  //$NON-NLS-1$
		}
	}
	
	/**
	* @generated
	*/
	private String getCoder_3001Text(View view) {
		IParser parser = CodingcontestParserProvider.getParser(CodingcontestElementTypes.Coder_3001,
				view.getElement() != null ? view.getElement() : view,
				CodingcontestVisualIDRegistry.getType(CoderNameEditPart.VISUAL_ID));
		if(parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CodingcontestDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5004); //$NON-NLS-1$
			return "";  //$NON-NLS-1$
		}
	}
	
	/**
	* @generated
	*/
	private String getLanguageToProblemMap_4001Text(View view) {
		IParser parser = CodingcontestParserProvider.getParser(CodingcontestElementTypes.LanguageToProblemMap_4001,
				view.getElement() != null ? view.getElement() : view,
				CodingcontestVisualIDRegistry.getType(LanguageToProblemMapKeyEditPart.VISUAL_ID));
		if(parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CodingcontestDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 6001); //$NON-NLS-1$
			return "";  //$NON-NLS-1$
		}
	}
	
	/**
	* @generated
	*/
	private String getEntryLocation_4002Text(View view) {
		return "";  //$NON-NLS-1$
	}
	
	/**
	* @generated
	*/
	private String getUnknownElementText(View view) {
		return "<UnknownElement Visual_ID = " + view.getType() + ">";  //$NON-NLS-1$  //$NON-NLS-2$
	}
	
	/**
	* @generated
	*/
	private String getUnresolvedDomainElementProxyText(View view) {
		return "<Unresolved domain element Visual_ID = " + view.getType() + ">";  //$NON-NLS-1$  //$NON-NLS-2$
	}
	
	/**
	* @generated
	*/
	public void init(ICommonContentExtensionSite aConfig) {
	}
	
	/**
	* @generated
	*/
	public void restoreState(IMemento aMemento) {
	}
	
	/**
	* @generated
	*/
	public void saveState(IMemento aMemento) {
	}
	
	/**
	* @generated
	*/
	public String getDescription(Object anElement) {
		return null;
	}
	
	/**
	* @generated
	*/
	private boolean isOwnView(View view) {
		return ContestEditPart.MODEL_ID.equals(CodingcontestVisualIDRegistry.getModelID(view));
	}
	
}
