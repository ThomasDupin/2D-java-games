package model.element.dynamicElement;


import contract.IPosition;
import contract.ISprite;
import model.element.Sprite;

// TODO: Auto-generated Javadoc
/**
 * The Class Unbreakable.
 * 
 * @author Thibault, Timoté, Andréas, Thomas
 */
public class Unbreakable extends DynamicElement{
	
	/** The Constant SPRITE. */
	private static final ISprite SPRITE = new Sprite("x", "Bedrock.png");
	
	/**
	 * Instantiates a new unbreakable.
	 *
	 * @param position the position
	 */
	public Unbreakable(IPosition position) {
		super(position,SPRITE); 
	}
}