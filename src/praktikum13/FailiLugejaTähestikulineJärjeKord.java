package praktikum13;

import java.util.List;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;

public class FailiLugejaT‰hestikulineJ‰rjeKord {
	public static void main(String[] args) {

		// punkt t√§histab jooksvat kataloogi
		String kataloogitee = FailiLugejaT‰hestikulineJ‰rjeKord.class.getResource(".").getPath();

		// otsime samast kataloogist kala.txt-nimelist faili
		File file = new File(kataloogitee + "kala.txt");

		try {
			// avame faili lugemise jaoks
			BufferedReader in = new BufferedReader(new FileReader(file));
			String rida;
			List<String> s6nad = new ArrayList<>();
			// loeme failist rida haaval
			while ((rida = in.readLine()) != null) {
				// System.out.println(rida);
				s6nad.add(rida);
				Collections.sort(s6nad);

			}
			for (String item : s6nad) {
				System.out.println(item);
			}

		} catch (FileNotFoundException e) {
			System.out.println("Faili ei leitud: \n" + e.getMessage());
		} catch (Exception e) {
			System.out
					.println("Error, jee, mingi muu error: " + e.getMessage());
		}
	}
}
