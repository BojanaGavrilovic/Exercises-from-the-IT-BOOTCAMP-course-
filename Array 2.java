package Vezbanje;

import java.util.Arrays;

public class Domaci2412Zadatak2 {

	public static void main(String[] args) {
		
		int [] prviNiz = {1,2,3,4};
		int [] drugiNiz = {1,2};
		boolean jesteNije=true;
		
		System.out.println("Prvi niz je: ");
		for (int i = 0; i < prviNiz.length; i++) {
			System.out.println(prviNiz[i]);
		}
		
		System.out.println("Drugi niz je: ");
		for (int i = 0; i < drugiNiz.length; i++) {
			System.out.println(prviNiz[i]);
		}
		
		System.out.println("Suma prvog niza je:" + sumaPrvogNiza(prviNiz));
		System.out.println("Suma drugog niza je:" + sumaDrugogNiza(drugiNiz));
		System.out.println("Da li je, veci niz, i posle oduzimanja sume manjeg niza, i dalje veci:" + daLiJeManjiIliNije(prviNiz, drugiNiz, jesteNije));
	}

	public static int sumaPrvogNiza (int [] prviNiz) {
			int sumaJedan = 0;
			 for (int i = 0; i < prviNiz.length; i++) {
				sumaJedan+= prviNiz[i];	
				} return sumaJedan;
	}		
	
	public static int sumaDrugogNiza (int [] drugiNiz) {
		int sumaDva=0;
		for (int i = 0; i < drugiNiz.length; i++) {	
			sumaDva+= drugiNiz[i];	
		}	 return sumaDva; 
	}	
	public static boolean daLiJeManjiIliNije (int [] prviNiz,int [] drugiNiz, boolean jesteNije) {
		int sumaJedan = 0;
		 for (int i = 0; i < prviNiz.length; i++) {
			sumaJedan+= prviNiz[i];	
		 }
			int sumaDva=0;
			for (int i = 0; i < drugiNiz.length; i++) {	
				sumaDva+= drugiNiz[i];
			}
			
		int sumaTri = sumaJedan-sumaDva;
		
		if (sumaTri>sumaDva) {	
		}return true;
		
		else (sumaTri<sumaDva){
		}return false;
				
}

}

/*2) Napisati funkciju koja vraca sumu dva niza, zatim od niza sa vecom 
 sumom oduzme sumu drugog niza i vrati da li je veci niz i dalje veci
Primer:
Ako se unese prvi niz 1,2,3 (suma je 6) i drugi niz 10,20,30 (suma 60) onda 60 - 6 = drugi niz je i dalje veci, vraca true.
 
 */
 