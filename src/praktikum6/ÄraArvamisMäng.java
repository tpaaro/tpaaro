package praktikum6;

public class �raArvamisM�ng {
	


		public static void main(String[] args) {
			while (true) {
				
				int arvuti = SuvaKlass.suvalineArv(1, 100);
				
				System.out
						.println("Sisesta �ks arv (1 - 100) ja n�ed, kas suudad �ra arvata.");
				while (true) {
					
					int kasutajaArv = kasutajaSisestus.kasutaja(1, 100);
					if (arvuti == kasutajaArv) {
						System.out.println("�ra arvasid!");
						break;
					} else {

						if (arvuti > kasutajaArv) {
							System.out.println("Pakutud arv on liiga v�ike. Proovi veel.");
						} else {
							System.out.println("Pakutud arv on liiga suur. Proovi veel.");
						}
					}

				}

			}
		}
	}

