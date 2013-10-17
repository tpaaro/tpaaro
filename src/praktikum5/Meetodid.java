package praktikum5;
import lib.TextIO;
public class Meetodid {



// 1. Ćlesanne
//	public static int kuup(int a) { // signatuur, p2is
//		// Sisu, keha
//		// a ja b v22rtused on alati m22ratud
//
//		// TextIO.putln();
//		//Math.pow(a, 3) // a astmes 3
//		return a*a*a;
//}
//
//	// Muutuja kehtib vaid antud bloki sees
//
//	public static void main(String[] args) {
//		int arv = 3;
//		System.out.println("Arv ja selle kuup - " + arv + " ja " +  kuup(arv));

// 2. Ülesanne

	public static void main(String[] args) {

		kasutajaSisestus(1, 10);
		System.out.println("Arv jääb vahemikku");
	}
public static int kasutajaSisestus(int min, int max) {
		while (true) {
		TextIO.putln(" Sisesta arv vahemikus " + min + " kuni " + max + ".");
		int sisestus = TextIO.getlnInt();
		if (sisestus >= min && sisestus <= max) {
			return sisestus;
		}
			TextIO.putln(" Vigane sisestus");
		}
	}

}
	
	