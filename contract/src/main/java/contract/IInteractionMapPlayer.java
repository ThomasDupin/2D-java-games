package contract;

// TODO: Auto-generated Javadoc
/**
 * The Interface IInteractionMapPlayer.
 * 
 * @author Thibault, Timoté, Andréas, Thomas
 */
public interface IInteractionMapPlayer {
	
	/**
	 * Move with push.
	 *
	 * @param x the x
	 * @param player the player
	 */
	void moveWithPush(int x, IElement player);

	/**
	 * Analyse move.
	 *
	 * @param object the object
	 * @param x the x
	 * @return true, if successful
	 */
	boolean analyseMove(IElement object, int x);

	/**
	 * Move.
	 *
	 * @param y the y
	 * @param x the x
	 */
	void move(int y, int x);

	/**
	 * Order to move.
	 *
	 * @param y the y
	 * @param x the x
	 */
	void orderToMove(int y, int x);

}