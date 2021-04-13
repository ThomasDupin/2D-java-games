package model.element.DPdecorator;

import model.element.Element;

// TODO: Auto-generated Javadoc
/**
 * The Class EndableDecorator.
 * 
 * @author Thibault, Timoté, Andréas, Thomas
 */
public class EndableDecorator extends Decorator{
	
	/**
	 * Instantiates a new endable decorator.
	 *
	 * @param object the object
	 */
	public EndableDecorator(final Element object) {
		super(object);
		endAble = true;
	}
}