package model.element.dynamicElement;

import contract.IPosition;
import contract.ISprite;
import model.element.Sprite;

// TODO: Auto-generated Javadoc
/**
 * The Class Boulder.
 * 
 * @author Thibault, Timoté, Andréas, Thomas
 */
public class Boulder extends DynamicElement {
	
	/** The Constant SPRITE. */
	private static final ISprite SPRITE = new Sprite("b", "Boulder.png");
	
	/**
	 * Instantiates a new boulder.
	 *
	 * @param position the position
	 */
	public Boulder(IPosition position) {
		super(position, SPRITE);
	}
}

 