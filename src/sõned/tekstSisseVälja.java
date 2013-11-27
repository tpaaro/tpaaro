package sõned;

import java.io.*;


public class tekstSisseVälja {
	public static void main(String[] args) {
	   try {
	         BufferedReader sisse = new BufferedReader
	                      (new InputStreamReader (System.in));
	         System.out.print ("Anna tekst: ");
	         String s = sisse.readLine(); // rida teksti ka"es
	         System.out.println ("Tippisid: " + s);
	      }
	      catch (IOException e) {
	         System.out.println ("S/V viga: " + e);
	      }
}

}