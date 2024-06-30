package boundary;

import java.util.ArrayList;

import paninoteca.Paninoteca;

public class Console {

	Paninoteca paninoteca;
	public Console() {
		paninoteca = new Paninoteca();
	}
	
	public void avvia() {
		FilePanini filePanini = new FilePanini();
		String[] elencoPanini = filePanini.leggi();
		
		paninoteca.creaMenu(elencoPanini);
	
		mostraMenu();
		
	}

	private void mostraMenu() {
		ArrayList<String> elenco = paninoteca.getMenu();
		for( String s: elenco) {
			System.out.println(s);
		}
			
	}

}
