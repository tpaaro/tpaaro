package praktikum9;

public class AstmeArvutaja {

	public static void main(String[] args) {
		System.out.println(astenda(2, 4));

	}

	public static int astenda(int arv, int aste) {
		int x;
		if (aste == 0) {
			x = 1;
			return x;
		} else if (aste == 1) {
			x = arv;
			return x;
		} else {

			x = arv * astenda(arv, aste - 1);
			return x;
		}

	}

}
