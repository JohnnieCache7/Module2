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
public class TestPlayer1 {
	
	String p1 = "JohnnieCache";
	Player player = new Player(p1, 3, 19);
	

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testGamerTag() {
		assertNotNull(player.getGamerTag());
	}
	
	@Test
	public void testDiamonds() {
		assertEquals(player.getDiamonds(), 3);
	}
	
	@Test
	public void testXPLevels() {
		assertEquals(player.getXpLevels(), 19);
	}
	
	

}
