package praktikum7;

import java.util.ArrayList;
import java.util.Arrays;

import lib.TextIO;
//Kirjutada programm, mis laseb kasutajal sisestada senikaua nimesid, kui kasutaja sisestab nime asemel tühja rea. 
//Seejärel trükkida nimed ekraanile tähestikulises järjekorras. 
//Vihje: selle ülesande kasutamiseks kasuta ArrayList klassi.
public class NimedTuhikTahestik {

	
		
		public static void main(String[] args) {
			
			String [] nimed = new String [10];
			for( int i = 0; i < nimed.length; i++){
			nimed[i] = TextIO.getlnString();

		}
			Arrays.sort(nimed);
	System.out.println(Arrays.toString(nimed));
	}
		}

	