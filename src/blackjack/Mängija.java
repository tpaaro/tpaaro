package blackjack;

/**
 * Blakcjacki m�ngija rakendamine
 */
public class M�ngija {

	/**
	 * M�ngija nimi
	 */
	private String nimi;

	/**
	 * M�ngija k�es olevad kaardid, kuni 10 kaarti.
	 */
	int maxKaarte = 10;
	private Kaart[] k�si = new Kaart[maxKaarte];

	/**
	 * Kaartide arv m�ngija k�es
	 */
	private int nrKaarte;

	/**
	 * M�ngija konstruktor
	 * 
	 * @param nimi
	 *            m�ngija nimi
	 */
	public M�ngija(String nimi) {

		this.nimi = nimi;

		// muudab m�ngija k�e t�hjaks
		this.t�hiK�si();
	}

	/**
	 * Eemaldab kaardid m�ngija k�est
	 */
	public void t�hiK�si() {

		for (int k = 0; k < 10; k++) {
			this.k�si[k] = null;
		}
		this.nrKaarte = 0;
	}

	/**
	 * Lisab kaardi m�ngija k�tte
	 * 
	 * @param kaart
	 *            kaart, mis lisatakse
	 * @return otsustab, kas summa on <= 21
	 */
	public boolean lisaKaart(Kaart kaart) {

		// prinditakse error kui m�ngija k�es on maksimaalne arv kaarte
		if (this.nrKaarte == maxKaarte) {
			System.err.printf("%s maksimaalne arv kaarte on saavutatud. "
					+ "Ei saa enam kaarte juurde lisada.\n ", this.nimi);
			System.exit(1);
		}

		// lisame uue kaardi j�rgmisesse kohta ja suurendame kaartide arvu
		this.k�si[this.nrKaarte] = kaart;
		this.nrKaarte++;

		return (this.k�eSumma() <= 21);
	}

	/**
	 * M�ngija kaartide summa
	 * 
	 * @return summa
	 */
	public int k�eSumma() {

		int k�eSumma = 0;
		int kaardiNr;
		int nr�ssi = 0;

		// lisame iga kaardi v��rtuse k�e summasse
		for (int k = 0; k < this.nrKaarte; k++) {

			// hetkel oleva kaardi v��rtus
			kaardiNr = this.k�si[k].aruvtaNumber();

			if (kaardiNr == 0) { // �ss
				nr�ssi++;
				k�eSumma += 11;
			} else if (kaardiNr >= 10) { // Poiss, emand, kuningas
				k�eSumma += 10;
			} else {
				k�eSumma += kaardiNr + 1;
			}
		}
		// kui meil �ssad ja summa on > 21, muudame m�ne/k�igi �ssa(de)
		// v��rtused: �ss = 1
		while (k�eSumma > 21 && nr�ssi > 0) {
			k�eSumma -= 10;
			nr�ssi--;

		}
		return k�eSumma;
	}

	/**
	 * Prinditakse m�ngija kaardid
	 * 
	 * @param n�ita1stKaarti
	 *            otsustada, kas esimene kaart j�tta peidetuks v�i mitte
	 */
	public void prindiK�si(boolean n�ita1stKaarti) {

		System.out.printf("%s kaardid: \n", this.nimi);

		for (int k = 0; k < this.nrKaarte; k++) {
			if (k == 0 && !n�ita1stKaarti) {
				System.out.println("  [peidetud]");
			} else {
				System.out.printf("  %s\n", this.k�si[k].toString());

			}

		}
		System.out.println();
	}
}
