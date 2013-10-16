package praktikum5;
import lib.TextIO;
public class KullKiri {

	public static void main(String[] args) {
		int suva;
		while (true){
		TextIO.putln("Kull(0) v6i kiri(1)?");
		int arv = TextIO.getlnInt();
if ( (int) arv > 1 || (int) arv < 0){
			System.out.println("Vale sisend, proovi uuesti.");
			continue;
		}
		// Genereerime random numbri, 0 kuni 1
		suva = (int)(Math.random() * 2);
		
		if( suva == arv ) {
			System.out.println("Ära arvasid!");
		}
		else {
			System.out.println("Ehh... kahjuks õnn seekord ei naeratanud.");
		
		}
	
		
		}
	}
}
