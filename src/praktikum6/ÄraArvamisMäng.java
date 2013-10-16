package praktikum6;

public class ÄraArvamisMäng {
	


		public static void main(String[] args) {
			while (true) {
				
				int arvuti = SuvaKlass.suvalineArv(1, 100);
				
				System.out
						.println("Sisesta üks arv (1 - 100) ja näed, kas suudad ära arvata.");
				while (true) {
					
					int kasutajaArv = kasutajaSisestus.kasutaja(1, 100);
					if (arvuti == kasutajaArv) {
						System.out.println("Ära arvasid!");
						break;
					} else {

						if (arvuti > kasutajaArv) {
							System.out.println("Pakutud arv on liiga väike. Proovi veel.");
						} else {
							System.out.println("Pakutud arv on liiga suur. Proovi veel.");
						}
					}

				}

			}
		}
	}

