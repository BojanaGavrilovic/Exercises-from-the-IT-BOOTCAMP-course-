package Domaci111;

public class Sportista {

	private String Ime;
	private String Prezime;
	private int godinaRodjenja;
	
	public Sportista(String ime, String prezime, int godinaRodjenja) {
		super();
		Ime = ime;
		Prezime = prezime;
		this.godinaRodjenja = godinaRodjenja;
	}

	public String getIme() {
		return Ime;
	}

	public String getPrezime() {
		return Prezime;
	}

	public int getGodinaRodjenja() {
		return godinaRodjenja;
	}
	
	
	public void printSportista () {
		System.out.println(this.Ime + " " +  this.Prezime + ":" + this.godinaRodjenja);
	}
	
}



/* 
 1.	Sportista poseduje ime, prezime i godinu rodjenja. 
 Ime, prezime i godina rodjenja se zadaju prilikom kreiranja i ne mogu da se promene. 
 Sportistu ispisati u obliku: IME_PREZIME: godinaRodjenja */
 