package net.feichti.codingcontest.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import net.feichti.codingcontest.diagram.providers.CodingcontestElementTypes;
import net.feichti.codingcontest.diagram.providers.CodingcontestModelingAssistantProvider;

/**
 * @generated
 */
public class CodingcontestModelingAssistantProviderOfContestEditPart extends CodingcontestModelingAssistantProvider
{
	
	/**
	* @generated
	*/
	@Override
	
	public List<IElementType> getTypesForPopupBar(IAdaptable host) {
		List<IElementType> types = new ArrayList<IElementType>(5);
		types.add(CodingcontestElementTypes.Level_2001);
		types.add(CodingcontestElementTypes.Organizer_2002);
		types.add(CodingcontestElementTypes.Location_2003);
		types.add(CodingcontestElementTypes.Team_2006);
		types.add(CodingcontestElementTypes.Problem_2005);
		return types;
	}
	
}
