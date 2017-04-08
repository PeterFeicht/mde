package net.feichti.codingcontest.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import net.feichti.codingcontest.diagram.edit.parts.LevelEditPart;
import net.feichti.codingcontest.diagram.edit.parts.ProblemEditPart;
import net.feichti.codingcontest.diagram.providers.CodingcontestElementTypes;
import net.feichti.codingcontest.diagram.providers.CodingcontestModelingAssistantProvider;

/**
 * @generated
 */
public class CodingcontestModelingAssistantProviderOfLevelEditPart extends CodingcontestModelingAssistantProvider
{
	
	/**
	* @generated
	*/
	@Override
	
	public List<IElementType> getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart =
				(IGraphicalEditPart) source.getAdapter(
						IGraphicalEditPart.class);
		return doGetRelTypesOnSource((LevelEditPart) sourceEditPart);
	}
	
	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSource(LevelEditPart source) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(CodingcontestElementTypes.LanguageToProblemMap_4001);
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
		return doGetRelTypesOnSourceAndTarget((LevelEditPart) sourceEditPart, targetEditPart);
	}
	
	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSourceAndTarget(LevelEditPart source, IGraphicalEditPart targetEditPart) {
		List<IElementType> types = new LinkedList<IElementType>();
		if(targetEditPart instanceof ProblemEditPart) {
			types.add(CodingcontestElementTypes.LanguageToProblemMap_4001);
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
		return doGetTypesForTarget((LevelEditPart) sourceEditPart, relationshipType);
	}
	
	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForTarget(LevelEditPart source, IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if(relationshipType == CodingcontestElementTypes.LanguageToProblemMap_4001) {
			types.add(CodingcontestElementTypes.Problem_2005);
		}
		return types;
	}
	
}
