package contract;

// TODO: Auto-generated Javadoc
/**
 * The Interface IController.
 * @author Thibault, Timoté, Andréas, Thomas
 */
public interface IController {

	/**
	 * Control.
	 */
	void control();
	
	/**
	 * Control map.
	 */
	void controlMap();
	
	 /**
 	 * Death.
 	 */
 	void death();
	
	/**
	 * Order perform.
	 *
	 * @param controllerOrder the controller order
	 */
	public void orderPerform(ControllerOrder controllerOrder);
}
