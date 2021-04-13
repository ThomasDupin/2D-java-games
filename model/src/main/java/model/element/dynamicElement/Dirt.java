package model.element.dynamicElement;

import contract.IPosition;
import contract.ISprite;
import model.element.Sprite;

// TODO: Auto-generated Javadoc
/**
 * The Class Dirt.
 * 
 * @author Thibault, Timoté, Andréas, Thomas
 */
public class Dirt extends DynamicElement{
	
	/** The Constant SPRITE. */
	private static final ISprite SPRITE = new Sprite("d", "Dirt.png");
	
	/**
	 * Instantiates a new dirt.
	 *
	 * @param position the position
	 */
	public Dirt(IPosition position) {
		super(position, SPRITE);
	}
}

  