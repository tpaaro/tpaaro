package praktikum7;

public class PINnKood {

	public static void main(String[] args) {
		// Kirjutada programm, mis trükib ekraanile õppejõu (Mart Manguse) Visa
		// pangakaardi parooli. Muid tingimusi ei ole. Vihje: selle ülesande
		// lahenduse jaoks pole massiive tarvis kasutada.
int random = (int)( Math.random()*10000);
if (random < 1000){
	String nill = "0" + random;
	System.out.println(nill);
}else{
System.out.println(random);

	}
}
}