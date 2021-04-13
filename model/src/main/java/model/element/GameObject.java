package model.element;

import contract.IGameObject;
import contract.IPosition;
import contract.ISprite;

// TODO: Auto-generated Javadoc
/**
 * The Class GameObject.
 * 
 * @author Thibault, Timoté, Andréas, Thomas
 */
public class GameObject implements IGameObject{
	
	/** The position. */
	IPosition position;
	
	/** The sprite. */
	ISprite sprite;
	
	/**
	 * Instantiates a new game object.
	 *
	 * @param position the position
	 * @param sprite the sprite
	 */
	public GameObject(IPosition position, ISprite sprite) {
		this.position = position;
		this.sprite = sprite;
	}
	
	/* (non-Javadoc)
	 * @see contract.IGameObject#getSprite()
	 */
	@Override
	public ISprite getSprite() {
		return sprite;
	}

	/* (non-Javadoc)
	 * @see contract.IGameObject#getPosition()
	 */
	@Override
	public IPosition getPosition() {
		return position;
	}
	
	/* (non-Javadoc)
	 * @see contract.IGameObject#setPosition(contract.IPosition)
	 */
	@Override
	public void setPosition(IPosition position) {
		this.position = position;
	}
	
	/* (non-Javadoc)
	 * @see contract.IGameObject#setSprite(contract.ISprite)
	 */
	@Override
	public void setSprite(ISprite sprite) {
		this.sprite = sprite;
	}
}
