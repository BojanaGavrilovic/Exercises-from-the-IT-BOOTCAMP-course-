package testKlaseI;

	public class Alpinista extends Planinar {
		
		private int brojOsvojenihPoena;

		public Alpinista(int jCIB, String imePlaninara, String prezimePlaninara, int brojOsvojenihPoena) {
			super(jCIB, imePlaninara, prezimePlaninara);
			this.brojOsvojenihPoena = brojOsvojenihPoena;
		}

		public int getBrojOsvojenihPoena() {
			return brojOsvojenihPoena;
		}

		public void setBrojOsvojenihPoena(int brojOsvojenihPoena) {
			this.brojOsvojenihPoena = brojOsvojenihPoena;
		}
		
		
		public boolean uspesanUspon (Planina java) {
			
			if (java.getVisinaPlanine() < 4000) {
				return true;
			}
			
			else {
				return false;
			}
		
		}
		
		public int clanarinaPlaninara () {
			return 1500 - (50 * brojOsvojenihPoena);
		}
		
		public void stampaj () {
			System.out.println("Alpinista, id: " + super.JCIB);
			System.out.println("Ime: " + super.imePlaninara + " "+  super.prezimePlaninara);
			System.out.println("Broj poena: " + this.brojOsvojenihPoena);
		}
}













/*(20 poena) Kreirati klasu Alpinista koja nasleđuje klasu Planinar. 
 * Klasa sadrži atribut koji pamti koliko poena je alpinista ostvario 
 * (celobrojna vrednost) i poeni se mogu menjati (znaci, postojace seter). 
 * Napraviti konstruktor. Alpinista može da savlada sve uspone do 4000 metara, 
 * placa clanarinu u iznosu od 1500 pritom za svaki poen ima popust od 50, a 
 * informacije o alpinisti se ispisuju u formatu: 
Alpinista, id: id
ime: ime i prezime 
Broj poena: poeni */
