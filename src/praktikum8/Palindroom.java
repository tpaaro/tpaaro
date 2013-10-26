package praktikum8;



import lib.TextIO;

public class Palindroom {

	
	public static void main(String[] args) {
	    
	  TextIO.putln("Sisesta s6na: ");
	    String s6na = TextIO.getln();
	    StringBuilder drow = new StringBuilder(s6na);
	    drow.reverse();
	    System.out.println(drow);
	    System.out.print(" ");
	    String X = drow.toString();
	    if (s6na.equals( " ") || s6na.equals("\t") || s6na.length() <= 1){
	    	System.out.println("Tegemist on tühjusega v6i üksiku t2hega.");
	    }
	    else if (s6na.equalsIgnoreCase(X)) {
	        System.out.println("Tegemist ON palindroomiga!"); 
	     
	} else {
	System.out.println("Tegemist EI OLE palindroomiga!");
	}
	}
	}