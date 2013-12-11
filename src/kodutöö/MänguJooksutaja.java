package kodut��;

import java.util.Scanner;
public class M�nguJooksutaja {

	public static void main(String[] args) {
		
		//algv��rtustame
		Scanner sk�nner = new Scanner(System.in);
		Pakk pakk = new Pakk(1, true);
		
		//a�gv��rtustame m�ngija objektid
		M�ngija mina = new M�ngija("M�ngija, Tanel, ");
		M�ngija diiler = new M�ngija ("Diileri");
		
		mina.lisaKaart(pakk.jagaJ�rgKaart());
		diiler.lisaKaart(pakk.jagaJ�rgKaart());
		mina.lisaKaart(pakk.jagaJ�rgKaart());
		diiler.lisaKaart(pakk.jagaJ�rgKaart());
		
		
		//prindime algsed k�ed
		System.out.println("Kaardid on jagatud\n");
		mina.prindiK�si(true);
		diiler.prindiK�si(false);
		System.out.println("\n");
		
		//n�itame, kas osalejad on l�petanud kaartide lisamise
		boolean minaL�p = false;
		boolean diilerL�p = false;
		String vastus;
		
		while(!minaL�p || !diilerL�p){
			
			// m�ngija kord
			if (!minaL�p){
				System.out.print(" Lisada v�i J��da(Sisesta L v�i J ): ");
				vastus = sk�nner.next();
				System.out.println();
				
				//kui m�ngija otsustab lisada
				if(vastus.compareToIgnoreCase("L")==0){
					
					//lisame j�rgmise kaardi pakist ning kontrollime ega m�ngija l�hki ole l�inud
					minaL�p = !mina.lisaKaart(pakk.jagaJ�rgKaart());
					mina.prindiK�si(true);
				}else{
					minaL�p = true;
					
				}
			}
			
			//diileri kord
			if(!diilerL�p){
				if(diiler.k�eSumma()<17) {
					System.out.println("Diiler lisab\n");
					diilerL�p = !diiler.lisaKaart(pakk.jagaJ�rgKaart());
					diiler.prindiK�si(false);
			}else{
				System.out.println("Diiler l�petab lisamise\n");
				diilerL�p = true;
			}
			
		}
			System.out.println();
		}
			
	// l�petame sk�nneri t��
	sk�nner.close();

	// prindime l�plikud k�ed
	mina.prindiK�si(true);
	diiler.prindiK�si(true);
	
	int minuSum = mina.k�eSumma();
	int diilerSum = diiler.k�eSumma();
	System.out.println("M�ngija summa:" + minuSum);
	System.out.println("Diileri summa:" + diilerSum);
	if (minuSum > diilerSum && minuSum <= 21 || diilerSum > 21){
		System.out.println("Sinu v�it! :)");
	}else{
		System.out.println("Diileri v�it! :(");
		
		
	}
	
	}

}
