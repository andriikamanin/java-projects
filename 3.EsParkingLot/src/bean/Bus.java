package bean;

import java.time.LocalTime;

public class Bus extends Veicolo {

	public static int totaleIngressi;

	public Bus(String targa, LocalTime localTime) {
		super(targa, localTime);
		tariffa = 2;
	}

}
