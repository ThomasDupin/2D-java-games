package model.element.DPdecorator;

import model.element.Element;

// TODO: Auto-generated Javadoc
/**
 * The Class FallableDecorator.
 * 
 * @author Thibault, Timoté, Andréas, Thomas
 */
public class FallableDecorator extends Decorator{

	/**
	 * Instantiates a new fallable decorator.
	 *
	 * @param object the object
	 */
	public FallableDecorator(final Element object) {
		super(object);
		fallable = true;
	}
}
