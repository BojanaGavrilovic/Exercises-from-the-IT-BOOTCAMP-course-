package testKlaseI;

public abstract class Planinar {

	protected int JCIB;
	protected String imePlaninara;
	protected String prezimePlaninara;
	
	public Planinar(int jCIB, String imePlaninara, String prezimePlaninara) {
		JCIB = jCIB;
		this.imePlaninara = imePlaninara;
		this.prezimePlaninara = prezimePlaninara;
	}

	public int getJCIB() {
		return JCIB;
	}

	public String getImePlaninara() {
		return imePlaninara;
	}

	public String getPrezimePlaninara() {
		return prezimePlaninara;
	}
	
	
	public abstract void stampaj ();
	public abstract int clanarinaPlaninara ();
	public abstract boolean uspesanUspon (Planina java);
	
}




/*(20 poena) Kreirati apstraktnu klasu Planinar koja od zaštićenih atributa ima: 
●	jedinstveni celobrojni identifikacioni broj
●	ime i prezime 
Dok od javnih metoda: 
●	konstruktor koji postavlja sve atribute klase. 
●	gettere 
●	apstraktnu metodu štampaj
●	apstraktnu metodu koja vraca clanarinu planinara
●	apstraktnu metodu uspesanUspon koja vraća informaciju da li će se planinar upešno popeti na planinu. 
Metoda kao ulazni parametar prima objekat tipa Planina. */
