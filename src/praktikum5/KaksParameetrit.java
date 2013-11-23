package praktikum5;
import lib.TextIO;
public class KaksParameetrit {
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
	
		public static void main(String[] args) {
	
			kasutajaSisestus(1, 100);
			System.out.println(" Arv j22b vahemikku");
}

}