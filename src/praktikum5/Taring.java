package praktikum5;
public class Taring {
	public static void main(String[] args) {
		int arvuti;
		
		arvuti = (int)(Math.random() * 6 + 1);
		
		System.out.println("Arvutil tuli number " + arvuti);
		int tanel;
		tanel = (int)(Math.random()*6+1);
		System.out.println("Tanelil tuli number "+ tanel);
		if ( (int)arvuti> (int)tanel){
			System.out.println("Arvuti v6itis! Sina kaotasid! Hale!");
		}
			else if ( (int)arvuti == (int) tanel){
				System.out.println("Viik! Veereta uuesti!");
			}
		else {
				System.out.println("Tanel v6itis! Wohooo!");
			}
		}
	}
