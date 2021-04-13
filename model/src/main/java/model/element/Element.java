package model.element;

import contract.IElement;
import contract.IPosition;
import contract.ISprite;

// TODO: Auto-generated Javadoc
/**
 * The Class Element.
 * 
 * @author Thibault, Timoté, Andréas, Thomas
 */
public abstract class Element extends GameObject implements IElement{

	/** The pickable. */
	protected boolean pickable = false;
	
	/** The fallable. */
	protected boolean fallable = false;
	
	/** The explosable. */
	protected boolean explosable = false;
	
	/** The ia moovable. */
	protected boolean iaMoovable = false;
	
	/** The minable. */
	protected boolean minable = false;
	
	/** The pushable. */
	protected boolean pushable = false;
	
	/** The un explosable. */
	protected boolean unExplosable = false;
	
	/** The end able. */
	protected boolean endAble = false;
	
	/** The alive. */
	protected boolean alive = false;

	/**
	 * Instantiates a new element.
	 *
	 * @param position the position
	 * @param sprite the sprite
	 */
	public Element(IPosition position, ISprite sprite){
		super(position, sprite);
	}
	
	/**
	 * Instantiates a new element.
	 *
	 * @param element the element
	 */
	public Element(Element element) {
		super(element.getPosition(), element.getSprite());
		this.pickable = element.isPickable();
		this.fallable = element.isFallable();
		this.explosable = element.doExplosion();
		this.iaMoovable = element.isIaMoovable();
		this.minable = element.isMinable();
		this.pushable = element.isPushable();
		this.unExplosable = element.isUnExplosable();
		this.endAble = element.doEnd();
		this.alive = element.isAlive();
	}

	/* (non-Javadoc)
	 * @see contract.IElement#isPickable()
	 */
	public boolean isPickable(){
		return pickable;
	}

	/* (non-Javadoc)
	 * @see contract.IElement#isFallable()
	 */
	public boolean isFallable(){
		return fallable;
	}	

	/* (non-Javadoc)
	 * @see contract.IElement#doExplosion()
	 */
	public boolean doExplosion(){
		return explosable;
	}	

	/* (non-Javadoc)
	 * @see contract.IElement#isIaMoovable()
	 */
	public boolean isIaMoovable(){
		return iaMoovable;
	}

	/* (non-Javadoc)
	 * @see contract.IElement#isMinable()
	 */
	public boolean isMinable(){
		return minable;
	}

	/* (non-Javadoc)
	 * @see contract.IElement#isPushable()
	 */
	public boolean isPushable(){
		return pushable;
	}

	/* (non-Javadoc)
	 * @see contract.IElement#isUnExplosable()
	 */
	public boolean isUnExplosable(){
		return unExplosable;
	}
	
	/* (non-Javadoc)
	 * @see contract.IElement#doEnd()
	 */
	public boolean doEnd(){
		return endAble;
	}
	
	/* (non-Javadoc)
	 * @see contract.IElement#isAlive()
	 */
	public boolean isAlive(){
		return alive;
	}
	
	/* (non-Javadoc)
	 * @see contract.IElement#setAliveToDie()
	 */
	public boolean setAliveToDie(){
		return this.alive = false;
	}
}