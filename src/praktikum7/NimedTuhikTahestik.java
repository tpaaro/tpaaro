package praktikum7;

import java.util.ArrayList;

import lib.TextIO;
//Kirjutada programm, mis laseb kasutajal sisestada senikaua nimesid, kui kasutaja sisestab nime asemel t�hja rea. 
//Seej�rel tr�kkida nimed ekraanile t�hestikulises j�rjekorras. 
//Vihje: selle �lesande kasutamiseks kasuta ArrayList klassi.
public class NimedTuhikTahestik {

	public static void main(String[] args) {
		
		ArrayList<String> nimed = new ArrayList<String>();
		nimed.add("Mati");
		for (String nimi : nimed) {
		    System.out.println(nimi);
		}
	}

}
