package praktikum9;

import java.util.ArrayList;
import java.util.List;

import lib.TextIO;

//Kirjutada tekstire�iimis tulpdiagrammi joonistav programm.

//K�sida kasutajalt j�rjest numbreid seni, kuni kasutaja sisestab nulli. Negatiivseid arve 
//mitte lubada. Tr�kkida ekraanile x t�htedest koosnev tulpdiagramm, 
//kus x-e on t�pselt sama palju kui oli numbreid.

public class Diagramm {

	public static void main(String[] args) {
		List<Integer> tulbad = new ArrayList<>();
		int tulpadeArv;
		System.out
				.println("Sisesta diagrammi moodustamiseks andmed. Andmete sisestamise l�petamiseks sisesta 0. ");
		do {
			tulpadeArv = TextIO.getlnInt();
			if (tulpadeArv > 0)
				tulbad.add(tulpadeArv);
		} while (tulpadeArv != 0);
		for (int item : tulbad) {

			System.out.print(item + "\t" + " |");
			String result = "";
			for (int i = 0; i < Math.min(item, 80); i++)
				result += "x";
			System.out.println(result);

		}
	}

}