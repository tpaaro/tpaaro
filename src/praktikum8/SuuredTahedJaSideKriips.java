package praktikum8;

import lib.TextIO;

public class SuuredTahedJaSideKriips {

	public static void main(String[] args) {
		TextIO.putln("Sisesta sona: ");
		String sona = TextIO.getln();
		for (int i = 0; i < sona.length(); i++) {

			System.out.print(sona.toUpperCase().charAt(i));
			if (i < sona.length() - 1)
				System.out.print(" - ");
		}

	}
}
