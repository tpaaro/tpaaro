package praktikum4;

import lib.TextIO;

public class BlokkHyperSuper {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arv = 0;
int tabelisuurus = TextIO.getlnInt() ;
	for ( int i = 0; i < tabelisuurus; i++) {
	for ( int j = 0; j < tabelisuurus; j++) {
		arv = j + i;
		if (arv >= tabelisuurus)
			arv = arv - tabelisuurus;
			
	
	System.out.print(arv + " ");
	}
	System.out.println(" ");
}

}
}


