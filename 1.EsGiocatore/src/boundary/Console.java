package boundary;

import business.ListaGiocatori;
import business.ListaOperazioni;

import java.util.Scanner;

public class Console {
    private Scanner scanner;
    private ListaGiocatori listaGiocatori;
    private ListaOperazioni listaOperazioni;
    public Console() {
        scanner = new Scanner(System.in);
        listaGiocatori = new ListaGiocatori();
        listaOperazioni = new ListaOperazioni();
    }

    public void menu(){
        System.out.println("\nMenu principale");
        System.out.println("Scegli tra quelli proposti:");
        System.out.println("1. Aggiungere  nuovo gioatore");
        System.out.println("2. Visualizza tutti giocatori");
        System.out.println("3. Eleminare un giocatore");
        System.out.println("4. Ricerca di giocatore");
        System.out.println("5. Visualizza elenco operazioni");
        System.out.print("Tua scelta: ");
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
            case 5:
                visualizzaElencoOperazioni();
                break;
            default:
                System.out.println("Input non valido");
                break;
        }
    }


    //Metodo che aggiunge nuovo operazione
    private void aggiungiOperazione(String nome, String stato){
        listaOperazioni.aggiungiOperazione(nome,stato);
    }


    //Metodo che visualizza tutti operazioni eseguiti
    private void visualizzaElencoOperazioni() {
        String elencoOperazioni = listaOperazioni.listaOperazioni();
        System.out.println(elencoOperazioni + "\n");
    }


    //Metodo per ricerca di un giocatore
    private void ricercaGiocatore() {
        System.out.println("Inserisci cognome del giocatore: ");
        String cognome = scanner.nextLine();

        String stato = listaGiocatori.ricercaGiocatore(cognome);



        aggiungiOperazione("ricerca", stato);

    }


    //Metodo per elemenare un giocatore
    private void eleminaGiocatore() {
        System.out.println("Inserisci cognome del giocatore: ");
        String cognome = scanner.nextLine();

        String stato = listaGiocatori.eleminaGiocatore(cognome);

        aggiungiOperazione("eleminazione", stato);

    }


    //Metodo che visualizza tutti giocatori
    private void visualizzaTuttiGiocatori() {
        String elencoGiocatori = listaGiocatori.elencoGiocatori();
        System.out.println(elencoGiocatori);

        aggiungiOperazione("visualizza tutti giocatori", "visualizzato");
    }


    //Metodo che aggiunge nuovo giocatore
    private void aggiungereNuovoGiocatore() {
        System.out.println("Menu di aggiungere nuovo giocatore\n");

        System.out.println("Inserisci nome: ");
        String nome = scanner.nextLine();

        System.out.println("Inserisci cognome: ");
        String cognome = scanner.nextLine();

        System.out.println("Inserisci club di giocatore: ");
        String club = scanner.nextLine();

        listaGiocatori.aggiungiGiocatore(nome,cognome,club);


        aggiungiOperazione("aggiungere nuovo giocatore: " + nome + " " + cognome, "aggiunto");
    }


    //Metodo di avvia
    public void start(){
        boolean isRunning = true;
        while(isRunning){
            menu();
            String scelta = scanner.nextLine();
            menuScelta(scelta);
        }
    }
}
