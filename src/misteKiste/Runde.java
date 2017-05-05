package misteKiste;

import java.util.ArrayList;
import java.util.List;

/**
 * @author sandra & patrick kennt die spezielle möglichkeit zwei fünfen werden
 *         zu einer 1 die punkte für die dauer der Runde gibt die restlichen
 *         würfel ans spielfeld zurück
 */

public class Runde {

	private int punkte = 0;

	public Runde() {

	}

	/**
	 * 
	 * @param a
	 * @param b
	 * @return null, wenn die Würfel nicht zwei 5 sind
	 */
	public Wuerfel zweiFuenfzuEins(Wuerfel a, Wuerfel b) {
		if (a.getWert() == 5 && b.getWert() == 5) {
			return new Wuerfel(6, 1);
		}
		return null;
	}

	public List<Wuerfel> punkteAuswerten(List<Wuerfel> wuerfelListe) {
		List<Wuerfel> temp = dreiGleicheFuerPunkte(wuerfelListe);

		if (temp.size()>0) {
			punkte += temp.get(0).getWert()*100;
			
		}
		wuerfelListe.removeAll(temp);

		ArrayList temp2 = new ArrayList();
		for (Wuerfel w : wuerfelListe) {
			if (w.getWert() == 1) {
				punkte += w.getWert() * 100;
				temp2.add(w);
			} else if (w.getWert() == 5) {
				punkte += w.getWert() * 10;
				temp2.add(w);
			}
		}
		wuerfelListe.removeAll(temp2);

		return wuerfelListe;
	}

	private List<Wuerfel> dreiGleicheFuerPunkte(List<Wuerfel> l) {
		List<Wuerfel> temp = new ArrayList<Wuerfel>();
		for (int i = 6; i >= 1; i--) {
			zaehleZahlen(i, l);
			if (zaehleZahlen(i, l) >= 3) {
				for (Wuerfel w : l) {
					if (i == w.getWert() && temp.size() <= 3) {
						temp.add(w);
					}
				}
			}

		}

		return temp;

	}

	private int zaehleZahlen(int i, List<Wuerfel> eintraegeZaehler) {

		int zaehler = 0;
		for (Wuerfel w : eintraegeZaehler) {
			if (i == w.getWert()) {
				zaehler++;
			}

		}
		return zaehler;
	}
}
