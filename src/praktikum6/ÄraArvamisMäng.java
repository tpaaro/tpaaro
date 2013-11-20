package praktikum6;

import lib.TextIO;

public class ÄraArvamisMäng {

	static int mängeVõidetud;
	static int kokku;

	public static void main(String[] args) {
		mängeVõidetud = 0;
		kokku = 0;
		TextIO.putln("Mängime veidi. Ma valin suvalise arvu");
		TextIO.putln("1-st 100-ni ning sina siis proovid ära arvata.");
		TextIO.putln("Arvesta, et sul on ära arvamiseks vaid 6 võimalust.");
		boolean mängiUuesti;
		do {
			Mäng(); // call subroutine to play one game
			TextIO.put("Kas soovid veel mängida? Jah (1)/Ei (0)");
			mängiUuesti = TextIO.getlnBoolean();
			kokku++;

		} while (mängiUuesti);

		TextIO.putln();
		TextIO.putln("Sa võitsid " + mängeVõidetud + " mängu " + kokku + "-st.");
		TextIO.putln("Tänan mängimast. Järgmise korrani!");
	} // end of main()

	static void Mäng() {

		int arvuti = SuvaKlass.suvalineArv(1, 100);
		int arva = 0;
		while (true) {
			TextIO.put("Paku üks number (1-100): ");
			int kasutajaArv = kasutajaSisestus.kasutaja(1, 100);
			arva++;
			if (arvuti == kasutajaArv) {
				System.out.println("Ära arvasid! Said " + arva
						+ " korraga hakkama! ");
				mängeVõidetud++;

				break;
			}
			if (arva == 6) {

				System.out
						.println("Arvamisvõimalused said otsa. Õige number oli "
								+ arvuti);

				break;
			} else {
				if (6 - arva == 1) {
					System.out
							.println("Pakutud arv on liiga väike. Sul on 1 võimalus veel");

				} else {

					if (arvuti > kasutajaArv) {
						System.out
								.println("Pakutud arv on liiga väike. Sul on "
										+ (6 - arva) + " võimalust veel");

					} else {
						System.out.println("Pakutud arv on liiga suur. Sul on "
								+ (6 - arva) + " võimalust veel");
					}

				}

			}
		}
	}
}
