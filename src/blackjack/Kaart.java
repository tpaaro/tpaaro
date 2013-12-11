package blackjack;

import java.util.ArrayList;
import java.util.Arrays;
/**
 * Kaardit��bi rakendamine
 */
public class Kaart {
	/**
	 * Kaardi jaoks v�imalikud mastit��bid.
	 */
	private Mast minuMast;

	/**
	 * Kaardi numbri v��rtused
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
		kaardiVd.addAll(Arrays.asList("�ss","Kaks", "Kolm", "Neli", "Viis", "Kuus",
				"Seitse", "Kaheksa", "�heksa", "K�mme", "Poiss", "Emand",
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
			numStr = "�heksa";
			break;
		case 10:
			numStr = "K�mme";
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
			numStr = "�ss";
			break;
		}
		*/
		
		return minuMast.toString() + " " + kaardiVd.get(kaardiNr);

	}

}
