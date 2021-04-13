package model.element;

import static org.junit.Assert.*;

import java.awt.Image;
import java.io.IOException;
import org.junit.Before;
import org.junit.Test;

// TODO: Auto-generated Javadoc
/**
 * The Class SpriteTest.
 * 
 * @author Thibault, Timoté, Andréas, Thomas
 */
public class SpriteTest {
    
    /** The sprite. */
    Sprite sprite;
    
    /**
     * Sets the up.
     *
     * @throws Exception the exception
     */
    @Before
    public void setUp() throws Exception {
        this.sprite = new Sprite("i", "Obsidian.png");
    }
    
    /**
     * Test sprite string string.
     */
    @Test
    public void testSpriteStringString() {
        final String expectedD = "i" ;
        final String expectedI = "Obsidian.png";
        assertEquals(expectedD, this.sprite.getConsoleImage());
        assertEquals(expectedI, this.sprite.getImageName());    
    }

    /**
     * Test get image.
     *
     * @throws IOException Signals that an I/O exception has occurred.
     */
    @Test
    public void testGetImage() throws IOException {
        Image Image = sprite.getImage();
        assertEquals(Image, sprite.getImage());
    }

    /**
     * Test get console image.
     */
    @Test
    public void testGetConsoleImage() {
        String expected = "i";
        assertEquals(expected, sprite.getConsoleImage());
    }

    /**
     * Test get image name.
     */
    @Test
    public void testGetImageName() {
        String expected = "Obsidian.png"; 
        assertEquals(expected, sprite.getImageName());

    }

    /**
     * Test set image name.
     */
    @Test
    public void testSetImageName() {
        String expected = "oobsidian.png";
        sprite.setImageName("oobsidian.png");
        assertEquals(expected, sprite.getImageName());
    }

    /**
     * Test set console image.
     */
    @Test
    public void testSetConsoleImage() {
        String expected ="K";
        sprite.setConsoleImage("K");
        assertEquals(expected, sprite.getConsoleImage());

    }

}