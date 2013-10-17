package praktikum5;
import lib.TextIO;
public class nVahemikus1099 {

public static void main(String[] args) {
	boolean t = vahemik(56);
	if (t){
		System.out.println("On vahemikus.");
	}else{
		System.out.println("V'ljapool vahemikku.");
	}
}
public static boolean vahemik(int n){
if ( n >=10 && n<=99){
	return true;
	}
return false;
}
}