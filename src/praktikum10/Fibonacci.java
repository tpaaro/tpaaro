package praktikum10;

import lib.TextIO;

public class Fibonacci {

	public static long fib(int n) {
		if (n <= 1)
			return n;
		else
			return fib(n - 1) + fib(n - 2);
		}
	

	public static void main(String[] args) {
		
		    int n = 100;
			for( int t = 0; t < n; t++){
				//System.out
					//.println("Mitmendat Fibonacci arvu soovite teada? Sisestage jrk number.");
		
			//int i = TextIO.getlnInt() - 1;
			System.out.println(t + 1 + ". Fibonacci arv on: " + fib(t));
			}
			
			
		

	}
}
