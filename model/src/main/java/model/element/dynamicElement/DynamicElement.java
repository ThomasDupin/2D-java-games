package model.element.dynamicElement;

import contract.IPosition;
import contract.ISprite;
import model.element.Element;

// TODO: Auto-generated Javadoc
/**
 * The Class DynamicElement.
 * 
 * @author Thibault, Timoté, Andréas, Thomas
 */
public abstract class DynamicElement extends Element {
	
	/**
	 * Instantiates a new dynamic element.
	 *
	 * @param position the position
	 * @param sprite the sprite
	 */
	DynamicElement(IPosition position, final ISprite sprite){
		super(position, sprite);
	}

}