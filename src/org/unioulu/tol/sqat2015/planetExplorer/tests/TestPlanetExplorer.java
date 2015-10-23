package org.unioulu.tol.sqat2015.planetExplorer.tests;

import static org.junit.Assert.*;

import org.junit.Test;
import org.unioulu.tol.sqat2015.planetExplorer.PlanetExplorer;

public class TestPlanetExplorer {

	@Test
	public void testCreatingPlanetExplorerWith3x3GridNoCommandShouldReturn11N() {
		//arrange
		PlanetExplorer explorer;
		//act
		explorer = new PlanetExplorer(3,3,"");
		//assert
		assertEquals("(0,0,N)", explorer.executeCommand(""));
		
	}
	
	@Test
	public void testCreatingPlanetExplorerWith3x3GridCommandFShouldReturn10N() {
		//arrange
		PlanetExplorer explorer;
		//act
		explorer = new PlanetExplorer(3,3,"");
		//assert
		assertEquals("(0,1,N)", explorer.executeCommand("f"));
		
	}
	
	@Test
	public void testGivingExplorerCommandFFShouldReturn02N(){
		//arrange
		PlanetExplorer explorer;
		//act
		explorer = new PlanetExplorer(3,3,"");
		//assert
		assertEquals("(0,2,N)", explorer.executeCommand("ff"));
	}
	
	@Test
	public void testGivingExplorerCommandFFFShouldReturn00N(){
		//arrange
		PlanetExplorer explorer;
		//act
		explorer = new PlanetExplorer(3,3,"");
		//assert
		assertEquals("(0,0,N)", explorer.executeCommand("fff"));
	}
	
	@Test
	public void testGivingExplorerCommandFFRShouldReturn02E(){
		//arrange
		PlanetExplorer explorer;
		//act
		explorer = new PlanetExplorer(3,3,"");
		//assert
		assertEquals("(0,2,E)", explorer.executeCommand("ffr"));
	}
	
	@Test
	public void testGivingExplorerCommandFFRFShouldReturn12E(){
		//arrange
		PlanetExplorer explorer;
		//act
		explorer = new PlanetExplorer(3,3,"");
		//assert
		assertEquals("(1,2,E)", explorer.executeCommand("ffrf"));
	}
}
