package praktikum12;

public class Matrix {
	public static void main(String[] args) {
		int [][] neo = {
				{1, 1, 1, 1, 1},
				{2, 3, 4, 5, 6},
				{3, 4, 5, 6, 7},
				{4, 5, 6, 7, 8},
				{5, 6, 7, 8, 9},
		};
		
		int i, j;
		int sum = 0;
		
		// Trykime maatriksi va"lja
		for(i = 0; i < neo.length; i = i + 1) {
			for(j = 0; j < neo[i].length; j = j + 1) {
				System.out.print(neo[i][j] + " ");
			}
			System.out.println();
		}
		
		// Liidame kokku peadiagonaali elemendid
		for(i = 0; i < neo.length; i = i + 1) {
			sum = sum + neo[i][i];
		}
		System.out.println(sum);
		
		// Transponeerimine
		int [][] morpheus = new int[neo[0].length][neo.length];
		
		for(i = 0; i < neo.length; i = i + 1) {
			for(j = 0; j < neo[i].length; j = j + 1) {
				morpheus[j][i] = neo[i][j];
			}
		}
		
		// Trykime maatriksi va"lja
		for(i = 0; i < morpheus.length; i = i + 1) {
			for(j = 0; j < morpheus[i].length; j = j + 1) {
				System.out.print(morpheus[i][j] + " ");
			}
			System.out.println();
		}
	}
}
