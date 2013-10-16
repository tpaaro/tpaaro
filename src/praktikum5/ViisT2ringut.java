package praktikum5;

public class ViisT2ringut {


	
	public static void main(String[] args) {
		int t2ringsum = 0;
	
		for (int i= 6;  i > 1 ; i-- ){
int suvakas = (int)(Math.random()*6+1);
System.out.println(suvakas);
t2ringsum += suvakas;

	}
		System.out.println("T2ringute summa on : " + t2ringsum);

}
}