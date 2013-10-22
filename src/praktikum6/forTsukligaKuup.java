package praktikum6;

public class forTsukligaKuup {
public static void main(String[] args) {
//int a = 5;
//int b = 3;
//int aKordaja = a;
//int bKordaja = b;
//	int i = 0;
//	int aste = 3 ;
//	for (i = 0; i < aste - 1; i++){
//		aKordaja= a*aKordaja;
//		bKordaja= b*bKordaja;
//		
//}
//	System.out.println(aKordaja + bKordaja);
//}
//}
int a = 5;
int b = 3;
int aste = 3;
double aKuup = Math.pow(a, aste);

double bKuup = Math.pow(b, aste);

double summa = aKuup + bKuup;
System.out.print(aKuup+ " + " + bKuup + " = " + summa);
}}