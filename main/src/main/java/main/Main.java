/**
 * @author Thibault, Timoté, Andréas, Thomas
 * @version 1.0
 */
package main;

import controller.Controller;
import model.Model;
import view.View;

// TODO: Auto-generated Javadoc
/**
 * The Class Main.
 */
public abstract class Main {

    /**
     * The main method.
     *
     * @param args the arguments
     */
    public static void main(final String[] args) {
        final Model model = new Model();
        final View view = new View(model);
        final Controller controller = new Controller(view, model);
        view.setController(controller);
        controller.controlMap();
        controller.control();
    }
}
