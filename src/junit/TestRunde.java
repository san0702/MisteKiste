package junit;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import java.time.format.TextStyle;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import misteKiste.Runde;
import misteKiste.Wuerfel;

public class TestRunde {
	
	
	@Test
	public void test5zu1(){
		Runde r1 = new Runde();
		Wuerfel w1 = new Wuerfel(6, 5);
		Wuerfel w2 = new Wuerfel(6, 5);
		Wuerfel w3 = new Wuerfel(6, 4);
		
		assertEquals(1, r1.zweiFuenfzuEins(w1, w2).getWert());
		assertNull(r1.zweiFuenfzuEins(w1, w3));
		
		
		
	}
	
	@Test
	public void testPunkteAuswerten(){
		Runde r1 = new Runde();
		Wuerfel w1 = new Wuerfel(6, 3);
		Wuerfel w2 = new Wuerfel(6, 3);
		Wuerfel w3  = new Wuerfel(6, 3);
		Wuerfel w4 = new Wuerfel(6, 4);
		Wuerfel w5 = new Wuerfel(6, 1);
		
		List<Wuerfel> testListe = new ArrayList<>();
		testListe.add(w5);
		testListe.add(w4);
		testListe.add(w3);
		testListe.add(w1);
		testListe.add(w2);
		
//		r1.punkteAuswerten(testListe);
		
		assertEquals(1, r1.punkteAuswerten(testListe).size());
	}

}
