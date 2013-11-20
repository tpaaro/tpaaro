package praktikum6;

import lib.TextIO;

public class �raArvamisM�ng {

	static int m�ngeV�idetud;
	static int kokku;

	public static void main(String[] args) {
		m�ngeV�idetud = 0;
		kokku = 0;
		TextIO.putln("M�ngime veidi. Ma valin suvalise arvu");
		TextIO.putln("1-st 100-ni ning sina siis proovid �ra arvata.");
		TextIO.putln("Arvesta, et sul on �ra arvamiseks vaid 6 v�imalust.");
		boolean m�ngiUuesti;
		do {
			M�ng(); // call subroutine to play one game
			TextIO.put("Kas soovid veel m�ngida? Jah (1)/Ei (0)");
			m�ngiUuesti = TextIO.getlnBoolean();
			kokku++;

		} while (m�ngiUuesti);

		TextIO.putln();
		TextIO.putln("Sa v�itsid " + m�ngeV�idetud + " m�ngu " + kokku + "-st.");
		TextIO.putln("T�nan m�ngimast. J�rgmise korrani!");
	} // end of main()

	static void M�ng() {

		int arvuti = SuvaKlass.suvalineArv(1, 100);
		int arva = 0;
		while (true) {
			TextIO.put("Paku �ks number (1-100): ");
			int kasutajaArv = kasutajaSisestus.kasutaja(1, 100);
			arva++;
			if (arvuti == kasutajaArv) {
				System.out.println("�ra arvasid! Said " + arva
						+ " korraga hakkama! ");
				m�ngeV�idetud++;

				break;
			}
			if (arva == 6) {

				System.out
						.println("Arvamisv�imalused said otsa. �ige number oli "
								+ arvuti);

				break;
			} else {
				if (6 - arva == 1) {
					System.out
							.println("Pakutud arv on liiga v�ike. Sul on 1 v�imalus veel");

				} else {

					if (arvuti > kasutajaArv) {
						System.out
								.println("Pakutud arv on liiga v�ike. Sul on "
										+ (6 - arva) + " v�imalust veel");

					} else {
						System.out.println("Pakutud arv on liiga suur. Sul on "
								+ (6 - arva) + " v�imalust veel");
					}

				}

			}
		}
	}
}
