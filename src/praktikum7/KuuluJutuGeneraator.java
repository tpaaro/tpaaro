package praktikum7;

public class KuuluJutuGeneraator {
//	Kirjutada kuulujutugeneraator.
//	Kolm �hepikkust massiivi: Esimeses naisenimed, teises mehenimed, kolmandas tegus�nad.
//	Programm v�tab igast massiivist �HE suvalise elemendi ja kombineerib nendest lause.
//	Vihje: Massivist suvalise elemendi valimiseks arvuta random number vahemikus 0 kuni massiivi pikkus (random * length).
	public static void main(String[] args) {
		String [] naised = new String [] {"Malle", "Lelle", "Mari"};
		String [] mehed = new String [] {"Kalle", "Viktor", "Dima"}; 
		String [] tegusonad = new String []{"soidutas", "ratsutas", "kabistas"};
	
	for (int i = 0; i < 6; i++)
	System.out.println(mehed[suva(mehed)] + " " + tegusonad[suva(tegusonad)]+ " " + naised[suva(naised)] + "t.");
	
	}
	
public static int suva (String []massiiv){
	int t = (int) (Math.random() * massiiv.length);
	
	 return t;
}

}
