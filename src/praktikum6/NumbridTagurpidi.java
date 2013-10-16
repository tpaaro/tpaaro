package praktikum6;

public class NumbridTagurpidi {

	public static void main(String[] args) {
		int [] numbrid = new int [] {4, 3, 1, 7, 1};
		//int[] numbrid = new int [5];
		//for( int i = 0; i < numbrid.length; i++){
			//System.out.println("Sisesta number indeksiga: " + i);
			//numbrid [i] = TextIO.getlnInt();
	//}
for (int i = numbrid.length-1; i >=0 ; i--){
	System.out.print(numbrid[i] + " ");
}
}
}