package model.element.dynamicElement;


import contract.IPosition;
import contract.ISprite;
import model.element.Sprite;

// TODO: Auto-generated Javadoc
/**
 * The Class Player.
 * 
 * @author Thibault, Timoté, Andréas, Thomas
 */
public class Player extends DynamicElement{
	
	/** The Constant SPRITE. */
	private static final ISprite SPRITE = new Sprite("p", "Player.png");	
	
	/**
	 * Instantiates a new player.
	 *
	 * @param position the position
	 */
	public Player(IPosition position) {
		super(position, SPRITE); 
	}
}