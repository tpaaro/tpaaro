package praktikum9;

import java.util.ArrayList;
import java.util.List;

import lib.TextIO;

//Kirjutada tekstire�iimis tulpdiagrammi joonistav programm.

//K�sida kasutajalt j�rjest numbreid seni, kuni kasutaja sisestab nulli. Negatiivseid arve 
//mitte lubada. Tr�kkida ekraanile x t�htedest koosnev tulpdiagramm, 
//kus x-e on t�pselt sama palju kui oli numbreid.

public class TulpDiagramm {
	
	
 
	public static void main(String[] args) {
		List<Integer> tulbad = new ArrayList<>();
		TextIO.putln("Sisesta (ainult positiivseid) numbreid et koostada tulbad.");
		do{
	    int x = TextIO.getlnInt();
		tulbad.add(x);
		System.out.println(tulbad);
	
		}while(TextIO.getlnInt() != 0);
		
		

		}

}


	
	
	
