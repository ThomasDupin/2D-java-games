package model.element.DPdecorator;

import model.element.Element;

// TODO: Auto-generated Javadoc
/**
 * The Class PickableDecorator.
 * 
 * @author Thibault, Timoté, Andréas, Thomas
 */
public class PickableDecorator extends Decorator{
	
	/**
	 * Instantiates a new pickable decorator.
	 *
	 * @param object the object
	 */
	public PickableDecorator(final Element object) {
		super(object);
		pickable = true;
	}
}
