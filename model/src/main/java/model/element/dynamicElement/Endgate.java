package model.element.dynamicElement;

import contract.IPosition;
import contract.ISprite;
import model.element.Sprite;

// TODO: Auto-generated Javadoc
/**
 * The Class Endgate.
 * 
 * @author Thibault, Timoté, Andréas, Thomas
 */
public class Endgate extends DynamicElement{
	
	/** The Constant SPRITE. */
	private static final ISprite SPRITE = new Sprite("t", "Endgate.png");
	
	/**
	 * Instantiates a new endgate.
	 *
	 * @param position the position
	 */
	public Endgate(IPosition position) {
		super(position, SPRITE);
	}
}
