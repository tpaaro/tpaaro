package praktikum4;

public class Blokk1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int tabeliSuurus = 7;
		int arv = 1;
		for (int i = 0; i < tabeliSuurus; i++) { // read
			for (int j = 0; j < tabeliSuurus; j++) { // veerud
				if (j == i) {
					arv = 1;
				} else {
					arv = 0;
				}
				System.out.print(arv + " ");

			}
			System.out.println();
		}
	}
}