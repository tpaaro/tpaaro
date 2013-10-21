package praktikum7;


import java.util.Collections;
import java.util.List;
import java.util.ArrayList;


import lib.TextIO;
//Kirjutada programm, mis laseb kasutajal sisestada senikaua nimesid, kui kasutaja sisestab nime asemel tühja rea. 
//Seejärel trükkida nimed ekraanile tähestikulises järjekorras. 
//Vihje: selle ülesande kasutamiseks kasuta ArrayList klassi.

public class NimedTuhikTahestik {

	public static void main(String[] args) {
    List<String> nimed = new ArrayList<>();
		 String nimi;
    do {
			TextIO.putln("Sisesta nimi");
			nimi = TextIO.getln();
			if (!nimi.equals(""))nimed.add(nimi);
		
		} while(!nimi.equals(""));
    

    Collections.sort(nimed);
    for (String item : nimed) {
        System.out.println(item);
       
    }
		
		}
		
    
   
		}

