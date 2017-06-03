
package net.feichti.codingcontest.diagram.part;

import java.util.Collections;

import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteDrawer;
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
		paletteRoot.add(createNodes1Group());
		paletteRoot.add(createLinks2Group());
	}
	
	/**
	* Creates "Nodes" palette tool group
	* @generated
	*/
	private PaletteContainer createNodes1Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(Messages.Nodes1Group_title);
		paletteContainer.setId("createNodes1Group"); //$NON-NLS-1$
		paletteContainer.setDescription(Messages.Nodes1Group_desc);
		paletteContainer.add(createOrganizer1CreationTool());
		paletteContainer.add(createLocation2CreationTool());
		paletteContainer.add(createLevel3CreationTool());
		paletteContainer.add(createProblem4CreationTool());
		paletteContainer.add(createTeam5CreationTool());
		paletteContainer.add(createCoder6CreationTool());
		return paletteContainer;
	}
	
	/**
	* Creates "Links" palette tool group
	* @generated
	*/
	private PaletteContainer createLinks2Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(Messages.Links2Group_title);
		paletteContainer.setId("createLinks2Group"); //$NON-NLS-1$
		paletteContainer.add(createLanguageToProblemMap1CreationTool());
		paletteContainer.add(createTeamLocation2CreationTool());
		return paletteContainer;
	}
	
	/**
	* @generated
	*/
	private ToolEntry createOrganizer1CreationTool() {
		DefaultNodeToolEntry entry =
				new DefaultNodeToolEntry(Messages.Organizer1CreationTool_title, Messages.Organizer1CreationTool_desc,
						Collections.singletonList(CodingcontestElementTypes.Organizer_2002));
		entry.setId("createOrganizer1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CodingcontestElementTypes.getImageDescriptor(CodingcontestElementTypes.Organizer_2002));
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
	private ToolEntry createLevel3CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Level3CreationTool_title,
				Messages.Level3CreationTool_desc, Collections.singletonList(CodingcontestElementTypes.Level_2001));
		entry.setId("createLevel3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CodingcontestElementTypes.getImageDescriptor(CodingcontestElementTypes.Level_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}
	
	/**
	* @generated
	*/
	private ToolEntry createProblem4CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Problem4CreationTool_title,
				Messages.Problem4CreationTool_desc, Collections.singletonList(CodingcontestElementTypes.Problem_2005));
		entry.setId("createProblem4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CodingcontestElementTypes.getImageDescriptor(CodingcontestElementTypes.Problem_2005));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}
	
	/**
	* @generated
	*/
	private ToolEntry createTeam5CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Team5CreationTool_title,
				Messages.Team5CreationTool_desc, Collections.singletonList(CodingcontestElementTypes.Team_2006));
		entry.setId("createTeam5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CodingcontestElementTypes.getImageDescriptor(CodingcontestElementTypes.Team_2006));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}
	
	/**
	* @generated
	*/
	private ToolEntry createCoder6CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Coder6CreationTool_title,
				Messages.Coder6CreationTool_desc, Collections.singletonList(CodingcontestElementTypes.Coder_3002));
		entry.setId("createCoder6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CodingcontestElementTypes.getImageDescriptor(CodingcontestElementTypes.Coder_3002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}
	
	/**
	* @generated
	*/
	private ToolEntry createLanguageToProblemMap1CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.LanguageToProblemMap1CreationTool_title,
				Messages.LanguageToProblemMap1CreationTool_desc,
				Collections.singletonList(CodingcontestElementTypes.LanguageToProblemMap_4001));
		entry.setId("createLanguageToProblemMap1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(
				CodingcontestElementTypes.getImageDescriptor(CodingcontestElementTypes.LanguageToProblemMap_4001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}
	
	/**
	* @generated
	*/
	private ToolEntry createTeamLocation2CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.TeamLocation2CreationTool_title,
				Messages.TeamLocation2CreationTool_desc,
				Collections.singletonList(CodingcontestElementTypes.TeamLocation_4003));
		entry.setId("createTeamLocation2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CodingcontestElementTypes.getImageDescriptor(CodingcontestElementTypes.TeamLocation_4003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}
	
}
