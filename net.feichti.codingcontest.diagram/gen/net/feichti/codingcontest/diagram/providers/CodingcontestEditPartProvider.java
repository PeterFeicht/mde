package net.feichti.codingcontest.diagram.providers;

import org.eclipse.gmf.tooling.runtime.providers.DefaultEditPartProvider;

import net.feichti.codingcontest.diagram.edit.parts.CodingcontestEditPartFactory;
import net.feichti.codingcontest.diagram.edit.parts.ContestEditPart;
import net.feichti.codingcontest.diagram.part.CodingcontestVisualIDRegistry;

/**
 * @generated
 */
public class CodingcontestEditPartProvider extends DefaultEditPartProvider
{
	
	/**
	* @generated
	*/
	public CodingcontestEditPartProvider() {
		super(new CodingcontestEditPartFactory(), CodingcontestVisualIDRegistry.TYPED_INSTANCE,
				ContestEditPart.MODEL_ID);
	}
	
}
