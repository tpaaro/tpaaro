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
		// int n = 100;
		// for( int t = 0; t < n; t++){
		System.out
				.println("Mitmendat Fibonacci arvu soovite teada? Sisestage jrk number.");

		while (true) {
			int i = TextIO.getlnInt();

			if (i < 1) {
				System.out.println("Vigane sisestus. Proovige uuesti.");

			} else if (i == 1) {
				System.out.println("1. Fibonacci arv on: " + 0);
				System.out.println("Kas soovid jätkata? Jah(Y) Ei (N)");
				if (TextIO.getlnBoolean() == false) {
					System.out.println("Kohtumiseni!");
					break;

				} else {
					System.out
							.println("Mitmendat Fibonacci arvu soovite teada? Sisestage jrk number.");

				}

			} else {

				System.out.println(i + ". Fibonacci arv on: " + fib(i-1));
				System.out.println("Kas soovid jätkata? Jah(Y) Ei (N)");
				if (TextIO.getlnBoolean() == false) {
					System.out.println("Kohtumiseni!");
					break;

				} else {
					System.out
							.println("Mitmendat Fibonacci arvu soovite teada? Sisestage jrk number.");

				}

			}
		}

	}

}
