package paninoteca;

import java.util.ArrayList;

import bean.Menu;

public class Paninoteca {

	Menu menu;
	
	public Paninoteca() {
		menu = new Menu();
	}
	
	public void creaMenu(String[] elencoPanini) {
		menu.crea(elencoPanini);
		
	}

	public ArrayList<String> getMenu() {
		return menu.getMenu();
	}

}
