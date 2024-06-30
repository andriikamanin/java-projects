package boundary;

import java.util.Scanner;

import business.Agenzia;

public class Console {
	Scanner sc;
	Agenzia agenzia;

	public Console() {
		agenzia = new Agenzia();
		sc = new Scanner(System.in);
	}

	public void inizia() {

		while(true) {
			char scelta = menuPrincipale();

			switch(scelta) {
			case 'V': case 'v':
				String viaggio = menuViaggi();
				agenzia.inserisciViaggio(viaggio);
				break;
			case 'U': case 'u':
				String utente = menuViaggiatore();
				agenzia.inserisciViaggiatore(utente);
				break;
			case 'G': case 'g':
				mostraViagggi();
				break;
			case 'T': case 't':
				mostraUtenti();
				break;
			case 'Q': case 'q':
				System.exit(0);
				break;
			}
		}
	}

	private void mostraUtenti() {
		String elencoUtenti = agenzia.dettagliUtenti();
		
		System.out.println();
		System.out.println(elencoUtenti);
		System.out.println();
	}

	private void mostraViagggi() {
		String elencoViaggi = agenzia.dettagliViaggi();
		
		System.out.println();
		System.out.println(elencoViaggi);
		System.out.println();
	}

	private char menuPrincipale() {
		String risposte = "VUGTQvugtq";
		String scelta = "";
		do {
			System.out.println("Inserisci: \n[V]iaggio\n[U]tente\nMostra Via[G]gi\nMostra U[T]enti\n[Q]uit");
			scelta = sc.nextLine();
		}	while( !risposte.contains(Character.toString(scelta.charAt(0))) );

		return scelta.charAt(0);
	}

	private String menuViaggi() {
		String viaggio;

		do {
			System.out.println("Inserisci meta, costo, durata, disponibilità separati da virgola");
			viaggio = sc.nextLine();
		}	while( viaggio.split(",").length != 4);

		return viaggio;
	}

	private String menuViaggiatore() {
		String viaggiatore;

		do {
			System.out.println("Inserisci meta scelta, stato pagamento, periodo scelto separati da virgola");
			viaggiatore = sc.nextLine();
		}	while( viaggiatore.split(",").length != 3);

		return viaggiatore;
	}

}
