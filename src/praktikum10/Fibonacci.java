package praktikum10;

public class Fibonacci {

	public static int fib(int n) {
		if (n <= 1) return n;
		else return fib (n-1) + fib(n-2);
		 }
	
	public static void main(String[] args) {
		 int N = 50;
		 for (int i = 0; i < N; i++)
			 System.out.println( i + ": " + fib(i));

	}

}
