package test;

import business.Agenzia;

public class AgenziaTest {

	public static void main(String[] args) {
		Agenzia a = new Agenzia();
		
		a.inserisciViaggio("trieste,2000,10,true");
		a.inserisciViaggio("muggia,200,5,false");
		a.inserisciViaggio("sistiana,1000,3,true");
		
		String elencoViaggi = a.dettagliUtenti();
		
		System.out.println();
		System.out.println(elencoViaggi);
		System.out.println();
		
		a.inserisciViaggiatore("Fabio,false,estate");
		a.inserisciViaggiatore("Jacopo,true,primavera");
		a.inserisciViaggiatore("Fabio,false,autunno");
		
		String elencoUtenti = a.dettagliUtenti();
		
		System.out.println();
		System.out.println(elencoUtenti);
		System.out.println();
		
		
		
	}
}
