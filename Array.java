package niz;

import java.util.Scanner;

public class Domaci2112Zadatak2 {

	public static void main(String[] args) {
		
		
		Scanner sken = new Scanner (System.in);
		
		int niz=0;
		
		System.out.println("Unesite velicinu niza:");
		niz = sken.nextInt();
		int [] a = new int [niz];
		
		 	System.out.println("Unesi niz");
			 for (int i = 0; i <= a.length; i++) {
				a [i] = sken.nextInt();
				
				if(a [i] > a[i++]) {
					System.out.println("Niz nije rastuci");
				}
				
				else if(a [i] < a[i++]);{
					System.out.println("Niz je rastuci");
				}			
				
}
				
	}
}









/* 2.	Napisati program koji proverava da li je napisan niz rastuci.
Primer1 niza: 3 54 123 18
Ispis: Niz nije rastuci.
Primer2 niza: 71 422 1001 5054
Ispis: Niz je rastuci
*/