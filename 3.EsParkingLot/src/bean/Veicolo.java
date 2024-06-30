package bean;

import java.time.LocalTime;

public class Veicolo {
	private String targa;
	protected double tariffa;
	LocalTime oraIngresso;
	LocalTime oraUscita;
	
	
	public Veicolo( String targa, LocalTime localTime) {
		this.targa = targa;
		oraIngresso = localTime;
	}


	public String getTarga() {
		return targa;
	}


	public void setTarga(String targa) {
		this.targa = targa;
	}


	public double getTariffa() {
		return tariffa;
	}


	public void setTariffa(double tariffa) {
		this.tariffa = tariffa;
	}


	public LocalTime getOraIngresso() {
		return oraIngresso;
	}


	public void setOraIngresso(LocalTime oraInizio) {
		this.oraIngresso = oraInizio;
	}
	
	public LocalTime getOraUscita() {
		return oraUscita;
	}


	public void setOraUscita(LocalTime localTime) {
		this.oraUscita = localTime;
	}


	@Override
	public String toString() {
		Object o = getClass();
		return targa + "  " + o.toString() + "  " + oraIngresso + "  " + tariffa + "\n";
	}
	
}
