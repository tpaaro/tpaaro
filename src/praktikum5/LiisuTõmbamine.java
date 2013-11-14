package praktikum5;

import lib.TextIO;


public class LiisuTõmbamine {
	public static int randomArv(int max) {

		int temp = (int) (Math.random() * max + 1);

		return temp;
	}

	public static void main(String[] args) {
	
			TextIO.putln("Sisesta liisku t6mbavate inimeste arv:");
			int inimArv = TextIO.getlnInt();
			if (inimArv <= 0) {
				System.out.println("Error!");
			
			}
			int v6itja = randomArv(inimArv);
			System.out.println(v6itja);

		

	}

}
