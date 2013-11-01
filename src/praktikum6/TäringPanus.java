package praktikum6;

import lib.TextIO;

public class TäringPanus {

	public static void main(String[] args) {
		int krediit = 1000;
		while (krediit > 0) {
			TextIO.putln("Asetage panus 1 - " + krediit + ":");
			int panus = TextIO.getlnInt();

			// panus ei uleta krediiti
			if (panus > krediit) { // panus ei uleta 25 piiri.

				panus = krediit;
				System.out.println("Panuseks maarati " + panus);
			}
			TextIO.putln("Mitme silma peale panustate? (1 - 6)");
			int t2ring = TextIO.getlnInt();
			boolean oigsus = (int) t2ring > 6 || (int) t2ring < 0;
			do {

				if (oigsus) {
					System.out.println("Vale sisend, proovi uuesti.");
					t2ring = TextIO.getlnInt();
				}
			} while (oigsus);

			int suva = (int) (Math.random() * 6 + 1);

			if (suva == t2ring) {
				System.out.println("Ära arvasid! " + suva + " silma tuli.");
				krediit += panus * 5;
				System.out.println("Krediidi j22k: " + krediit);
			} else {
				System.out.println("Ehh... kahjuks õnn seekord ei naeratanud. "
						+ suva + " oli 6nnelik arv silmi.");
				krediit -= panus;
				System.out.println("Krediidi j22k: " + krediit);
			}
			if (krediit == 0) {
				System.out
						.println("Game Over, madafaka! Better luck next time");
				break;
			} else {
				System.out.println("Kas soovid mangu jatkata? Jah(0) Ei (1)");
				if (TextIO.getlnInt() == 1) {
					System.out.println("Kohtumiseni!");
					break;
				}

			}
		}

	}
}
