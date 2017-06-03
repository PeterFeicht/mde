package net.feichti.codingcontest.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import net.feichti.codingcontest.diagram.edit.parts.LocationEditPart;
import net.feichti.codingcontest.diagram.edit.parts.TeamEditPart;
import net.feichti.codingcontest.diagram.providers.CodingcontestElementTypes;
import net.feichti.codingcontest.diagram.providers.CodingcontestModelingAssistantProvider;

/**
 * @generated
 */
public class CodingcontestModelingAssistantProviderOfTeamEditPart extends CodingcontestModelingAssistantProvider
{
	
	/**
	* @generated
	*/
	@Override
	
	public List<IElementType> getTypesForPopupBar(IAdaptable host) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(CodingcontestElementTypes.Coder_3002);
		return types;
	}
	
	/**
	* @generated
	*/
	@Override
	
	public List<IElementType> getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart =
				(IGraphicalEditPart) source.getAdapter(
						IGraphicalEditPart.class);
		return doGetRelTypesOnSource((TeamEditPart) sourceEditPart);
	}
	
	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSource(TeamEditPart source) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(CodingcontestElementTypes.TeamLocation_4003);
		return types;
	}
	
	/**
	* @generated
	*/
	@Override
	
	public List<IElementType> getRelTypesOnSourceAndTarget(
			IAdaptable source, IAdaptable target) {
		IGraphicalEditPart sourceEditPart =
				(IGraphicalEditPart) source.getAdapter(
						IGraphicalEditPart.class);
		IGraphicalEditPart targetEditPart =
				(IGraphicalEditPart) target.getAdapter(
						IGraphicalEditPart.class);
		return doGetRelTypesOnSourceAndTarget((TeamEditPart) sourceEditPart, targetEditPart);
	}
	
	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSourceAndTarget(TeamEditPart source, IGraphicalEditPart targetEditPart) {
		List<IElementType> types = new LinkedList<IElementType>();
		if(targetEditPart instanceof LocationEditPart) {
			types.add(CodingcontestElementTypes.TeamLocation_4003);
		}
		return types;
	}
	
	/**
	* @generated
	*/
	@Override
	
	public List<IElementType> getTypesForTarget(IAdaptable source,
			IElementType relationshipType) {
		IGraphicalEditPart sourceEditPart =
				(IGraphicalEditPart) source.getAdapter(
						IGraphicalEditPart.class);
		return doGetTypesForTarget((TeamEditPart) sourceEditPart, relationshipType);
	}
	
	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForTarget(TeamEditPart source, IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if(relationshipType == CodingcontestElementTypes.TeamLocation_4003) {
			types.add(CodingcontestElementTypes.Location_2003);
		}
		return types;
	}
	
}
