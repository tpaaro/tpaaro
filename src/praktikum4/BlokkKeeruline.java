package praktikum4;

import lib.TextIO;

public class BlokkKeeruline {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TextIO.putln("Palun sisestage tabelisuurus:");
		int tabeliSuurus = TextIO.getlnInt();
		
		String t2ht;
		
		int arv = (int) Math.round(tabeliSuurus * 1.4);
		for (int i = 0; i < arv; i++) {
			System.out.print("--");
			if (i == arv - 1) {
				System.out.println("");

			}
		}

		for (int i = 0; i < tabeliSuurus; i++) { // read
			System.out.print(" | ");
			for (int j = 0; j < tabeliSuurus; j++) {// veerud

				if ((i == j)/* esimene diagonaal */
						|| (i + j == tabeliSuurus - 1)) {// teine diagonaal
					t2ht = "x";
				} else {
					t2ht = "0";
				}

				System.out.print(t2ht + " "); // mitte println
				if (j == tabeliSuurus - 1) {
					System.out.print("| ");
				}
			}
			System.out.println();// reavahetus

		}
		for (int i = 0; i < arv; i++) {
			System.out.print("--");
			if (i == arv - 1) {
				System.out.println("");
			}

		}
	}
}