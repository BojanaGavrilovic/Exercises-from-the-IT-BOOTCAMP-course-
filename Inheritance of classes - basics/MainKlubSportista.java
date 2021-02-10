package Domaci111;

public class MainKlubSportista {

	public static void main(String[] args) {
		
		Sportista spor1 = new Sportista("Oliver", "Strbac", 1988);
		spor1.printSportista();
	
		
		Klub klub1 = new Klub ("Biciklisticki klub Strazilovo","Sremski Karlovci",
				2002, spor1);
		
		//klub1.setNazivKluba("BS Crvena Zvezda");
		
		System.out.println("Podaci o klubu: " +  klub1.getNazivKluba()  + 
				", " + klub1.getSedisteKluba()  + ","  +  klub1.getGodinaOsnivanja());
		
	}

}


//Napisati glavni program, gde cete testirati kako ove klase funkcionisu.
//Deo za istrazivanje: Napisati metodu koja ce ispisati ceo objekat klase klub.