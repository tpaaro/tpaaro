package praktikum6;

import lib.TextIO;

public class ÄraArvamisMäng {

	public static void main(String[] args) {
		TextIO.putln("Mängime veidi, ma valin suvalise arvu");
	      TextIO.putln("1-st 100-ni, ja sina proovid ära arvata.");
	      TextIO.put("Paku üks number: ");
	      boolean mängiUuesti;
	      do {
	        Mäng();  // call subroutine to play one game
	         TextIO.put("Kas soovid veel mängida? Jah (Y)/Ei (N)");
	         mängiUuesti = TextIO.getlnBoolean();
	         TextIO.put("Paku üks number: ");
	      } while (mängiUuesti);
	      TextIO.putln("Tänan mängimast. Järgmise korrani!.");
	   } // end of main()            
		
	static void Mäng() {
	
		int arvuti = SuvaKlass.suvalineArv(1, 100);
		int arva = 0;
		while (true) {

			int kasutajaArv = kasutajaSisestus.kasutaja(1, 100);
			arva ++;
			if (arvuti == kasutajaArv) {
				System.out.println("Ära arvasid! Said " + arva + " korraga hakkama! ");
				break;
			}
			if (arva == 6) {
			System.out.println("Arvamisvõimalused said otsa. Õige number oli "+ arvuti);
				break;
			} else {
				if (arvuti > kasutajaArv) {
					System.out
							.println("Pakutud arv on liiga väike. Sul on " + (6-arva) + " võimalust veel");
				} else {
					System.out
							.println("Pakutud arv on liiga suur. Sul on " + (6-arva) + " võimalust veel");
				}

			}
		}
	}

}
