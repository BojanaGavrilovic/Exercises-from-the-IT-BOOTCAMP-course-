package Funkcije;

import java.util.Scanner;

public class Domaci2212Zadatak1 {
	

	public static void main (String[] args) {
		Scanner sken = new Scanner (System.in); 
		
		
		double a;
		double b;
		double r;
		double pi;
		double P;
		String figura;
		boolean izadji = false;
	
		
		do {
		System.out.println("Unesi naziv figure (Pravougaonik, Kvadrat,Krug ili Izadji (za kraj programa))");
		figura = sken.next();
		
		switch (figura)  {
		
			case "pravougaonik": {
					System.out.println("Unesi vrednost a");
					a = sken.nextDouble();
					System.out.println("Unesi vrednost b");
					b = sken.nextDouble();
					P = a*b;
					System.out.println("Povrsina zadate figure je:" + P);
					izadji=false;
					break;
				}
			
			case "kvadrat":{
				System.out.println("Unesi vrednost a");
				a = sken.nextDouble();
				P= a*a;
				System.out.println("Povrsina zadate figure je:" + P);
				izadji=false;
				break;
				
				}
			case "krug":{
				System.out.println("Unesi vrednost r");
				r = sken.nextDouble();	
				System.out.println("Unesi vrednost pi");
				pi = sken.nextDouble();
				P= r*r*pi;
				System.out.println("Povrsina zadate figure je:" + P);
				izadji=false;
			  break;
		}	

			case "izadji":{
				System.out.println("Program je zavrsen");
				izadji=true;
				break;
			}
	}
		
		
	
		System.out.println("Kraj programa");
 }		while (izadji=false);
}		
}		
 

			
		
		
	
		

	



/* 
 Kada je switch u pitanju, moguce je tzv 
 uporedjivanje iako je string pa samim tim i case u 
 okviru switch-a moze biti string a while moze uporediti 
 string ukoliko je to case nekog switch-a*/


//Napraviti kalkulator povrsina kvadrata, pravougaonika i kruga. 
//Povrsina se bira tako sto se unese kao tekst odgovarajuca figura. 
//Ukoliko se unese 'izadji', program treba da se zavrsi. 
//Program treba da se ponavlja dokle god se ne unese izadji.
