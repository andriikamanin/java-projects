package business;

import bean.Viaggiatore;
import bean.Viaggio;

public class Agenzia {

	Viaggio viaggi[];
	Viaggiatore viaggiatori[];
	int viaggioCorrente = -1;
	int viaggiatoreCorrente = -1;
	
	public Agenzia() {
		viaggi = new Viaggio[100];
		viaggiatori = new Viaggiatore[100];
	}
	
	public void inserisciViaggio(String viaggio) {
		String[] dettagli = viaggio.split(",");

		viaggi[++viaggioCorrente] = new Viaggio(dettagli[0], Integer.parseInt(dettagli[1])
				, Integer.parseInt(dettagli[2]), (dettagli[3].equalsIgnoreCase("si"))?true:false);
	}

	public String dettagliViaggi() {
		String s = "";
		
		for( int i=0; i<= viaggioCorrente; i++ ) {
			s += viaggi[i].toString() + "\n";
		}
		return s;
		
	}

	public void inserisciViaggiatore(String utente) {
		String[] dettagli = utente.split(",");

		viaggiatori[++viaggiatoreCorrente] = new Viaggiatore(dettagli[0], dettagli[1].equalsIgnoreCase("ok")?true:false, dettagli[2]);
	}

	public String dettagliUtenti() {
		String s = "";
		
		for( int i=0; i<= viaggiatoreCorrente; i++ ) {
			s += viaggiatori[i].toString() + "\n";
		}
		return s;
		
	}
	

}
