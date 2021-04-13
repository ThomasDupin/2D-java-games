package model.element.DPdecorator;

import model.element.Element;

// TODO: Auto-generated Javadoc
/**
 * The Class Decorator.
 * 
 * @author Thibault, Timoté, Andréas, Thomas
 */
public abstract class Decorator extends Element{
	
	/**
	 * Instantiates a new decorator.
	 *
	 * @param object the object
	 */
	public Decorator(Element object) {
		super(object);
	}
}