package praktikum9;

public class MaatriksiSuuremElement {

	public static void main(String[] args) {
		int[] massiiv = { 1, 3, 6, 7, 8, 3, 5, 7, 21, 3 };
		
		int[][] neo = { { 1, 3, 6, 7 }, 
						{ 2, 3, 3, 1 }, 
						{ 17, 4, 5, 0 },
						{ -20, 13, 16, 22 } 
					  };

		System.out.println("Massiivi suurim element on " + maksimum(massiiv));
		System.out.println("Maatriksi maksimaalne element on " + maximum(neo));
	}

	public static int maksimum(int[] massiiv) {
		int max = 0;
		for (int item : massiiv) {
			if (item > max) {
				max = item;
			}
		}
		return max;
	}

	public static int maximum(int[][] maatriks) {

		int max = 0;
		for (int[] item : maatriks) {
			if (maksimum(item) > max) {
				max = maksimum(item);
			}
		}
		return max;
	}

}
