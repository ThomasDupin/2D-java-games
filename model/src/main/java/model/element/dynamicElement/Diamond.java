package model.element.dynamicElement;

import contract.IPosition;
import contract.ISprite;
import model.element.Sprite;

// TODO: Auto-generated Javadoc
/**
 * The Class Diamond.
 * 
 * @author Thibault, Timoté, Andréas, Thomas
 */
public class Diamond extends DynamicElement{
	
	/** The Constant SPRITE. */
	private static final ISprite SPRITE = new Sprite("o", "Diamond.png");
	
	/**
	 * Instantiates a new diamond.
	 *
	 * @param position the position
	 */
	public Diamond(IPosition position) {
		super(position,SPRITE);
	}
}

  