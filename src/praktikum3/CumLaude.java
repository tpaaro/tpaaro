package praktikum3;

import lib.TextIO;

public class CumLaude {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TextIO.putln("Palun sisestage keskmine hinne.");
		double keskmineHinne = TextIO.getlnDouble();
		TextIO.putln("Palun sisestage lõputöö hinne.");
		double lõputööHinne = TextIO.getlnDouble();
	
		if (keskmineHinne < 0 || keskmineHinne > 5)	{
		System.out.println("Vigane sisestus!");
		return;
	}
	
		boolean tingimus;
		tingimus = lõputööHinne == 5;
		tingimus = !tingimus;
		
		if (keskmineHinne > 4.5 && lõputööHinne == 5) {
		System.out.println("Saad Cum Laude!");											//tühikäsk = semikoolon; if lause lõpus ei käi semikoolonit
		} else {
		System.out.println("Ei saa Cum Laudet!");
	
		}
		
	}

}
