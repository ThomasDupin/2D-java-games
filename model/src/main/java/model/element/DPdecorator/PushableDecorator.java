package model.element.DPdecorator;

import model.element.Element;

// TODO: Auto-generated Javadoc
/**
 * The Class PushableDecorator.
 * 
 * @author Thibault, Timoté, Andréas, Thomas
 */
public class PushableDecorator extends Decorator{
	
	/**
	 * Instantiates a new pushable decorator.
	 *
	 * @param object the object
	 */
	public PushableDecorator(final Element object) {
		super(object);
		pushable = true;
	}
}
