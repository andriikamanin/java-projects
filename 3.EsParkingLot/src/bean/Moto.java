package bean;

import java.time.LocalTime;

public class Moto extends Veicolo {

	public static int totaleIngressi;

	public Moto(String targa, LocalTime localTime) {
		super(targa, localTime);
		tariffa = 0.5;
	}

}
