package praktikum13;


import java.awt.Color;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;

public class FailiLugeja {
	
	public static ArrayList<String> loeFail(
		Class kontektst, String failiNimi){
		
		ArrayList<String>failiRead = new ArrayList<String>();
	/*ArrayList<Pliiats> pliiatsid = new ArrayList<Pliiats>();
		/*Pliiats harilik;
		harilik = new Pliiats();
		harilik.j2medus = 4.567;
		harilik.v2rv = new Color (5, 5, 5);
		pliiats.add(harilik);
		*/
	    
	    // punkt tähistab jooksvat kataloogi
	    String kataloogitee = 
	    		kontektst.getResource(".").getPath();
	    
	    // otsime samast kataloogist kala.txt-nimelist faili
		File file = new File(kataloogitee + failiNimi);
		
		try {
		    // avame faili lugemise jaoks
			BufferedReader in = new BufferedReader(new FileReader(file));
			String rida;

			// loeme failist rida haaval
			while ((rida = in.readLine()) != null) {
				failiRead.add(rida);
			}
		}
		catch (FileNotFoundException e) {
		    System.out.println("Faili ei leitud: \n" + e.getMessage());
		}
		catch (Exception e) {
			System.out.println("Error, jee, mingi muu error: " + e.getMessage());
		}
		return failiRead;
	}
	
	public static void main(String[] args) {
		ArrayList<String>failiSisu = 
				loeFail(FailiLugeja.class, "kala.txt" );
		Collections.sort(failiSisu);
		for (String rida : failiSisu){
			System.out.println(rida);
		}
	}
}