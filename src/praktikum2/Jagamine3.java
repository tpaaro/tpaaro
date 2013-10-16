package praktikum2;

import lib.TextIO;

public class Jagamine3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TextIO.putln("Sisesta inimeste arv ja grupi suurus.");
		TextIO.putln("Inimeste arv: ");
		int inimestearv = TextIO.getlnInt();
		TextIO.putln("Grupisuurus: ");
		int grupiSuurus = TextIO.getlnInt();
		
		int mituGruppi = inimestearv / grupiSuurus;
		System.out.println("Gruppide arv: " + mituGruppi);
		int j22k = inimestearv % grupiSuurus;
		System.out.println("‹lej‰‰nud inimeste arv: " + j22k);
	}

}
