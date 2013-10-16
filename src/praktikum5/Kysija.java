package praktikum5;
import lib.TextIO;
public class Kysija {

	public static int kasutajaSisestus(int min, int max) {
		return kasutajaSisestus("Sisesta arv vahemikus " + min + " kuni " + max + ".", min, max);
	}

	public static int kasutajaSisestus(String kysimus, int min, int max) {
		// l6putu tsykkel
		while (true) {
			// trykime ekraanile kysimuse
			TextIO.putln(kysimus);
			
			// kysime kasutajalt sisestuse
			int sisestus = TextIO.getlnInt();
			
			// kui sisestus on sobilikus vahemikus, tagastame selle
			// return-k2sk tagastab v22rtuse ja l2heb yhtlasi ka meetodist v2lja
			if (sisestus >= min && sisestus <= max) {
				return sisestus;
			}
			TextIO.putln("Arv ei ole sobilikus vahemikus, sisesta uuesti.");
		}	
	}

	public static void main(String[] args) {
	
		int hinne = kasutajaSisestus("Sisesta hinne", 1, 5);
		
		if (hinne >= 3)
			TextIO.putln("T2iesti okei hinne ju.");
		else
			TextIO.putln("Ei ole just k6ige parem hinne.");
	}

}
