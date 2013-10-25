package praktikum7;


public class KaheMootmelineMassiiv {
	// Kirjutada meetod, mis leiab ja tagastab ettantud kahemõõtmelise massiivi
	// maksimaalse elemendi.
	// Kirjuta kõigepealt meetod, mis leiab ühemõõtmelise massiivi maksimaalse
	// elemendi
	// ning kasuta siis seda meetodit teises:
	public static void main(String[] args) {
		int[][] mat = new int[][] {
				  { 1, 2, 3 },
				  { 4, 5, 6 },
				  { 7, 8, 9 }
				};
		System.out.println(maksimum(mat));
	}
	

	public static int maksimum(int[] massiiv) {
		int max = 0;
		for (int item : massiiv) {
			if (item > max){
			max = item;
		}
		}
		return max;
	}
		

	public static int maksimum(int[][] maatriks) {
	
						int max = 0;
				for (int[] item : maatriks) {
				if (maksimum(item) > max){
					max = maksimum( item);
				}
				}
				return max;
			
			}
			
		
	}

