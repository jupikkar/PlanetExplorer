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
		assertEquals("(1,1,N)", explorer.executeCommand(""));
		
	}
}
