package model;

import contract.IElement;
import contract.IInteractionMapPlayer;
import contract.IModel;

// TODO: Auto-generated Javadoc
/**
 * The Class InteractionMapPlayer.
 * 
 * @author Thibault, Timoté, Andréas, Thomas
 */
public class InteractionMapPlayer extends Model implements IInteractionMapPlayer {
	
	/** The model. */
	private IModel model;

	/**
	 * Instantiates a new interaction map player.
	 *
	 * @param model the model
	 */
	public InteractionMapPlayer(IModel model){
		this.model = model;
	}

	/* (non-Javadoc)
	 * @see contract.IInteractionMapPlayer#orderToMove(int, int)
	 */
	@Override
	public void orderToMove(int y, int x){
		if (model.getMapElement(model.getPlayer().getPosition().getY()+y, model.getPlayer().getPosition().getX()+x) == null){
			move(y, x);
		}else if(analyseMove(model.getMapElement(model.getPlayer().getPosition().getY()+y, model.getPlayer().getPosition().getX()+x), x) == true){
			move(y, x);
		}
	}
	
	/* (non-Javadoc)
	 * @see contract.IInteractionMapPlayer#move(int, int)
	 */
	@Override
	public void move(int y, int x){
		this.model.getPlayer().getPosition().setY(this.model.getPlayer().getPosition().getY()+y);
		this.model.getPlayer().getPosition().setX(this.model.getPlayer().getPosition().getX()+x);
		model.setOnTheMapXY(this.model.getPlayer(), this.model.getPlayer().getPosition().getX(), this.model.getPlayer().getPosition().getY());
		model.setOnTheMapXY(null, this.model.getPlayer().getPosition().getX()-x, this.model.getPlayer().getPosition().getY()-y);
	}

	/* (non-Javadoc)
	 * @see contract.IInteractionMapPlayer#analyseMove(contract.IElement, int)
	 */
	@Override
	public boolean analyseMove(IElement object, int x){
		if(object.isPushable() == true && x == 0){
			return false;
		}else if (object.isPushable() == true && x != 0){
			if(model.getMapElement(object.getPosition().getY(), object.getPosition().getX() + x) == null){
				moveWithPush(x, this.model.getPlayer());
			}else{
				return false;
			}
		}else if(object.isPickable() == true){
			setNbDiams(getNbDiams()+1);
			System.out.println("You need " + (10-getNbDiams()) + " diamond to continue");
			return true;
		}else if(object.doExplosion() == true){
			model.getPlayer().setAliveToDie();
		}else if (object.isMinable() == true){
			return true;

		}else if (object.doEnd() == true && getNbDiams() >= 10){
			return true;
		}else{
			return false;
		}
		return false;
	}

	/* (non-Javadoc)
	 * @see contract.IInteractionMapPlayer#moveWithPush(int, contract.IElement)
	 */
	@Override
	public void moveWithPush (int x, IElement player){
		IElement boulder = model.getMapElement(this.model.getPlayer().getPosition().getY(), this.model.getPlayer().getPosition().getX()+x);
		boulder.getPosition().setX(boulder.getPosition().getX()+x);
		model.setOnTheMapXY(boulder, boulder.getPosition().getX(), boulder.getPosition().getY());
		move(0, x);
	}
}
