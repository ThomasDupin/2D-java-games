package model.element;

import contract.IModel;
import contract.IPosition;
import model.Model;
import model.element.dynamicElement.ElementFactory;

// TODO: Auto-generated Javadoc
/**
 * The Class DoExplosion.
 * 
 * @author Thibault, Timoté, Andréas, Thomas
 */
public class DoExplosion extends Model{
	
	/** The model. */
	private IModel model;

	/**
	 * Instantiates a new do explosion.
	 *
	 * @param model the model
	 */
	public DoExplosion(IModel model){
		this.model = model;
	}
	
	/**
	 * Explosion.
	 *
	 * @param boulderX the boulder X
	 * @param boulderY the boulder Y
	 */
	public void explosion(int boulderX, int boulderY){
		model.setOnTheMapXY(null, boulderX, boulderY);

		for(int x = (boulderX-1); x <= boulderX+1; x++){
			for(int y = (boulderY-1); y <= boulderY+1; y++){
				if(model.getPlayer().getPosition().getX() == x && model.getPlayer().getPosition().getY() == y){
					model.getPlayer().setAliveToDie();
				}
				IPosition position = new Position(x, y);
				model.setOnTheMapXY(ElementFactory.createDiamond(position) , x, y);
			}
		}
	}
}
