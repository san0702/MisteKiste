package junit;

import static org.junit.Assert.*;

import org.junit.Test;

import misteKiste.SpielFeld;

public class TestSpiel {

	
	public TestSpiel() {
		// TODO Auto-generated constructor stub
	}
	
	@Test
	public void testInitialisiereSpieler(){
		
		SpielFeld s = new SpielFeld();
		assertFalse(s.initialisiereSpieler(null));
		
		//spiel ist nicht aktiv wenn keine spieler vorhanden sind
		s.spielStarten();
		assertFalse(s.spielAktiv());
		
	}
}
