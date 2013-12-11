package praktikum13;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;

public class FailiKeskmine {
	public static ArrayList<Double>readNumbritena(
			ArrayList<String>read) {
		
		ArrayList<Double>numbrid = new ArrayList<Double>();
		for (String rida : read){
			try {
				double nr = Double.parseDouble(rida);
				numbrid.add(nr);
			} catch (NumberFormatException e) {
				System.out.println("See ei ole korrektne number: " + rida);
			}
		}
		return numbrid;
	}
		
	public static void main(String[] args) {
		ArrayList<String>failiSisu 
		= FailiLugeja.loeFail(FailiKeskmine.class, "numbrid.txt");
		
		ArrayList<Double> numbrid = readNumbritena(failiSisu);
		
		double summa = 0;
		for (double number : numbrid) {
			summa += number;
		}
		double keskmine = summa / numbrid.size();
		System.out.println("Aritmeetiline keskmine: " + keskmine);
	}

}
