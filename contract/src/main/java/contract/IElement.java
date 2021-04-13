package contract;

import contract.IGameObject;

// TODO: Auto-generated Javadoc
/**
 * The Interface IElement.
 * @author Thibault, Timoté, Andréas, Thomas
 */
public interface IElement extends IGameObject{
	
	/**
	 * Checks if is pickable.
	 *
	 * @return true, if is pickable
	 */
	boolean isPickable();
	
	/**
	 * Checks if is fallable.
	 *
	 * @return true, if is fallable
	 */
	boolean isFallable();
	
	/**
	 * Do explosion.
	 *
	 * @return true, if successful
	 */
	boolean doExplosion();
	
	/**
	 * Checks if is ia moovable.
	 *
	 * @return true, if is ia moovable
	 */
	boolean isIaMoovable();
	
	/**
	 * Checks if is minable.
	 *
	 * @return true, if is minable
	 */
	boolean isMinable();
	
	/**
	 * Checks if is pushable.
	 *
	 * @return true, if is pushable
	 */
	boolean isPushable();
	
	/**
	 * Checks if is un explosable.
	 *
	 * @return true, if is un explosable
	 */
	boolean isUnExplosable();
	
	/**
	 * Checks if is alive.
	 *
	 * @return true, if is alive
	 */
	boolean isAlive();
	
	/**
	 * Do end.
	 *
	 * @return true, if successful
	 */
	boolean doEnd();
	
	/**
	 * Sets the alive to die.
	 *
	 * @return true, if successful
	 */
	boolean setAliveToDie();
}
