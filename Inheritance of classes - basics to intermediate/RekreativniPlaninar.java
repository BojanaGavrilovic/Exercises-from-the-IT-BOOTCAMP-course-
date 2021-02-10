package testKlaseI;

public class RekreativniPlaninar extends Planinar {

	private int tezinaOpreme;
	private String nazivOkruga;
	private int maksimalniUspon;
	
	public RekreativniPlaninar(int jCIB, String imePlaninara, String prezimePlaninara, int tezinaOpreme,
			String nazivOkruga, int maksimalniUspon) {
		super(jCIB, imePlaninara, prezimePlaninara);
		this.tezinaOpreme = tezinaOpreme;
		this.nazivOkruga = nazivOkruga;
		this.maksimalniUspon = maksimalniUspon;
	}

	public int getTezinaOpreme() {
		return tezinaOpreme;
	}

	public String getNazivOkruga() {
		return nazivOkruga;
	}

	public int getMaksimalniUspon() {
		return maksimalniUspon;
	}
	
	public boolean uspesanUspon (Planina java) {
		
		this.maksimalniUspon = this.maksimalniUspon - (this.tezinaOpreme*50);
		
		if(this.maksimalniUspon < java.getVisinaPlanine()) {
				return true;
		}
		
		else {
			return false;
		}
	}
	
	public int clanarinaPlaninara () {
		return 1000;
	}
	
	public void stampaj () {
		System.out.println("Rekreativac, id " + super.JCIB );
		System.out.println("Ime i prezime: " + super.imePlaninara +" " + super.prezimePlaninara);
		System.out.println("Okrug: " + this.nazivOkruga);
	}
	
}






/*(20 poena) Kreirati klasu RekreativniPlaninar koja nasleđuje klasu Planinar. 
 * Klasa dodatno pamti još neke informacije koje se ne mogu menjati nakon postavljanja u konstuktoru (znaci, nemaju setere): 
●	težinu opreme (kg) koju nosi (celobrojna je vrednost npr: 20kg) 
●	naziv okruga odakle je rekreativni planinar. 
●	maksimalni uspon koji planinar može da savlada bez opreme (npr: 2000m)
●	napraviti konstruktor

●	da li će rekreativni planinar uspešno popeti na planinu zavisi da 
li je njegov najveći uspon manji od visine planine,
 s tim da oprema dodatno otežava penjanje i za svaki kilogram opreme koji nosi može da pređe 50 metara manje. 
 
●	rekeativci placaju clanarinu u iznosu od 1000 rsd
●	metoda koja ispisuje podatke o planinaru ispisuje ih u sledećem formatu: 
Rekreativac, id: id
 ime: ime prezime Okrug: okrug */
