package Vezbanje;

import java.util.Scanner;

public class Domaci18122020 {

	public static void main(String[] args) {
		
		Scanner horoskopskiZnak = new Scanner (System.in);
		
	int datum;
	int mesec;
	
		
		System.out.println("Unesi datum rodjenja:");
		datum = horoskopskiZnak.nextInt();
		
		System.out.println("Unesi mesec rodjenja:");
		mesec = horoskopskiZnak.nextInt();
		
		
		switch (mesec) {
		
		case 1: {
			if (datum <= 20) {
				System.out.println("Vas horoskopski znak je Jarac. ");
			}
			
			else if (datum >=21) {
				System.out.println("Vas horoskopski znak je Vodolija. ");
			}
			break;
		}
		
		case 2: {
			if (datum <= 19) {
				System.out.println("Vas horoskopski znak je Vodolija. ");
			}
			
			else if (datum >=20) {
				System.out.println("Vas horoskopski znak je Riba. ");
			}
			break;
		}
		
		
		case 3: {
			if (datum >= 21) {
				System.out.println("Vas horoskopski znak je Ovan. ");
			}
			
			else if (datum <=20) {
				System.out.println("Vas horoskopski znak je Riba. ");
			}
			break;
		}
		
		case 4: {
			if (datum <= 20) {
				System.out.println("Vas horoskopski znak je Ovan. ");
			}
			else  if (datum >= 21) {
				System.out.println("Vas horoskopski znak je Bik. ");
			}
			break;
		}
		
		case 5: {
			if (datum <= 21) {
				System.out.println("Vas horoskopski znak je Bik. ");
			}
			else  if (datum >= 22) {
				System.out.println("Vas horoskopski znak je Blizanci. ");
			}
			break;
		}
		
		
		case 6: {
			if (datum <= 21) {
				System.out.println("Vas horoskopski znak je Blizanci. ");
			}
			else  if (datum >= 22) {
				System.out.println("Vas horoskopski znak je Rak. ");
			}
			break;
		}
		
		case 7: {
			if (datum <= 22) {
				System.out.println("Vas horoskopski znak je Rak. ");
			}
			else  if (datum >= 23) {
				System.out.println("Vas horoskopski znak je Lav. ");
			}
			break;
		}
		
		case 8: {
			if (datum <= 22) {
				System.out.println("Vas horoskopski znak je Lav. ");
			}
			else  if (datum >= 23) {
				System.out.println("Vas horoskopski znak je Devica. ");
			}
			break;
		}
		
		case 9: {
			if (datum <= 22) {
				System.out.println("Vas horoskopski znak je Devica. ");
			}
			else  if (datum >= 23) {
				System.out.println("Vas horoskopski znak je Vaga. ");
			}
			break;
		}
		
		case 10: {
			if (datum <= 23) {
				System.out.println("Vas horoskopski znak je Vaga. ");
			}
			else  if (datum >= 24) {
				System.out.println("Vas horoskopski znak je Skorpija. ");
			}
			break;
		}
		
		case 11: {
			if (datum <= 22) {
				System.out.println("Vas horoskopski znak je Skorpija. ");
			}
			else  if (datum >= 23) {
				System.out.println("Vas horoskopski znak je Strelac. ");
			}
			break;
		}
		
		
		case 12: {
			if (datum <= 21) {
				System.out.println("Vas horoskopski znak je Strelac. ");
			}
			else  if (datum >= 22) {
				System.out.println("Vas horoskopski znak je Jarac. ");
			}
			break;
		}
		
		default:{
			System.out.println("Mesec ima 31 dan a godina ima 12 meseci");
		}
	}
		
	}

}




//1) Napisati program gde korisnik unese datum rodjenja i program vrati 
//koji je to horoskopski znak (istrazite dobro granicne vrednosti ovde)