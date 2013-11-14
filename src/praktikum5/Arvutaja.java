package praktikum5;
import lib.TextIO;
public class Arvutaja {

	public static void liida(int a, int b) {
		System.out.println(a + " ja " + b + " summa on " + (a + b));
	}
	
	public static double korruta(double a, double b) {
		double korrutis = a * b;
		return korrutis;
	}
	
	public static String korruta(String sone, int arv) {
		String tulemus = "";
		for (int i = 0; i < arv; i++) {
			tulemus += sone;
		}
		return tulemus;
	}
	
	public static void main(String[] args) {
		
		liida(4, 5);
		
		System.out.println("Korrutamise tulemus on " + korruta(4 , 5));
		
		
		String sadaXi = korruta("X", 20);
		
		System.out.println(sadaXi);
	}
}
