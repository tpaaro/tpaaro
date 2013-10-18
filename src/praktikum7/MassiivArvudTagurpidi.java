package praktikum7;


import lib.TextIO;
public class MassiivArvudTagurpidi {

	public static void main(String[] args) {
		int [] arvud = new int [10];
		for( int i = 0; i < arvud.length; i++){
		arvud[i] = TextIO.getlnInt();
		}
		for ( int t = arvud.length-1; t >= 0; t--){
			System.out.println(arvud[t]);
		}
		}

	}
		
			


