package model.element.DPdecorator;

import model.element.Element;

// TODO: Auto-generated Javadoc
/**
 * The Class MinableDecorator.
 * 
 * @author Thibault, Timoté, Andréas, Thomas
 */
public class MinableDecorator extends Decorator{
	
	/**
	 * Instantiates a new minable decorator.
	 *
	 * @param object the object
	 */
	public MinableDecorator(final Element object) {
		super(object);
		minable = true;
	}
}
