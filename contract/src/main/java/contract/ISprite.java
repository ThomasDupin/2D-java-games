package contract;

import java.awt.Image;
import java.io.IOException;

// TODO: Auto-generated Javadoc
/**
 * The Interface ISprite.
 * 
 * @author Thibault, Timoté, Andréas, Thomas
 */
public interface ISprite {

	/**
	 * Gets the image.
	 *
	 * @return the image
	 */
	Image getImage();

	/**
	 * Load image.
	 *
	 * @throws IOException Signals that an I/O exception has occurred.
	 */
	void loadImage() throws IOException;

	/**
	 * Gets the console image.
	 *
	 * @return the console image
	 */
	String getConsoleImage();

}