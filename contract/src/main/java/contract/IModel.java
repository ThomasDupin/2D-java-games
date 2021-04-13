package contract;

import java.util.ArrayList;
import java.util.Observable;

// TODO: Auto-generated Javadoc
/**
 * The Interface IModel.
 * 
 * @author Thibault, Timoté, Andréas, Thomas
 */
public interface IModel {

	/** The width map. */
	int widthMap = 28;
	
	/** The height map. */
	int heightMap = 32;
	
	/**
	 * Load map.
	 *
	 * @param idMap the id map
	 */
	void loadMap(final int idMap);
	
	/**
	 * Gets the map.
	 *
	 * @return the map
	 */
	ArrayList<ArrayList<IElement>> getMap();
	
	/**
	 * Sets the map.
	 *
	 * @param map the new map
	 */
	void setMap(ArrayList<ArrayList<IElement>> map);
	 
	/**
	 * Gets the map element.
	 *
	 * @param y the y
	 * @param x the x
	 * @return the map element
	 */
	IElement getMapElement(int y, int x);

	/**
	 * Gets the player.
	 *
	 * @return the player
	 */
	IElement getPlayer();
		
	/**
	 * Refresh.
	 */
	void refresh();
	
	/**
	 * Sets the on the map XY.
	 *
	 * @param element the element
	 * @param x the x
	 * @param y the y
	 */
	void setOnTheMapXY(IElement element,int x, int y);
	
	/**
	 * Gets the observable.
	 *
	 * @return the observable
	 */
	Observable getObservable();

	/**
	 * Gets the game loop.
	 *
	 * @return the game loop
	 */
	IGameLoop getGameLoop();

	/**
	 * Sets the nb diams.
	 *
	 * @param nbDiams the new nb diams
	 */
	void setNbDiams(int nbDiams);

	/**
	 * Gets the nb diams.
	 *
	 * @return the nb diams
	 */
	int getNbDiams();

	/**
	 * Sets the game loop.
	 *
	 * @param gameLoop the new game loop
	 */
	void setGameLoop(IGameLoop gameLoop);
}
