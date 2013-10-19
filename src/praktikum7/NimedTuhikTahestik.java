package praktikum7;

import java.util.ArrayList;

import lib.TextIO;
//Kirjutada programm, mis laseb kasutajal sisestada senikaua nimesid, kui kasutaja sisestab nime asemel tühja rea. 
//Seejärel trükkida nimed ekraanile tähestikulises järjekorras. 
//Vihje: selle ülesande kasutamiseks kasuta ArrayList klassi.
public class NimedTuhikTahestik {

	public static void main(String[] args) {
		
		ArrayList<String> nimed = new ArrayList<String>();
		nimed.add("Mati");
		for (String nimi : nimed) {
		    System.out.println(nimi);
		}
	}

}
