package praktikum6;
import lib.TextIO;
public class kasutajaSisestus {

		public static int kasutaja(int min, int max) {
			while (true) {
			
		int sisestus = TextIO.getlnInt();
			if (sisestus >= min && sisestus <= max) {
				return sisestus;
				
			}
				TextIO.putln("Vigane sisestus");
			}
		}

	}

