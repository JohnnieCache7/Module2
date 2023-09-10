package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import model.Player;

/**
 * Jonathan Argueta-Herrera - jiarguetaherrera
 * CIS175 Fall 2023
 * Aug, 30
 */
public class TestPLayer2 {

	String p2 = "LambLight";
	int diamonds = 23;
	int xpLevels = 30;
	
	Player player = new Player(p2, diamonds, xpLevels);
	
	
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testPrintAll() {
		assertEquals(p2 + diamonds + xpLevels, player.printAll());
	}

}
