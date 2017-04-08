
package net.feichti.codingcontest.diagram.part;

import java.util.Collections;

import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteGroup;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.tooling.runtime.part.DefaultLinkToolEntry;
import org.eclipse.gmf.tooling.runtime.part.DefaultNodeToolEntry;

import net.feichti.codingcontest.diagram.providers.CodingcontestElementTypes;

/**
 * @generated
 */
public class CodingcontestPaletteFactory
{
	
	/**
	* @generated
	*/
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createCodingcontest1Group());
	}
	
	/**
	* Creates "codingcontest" palette tool group
	* @generated
	*/
	private PaletteContainer createCodingcontest1Group() {
		PaletteGroup paletteContainer = new PaletteGroup(Messages.Codingcontest1Group_title);
		paletteContainer.setId("createCodingcontest1Group"); //$NON-NLS-1$
		paletteContainer.add(createCoder1CreationTool());
		paletteContainer.add(createLocation2CreationTool());
		paletteContainer.add(createEntry3CreationTool());
		paletteContainer.add(createEntryLocation4CreationTool());
		paletteContainer.add(createOrganizer5CreationTool());
		paletteContainer.add(createLevel6CreationTool());
		paletteContainer.add(createProblem7CreationTool());
		paletteContainer.add(createLanguageToProblemMap8CreationTool());
		return paletteContainer;
	}
	
	/**
	* @generated
	*/
	private ToolEntry createCoder1CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Coder1CreationTool_title,
				Messages.Coder1CreationTool_desc, Collections.singletonList(CodingcontestElementTypes.Coder_3001));
		entry.setId("createCoder1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CodingcontestElementTypes.getImageDescriptor(CodingcontestElementTypes.Coder_3001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}
	
	/**
	* @generated
	*/
	private ToolEntry createLocation2CreationTool() {
		DefaultNodeToolEntry entry =
				new DefaultNodeToolEntry(Messages.Location2CreationTool_title, Messages.Location2CreationTool_desc,
						Collections.singletonList(CodingcontestElementTypes.Location_2003));
		entry.setId("createLocation2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CodingcontestElementTypes.getImageDescriptor(CodingcontestElementTypes.Location_2003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}
	
	/**
	* @generated
	*/
	private ToolEntry createEntry3CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Entry3CreationTool_title,
				Messages.Entry3CreationTool_desc, Collections.singletonList(CodingcontestElementTypes.Entry_2004));
		entry.setId("createEntry3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CodingcontestElementTypes.getImageDescriptor(CodingcontestElementTypes.Entry_2004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}
	
	/**
	* @generated
	*/
	private ToolEntry createEntryLocation4CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.EntryLocation4CreationTool_title,
				Messages.EntryLocation4CreationTool_desc,
				Collections.singletonList(CodingcontestElementTypes.EntryLocation_4002));
		entry.setId("createEntryLocation4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CodingcontestElementTypes.getImageDescriptor(CodingcontestElementTypes.EntryLocation_4002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}
	
	/**
	* @generated
	*/
	private ToolEntry createOrganizer5CreationTool() {
		DefaultNodeToolEntry entry =
				new DefaultNodeToolEntry(Messages.Organizer5CreationTool_title, Messages.Organizer5CreationTool_desc,
						Collections.singletonList(CodingcontestElementTypes.Organizer_2002));
		entry.setId("createOrganizer5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CodingcontestElementTypes.getImageDescriptor(CodingcontestElementTypes.Organizer_2002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}
	
	/**
	* @generated
	*/
	private ToolEntry createLevel6CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Level6CreationTool_title,
				Messages.Level6CreationTool_desc, Collections.singletonList(CodingcontestElementTypes.Level_2001));
		entry.setId("createLevel6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CodingcontestElementTypes.getImageDescriptor(CodingcontestElementTypes.Level_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}
	
	/**
	* @generated
	*/
	private ToolEntry createProblem7CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Problem7CreationTool_title,
				Messages.Problem7CreationTool_desc, Collections.singletonList(CodingcontestElementTypes.Problem_2005));
		entry.setId("createProblem7CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CodingcontestElementTypes.getImageDescriptor(CodingcontestElementTypes.Problem_2005));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}
	
	/**
	* @generated
	*/
	private ToolEntry createLanguageToProblemMap8CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.LanguageToProblemMap8CreationTool_title,
				Messages.LanguageToProblemMap8CreationTool_desc,
				Collections.singletonList(CodingcontestElementTypes.LanguageToProblemMap_4001));
		entry.setId("createLanguageToProblemMap8CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(
				CodingcontestElementTypes.getImageDescriptor(CodingcontestElementTypes.LanguageToProblemMap_4001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}
	
}
