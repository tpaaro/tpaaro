package praktikum6;

import java.lang.StringBuffer;
import lib.TextIO;
public class Tagurpidi {

	public static void main(String[] args) {
		
TextIO.putln("Truki sisse soovitud sona.");
String sona = TextIO.getln();
char[] nimi = sona.toCharArray();//tükeldab sõna osadeks
StringBuffer buffa= new StringBuffer();//saab lisada märke juurde
for (int i = nimi.length-1; i>=0; i-- ){
	buffa.append(nimi[i]);
	
}
 
 System.out.println(buffa);
	}

}
