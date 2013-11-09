package praktikum10;

import lib.TextIO;

public class Fibonacci {

	public static int fib(int n) {
		if (n <= 1) return n;
		else return fib (n-1) + fib(n-2);
		 }
	
	public static void main(String[] args) {
		while(true){
		System.out.println("Mitmendat Fibonacci arvu soovite teada? Sisestage jrk number.");
			int i = TextIO.getlnInt()-1;
			 System.out.println(i + 1 + ". Fibonacci arv on: " + fib(i));
		}

	}

}
