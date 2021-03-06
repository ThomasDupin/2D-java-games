package view;



import java.awt.event.KeyEvent;


import javax.swing.SwingUtilities;
import contract.ControllerOrder;
import contract.IController;
import contract.IModel;
import contract.IView;

// TODO: Auto-generated Javadoc
/**
 * The Class View.
 * 
 * @author Thibault, Timoté, Andréas, Thomas
 */
public final class View implements IView, Runnable {

	/** The view frame. */
	private final ViewFrame viewFrame;  
	
	/**
	 * Instantiates a new view.
	 *
	 * @param model the model
	 */
	public View(final IModel model) { 
		this.viewFrame = new ViewFrame(model);
		SwingUtilities.invokeLater(this);
	}

	/**
	 * Key code to controller order.
	 *
	 * @param keyCode the key code
	 * @return the controller order
	 */
	protected static ControllerOrder keyCodeToControllerOrder(final int keyCode) {
		switch (keyCode) {
			case KeyEvent.VK_NUMPAD1:
				return ControllerOrder.Map_1;
			case KeyEvent.VK_NUMPAD2:
				return ControllerOrder.Map_2;
			case KeyEvent.VK_NUMPAD3:
				return ControllerOrder.Map_3;
			case KeyEvent.VK_Z:
				return ControllerOrder.Up;
			case KeyEvent.VK_Q:
				return ControllerOrder.Left;
			case KeyEvent.VK_S:
				return ControllerOrder.Down;
			case KeyEvent.VK_D:
				return ControllerOrder.Right;
			default:
				return ControllerOrder.Nothing;

		}
	}

	/* (non-Javadoc)
	 * @see contract.IView#printMessage(java.lang.String)
	 */
	public void printMessage(final String message) {
		this.viewFrame.printMessage(message);
	}

	/* (non-Javadoc)
	 * @see java.lang.Runnable#run()
	 */
	public void run() {
		this.viewFrame.setVisible(true);
	}

	/**
	 * Sets the controller.
	 *
	 * @param controller the new controller
	 */
	public void setController(final IController controller) {
		this.viewFrame.setController(controller);
	}
}
