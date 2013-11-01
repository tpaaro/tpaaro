package praktikum7;

import java.util.Arrays;

public class Massiiv2 {
	public static void main(String[] args) {
		int [] m = new int[8];
		
		int i;
		for( i = 0; i < m.length; i ++) {
			m[i] = (int)(Math.random() * 1000);
		}
		
		Arrays.sort(m);
		
		for(i = 0; i < m.length; i ++) {
			System.out.println(m[i]);
		}
	}
}
