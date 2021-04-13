package model.element.DPdecorator;

import model.element.Element;

// TODO: Auto-generated Javadoc
/**
 * The Class AliveDecorator.
 * 
 * @author Thibault, Timoté, Andréas, Thomas
 */
public class AliveDecorator extends Decorator{
	
	/**
	 * Instantiates a new alive decorator.
	 *
	 * @param object the object
	 */
	public AliveDecorator(final Element object) {
		super(object);
		alive = true;
	}
}