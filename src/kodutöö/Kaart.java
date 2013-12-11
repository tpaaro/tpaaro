package kodutöö;

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
	 * Kaardi numbri väärtused, kus Äss: 1, Poiss-Kuningas: 11 - 13
	 */
	private int kaardiNr;
	ArrayList<String> kaardiVd = new ArrayList<String>();

	/**
	 * Kaardi konstruktor
	 * 
	 * @param mast	kaardi mast
	 * @param nr	kaardi number
	 */
	public Kaart(Mast mast, int nr) {
		
		this.minuMast = mast;
		
		if(nr >= 1 && nr <=13){
			this.kaardiNr = nr;
		}else{
			System.err.println(nr + " pole sobiv kaardinumber.");
			System.exit(1);
		}
		this.kaardiNr = nr;
		kaardiVd.addAll(Arrays.asList("Kaks", "Kolm", "Neli", "Viis", "Kuus",
				"Seitse", "Kaheksa", "Üheksa", "Kümme", "Poiss", "Emand",
				"Kuningas", "Äss"));
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
	public String Stringiks() {

		return  minuMast.toString() + " " + kaardiVd.get(kaardiNr);

	}

}
