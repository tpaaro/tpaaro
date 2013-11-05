package praktikum9;

import java.util.ArrayList;
import java.util.List;

import lib.TextIO;

//Kirjutada tekstireþiimis tulpdiagrammi joonistav programm.

//Küsida kasutajalt järjest numbreid seni, kuni kasutaja sisestab nulli. Negatiivseid arve 
//mitte lubada. Trükkida ekraanile x tähtedest koosnev tulpdiagramm, 
//kus x-e on täpselt sama palju kui oli numbreid.

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


	
	
	
