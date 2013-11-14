package praktikum6;

import lib.TextIO;

public class �raArvamisM�ng {

	public static void main(String[] args) {
		TextIO.putln("M�ngime veidi, ma valin suvalise arvu");
	      TextIO.putln("1-st 100-ni, ja sina proovid �ra arvata.");
	      TextIO.put("Paku �ks number: ");
	      boolean m�ngiUuesti;
	      do {
	        M�ng();  // call subroutine to play one game
	         TextIO.put("Kas soovid veel m�ngida? Jah (Y)/Ei (N)");
	         m�ngiUuesti = TextIO.getlnBoolean();
	         TextIO.put("Paku �ks number: ");
	      } while (m�ngiUuesti);
	      TextIO.putln("T�nan m�ngimast. J�rgmise korrani!.");
	   } // end of main()            
		
	static void M�ng() {
	
		int arvuti = SuvaKlass.suvalineArv(1, 100);
		int arva = 0;
		while (true) {

			int kasutajaArv = kasutajaSisestus.kasutaja(1, 100);
			arva ++;
			if (arvuti == kasutajaArv) {
				System.out.println("�ra arvasid! Said " + arva + " korraga hakkama! ");
				break;
			}
			if (arva == 6) {
			System.out.println("Arvamisv�imalused said otsa. �ige number oli "+ arvuti);
				break;
			} else {
				if (arvuti > kasutajaArv) {
					System.out
							.println("Pakutud arv on liiga v�ike. Sul on " + (6-arva) + " v�imalust veel");
				} else {
					System.out
							.println("Pakutud arv on liiga suur. Sul on " + (6-arva) + " v�imalust veel");
				}

			}
		}
	}

}
