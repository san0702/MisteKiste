package misteKiste;

/**
 * @author sandra & patrick kennt die spezielle m�glichkeit zwei f�nfen werden
 *         zu einer 1 die punkte f�r die dauer der Runde gibt die restlichen
 *         w�rfel ans spielfeld zur�ck
 */

public class Runde {

	private int punkte = 0;

	/**
	 * 
	 * @param a
	 * @param b
	 * @return null, wenn die W�rfel nicht zwei 5 sind
	 */
	public Wuerfel zweiFuenfzuEins(Wuerfel a, Wuerfel b) {
		if (a.getWert() == 5 && b.getWert() == 5) {
			return new Wuerfel(6, 1);
		}
		return null;
	}

}
