package net.feichti.codingcontest.diagram.providers;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.service.AbstractProvider;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.GetParserOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParserProvider;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserService;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.parser.ParserHintAdapter;
import org.eclipse.gmf.runtime.notation.View;

import net.feichti.codingcontest.CodingcontestPackage;
import net.feichti.codingcontest.diagram.edit.parts.CoderNameEditPart;
import net.feichti.codingcontest.diagram.edit.parts.EntryTeamNameEditPart;
import net.feichti.codingcontest.diagram.edit.parts.LanguageToProblemMapKeyEditPart;
import net.feichti.codingcontest.diagram.edit.parts.LevelNumberEditPart;
import net.feichti.codingcontest.diagram.edit.parts.LocationNameEditPart;
import net.feichti.codingcontest.diagram.edit.parts.OrganizerNameEditPart;
import net.feichti.codingcontest.diagram.edit.parts.ProblemTitleEditPart;
import net.feichti.codingcontest.diagram.parsers.MessageFormatParser;
import net.feichti.codingcontest.diagram.part.CodingcontestVisualIDRegistry;

/**
 * @generated
 */
public class CodingcontestParserProvider extends AbstractProvider implements IParserProvider
{
	
	/**
	* @generated
	*/
	private IParser levelNumber_5001Parser;
	
	/**
	* @generated
	*/
	private IParser getLevelNumber_5001Parser() {
		if(levelNumber_5001Parser == null) {
			EAttribute[] features = new EAttribute[] {
					CodingcontestPackage.eINSTANCE.getLevel_Number()
			};
			MessageFormatParser parser = new MessageFormatParser(features);
			levelNumber_5001Parser = parser;
		}
		return levelNumber_5001Parser;
	}
	
	/**
	* @generated
	*/
	private IParser organizerName_5002Parser;
	
	/**
	* @generated
	*/
	private IParser getOrganizerName_5002Parser() {
		if(organizerName_5002Parser == null) {
			EAttribute[] features = new EAttribute[] {
					CodingcontestPackage.eINSTANCE.getOrganizer_Name()
			};
			MessageFormatParser parser = new MessageFormatParser(features);
			organizerName_5002Parser = parser;
		}
		return organizerName_5002Parser;
	}
	
	/**
	* @generated
	*/
	private IParser locationName_5003Parser;
	
	/**
	* @generated
	*/
	private IParser getLocationName_5003Parser() {
		if(locationName_5003Parser == null) {
			EAttribute[] features = new EAttribute[] {
					CodingcontestPackage.eINSTANCE.getLocation_Name()
			};
			MessageFormatParser parser = new MessageFormatParser(features);
			locationName_5003Parser = parser;
		}
		return locationName_5003Parser;
	}
	
	/**
	* @generated
	*/
	private IParser entryTeamName_5005Parser;
	
	/**
	* @generated
	*/
	private IParser getEntryTeamName_5005Parser() {
		if(entryTeamName_5005Parser == null) {
			EAttribute[] features = new EAttribute[] {
					CodingcontestPackage.eINSTANCE.getEntry_TeamName()
			};
			MessageFormatParser parser = new MessageFormatParser(features);
			entryTeamName_5005Parser = parser;
		}
		return entryTeamName_5005Parser;
	}
	
	/**
	* @generated
	*/
	private IParser problemTitle_5006Parser;
	
	/**
	* @generated
	*/
	private IParser getProblemTitle_5006Parser() {
		if(problemTitle_5006Parser == null) {
			EAttribute[] features = new EAttribute[] {
					CodingcontestPackage.eINSTANCE.getProblem_Title()
			};
			MessageFormatParser parser = new MessageFormatParser(features);
			problemTitle_5006Parser = parser;
		}
		return problemTitle_5006Parser;
	}
	
	/**
	* @generated
	*/
	private IParser coderName_5004Parser;
	
	/**
	* @generated
	*/
	private IParser getCoderName_5004Parser() {
		if(coderName_5004Parser == null) {
			EAttribute[] features = new EAttribute[] {
					CodingcontestPackage.eINSTANCE.getCoder_Name()
			};
			MessageFormatParser parser = new MessageFormatParser(features);
			coderName_5004Parser = parser;
		}
		return coderName_5004Parser;
	}
	
	/**
	* @generated
	*/
	private IParser languageToProblemMapKey_6001Parser;
	
	/**
	* @generated
	*/
	private IParser getLanguageToProblemMapKey_6001Parser() {
		if(languageToProblemMapKey_6001Parser == null) {
			EAttribute[] features = new EAttribute[] {
					CodingcontestPackage.eINSTANCE.getLanguageToProblemMap_Key()
			};
			MessageFormatParser parser = new MessageFormatParser(features);
			languageToProblemMapKey_6001Parser = parser;
		}
		return languageToProblemMapKey_6001Parser;
	}
	
	/**
	* @generated
	*/
	protected IParser getParser(int visualID) {
		switch(visualID) {
			case LevelNumberEditPart.VISUAL_ID:
				return getLevelNumber_5001Parser();
			case OrganizerNameEditPart.VISUAL_ID:
				return getOrganizerName_5002Parser();
			case LocationNameEditPart.VISUAL_ID:
				return getLocationName_5003Parser();
			case EntryTeamNameEditPart.VISUAL_ID:
				return getEntryTeamName_5005Parser();
			case ProblemTitleEditPart.VISUAL_ID:
				return getProblemTitle_5006Parser();
			case CoderNameEditPart.VISUAL_ID:
				return getCoderName_5004Parser();
			case LanguageToProblemMapKeyEditPart.VISUAL_ID:
				return getLanguageToProblemMapKey_6001Parser();
		}
		return null;
	}
	
	/**
	* Utility method that consults ParserService
	* @generated
	*/
	public static IParser getParser(IElementType type, EObject object, String parserHint) {
		return ParserService.getInstance().getParser(new HintAdapter(type, object, parserHint));
	}
	
	/**
	* @generated
	*/
	public IParser getParser(
			IAdaptable hint) {
		String vid = (String) hint.getAdapter(String.class);
		if(vid != null) {
			return getParser(CodingcontestVisualIDRegistry.getVisualID(vid));
		}
		View view =
				(View) hint.getAdapter(View.class);
		if(view != null) {
			return getParser(CodingcontestVisualIDRegistry.getVisualID(view));
		}
		return null;
	}
	
	/**
	* @generated
	*/
	public boolean provides(IOperation operation) {
		if(operation instanceof GetParserOperation) {
			IAdaptable hint =
					((GetParserOperation) operation).getHint();
			if(CodingcontestElementTypes.getElement(hint) == null) {
				return false;
			}
			return getParser(hint) != null;
		}
		return false;
	}
	
	/**
	* @generated
	*/
	private static class HintAdapter extends ParserHintAdapter
	{
		
		/**
		* @generated
		*/
		private final IElementType elementType;
		
		/**
		* @generated
		*/
		public HintAdapter(IElementType type,
				EObject object, String parserHint) {
			super(object, parserHint);
			assert type != null;
			elementType = type;
		}
		
		/**
		* @generated
		*/
		public Object getAdapter(Class adapter) {
			if(IElementType.class.equals(adapter)) {
				return elementType;
			}
			return super.getAdapter(adapter);
		}
	}
	
}
