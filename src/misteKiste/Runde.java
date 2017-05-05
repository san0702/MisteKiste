package misteKiste;

/**
 * @author sandra & patrick kennt die spezielle möglichkeit zwei fünfen werden
 *         zu einer 1 die punkte für die dauer der Runde gibt die restlichen
 *         würfel ans spielfeld zurück
 */

public class Runde {

	private int punkte = 0;

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

}
