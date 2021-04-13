package controller;

import contract.ControllerOrder;
import contract.IController;
import contract.IModel;
import contract.IView;

// TODO: Auto-generated Javadoc
/**
 * The Class Controller.
 * 
 * @author Thibault, Timoté, Andréas, Thomas
 */
public final class Controller implements IController {

	/** The view. */
	private IView		view;

	/** The model. */
	private IModel	model;	

	/**
	 * Instantiates a new controller.
	 *
	 * @param view the view
	 * @param model the model
	 */
	public Controller(final IView view, final IModel model) {
		this.setView(view);
		this.setModel(model);
	}

	/* (non-Javadoc)
	 * @see contract.IController#controlMap()
	 */
	public void controlMap() {

		this.view.printMessage("Appuyer sur les touches '1', '2', '3' du pave numérique pour afficher la Map Correspondante");
	}
	
	/* (non-Javadoc)
	 * @see contract.IController#control()
	 */
	public void control(){
		this.view.printMessage("Appuyer sur les touches 'z', 'q', 's' , 'd' du pave numérique pour vous deplacer");
	}
	
	/* (non-Javadoc)
	 * @see contract.IController#death()
	 */
	public void death(){
		this.view.printMessage("YOU DIE");
	}

	/**
	 * Sets the view.
	 *
	 * @param pview the new view
	 */
	private void setView(final IView pview) {
		this.view = pview;
	}

	/**
	 * Sets the model.
	 *
	 * @param model the new model
	 */
	private void setModel(final IModel model) {
		this.model = model;
	}

	/* (non-Javadoc)
	 * @see contract.IController#orderPerform(contract.ControllerOrder)
	 */
	public void orderPerform(final ControllerOrder controllerOrder) {
		switch (controllerOrder) {
			case Map_1:
				this.model.loadMap(1);
				break;
			case Map_2:
				this.model.loadMap(2);
				break;
			case Map_3:
				this.model.loadMap(3);
				break;
			case Up :
				this.model.getGameLoop().getInteractionMapPlayer().orderToMove(-1, 0);
				break;
			case Down:
				this.model.getGameLoop().getInteractionMapPlayer().orderToMove(1, 0);
				break;
			case Left:
				this.model.getGameLoop().getInteractionMapPlayer().orderToMove(0, -1);
				break;
			case Right:
				this.model.getGameLoop().getInteractionMapPlayer().orderToMove(0, 1);
				break;
			default: 
				break;
		}
	}

}
