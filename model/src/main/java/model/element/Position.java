package model.element;

import contract.IPosition;

// TODO: Auto-generated Javadoc
/**
 * The Class Position.
 * 
 * @author Thibault, Timoté, Andréas, Thomas
 */
public class Position implements IPosition{
	
	/** The x. */
	private int x;
	
	/** The y. */
	private int y;
	
	/**
	 * Instantiates a new position.
	 *
	 * @param x the x
	 * @param y the y
	 */
	public Position(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	/* (non-Javadoc)
	 * @see contract.IPosition#getX()
	 */
	@Override
	public int getX() {
		return this.x;
	}

	/* (non-Javadoc)
	 * @see contract.IPosition#getY()
	 */
	@Override
	public int getY() {
		return this.y;
	}

	/* (non-Javadoc)
	 * @see contract.IPosition#setX(int)
	 */
	@Override
	public void setX(int x) {
		this.x = x;
		
	}

	/* (non-Javadoc)
	 * @see contract.IPosition#setY(int)
	 */
	@Override
	public void setY(int y) {
		this.y = y ;
		
	}
	
}
