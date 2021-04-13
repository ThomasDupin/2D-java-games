package model;

import java.util.Observable;
import java.util.Observer;


import contract.IModel;
import contract.IPhysicsEngine;
import model.element.DoExplosion;

// TODO: Auto-generated Javadoc
/**
 * The Class PhysicsEngine.
 * 
 * @author Thibault, Timoté, Andréas, Thomas
 */
public class PhysicsEngine extends Model implements IPhysicsEngine, Observer {
	
	/** The explode. */
	private DoExplosion explode;
	
	/** The model. */
	private IModel model;

	/**
	 * Instantiates a new physics engine.
	 *
	 * @param model the model
	 */
	public PhysicsEngine(IModel model){
		this.model = model;
		model.getObservable().addObserver(this);
		explode = new DoExplosion(model);
	}

	/* (non-Javadoc)
	 * @see contract.IPhysicsEngine#runPhysics()
	 */
	@Override
	public void runPhysics(){
		for(int y = 3; y < model.getMap().size()-3; y++){
			for(int x = 3; x < model.getMap().get(y).size()-3; x++){
				if(model.getMap().get(y).get(x)!=null) {
					if(model.getMap().get(y).get(x).isFallable()==true){
						physicsBoulder(model.getMapElement(y, x).getPosition().getX(), model.getMapElement(y, x).getPosition().getY());
					}
				}
			}
		}
	}

	/* (non-Javadoc)
	 * @see contract.IPhysicsEngine#physicsBoulder(int, int)
	 */
	@Override
	public void physicsBoulder(int x, int y) {
		if(model.getMapElement(y+1, x) == null){
				model.getMapElement(y, x).getPosition().setY(model.getMapElement(y, x).getPosition().getY()+1);
				model.setOnTheMapXY(model.getMapElement(y, x), x, model.getMapElement(y, x).getPosition().getY());
				model.setOnTheMapXY(null, x, y);
				if (this.model.getMapElement(y+2, x).isAlive() == true){
					model.getPlayer().setAliveToDie();
				}
		} else if (model.getMapElement(y+1, x).isFallable() == true) {
			if (model.getMapElement(y+1, x+1)==null && model.getMapElement(y, x+1)==null) {
				model.getMapElement(y, x).getPosition().setY(model.getMapElement(y, x).getPosition().getY()+1);
				model.getMapElement(y, x).getPosition().setX(model.getMapElement(y, x).getPosition().getX()+1);
				model.setOnTheMapXY(model.getMapElement(y, x), model.getMapElement(y, x).getPosition().getX(), model.getMapElement(y, x).getPosition().getY());
				model.setOnTheMapXY(null, x, y);	
			} else if (model.getMapElement(y+1, x-1)==null && model.getMapElement(y, x-1)==null) {
				model.getMapElement(y, x).getPosition().setY(model.getMapElement(y, x).getPosition().getY()+1);
				model.getMapElement(y, x).getPosition().setX(model.getMapElement(y, x).getPosition().getX()-1);
				model.setOnTheMapXY(model.getMapElement(y, x), model.getMapElement(y, x).getPosition().getX(), model.getMapElement(y, x).getPosition().getY());
				model.setOnTheMapXY(null, x, y);
			}
		}else if(this.model.getMapElement(y+1, x).doExplosion() == true){
			explode.explosion(x, y+1);
		}
	}

	/* (non-Javadoc)
	 * @see java.util.Observer#update(java.util.Observable, java.lang.Object)
	 */
	@Override
	public void update(Observable arg0, Object arg1) {
		this.runPhysics();
	}
}
