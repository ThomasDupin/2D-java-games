package model;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Observable;

import contract.IElement;
import contract.IGameLoop;
import contract.IModel;
import entity.ElementPosition;
import model.element.Element;
import model.element.Position;
import model.element.DPdecorator.AliveDecorator;
import model.element.dynamicElement.ElementFactory;
import model.element.dynamicElement.Player;

// TODO: Auto-generated Javadoc
/**
 * The Class Model.
 * 
 * @author Thibault, Timoté, Andréas, Thomas
 */
public class Model extends Observable implements IModel{
	
	/** The map. */
	private ArrayList<ArrayList<IElement>> map;
	
	/** The player. */
	private Element player = null;
	
	/** The nb diams. */
	private int nbDiams;
	
	/** The game loop. */
	private IGameLoop gameLoop;

	
	/**
	 * Instantiates a new model.
	 */
	public Model() {
		map = new ArrayList<ArrayList<IElement>>();
		this.player= new Player(null);
		
	}
	
	/**
	 * Sets the player.
	 *
	 * @param element the new player
	 */
	public void setPlayer(Element element) {
		this.player = element;
	}
	
	/**
	 * Sets the player on the map.
	 *
	 * @param idMap the new player on the map
	 */
	public void setPlayerOnTheMap(int idMap) {
		switch(idMap) {
		case 1 :
			this.player = new AliveDecorator(new Player(new Position(5, 6)));
			break;
		case 2 : 
			this.player =  new AliveDecorator(new Player(new Position(15, 9)));
			break;
		case 3 :
			this.player =  new AliveDecorator(new Player(new Position(5, 5)));
			break;
		default:
			this.player =  new AliveDecorator(new Player(new Position(0, 0)));
		}
		this.map.get(player.getPosition().getY()).set(player.getPosition().getX(), this.player);
	}
	
	/* (non-Javadoc)
	 * @see contract.IModel#getPlayer()
	 */
	public IElement getPlayer() {
		return this.player;
	}
	
	
	/* (non-Javadoc)
	 * @see contract.IModel#getMap()
	 */
	public ArrayList<ArrayList<IElement>> getMap() {
		return this.map;
	}
	
	/* (non-Javadoc)
	 * @see contract.IModel#getMapElement(int, int)
	 */
	public IElement getMapElement(int y, int x) {
		return this.map.get(y).get(x);
	}

	/**
	 * Sets the onthe map.
	 *
	 * @param Map the map
	 * @param idMap the id map
	 */
	public void setOntheMap(ArrayList<ElementPosition> Map, int idMap) {
		this.map.clear();
		String [][] onTheMap = new String[IModel.widthMap][IModel.heightMap];
		for (ElementPosition m : Map) {
			onTheMap[m.getY()][m.getX()] = m.getDiminutif();
		}
		for (int y = 0 ; y < widthMap ; y++) {
			ArrayList<IElement> ligne = new ArrayList<IElement>();
			for (int x = 0 ; x < heightMap ; x++ ) {
				ligne.add(x, ElementFactory.createElement(onTheMap[y][x],new Position(x, y)));
			}
			this.map.add(y, ligne);
		}
		setNbDiams(0);
		this.setPlayerOnTheMap(idMap);
		this.setGameLoop(new GameLoop(this));
		refresh();
	}
	
	/* (non-Javadoc)
	 * @see contract.IModel#refresh()
	 */
	public void refresh() {
		setChanged();
		notifyObservers();
		this.getGameLoop().play();
	}
	
	/* (non-Javadoc)
	 * @see contract.IModel#setOnTheMapXY(contract.IElement, int, int)
	 */
	public void setOnTheMapXY(IElement element,int x, int y) {
		this.map.get(y).set(x, element);
		this.refresh();
	}
	
	/**
	 * Removes the ofthe map.
	 *
	 * @param x the x
	 * @param y the y
	 */
	public void removeOftheMap(int x, int y) {
		this.map.get(y).remove(x);
	}

	/* (non-Javadoc)
	 * @see contract.IModel#loadMap(int)
	 */
	public void loadMap(final int idMap) {
		try {
			final DAOElementPosition ElementPosition = new DAOElementPosition(DBConnection.getInstance().getConnection());
			this.setOntheMap(ElementPosition.find(idMap), idMap);
			this.setPlayerOnTheMap(idMap);
		} catch (final SQLException e) {
			e.printStackTrace();
		}
	}
	
	/* (non-Javadoc)
	 * @see contract.IModel#getObservable()
	 */
	public Observable getObservable() {
		return this;
	}
	
	/* (non-Javadoc)
	 * @see contract.IModel#setMap(java.util.ArrayList)
	 */
	@Override
	public void setMap(ArrayList<ArrayList<IElement>> map) {
		this.map = map;
	}
	
	/* (non-Javadoc)
	 * @see contract.IModel#getNbDiams()
	 */
	@Override
	public int getNbDiams() {
		return nbDiams;
	}
	
	/* (non-Javadoc)
	 * @see contract.IModel#setNbDiams(int)
	 */
	@Override
	public void setNbDiams(int nbDiams) {
		this.nbDiams = nbDiams;
	}
	
	/* (non-Javadoc)
	 * @see contract.IModel#getGameLoop()
	 */
	@Override
	public IGameLoop getGameLoop() {
		return gameLoop;
	}
	
	/* (non-Javadoc)
	 * @see contract.IModel#setGameLoop(contract.IGameLoop)
	 */
	@Override
	public void setGameLoop(IGameLoop gameLoop) {
		this.gameLoop = gameLoop;
	}
}
