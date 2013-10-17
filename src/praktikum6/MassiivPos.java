package praktikum6;

import lib.TextIO;

public class MassiivPos {

	public static void main(String[] args) {
		int[] arvud = new int[] { 4, 5, 6, -7, -8, -9, 10 };
		int i = 0;
		for (i = 0; i < arvud.length; i++) {
			if (arvud[i] > 0) {
				System.out.println(arvud[i]);
			}
		}

	}
}
