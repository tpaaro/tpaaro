package praktikum9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import lib.TextIO;

public class DiagrammAltUlesse {

	public static void main(String[] args) {

		printTulpVert(andmeteSisestus());
	}

	// / tulba suuruste sistamis meetod
	private static List<Integer> andmeteSisestus() {
		List<Integer> tulbad = new ArrayList<>();

		int tulpadeArv;
		do {
			tulpadeArv = TextIO.getlnInt();
			if (tulpadeArv > 0)
				tulbad.add(tulpadeArv);
		} while (tulpadeArv != 0);
		return tulbad;
	}

	// / teeb tulba suuruse alusel vastava summa *-nidest stringi nt 5= *****
	private static List<String> tulpadeMoodustamine(List<Integer> tulbad) {
		List<String> results = new ArrayList<>();
		for (int item : tulbad) {
			String result = "";
			for (int i = 0; i < Math.min(item, 80); i++)
				result += "*";

			results.add(result);
		}
		return results;
	}

	// / moodustab horisontaalsetest stringidest veritkaalsed
	private static void printTulpVert(List<Integer> tulbad) {
		String kriipsud = "";
		String muutujateriba = "";
		List<String> results = tulpadeMoodustamine(tulbad);
		int max = Collections.max(tulbad);
		for (int j = Math.min(max, 80); j >= 0; j--) {
			String v = "";
			for (String s : results) {
				if (j <= s.length() - 1)
					v += s.charAt(j) + " \t";
				else
					v += "\t";
			}
			System.out.println(v);
		}

		for (int o : tulbad) {
			kriipsud += "------";
			muutujateriba += o + " \t";
		}
		System.out.println(kriipsud);
		System.out.println(muutujateriba);
	}
}