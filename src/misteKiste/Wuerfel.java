package misteKiste;

import java.util.Random;

public class Wuerfel {
	
	private int wert = 0;
	private int seitenZahl = 6;
	
	public Wuerfel(int dieSeitenZahl){
		seitenZahl = dieSeitenZahl;
	}
	
	public int wuerfeln(){
		Random rand = new Random();
		wert = 1 + rand.nextInt(seitenZahl);
		return wert;
	}
	
	public int getSeitenZahl(){
		return seitenZahl;
	}
	
	public int getWert(){
		return wert;
	}

}
