package model;


import contract.IController;
import contract.IGameLoop;
import contract.IInteractionMapPlayer;
import contract.IModel;
import contract.IPhysicsEngine;

// TODO: Auto-generated Javadoc
/**
 * The Class GameLoop.
 * 
 * @author Thibault, Timoté, Andréas, Thomas
 */
public class GameLoop extends Thread implements IGameLoop{
	
	/** The model. */
	private IModel model;
	
	/** The physics engine. */
	private IPhysicsEngine physicsEngine;
	
	/** The interaction map player. */
	private IInteractionMapPlayer interactionMapPlayer;
	
	/** The controller. */
	private IController controller;

	/**
	 * Instantiates a new game loop.
	 *
	 * @param model the model
	 */
	public GameLoop(IModel model) {
		this.setModel(model);
		this.setInteractionMapPlayer(new InteractionMapPlayer(this.getModel()));
		this.setPhysicsEngine(new PhysicsEngine(this.getModel()));
	}

	/* (non-Javadoc)
	 * @see contract.IGameLoop#play()
	 */
	@Override
	public void play() {
		if(model.getPlayer().isAlive() == true){
		}else{
			model.getMap().get(model.getPlayer().getPosition().getY()).remove(model.getPlayer().getPosition().getX());
			this.model.getMap().clear();
			controller.death();
		}
		
	}

	/* (non-Javadoc)
	 * @see contract.IGameLoop#getPhysicsEngine()
	 */
	@Override
	public IPhysicsEngine getPhysicsEngine() {
		return physicsEngine;
	}

	/* (non-Javadoc)
	 * @see contract.IGameLoop#setPhysicsEngine(contract.IPhysicsEngine)
	 */
	@Override
	public void setPhysicsEngine(IPhysicsEngine physicsEngine) {
		this.physicsEngine = physicsEngine;
	}

	/* (non-Javadoc)
	 * @see contract.IGameLoop#getInteractionMapPlayer()
	 */
	@Override
	public IInteractionMapPlayer getInteractionMapPlayer() {
		return interactionMapPlayer;
	}

	/* (non-Javadoc)
	 * @see contract.IGameLoop#setInteractionMapPlayer(contract.IInteractionMapPlayer)
	 */
	@Override
	public void setInteractionMapPlayer(IInteractionMapPlayer interactionMapPlayer) {
		this.interactionMapPlayer = interactionMapPlayer;
	}

	/* (non-Javadoc)
	 * @see contract.IGameLoop#getModel()
	 */
	@Override
	public IModel getModel() {
		return model;
	}

	/* (non-Javadoc)
	 * @see contract.IGameLoop#setModel(contract.IModel)
	 */
	@Override
	public void setModel(IModel model) {
		this.model = model;
	}
}