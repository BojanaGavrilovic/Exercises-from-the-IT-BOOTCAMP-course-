package primerTesta;

public class Domaci2512Zadatak4 {

	public static void main(String[] args) {
		
	 int [] nizBrojeva = {10,10,10,10,10};
	
	 System.out.println("Aritmeticka sredina niza je:" + aritmetickaSredina(nizBrojeva));
	}

	public static double aritmetickaSredina (int [] nizBrojeva) {
		int suma =0;
		double aS = 0;
		
		for (int i = 0; i < nizBrojeva.length; i++) {
			suma = suma + nizBrojeva [i];
			 aS = suma/nizBrojeva.length;
			
		}
		return aS;
	}
}


//Napisati funkciju koja racuna aritmeticku sredinu niza