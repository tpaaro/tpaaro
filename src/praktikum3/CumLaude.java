package praktikum3;

import lib.TextIO;

public class CumLaude {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TextIO.putln("Palun sisestage keskmine hinne.");
		double keskmineHinne = TextIO.getlnDouble();
		TextIO.putln("Palun sisestage l�put�� hinne.");
		double l�put��Hinne = TextIO.getlnDouble();
	
		if (keskmineHinne < 0 || keskmineHinne > 5)	{
		System.out.println("Vigane sisestus!");
		return;
	}
	
		boolean tingimus;
		tingimus = l�put��Hinne == 5;
		tingimus = !tingimus;
		
		if (keskmineHinne > 4.5 && l�put��Hinne == 5) {
		System.out.println("Saad Cum Laude!");											//t�hik�sk = semikoolon; if lause l�pus ei k�i semikoolonit
		} else {
		System.out.println("Ei saa Cum Laudet!");
	
		}
		
	}

}
