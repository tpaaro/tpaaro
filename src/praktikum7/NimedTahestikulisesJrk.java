package praktikum7;


import java.util.Arrays;
import lib.TextIO;

public class NimedTahestikulisesJrk {
	//Kirjutada programm, mis laseb kasutajal sisestada k�mme nime, sorteerib need 
	//t�hestikulisse j�rjekorda ja tr�kib v�lja.
	
	public static void main(String[] args) {
		TextIO.putln("Sisesta inimeste arv: ");
		int inimesteArv = TextIO.getlnInt();
		System.out.println("Sisesta " + inimesteArv + " nime: ");
		String [] nimed = new String [inimesteArv];
		for( int i = 0; i < nimed.length; i++){
		nimed[i] = TextIO.getlnString();

	}
		Arrays.sort(nimed);
System.out.println(Arrays.toString(nimed));
}
	}
