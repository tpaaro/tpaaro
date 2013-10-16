package praktikum6;
import lib.TextIO;
public class HeidaLiisku {

	
		public static void main(String[] args) {
	String[] nimed = new String [10];
	for( int i = 0; i < 10; i++){
		System.out.println("Sisesta nimi indeksiga: " + i);
		nimed [i] = TextIO.getlnString();
		//Massiivi nimed.
	}
	int suvalineIndeks = (int) (Math.random() * 10);
	System.out.println("Valisin suvalise nime indeksiga: " + suvalineIndeks);
	System.out.println("Ja see nimi on: " + nimed[suvalineIndeks]);
		}

	}
