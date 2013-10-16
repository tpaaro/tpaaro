package praktikum2;
import lib.TextIO;
public class Jagamine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TextIO.putln("Sisestahe kaks arvu: ");
		double a = TextIO.getlnDouble();
		System.out.println("1: " + a);
		double b = TextIO.getlnDouble();
		System.out.println("2: " + b);
		double c;
	
		c = a / b;
		System.out.println(a + " / " + b + " = " + c);
	}

}
