package praktikum6;

public class MassiividSummaKeskmine {

	public static int summa(int[] massiiv) {
		int t = 0;
		for (int i = 0; i < massiiv.length; i++) {
			t += massiiv[i];
		}
		return t;
		// meetodi sisu siia
	}

	public static void main(String[] args) {

		// sedasi saab meetodi välja kutsuda
		int [] massiiv = new int [] { 4, 3, 1, 7, 31, 27, 56, 3, 2 };
		int summa = summa(massiiv);
		int keskmine = summa / massiiv.length;
		System.out.println("Keskmine: " +keskmine);
		int i = 0;
		for (i = 0; i < massiiv.length; i++) {
			if (massiiv[i] < keskmine) {
				System.out.println(massiiv[i]);
			}

		}
	}
}