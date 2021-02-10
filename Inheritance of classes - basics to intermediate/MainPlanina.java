package testKlaseI;

public class MainPlanina {

	public static void main(String[] args) {
		
		Planina P1 = new Planina("Tara", "Srbija", 2000);
		
Planinar RP1 = new RekreativniPlaninar(123456789, "Petar", "Petrovic", 2, "Sremski", 2000);
Planinar RP2 = new RekreativniPlaninar(12345678,"Jovan", "Jovanovic", 3, "Raski",5000);
Planinar RP3 = new RekreativniPlaninar(1234567899, "Djordje", "Djordjevic", 1, "Zicki", 1000);
	
Planinar A1 = new Alpinista(12456789, "Bojan", "Bojanic", 15);
Planinar A2 = new Alpinista(12345678, "Saska", "Bojanic", 5);
Planinar A3 = new Alpinista(1234567, "Milana", "Milanovic", 10);

Planinar [] nizPLaninara = new Planinar [6];
 	
 	nizPLaninara [0] = RP1;
 	nizPLaninara [1] = RP2;
 	nizPLaninara [2] = RP3;
 	nizPLaninara [3] = A1;
	nizPLaninara [4] = A2;
	nizPLaninara [5] = A3;
	
	int zbirClanarina = 0;
	
	for (int i = 0; i < nizPLaninara.length; i++) {
		nizPLaninara [i].stampaj();
		System.out.println("Da li ce se planinar popeti na planinu: " + nizPLaninara [i].uspesanUspon(P1));
		System.out.println("-------------------------------");
		
		zbirClanarina = zbirClanarina + nizPLaninara [i].clanarinaPlaninara();
		
		
		
	}
	
	System.out.println("Zbir clanarina planinara: " + zbirClanarina);
	
	
	
	
	}

}



/*(20 poena) Kreirati glavnu klasu I u njoj: 
•	instancirati jednu planinu
•	napraviti niz koji ce sadrzati tri rekrativna planinara I tri alpiniste
•	ispisati podatke o svim planinarima I za svakog od planinara 
ispisati da li ce se popeti na instanciranu planinu
•	ispisati kolika je zbir svih clanarina planinara iz niza */
