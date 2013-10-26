package praktikum8;

import java.util.ArrayList;

import lib.TextIO;

public class Tervitaja {

	public static void main(String[] args) {
		ArrayList<Inimene> inimesed = new ArrayList<Inimene>();
		String x = "";
		do {
			TextIO.putln("Sisesta inimese nimi: ");
			String nimi = TextIO.getln();
			TextIO.putln("Sisesta vanus: ");
			int vanus = TextIO.getlnInt();
			Inimene inimene = new Inimene(nimi, vanus);
			inimesed.add(inimene);
			x = TextIO.getlnString();
		} while (x.equals(""));

		for (Inimene inimene : inimesed) {

			inimene.tervita();
		}
	}
}
