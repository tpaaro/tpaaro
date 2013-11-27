package sõned;

public class aKuniZ {
	public static void main(String[] args) {
		
		StringBuffer puhver = new StringBuffer();

		for (char c = 'a'; c <= 'z'; c++)
			puhver.append(c);

		String tulemus = puhver.toString();
		System.out.println(tulemus);

	}
}
