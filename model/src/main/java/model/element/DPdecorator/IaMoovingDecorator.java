package model.element.DPdecorator;

import model.element.Element;

// TODO: Auto-generated Javadoc
/**
 * The Class IaMoovingDecorator.
 * 
 * @author Thibault, Timoté, Andréas, Thomas
 */
public class IaMoovingDecorator extends Decorator{

	/**
	 * Instantiates a new ia mooving decorator.
	 *
	 * @param object the object
	 */
	public IaMoovingDecorator(final Element object) {
		super(object);
		iaMoovable = true;
		
	}
}
