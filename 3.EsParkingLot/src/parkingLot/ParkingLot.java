
package parkingLot;

import java.time.LocalTime;

import bean.Auto;
import bean.Bus;
import bean.Moto;
import bean.Veicolo;

public class ParkingLot {
	private int numeroStalli;
	private Veicolo[] veicoli;
	private int corrente = -1;
	private boolean pieno = false;
	
	ParkingStats parkingStats;

	public ParkingLot(int numeroStalli) {
		veicoli  = new Veicolo[numeroStalli];
		parkingStats = new ParkingStats();
		this.numeroStalli = numeroStalli;
	}

	public boolean entra(char veicolo, String targa, LocalTime localTime) {
		if( pieno )
			return false;
		
		corrente++;
		switch(veicolo) {
		case 'A': case 'a':
			veicoli[corrente] = new Auto(targa, localTime);
			break;
		case 'M': case 'm':
			veicoli[corrente] = new Moto(targa, localTime);
			break;
		case 'B': case 'b':
			veicoli[corrente] = new Bus(targa, localTime);
			break;
		}
		
		parkingStats.register(veicoli[corrente]);
		pieno = controllaDisponibilità();
		
		return true;
	}

	private boolean controllaDisponibilità() {
		return (corrente == numeroStalli - 1);	
	}

	public double esci(String targa, LocalTime localTime) {	
		Veicolo v = cercaVeicolo(targa);
		if( v == null )
			return -1;

		v.setOraUscita(localTime);
		rimuoviVeicolo(targa);
		return calcolaPedaggio(v);
	}

	private void rimuoviVeicolo(String targa) {
		for(int i=0; i<=corrente; i++ ) {
			if( veicoli[i] != null && veicoli[i].getTarga().equalsIgnoreCase(targa)) {
				veicoli[i] = null;
			}
		}
	}
	
	private Veicolo cercaVeicolo(String targa) {
		for(int i=0; i<=corrente; i++ ) {
			if( veicoli[i] != null && veicoli[i].getTarga().equalsIgnoreCase(targa)) {
				return veicoli[i];
			}
		}
		
		return null;
	}

	private double calcolaPedaggio(Veicolo veicolo) {
		LocalTime oraInizio = veicolo.getOraIngresso(); 
		LocalTime oraFine = veicolo.getOraUscita(); 
		double tariffa = veicolo.getTariffa();

		int secondi = oraFine.toSecondOfDay() - oraInizio.toSecondOfDay();

		double pedaggio = secondi < 1800 ? tariffa: secondi/3600.00 * tariffa;
		parkingStats.addParcheggio(pedaggio);
		return pedaggio;
	}

	public String daiElencoVeicoli() {
		String s = "";
		for(int i=0; i<numeroStalli; i++ ) {
			if( veicoli[i] != null )
				s += veicoli[i].toString();
		}

		return s;
	}

	public int getTotaleIngressi() {
		return parkingStats.getTotaleIngressi();
	}

	public double getTotaleIncasso() {
		return parkingStats.getTotaleIncasso();
	}
}
