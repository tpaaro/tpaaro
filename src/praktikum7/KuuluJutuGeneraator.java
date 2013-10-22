package praktikum7;

public class KuuluJutuGeneraator {
//	Kirjutada kuulujutugeneraator.
//	Kolm ühepikkust massiivi: Esimeses naisenimed, teises mehenimed, kolmandas tegusõnad.
//	Programm võtab igast massiivist ÜHE suvalise elemendi ja kombineerib nendest lause.
//	Vihje: Massivist suvalise elemendi valimiseks arvuta random number vahemikus 0 kuni massiivi pikkus (random * length).
	public static void main(String[] args) {
		String [] naised = new String [] {"Malle", "Aki", "Luule"};
		String [] mehed = new String [] {"Kalle", "Viktor", "Dima"}; 
		String [] tegusonad = new String []{"sõidutas", "ratsutas", "kabistas"};
	

	System.out.println(mehed[suva(mehed)] + " " + tegusonad[suva(tegusonad)]+ " " + naised[suva(naised)] + "t.");
	
	}
	
public static int suva (String []massiiv){
	int t = (int) (Math.random() * massiiv.length);
	
	 return t;
}

}
