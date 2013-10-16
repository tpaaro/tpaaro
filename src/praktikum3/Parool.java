package praktikum3;

import lib.TextIO;

public class Parool {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	TextIO.putln("Sisestage parool.");
	int parool = TextIO.getlnInt();
	
	if ( parool == 1234 ) {
		System.out.println("Parool aktsepteeritud!");
	}else{
		System.out.println("Vale parool!");
	}
	

	
	
	}

}
