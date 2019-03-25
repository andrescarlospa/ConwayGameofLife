package oclc.codekata.gameoflife;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestGameLife {

	@Test
	public void testUpdatedState() {
		
		BasicGame g = new BasicGame();
		
		g.loadSampleData();
		
		Character[][] expectedState = Util.loadStateData("resources/updated-state.txt");
		g.evolve();
		
		Character[][] updated = g.getData();
		
		assertEquals(g.getY(), expectedState.length);
		assertArrayEquals(expectedState, updated);
		assertEquals(g.getX(), expectedState[0].length);
	}
	
	@Test
	public void testSizeX() {
		
		BasicGame g = new BasicGame();
		
		g.loadSampleData();
		
		Character[][] expectedState = Util.loadStateData("resources/updated-state.txt");
		g.evolve();
		
		assertEquals(g.getX(), expectedState[0].length);
	}
	
	@Test
	public void testSizeY() {
		
		BasicGame g = new BasicGame();
		
		g.loadSampleData();
		
		Character[][] expectedState = Util.loadStateData("resources/updated-state.txt");
		g.evolve();

		assertEquals(g.getY(), expectedState.length);
	}
	
}
