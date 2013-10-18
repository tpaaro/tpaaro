package praktikum7;

import java.util.Arrays;

public class Massiiv2 {
	public static void main(String[] args) {
		int [] m = new int[10];
		int i;
		
		for(i = 0; i < m.length; i = i + 1) {
			m[i] = (int)(Math.random() * 100);
		}
		
		Arrays.sort(m);
		
		for(i = 0; i < m.length; i = i + 1) {
			System.out.println(m[i]);
		}
	}
}
