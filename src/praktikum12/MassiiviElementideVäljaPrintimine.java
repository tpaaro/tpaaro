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
		tryki (neo);
			}

	public static void tryki(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	
	System.out.println(" ");

	}

	public static void tryki(int[][] array) {
		int i, j;
		for(i = 0; i < array.length; i = i + 1) {
			for(j = 0; j < array[i].length; j = j + 1) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		
		}
	}
	}

