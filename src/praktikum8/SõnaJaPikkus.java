package praktikum8;

import java.util.Arrays;

import lib.TextIO;

public class SõnaJaPikkus {

	public static void main(String[] args) {

		System.out.println("Sisesta 10 nime: ");
		String[] nimed = new String[10];
		for( int i = 0; i < nimed.length; i++){
			nimed[i] = TextIO.getlnString();
		}
		for ( int t = 0; t < nimed.length; t++){
		int nimePikkus = nimed[t].length();
		int temp = nimePikkus;	
		System.out.println( temp + " "+ nimed[t]);
	
	}
	
}
}
