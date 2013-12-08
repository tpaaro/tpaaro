package praktikum12;

public class MassiiviElementideVäljaPrintimine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] neo = { { 1, 1, 1, 1, 1 }, { 2, 3, 4, 5, 6 },
				{ 3, 4, 5, 6, 7 }, { 4, 5, 6, 7, 8 }, { 5, 6, 7, 8, 9 }, };
		int[][] kamakaks = { { 1, 2 }, 
							 { 3, 4 }, 
							 { 5, 6 }

		};

		//tryki(kamakaks);
		//tryki(neo);
		// tryki(ridadeSummad(neo));
		// System.out.println(korvalDiagonaaliSumma(neo));
		// tryki(ridadeMaksimum(neo));
		// System.out.println(miinimum(neo));
		// tryki(kahegaJaakMaatriks(3,5)) ;
		//tryki(transponeeri(kamakaks));
	}

	public static void tryki(int[] massiiv) {
		for (int i = 0; i < massiiv.length; i++) {
			System.out.print(massiiv[i] + " ");
		}

		System.out.println(" ");

	}

	private static void tryki(int[][] maatriks) {
		for (int[] a : maatriks) {
			tryki(a);
		}
		;
	}

	public static int summa(int[] massiiv) {
		int sum = 0;
		for (int i = 0; i < massiiv.length; i++) {
			sum += massiiv[i];
		}
		return sum;
		// meetodi sisu siia
	}

	public static int[] ridadeSummad(int[][] maatriks) {

		int[] neu = new int[maatriks.length];
		int i = 0;
		for (int[] a : maatriks) {

			neu[i] = summa(a);
			i += 1;

		}
		;
		return neu;
	}

	public static int korvalDiagonaaliSumma(int[][] maatriks) {
		int sum = 0;
		int i;
		int j = 0;
		for (i = maatriks.length - 1; i >= 0; i = i - 1) {
			sum = sum + maatriks[j][i];
			j++;
		}
		return sum;
	}

	public static int[] ridadeMaksimum(int[][] maatriks) {

		int[] neu = new int[maatriks.length];
		int i = 0;
		for (int[] a : maatriks) {

			neu[i] = maksimum(a);
			i += 1;

		}
		;
		return neu;
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

	public static int miinimum(int[][] maatriks) {
		int i, j, min = maatriks[0][0];
		for (i = 0; i < maatriks.length; i = i + 1) {
			for (j = 0; j < maatriks[i].length; j = j + 1) {
				if (maatriks[i][j] < min) {
					min = maatriks[i][j];

				}

			}

		}
		return min;
	}

	public static int[][] kahegaJaakMaatriks(int ridu, int veerge) {
		int i, j;

		int[][] temp = new int[ridu][veerge];
		for (i = 0; i < temp.length; i = i + 1) {
			for (j = 0; j < temp[i].length; j = j + 1) {
				temp[i][j] = (i + j) % 2;
			}
		}
		return temp;
	}

	public static int[][] transponeeri(int[][] maatriks) {
		int i, j;
		int[][] neu = new int[maatriks[0].length][maatriks.length];
		for (i = 0; i < maatriks.length; i = i + 1) {
			for (j = 0; j < maatriks[i].length; j = j + 1) {
				neu[j][i] = maatriks[i][j];

			}
		}
		return neu;
	}
}
