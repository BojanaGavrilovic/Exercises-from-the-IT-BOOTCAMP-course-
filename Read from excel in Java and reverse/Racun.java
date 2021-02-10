package Domaci19012021;

public class Racun {

	
	
	private int brojRacuna; //moze get dohvati, ne moze set postavi(Znaci ne moze da)
	
							//se menja broj racuna, ali moze da se vidi
	private double stanje;// moze get - moze da se menja stanje	

	
							public Racun(int brojRacuna, double stanje) {
								this.brojRacuna = brojRacuna;
								this.stanje = stanje;
							}


							public double getStanje() {
								return stanje;
							}


							public void setStanje(double stanje) {
								this.stanje = stanje;
							}


							public int  getBrojRacuna() {
								return brojRacuna;
							}
	
	

}
