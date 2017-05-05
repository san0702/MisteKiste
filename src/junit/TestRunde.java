package junit;
import static org.junit.Assert.*;
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

}
