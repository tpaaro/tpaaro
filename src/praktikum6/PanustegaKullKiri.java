package praktikum6;

import lib.TextIO;

public class PanustegaKullKiri {

	public static void main(String[] args) {

		int krediit = 100;
		while (krediit > 0) {
			TextIO.putln("Asetage panus.");
			int panus = TextIO.getlnInt();

			panus = panus > krediit ? krediit : panus; // panus ei uleta krediiti
			if (panus>25)	{	 // panus ei uleta 25 piiri.								
					
				panus =  25; 
				System.out.println("Panus maarati 25ks") ;
				}
			TextIO.putln("Mille peale panustate - kull(0) voi kiri(1)?");
			int kullkiri = TextIO.getlnInt();
			do{
				
			
			if ((int) kullkiri > 1 || (int) kullkiri < 0) {
				System.out.println("Vale sisend, proovi uuesti.");
			kullkiri = TextIO.getlnInt();
			}} while ((int) kullkiri > 1 || (int) kullkiri < 0);

				int suva = (int) (Math.random() * 2);

				if (suva == kullkiri) {
					System.out.println("Ära arvasid!");
					krediit += panus;
					System.out.println(krediit);
				} else {
					System.out
							.println("Ehh... kahjuks õnn seekord ei naeratanud.");
					krediit -= panus;
					System.out.println(krediit);
				}
System.out.println("Kas soovid mangu jatkata? Jah(0) Ei (1)");
if (TextIO.getlnInt() == 1) {
	System.out.println("Kohtumiseni!");
	break;

}
			}

		}
	}
