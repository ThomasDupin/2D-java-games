package model.element;

import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

import contract.ISprite;

// TODO: Auto-generated Javadoc
/**
 * The Class Sprite.
 * 
 * @author Thibault, Timoté, Andréas, Thomas
 */
public class Sprite implements ISprite {
 
    /** The image. */
    private Image   image;

    /** The image name. */
    private String  imageName;

    /** The console image. */
    private String    consoleImage;

    /** The image loaded. */
    private boolean imageLoaded;

    /**
     * Instantiates a new sprite.
     *
     * @param string the string
     * @param imageName the image name
     */
    public Sprite(final String string, final String imageName) {
        this.setConsoleImage(string);
        this.setImageName(imageName);
        try {
			this.setImage(ImageIO.read(getClass().getResource("/"+ imageName)));
		} catch (IOException e) {
			e.printStackTrace();
		}
    }

    /**
     * Instantiates a new sprite.
     *
     * @param character the character
     * @throws IOException Signals that an I/O exception has occurred.
     */
    public Sprite(final String character) throws IOException {
        this(character, "noimage.jpg");
    }
    
    /* (non-Javadoc)
     * @see contract.ISprite#getImage()
     */
    public final Image getImage() {
        return this.image;
    }

    /* (non-Javadoc)
     * @see contract.ISprite#loadImage()
     */
    public final void loadImage() throws IOException {
        this.setImage(ImageIO.read(new File("images/" + this.getImageName())));
    }

    /* (non-Javadoc)
     * @see contract.ISprite#getConsoleImage()
     */
    public final String getConsoleImage() {
        return this.consoleImage;
    }
    
    /**
     * Sets the image.
     *
     * @param image the new image
     */
    private void setImage(final Image image) {
        this.image = image;
    }

    /**
     * Sets the console image.
     *
     * @param string the new console image
     */
    void setConsoleImage(final String string) {
        this.consoleImage = string;
    }
    
    /**
     * Gets the image name.
     *
     * @return the image name
     */
    public final String getImageName() {
        return this.imageName;
    }

    /**
     * Sets the image name.
     *
     * @param imageName the new image name
     */
    void setImageName(final String imageName) {
        this.imageName = imageName;
    }

    /**
     * Checks if is image loaded.
     *
     * @return true, if is image loaded
     */
    public final boolean isImageLoaded() {
        return this.imageLoaded;
    }

    /**
     * Sets the image loaded.
     *
     * @param isImageLoaded the new image loaded
     */
    public final void setImageLoaded(final boolean isImageLoaded) {
        this.imageLoaded = isImageLoaded;
    }

}	
  