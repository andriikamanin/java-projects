package boundary;

import java.time.LocalTime;

import parkingLot.ParkingLot;

public class FunctionalTest {
	private ParkingLot parkingLot = null;

	public FunctionalTest() {
		parkingLot = new ParkingLot(5);
	}

	public static void main(String[] args) {

		FunctionalTest test = new FunctionalTest();
		test.creaTest();

	}

	private void creaTest() {
		LocalTime localTime = LocalTime.parse("08:00:00");

		if( !parkingLot.entra('A', "qwert", localTime) )
			System.out.println( "Il parcheggio è pieno  ");
		localTime = localTime.plusSeconds(3600);
		if( !parkingLot.entra('M', "asdfg", localTime))
			System.out.println( "Il parcheggio è pieno  ");
		localTime = localTime.plusSeconds(3600);
		if( !parkingLot.entra('b', "zxcvb", localTime))
			System.out.println( "Il parcheggio è pieno  ");
		localTime = localTime.plusSeconds(3600);
		if( !parkingLot.entra('a', "poiuy", localTime))
			System.out.println( "Il parcheggio è pieno  ");
		localTime = localTime.plusSeconds(3600);
		if( !parkingLot.entra('m', "lkjhg", localTime))
			System.out.println( "Il parcheggio è pieno  ");
		localTime = localTime.plusSeconds(3600);
		if( !parkingLot.entra('B', "mnbvc", localTime))
			System.out.println( "Il parcheggio è pieno  ");

		mostra();

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		localTime = localTime.plusSeconds(3600);
		double pedaggio = parkingLot.esci("qwert", localTime);
		System.out.println("Il pedaggio è  " + pedaggio);
		localTime = localTime.plusSeconds(3600);
		pedaggio = parkingLot.esci("asdfg", localTime);
		System.out.println("Il pedaggio è  " + pedaggio);
		localTime = localTime.plusSeconds(3600);
		pedaggio = parkingLot.esci("zxcvb", localTime);
		System.out.println("Il pedaggio è  " + pedaggio);
		localTime = localTime.plusSeconds(3600);
		pedaggio = parkingLot.esci("poiuy", localTime);
		System.out.println("Il pedaggio è  " + pedaggio);
		localTime = localTime.plusSeconds(3600);
		pedaggio = parkingLot.esci("lkjhg", localTime);
		System.out.println("Il pedaggio è  " + pedaggio);
		localTime = localTime.plusSeconds(3600);
		pedaggio = parkingLot.esci("mnbvc", localTime);
		System.out.println("Il pedaggio è  " + pedaggio);

		System.out.println();
		System.out.println("incasso     " + parkingLot.getTotaleIncasso());
		System.out.println("totale veicoli   " + parkingLot.getTotaleIngressi());
	}

	private void mostra() {
		String s = parkingLot.daiElencoVeicoli();
		System.out.println(s);
	}

}
