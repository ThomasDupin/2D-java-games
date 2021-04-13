package entity;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

// TODO: Auto-generated Javadoc
/**
 * The Class ElementPositionTest.
 * 
 * @author Thibault, Timoté, Andréas, Thomas
 */
public class ElementPositionTest {
	
	/** The ep. */
	private ElementPosition EP;
	
	/**
	 * Sets the up.
	 *
	 * @throws Exception the exception
	 */
	@Before
	public void setUp() throws Exception {
		this.EP = new ElementPosition("d",0,0);
	}

	/**
	 * Test element position.
	 */
	@Test
	public void testElementPosition() {
		final String diminutifExpected = "x";
		final int xExpected = 18;
		final int yExpected = 20;
		ElementPosition EPConstTest = new ElementPosition("x",18,20);
		assertEquals(diminutifExpected, EPConstTest.getDiminutif());
		assertEquals(xExpected, EPConstTest.getX());
		assertEquals(yExpected, EPConstTest.getY());
	}

	/**
	 * Test get Y.
	 */
	@Test
	public void testGetY() {
		final int expected = 0;
		assertEquals(expected, EP.getY());
	}

	/**
	 * Test set Y.
	 */
	@Test
	public void testSetY() {
		final int expected = 25;
		EP.setY(25);
		assertEquals(expected, EP.getY());
	}

	/**
	 * Test get X.
	 */
	@Test
	public void testGetX() {
		final int expected = 0;
		assertEquals(expected, EP.getX());
	}

	/**
	 * Test set X.
	 */
	@Test
	public void testSetX() {
		final int expected = 20;
		EP.setX(20);
		assertEquals(expected, EP.getX());		
	}

	/**
	 * Test get diminutif.
	 */
	@Test
	public void testGetDiminutif() {
		final String expected = "d";
		assertEquals(expected , EP.getDiminutif());
	}

	/**
	 * Test set diminutif.
	 */
	@Test
	public void testSetDiminutif() {
		final String expected = "o";
		EP.setDiminutif("o");
		assertEquals(expected, EP.getDiminutif());
	}

}
