package model.element.dynamicElement;


import contract.IPosition;
import contract.ISprite;
import model.element.Sprite;

// TODO: Auto-generated Javadoc
/**
 * The Class Monster.
 * 
 * @author Thibault, Timoté, Andréas, Thomas
 */
public class Monster extends DynamicElement {
	
	/** The Constant SPRITE. */
	private static final ISprite SPRITE = new Sprite("m", "Monster.png");
	
	/**
	 * Instantiates a new monster.
	 *
	 * @param position the position
	 */
	public Monster(IPosition position) {
		super(position, SPRITE);
	}

}

  