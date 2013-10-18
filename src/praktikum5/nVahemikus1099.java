package praktikum5;
import lib.TextIO;
public class nVahemikus1099 {

public static void main(String[] args) {
	boolean t = vahemik(3);
	if (t){
		System.out.println("On vahemikus.");
	}else{
		System.out.println("Väljaspool vahemikku.");
	}
}
public static boolean vahemik(int n){
if ( n >=10 && n<=99){
	return true;
	}
return false;
}
}