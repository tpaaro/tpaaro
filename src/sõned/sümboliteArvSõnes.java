package s�ned;

import lib.TextIO;

public class s�mboliteArvS�nes {

	public static void main(String[] args) {
		String s = TextIO.getln();
System.out.println(adeArv(s));
	}
	 public static int adeArv (String s) {
	      int result = 0;
	      if (s != null) {
	         for (int i=0; i<s.length(); i++) {
	            if (s.charAt (i) == 'a') result++;
	         }
	      }
	      return result;
	   } // adeArv
}
