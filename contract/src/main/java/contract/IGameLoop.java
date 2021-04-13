package contract;

// TODO: Auto-generated Javadoc
/**
 * The Interface IGameLoop.
 * 
 * @author Thibault, Timoté, Andréas, Thomas
 */
public interface IGameLoop {

	/**
	 * Play.
	 */
	void play();

	/**
	 * Gets the physics engine.
	 *
	 * @return the physics engine
	 */
	IPhysicsEngine getPhysicsEngine();

	/**
	 * Sets the physics engine.
	 *
	 * @param physicsEngine the new physics engine
	 */
	void setPhysicsEngine(IPhysicsEngine physicsEngine);

	/**
	 * Gets the interaction map player.
	 *
	 * @return the interaction map player
	 */
	IInteractionMapPlayer getInteractionMapPlayer();

	/**
	 * Sets the interaction map player.
	 *
	 * @param interactionMapPlayer the new interaction map player
	 */
	void setInteractionMapPlayer(IInteractionMapPlayer interactionMapPlayer);

	/**
	 * Gets the model.
	 *
	 * @return the model
	 */
	IModel getModel();

	/**
	 * Sets the model.
	 *
	 * @param model the new model
	 */
	void setModel(IModel model);

}