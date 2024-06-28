package boundary;

import business.ListaGiocatori;

import java.util.Scanner;

public class Console {
    private Scanner scanner;
    private ListaGiocatori listaGiocatori;

    public Console() {
        scanner = new Scanner(System.in);
        listaGiocatori = new ListaGiocatori();
    }

    public void menu(){

    }

    public void menuScelta(String sc){
        int scelta = Integer.parseInt(sc);
        switch (scelta){
            case 1:
                aggiungereNuovoGiocatore();
                break;

            case 2:
                visualizzaTuttiGiocatori();
                break;
            case 3:
                eleminaGiocatore();
                break;
                
            case 4:
                ricercaGiocatore();
                break;
            default:
                System.out.println("Input non valido");
                break;
        }
    }

    private void ricercaGiocatore() {
        System.out.println("Inserisci cognome del giocatore: ");
        String cognome = scanner.nextLine();
    }

    private void eleminaGiocatore() {
        System.out.println("Inserisci cognome del giocatore: ");
        String cognome = scanner.nextLine();


    }

    private void visualizzaTuttiGiocatori() {
        String elencoGiocatori = listaGiocatori.elencoGiocatori();
        System.out.println(elencoGiocatori);
    }

    private void aggiungereNuovoGiocatore() {
        System.out.println("Menu di aggiungere nuovo giocatore\n");

        System.out.println("Inserisci nome: ");
        String nome = scanner.nextLine();

        System.out.println("Inserisci cognome: ");
        String cognome = scanner.nextLine();

        System.out.println("Inserisci club di giocatore: ");
        String club = scanner.nextLine();

        listaGiocatori.aggiungiGiocatore(nome,cognome,club);
    }

    public void start(){
        boolean isRunning = true;
        while(isRunning){
            menu();
            String scelta = scanner.nextLine();
            menuScelta(scelta);
        }
    }
}
