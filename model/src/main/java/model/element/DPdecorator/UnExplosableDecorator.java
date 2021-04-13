package model.element.DPdecorator;

import model.element.Element;

// TODO: Auto-generated Javadoc
/**
 * The Class UnExplosableDecorator.
 * 
 * @author Thibault, Timoté, Andréas, Thomas
 */
public class UnExplosableDecorator extends Decorator{
	
	/**
	 * Instantiates a new un explosable decorator.
	 *
	 * @param object the object
	 */
	public UnExplosableDecorator(final Element object) {
		super(object);
		unExplosable = true;
	}
}
