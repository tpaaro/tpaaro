package harjutustund3;

public class massiivN {

	public static void main(String[] args) {
		tryki(massiiv(8));

	}
public static int[][] massiiv ( int n){
	int[][] m = new int [n][n];
	for( int i = 1; i < n; i++){
		for(int j = 1 ; j < n; j ++)	
		
		m[i][j] += i*j;
			
			
		
		
	}
	return m;
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
}
