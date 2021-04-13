package model.element.DPdecorator;

import model.element.Element;

// TODO: Auto-generated Javadoc
/**
 * The Class ExplosionDecorator.
 * 
 * @author Thibault, Timoté, Andréas, Thomas
 */
public class ExplosionDecorator extends Decorator{
	
	/**
	 * Instantiates a new explosion decorator.
	 *
	 * @param object the object
	 */
	public ExplosionDecorator(final Element object) {
		super(object);
		explosable = true;
	}
}
