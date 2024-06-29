package test;

import business.ListaGiocatori;

public class Test {
    public static void main(String[] args) {
        ListaGiocatori l = new ListaGiocatori();

        l.aggiungiGiocatore("Andrii", "Kamanin", "barcelona");

        System.out.println(l.elencoGiocatori());

        System.out.println(l.eleminaGiocatore("Kamanin"));

        System.out.println(l.elencoGiocatori());
    }
}
