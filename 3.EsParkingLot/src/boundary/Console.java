package boundary;

import java.time.LocalTime;
import java.util.Scanner;

import bean.Veicolo;
import parkingLot.ParkingLot;

public class Console {
	private Scanner scanner = null;
	private ParkingLot parkingLot = null;
	private final int STALLI = 10;

	public Console() {
		scanner = new Scanner(System.in);	
		parkingLot = new ParkingLot(STALLI);
	}

	public void inizia() {
		String targa;

		while(true) {
			int scelta = menuPrincipale();

			switch(scelta) {
			case 0:
				System.out.println( "Grazie per aver parcheggiato da noi" );
				System.exit(0);
				break;
			case 1:
				char veicolo = menuVeicolo();
				targa = menuTarga();
				if( !parkingLot.entra(veicolo, targa, LocalTime.now()))
					System.out.println( "Il parcheggio è pieno  ");
				break;
			case 2:
				targa = menuTarga();
				double pedaggio = parkingLot.esci(targa, LocalTime.now());
				System.out.println( "Il pedaggio è  " + pedaggio );
				break;
			case 3:
				int totaleIngressi = parkingLot.getTotaleIngressi();
				System.out.println( "Veicoli entrati  " + totaleIngressi );
				break;
			case 4:
				double totaleIncasso = parkingLot.getTotaleIncasso();
				System.out.println( "Incasso giornaliero  " + totaleIncasso );
				break;
			case 5:
				mostraElencoVeicoli();
				break;
			}
		}
	}

	private void mostraElencoVeicoli() {
		String s = parkingLot.daiElencoVeicoli();
		System.out.println(s);
		if(s.equals("")) 
			System.out.println("il parcheggio è vuoto");
	}

	private String menuTarga() {
		System.out.println("Inserisci la targa:");
		String s = scanner.nextLine();
		return s;
	}

	private char menuVeicolo() {
		String s = "";
		char scelta = 0;
		String risposte = "AMBamb";
		
		do {
			System.out.println("Scegli:");
			System.out.println("[A]uto");
			System.out.println("[M]oto:");
			System.out.println("[B]us:");

			s = scanner.nextLine();
		}
		while( !risposte.contains(Character.toString(s.charAt(0))));

		return s.charAt(0);
	}

	private int menuPrincipale() {
		int scelta = -1;

		do {
			System.out.println("Scegli:");
			System.out.println("0 Fine:");
			System.out.println("1 Entra");
			System.out.println("2 Esci:");
			System.out.println("3 Totale ingressi:");
			System.out.println("4 Totale incasso:");
			System.out.println("5 Elenco veicoli presenti:");

			String s = scanner.nextLine();
			if(s != null && !s.equals(""))
				scelta = Integer.parseInt(s);
		}
		while( scelta<0 || scelta>5);

		return scelta;
	}
}
