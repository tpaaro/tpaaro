package harjutustund3;

import lib.TextIO;

public class sisestaPosArv {
	public static void main(String[] args) {
	double d = 0.;
	      do {
	         TextIO.put ("Sisesta positiivne arv ");
	         d = TextIO.getlnDouble();
	        
	      } while (d <= 0.);
	      
}

}