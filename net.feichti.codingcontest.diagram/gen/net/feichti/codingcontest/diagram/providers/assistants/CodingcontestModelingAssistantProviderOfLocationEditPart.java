package net.feichti.codingcontest.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import net.feichti.codingcontest.diagram.edit.parts.LocationEditPart;
import net.feichti.codingcontest.diagram.providers.CodingcontestElementTypes;
import net.feichti.codingcontest.diagram.providers.CodingcontestModelingAssistantProvider;

/**
 * @generated
 */
public class CodingcontestModelingAssistantProviderOfLocationEditPart extends CodingcontestModelingAssistantProvider
{
	
	/**
	* @generated
	*/
	@Override
	
	public List<IElementType> getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart =
				(IGraphicalEditPart) target.getAdapter(
						IGraphicalEditPart.class);
		return doGetRelTypesOnTarget((LocationEditPart) targetEditPart);
	}
	
	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnTarget(LocationEditPart target) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(CodingcontestElementTypes.EntryLocation_4002);
		return types;
	}
	
	/**
	* @generated
	*/
	@Override
	
	public List<IElementType> getTypesForSource(IAdaptable target,
			IElementType relationshipType) {
		IGraphicalEditPart targetEditPart =
				(IGraphicalEditPart) target.getAdapter(
						IGraphicalEditPart.class);
		return doGetTypesForSource((LocationEditPart) targetEditPart, relationshipType);
	}
	
	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForSource(LocationEditPart target, IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if(relationshipType == CodingcontestElementTypes.EntryLocation_4002) {
			types.add(CodingcontestElementTypes.Entry_2004);
		}
		return types;
	}
	
}
