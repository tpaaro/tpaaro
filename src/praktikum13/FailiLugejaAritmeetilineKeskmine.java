package praktikum13;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;

public class FailiLugejaAritmeetilineKeskmine {
	public static void main(String[] args) {

		ArrayList<String> failiSisu = FailiLugeja.loeFail(
				FailiLugejaAritmeetilineKeskmine.class, "numbrid.txt");
		
		ArrayList<Double> numbrid = readNumbritena(failiSisu);
		
		double summa = 0;
		for (double number : numbrid) {
			summa += number;
		}
		double keskmine = summa / numbrid.size();
		System.out.println(keskmine);
	}

}
