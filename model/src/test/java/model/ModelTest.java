package model;

import static org.junit.Assert.*;

import org.junit.Before;

import org.junit.Test;


// TODO: Auto-generated Javadoc
/**
 * The Class ModelTest.
 * 
 * @author Thibault, Timoté, Andréas, Thomas
 */
public class ModelTest {

    /** The nb diams. */
    int nbDiams;
    
    /** The model. */
    Model model;
    
    /**
     * Sets the up.
     *
     * @throws Exception the exception
     */
    @Before
    public void setUp() throws Exception {
    this.model = new Model();
    this.model.setNbDiams(10);
    }

    /**
     * Test get nb diams.
     */
    @Test
    public void testGetNbDiams() {
    int expected = 10;
    assertEquals(expected, model.getNbDiams());
    }

    /**
     * Test set nb diams.
     */
    @Test
    public void testSetNbDiams() {
        int expected = 9;
        model.setNbDiams(9);
        assertEquals(expected, model.getNbDiams());
    }

}