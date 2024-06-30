package bean;

import java.util.ArrayList;

public class Menu {

	Panino menu;
	
	public void crea(String[] elencoPanini) {
		
		for(int i=0; i< elencoPanini.length; i++) {
			String[] dettagli = elencoPanini[i].split("\\|");
			Panino panino = new Panino(dettagli);
			
			addTail(panino);		
		}
	}

	private void addTail(Panino panino) {

		
		if(menu == null) {
			menu = panino;
		} else	{
			Panino temp = menu;
			while(temp.next != null ) {
				temp = temp.next;
			}
			temp.next = panino;			
		}
		
	}

	public ArrayList<String> getMenu() {
		Panino temp = menu;
		ArrayList<String> elencoPanini = new ArrayList<String>();
		
		while(temp != null) {
			elencoPanini.add(temp.getNome() + "\n");
			temp  = temp.next;
		}
		return elencoPanini;
		
		
	}

}
