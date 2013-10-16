package harjutustund3;

public class Answer {

	public static void main(String[] param) {
		// YOUR TESTS HERE!
		double a = 3.;
		double b = 2.;
		double c = 3.;
		double x = 2.;
		double y = 4;
		System.out.println("a=" + a + "  b=" + b + "  c=" + c + "   x=" + x
				+ "  y=" + y + "   mahub = " + mahub(a, b, c, x, y));
	} // main

	public static boolean mahub(double a, double b, double c, double x, double y) {
		// TODO!!! YOUR CODE HERE!
		if (a <= x && b <= y || a <= y && b <= x) {
			return true;
		} else if (b <= x && c <= y || b <= y && c <= x) {
			return true;
		} else if (a <= x && c <= y || a <= y && c <= x) {
			return true;
		} else {
			return false;
		}
	} // mahub

} // Answer

