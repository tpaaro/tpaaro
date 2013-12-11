package blackjack;

import java.util.ArrayList;
import java.util.Arrays;
/**
 * Kaarditüübi rakendamine
 */
public class Kaart {
	/**
	 * Kaardi jaoks võimalikud mastitüübid.
	 */
	private Mast minuMast;

	/**
	 * Kaardi numbri väärtused
	 */
	private int kaardiNr;
	ArrayList<String> kaardiVd = new ArrayList<String>();
	/**
	 * Kaardi konstruktor
	 * 
	 * @param mast
	 *            kaardi mast
	 * @param nr
	 *            kaardi number
	 */
	public Kaart(Mast mast, int nr) {

		this.minuMast = mast;

		if (nr >= 0  && nr <= 12) {
			this.kaardiNr = nr;
		} else {
			System.err.println(nr + " pole sobiv kaardinumber.");
			System.exit(1);
		}
		this.kaardiNr = nr;
		kaardiVd.addAll(Arrays.asList("Äss","Kaks", "Kolm", "Neli", "Viis", "Kuus",
				"Seitse", "Kaheksa", "Üheksa", "Kümme", "Poiss", "Emand",
				"Kuningas"));

	}

	/**
	 * Tagastab kaardi numbri.
	 * 
	 * @return number
	 */
	public int aruvtaNumber() {
		return kaardiNr;
	}

	/**
	 * Tagastab masti ja kaardinumbri
	 */
	public String toString() {
		
		
		/*
		String numStr = "Error";
		
		switch(this.kaardiNr){
		
		case 2:
			numStr = "Kaks";
			break;
		case 3:
			numStr = "Kolm";
			break;
		case 4:
			numStr = "Neli";
			break;
		case 5:
			numStr = "Viis";
			break;
		case 6:
			numStr = "Kuus";
			break;
		case 7:
			numStr = "Seitse";
			break;
		case 8:
			numStr = "Kaheksa";
			break;
		case 9:
			numStr = "Üheksa";
			break;
		case 10:
			numStr = "Kümme";
			break;
		case 11:
			numStr = "Poiss";
			break;
		case 12:
			numStr = "Emand";
			break;
		case 13:
			numStr = "Kuningas";
			break;
		case 1:
			numStr = "Äss";
			break;
		}
		*/
		
		return minuMast.toString() + " " + kaardiVd.get(kaardiNr);

	}

}
