package praktikum12;

import org.apache.commons.lang3.ArrayUtils;

import java.util.Arrays;

public class MassiiviElementideVäljaPrintimine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] neo = { { 1, 1, 1, 1, 1 }, 
						{ 2, 3, 4, 5, 6 },
						{ 3, 4, 5, 6, 7 }, 
						{ 4, 5, 6, 7, 8 }, 
						{ 5, 6, 7, 8, 9 }, 
					  };
		int[] uus = { 2, 3, 4, 5, 6 };
		tryki(uus);
		tryki(neo);
			}

	public static void tryki(int[] massiiv) {
		for (int i = 0; i < massiiv.length; i++) {
			System.out.print(massiiv[i] + " ");
		}
	
	System.out.println(" ");
	
	}
	
	private static void tryki(int[][] maatriks) {
		for (int[] a: maatriks) {
			tryki(a);
		};
	}

}