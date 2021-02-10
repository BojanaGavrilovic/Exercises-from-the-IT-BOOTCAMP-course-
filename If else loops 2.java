package ifAlsePetlje;

import java.util.Scanner;

public class Domaci1412prvizadatak {

	public static void main(String[] args) {
		
		Scanner stranicatrougao = new Scanner (System.in);
		
		int a;
		int b;
		int c;
		
		System.out.println("Unesi prvi broj");
		a = stranicatrougao.nextInt();
		
		System.out.println("Unesi drugi broj");
		b = stranicatrougao.nextInt();
		
		System.out.println("Unesi treci broj");
		c = stranicatrougao.nextInt();

		if (a==b && b==c) {
			System.out.println("Trougao je jednakostranicni");
		}
		
		else if (a==b && c!=a || a!=b && b==c || c==a && b!=a ) {
			System.out.println("Trougao je jednakokraki");
		}
		
			
		/*else if (a==b && c!=a) {
		System.out.println("Trougao je jednakokraki");
		}
		
		else if (a!=b && b==c) {
			System.out.println("Trougao je jednakokraki");
		}
		
		else if (c==a && b!=a) {
			System.out.println("Trougao je jednakokraki");
		}*/
	
		else if (a!=b && a!=c && b!=c) {
			System.out.println("Trougao je raznostranicni");
		}
		
		else {
			System.out.println("Kraj programa");
		}
	}

}


//	Napisati program koji ce traziti unos 3 broja sa tastature koji ce 
//predstavljati duzinu 3 stranice nekog trougla. 
//U zavisnosti od duzine stranice, ispisati da li je trougao jednakostranicni, 
//jednakokraki ili raznostranican trougao.