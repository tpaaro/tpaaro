package praktikum4;

public class BlokkHyperSuper {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arv = 0;
int konn = 10 ;
	for ( int i = 0; i < konn; i++) {
	for ( int j = 0; j < konn; j++) {
		arv = j + i;
		if (arv >= konn)
			arv = arv - konn;
			
	
	System.out.print(arv + " ");
	}
	System.out.println(" ");
}

}
}


