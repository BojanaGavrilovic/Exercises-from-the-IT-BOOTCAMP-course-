package Domaci111;

	public class Klub {
		private String nazivKluba;
		private String sedisteKluba;
		public String getNazivKluba() {
			return nazivKluba;
		}

		public void setNazivKluba(String nazivKluba) {
			this.nazivKluba = nazivKluba;
		}

		public String getSedisteKluba() {
			return sedisteKluba;
		}

		public int getGodinaOsnivanja() {
			return godinaOsnivanja;
		}

		public Sportista getSportista() {
			return sportista;
		}

		private int godinaOsnivanja;
		private Sportista sportista;
		
		public Klub(String nazivKluba, String sedisteKluba, int godinaOsnivanja, Sportista sportista) {
			super();
			this.nazivKluba = nazivKluba;
			this.sedisteKluba = sedisteKluba;
			this.godinaOsnivanja = godinaOsnivanja;
			this.sportista = sportista;
		}
		
		
}



/*
 Klub poseduje naziv, sediste (grad), godinu osnivanja i sportistu. 
 Sva polja mogu da se dohvate, a naziv kluba moze i da se postavi.
 */
 