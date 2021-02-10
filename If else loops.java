package ifAlsePetlje;

import java.util.Scanner;

public class Domaci1412drugizadatak {

	public static void main(String[] args) {
	
		Scanner parnepar = new Scanner (System.in);
		
		
		
		int a;
		
		
		System.out.println("Unesi broj");
		a=parnepar.nextInt();
		

		if (a%2 == 0) {
			System.out.println("Broj je paran");
			a=a*5;
			System.out.println("Proizvod mnozenja je " + a);
		}
			
		
		else if (a/2 != 0 ) {
			System.out.println("Broj je neparan");
			a=a*6;
			System.out.println("Proizvod mnozenjna je " + a);
		}
		
		else {
			System.out.println("Paran broj je onaj koji je deljiv sa dva, a neparan je onaj koji nije deljiv sa dva");
		}
		System.out.println("Kraj programa");
	}
	

}


 //Napisati program koji ce proveravati da li je uneti broj parni ili neparni//