package praktikum4;

public class Fox {

	public static String turnFoxHorizontally(String foxline) {
		char[] line = foxline.toCharArray();
		String ret = "";

		for (int i = line.length - 1; i >= 0; i--) {
			char c;
			c = line[i];
			switch(c) {
				case '(' : c = ')';  break;
				case ')' : c = '(';  break;
				case '/' : c = '\\'; break;
				case '\\': c = '/';  break;
			}
			ret += c;
		}

		return ret;
	}

	public static String turnFoxVertically(String foxline) {
		char[] line = foxline.toCharArray();
		String ret = "";

		for (int i = 0; i < line.length; i++) {
			char c;
			c = line[i];
			switch(c) {
				case 'V' : c = 'A';  break;
				case '_' : c = '-';  break;
				case '/' : c = '\\'; break;
				case '\\': c = '/';  break;
			}
			ret += c;
		}

		return ret;
	}

	public static void main (String [] args) {
		 String fox[] = {
			" /\\           ",
			"(~(           ",
			" ) )     /\\_/\\",
			"( _-----_(@ @)",
			"  (       \\ / ",
			"  /|/--\\|\\ V  ",
			"  \" \"   \" \"   "
		};
		
		
		for (int i = 0; i < fox.length; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print(fox[i]);
				System.out.print(" ");
			}
			System.out.print(" ");
			System.out.print(turnFoxHorizontally(fox[i]));
			System.out.println();
		}
	}
}










