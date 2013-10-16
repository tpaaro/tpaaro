package praktikum4;

public class TaneliFoxTaring {
	public static void main(String[] args) {

		String fox[] = { " /\\           ", "(~(           ",
				" ) )     /\\_/\\", "( _-----_(@ @)", "  (       \\ / ",
				"  /|/--\\|\\ V  ", "  \" \"   \" \"   "

		};

		String taring[][] = {
				{ "+-------+", "|       |", "|   *   |", "|       |",
						"+-------+" },
				{ "+-------+", "|       |", "| *   * |", "|       |",
						"+-------+" },
				{ "+-------+", "| *     |", "|   *   |", "|     * |",
						"+-------+" },
				{ "+-------+", "| *   * |", "|       |", "| *   * |",
						"+-------+" },
				{ "+-------+", "| *   * |", "|   *   |", "| *   * |",
						"+-------+" },
				{ "+-------+", "| *   * |", "| *   * |", "| *   * |",
						"+-------+" } };

		int t1 = (int) (Math.random() * taring.length);
		int t2 = (int) (Math.random() * taring.length);

		for (int i = 0; i < fox.length; i++) {

			System.out.print(fox[i]);
			if (i < taring[t1].length)
				System.out.print(taring[t1][i]);
			else
				System.out.print("        ");
			if (i < taring[t2].length)
				System.out.print(taring[t2][i]);
			else
				System.out.print("          ");
			System.out.print(Fox.turnFoxHorizontally(fox[i]));
			System.out.println();
		}
	}

}

