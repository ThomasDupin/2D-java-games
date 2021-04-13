package model.element;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

// TODO: Auto-generated Javadoc
/**
 * The Class PositionTest.
 * 
 * @author Thibault, Timoté, Andréas, Thomas
 */
public class PositionTest {
    
    /** The position. */
    Position position;
    
    /**
     * Sets the up.
     *
     * @throws Exception the exception
     */
    @Before
    public void setUp() throws Exception {
    position = new Position(1,0);
    }


    /**
     * Test get X.
     */
    @Test
    public void testGetX() {
        int expected = 1;
        assertEquals(expected, position.getX());
    }

    /**
     * Test get Y.
     */
    @Test
    public void testGetY() {
        int expected = 0;
        assertEquals(expected, position.getY());
    }

    /**
     * Test set X.
     */
    @Test
    public void testSetX() {
        int expected = 8;
        position.setX(8);
        assertEquals(expected , position.getX());
    }

    /**
     * Test set Y.
     */
    @Test
    public void testSetY() {
        int expected = 9;
        position.setY(9);
        assertEquals(expected , position.getY());
    }

}