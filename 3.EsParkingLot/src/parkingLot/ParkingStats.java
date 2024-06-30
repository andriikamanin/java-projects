package parkingLot;

import bean.Auto;
import bean.Bus;
import bean.Moto;
import bean.Veicolo;

public class ParkingStats {
	static private double totaleIncasso;

	public ParkingStats() {

	}

	public void register(Veicolo veicolo) {
		if( veicolo instanceof Auto )
			Auto.totaleIngressi++;
		else if( veicolo instanceof Moto )
			Moto.totaleIngressi++;
		else if( veicolo instanceof Bus)
			Bus.totaleIngressi++;		
	}

	public int getTotaleIngressi() {
		return Auto.totaleIngressi+Moto.totaleIngressi+Bus.totaleIngressi;
		
	}

	public double getTotaleIncasso() {
		return totaleIncasso;
	}

	public void addParcheggio(double pedaggio) {
		totaleIncasso += pedaggio;
	}
}