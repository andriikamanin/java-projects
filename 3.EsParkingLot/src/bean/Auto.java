package bean;

import java.time.LocalTime;

public class Auto extends Veicolo {
	
	public static int totaleIngressi = 0;

	public Auto(String targa, LocalTime localTime) {
		super(targa, localTime);
		tariffa = 1;
	}

}
