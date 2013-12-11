package blackjack;

import java.util.Scanner;

import lib.TextIO;

public class MänguJooksutaja {

	public static void main(String[] args) {

		// algväärtustame
		Scanner skänner = new Scanner(System.in);
		Pakk pakk = new Pakk(1, true);

		// aögväärtustame mängija objektid
		Mängija mina = new Mängija("Mängija, Tanel, ");
		Mängija diiler = new Mängija("Diileri");

		mina.lisaKaart(pakk.jagaJärgKaart());
		diiler.lisaKaart(pakk.jagaJärgKaart());
		mina.lisaKaart(pakk.jagaJärgKaart());
		diiler.lisaKaart(pakk.jagaJärgKaart());

		// prindime algsed käed
		System.out.println("Kaardid on jagatud\n");
		mina.prindiKäsi(true);
		diiler.prindiKäsi(false);
		System.out.println("\n");

		// näitame, kas osalejad on lõpetanud kaartide lisamise
		boolean minaLõp = false;
		boolean diilerLõp = false;
		String vastus;

		
		
	
			
			while (!minaLõp || !diilerLõp) {
				
			
				// mängija kord
				if (!minaLõp) {
					System.out.print("Hit või Stay(Sisesta H või S ): ");
					vastus = skänner.next();
					System.out.println();

					// kui mängija otsustab lisada
					if (vastus.compareToIgnoreCase("H") == 0) {

						// lisame järgmise kaardi pakist ning kontrollime ega
						// mängija lõhki ole läinud
						minaLõp = !mina.lisaKaart(pakk.jagaJärgKaart());
						mina.prindiKäsi(true);
					} else {
						minaLõp = true;

					}
				}

				// diileri kord
				if (!diilerLõp) {
					if (diiler.käeSumma() < 17) {
						System.out.println("Diiler lisab\n");
						diilerLõp = !diiler.lisaKaart(pakk.jagaJärgKaart());
						diiler.prindiKäsi(false);
					} else {
						System.out.println("Diiler lõpetab lisamise\n");
						diilerLõp = true;
					}

				}
				System.out.println();
			}

			// lõpetame skänneri töö
			skänner.close();

			// prindime lõplikud käed
			mina.prindiKäsi(true);
			diiler.prindiKäsi(true);

			int minuSum = mina.käeSumma();
			int diilerSum = diiler.käeSumma();

			System.out.println("Mängija summa:" + minuSum);
			System.out.println("Diileri summa:" + diilerSum);
			System.out.println();

			if (minuSum > diilerSum && minuSum <= 21 || diilerSum > 21) {
				System.out.println("Sinu võit! :)");
			
			} else {
				System.out.println("Diileri võit! :(");
				

			}


	}
}

