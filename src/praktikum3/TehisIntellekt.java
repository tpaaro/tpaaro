package praktikum3;

import lib.TextIO;

public class TehisIntellekt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TextIO.putln("Palun sisestage kaks vanust.");
		int vanus1 = TextIO.getlnInt();
	    int vanus2 = TextIO.getlnInt();
		
		int vanusteVahe = Math.abs(vanus1 - vanus2);
		if (vanusteVahe < 5) {
			System.out.println("Sobib!");
		} else if (vanusteVahe < 10) {
		System.out.println("Muna!");
		} else { 
		System.out.println("Peekon!");
		}
		}
	

}
