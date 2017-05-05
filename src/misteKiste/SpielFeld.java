package misteKiste;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author sandra & Patrick macht das Spiel
 */

public class SpielFeld {

	private boolean spielLaueftNoch = false;
	private List<Spieler> spielerListe = new ArrayList<Spieler>();

	public SpielFeld() {

	}

	/**
	 * Gibt den Status des Spiels
	 * 
	 * @return true wenn Spiel aktiv ist, false wenn das Spiel noch nicht
	 *         gestartet oder beendet ist
	 */

	public boolean spielAktiv() {
		return spielLaueftNoch;
	}
/**
 * Vorbereitung, um das Spiel zu starten
 * @return true, wenn die Spielerliste nicht leer ist, false wenn es keine Spieler gibt
 */
	private boolean vorbereitet() {
		return !spielerListe.isEmpty();

	}

	/**
	 * Initialisiert den Spieler und startet das Spiel
	 */
	public void spielStarten() {
		if(vorbereitet()){
			spielLaueftNoch = true;	
		}
		

	}

	/**
	 * initialisiert Spieler. Ist notwendig
	 * um das Spiel zu starten
	 * 
	 * @param spielerListe
	 *            enthält die Spielernamen(String)
	 */

	public boolean initialisiereSpieler(List<String> spielerNamen) {
		if(spielerNamen != null){
			for(String temp : spielerNamen){
				Spieler s = new Spieler(temp);
				spielerListe.add(s);
			}
	return true;
		}else{
			log("Es exisitiert nur Null und keine Liste!Siehe: Spielfeld.initialisiereSpieler");
			return false;
		}
		
	}
	
	private void log(String info){
		System.err.println(info);
	}
	
	public void spielerWurf(List<Wuerfel>wuerfelBehalten){
		boolean einsOderFuenf = false;
		boolean dreiGleiche = false;
		for(Wuerfel w : wuerfelBehalten){
		if(w.getWert() == 5 || w.getWert() == 1){
			einsOderFuenf = true;
		}
		
		}
		dreiGleiche = dreiGleiche(wuerfelBehalten);
		if(einsOderFuenf || dreiGleiche){
			
		}
	}

	private boolean dreiGleiche(List<Wuerfel> wuerfelBehalten) {
		// TODO Auto-generated method stub
		return false;
	}
}
