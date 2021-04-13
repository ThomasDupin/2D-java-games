package contract;

// TODO: Auto-generated Javadoc
/**
 * The Interface IGameObject.
 * 
 * @author Thibault, Timoté, Andréas, Thomas
 */
public interface IGameObject {
	
	/**
	 * Gets the sprite.
	 *
	 * @return the sprite
	 */
	ISprite getSprite();
	
	/**
	 * Gets the position.
	 *
	 * @return the position
	 */
	IPosition getPosition();
	
	/**
	 * Sets the position.
	 *
	 * @param position the new position
	 */
	void setPosition(IPosition position);
	 
 	/**
 	 * Sets the sprite.
 	 *
 	 * @param sprite the new sprite
 	 */
 	void setSprite(ISprite sprite);
}
