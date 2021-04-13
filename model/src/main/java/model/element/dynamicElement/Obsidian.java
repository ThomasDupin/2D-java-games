package model.element.dynamicElement;


import contract.IPosition;
import contract.ISprite;
import model.element.Sprite;

// TODO: Auto-generated Javadoc
/**
 * The Class Obsidian.
 * 
 * @author Thibault, Timoté, Andréas, Thomas
 */
public class Obsidian extends DynamicElement{
	
	/** The Constant SPRITE. */
	private static final ISprite SPRITE = new Sprite("i", "Obsidian.png");
	
	/**
	 * Instantiates a new obsidian.
	 *
	 * @param position the position
	 */
	public Obsidian(IPosition position) {
		super(position,SPRITE); 
	}

}