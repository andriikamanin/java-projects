package business;

import bean.Giocatore;

public class ListaGiocatori {
    private Giocatore head;

    public ListaGiocatori() {
        head = null;
    }

    public void addTail(Giocatore nuovoGiocatore){
        if(head == null){
            head = nuovoGiocatore;
        }else{
            Giocatore current = head;
            while(current.getNext() != null){
                current = current.getNext();
            }
            current.setNext(nuovoGiocatore);
        }
    }

    public void aggiungiGiocatore(String nome, String cognome, String club){
        Giocatore nuovoGiocatore = new Giocatore(nome, cognome, club);
        addTail(nuovoGiocatore);
    }


    public String elencoGiocatori(){
        String elenco = "";
        Giocatore current = head;
        while(current != null){
            elenco += current.getNome() + "\n";
            current = current.getNext();
        }
        return elenco;
    }


   public String eleminaGiocatore(String cognome){
        if(head != null){
            return "Lista e' vuota";
        }

        if(head.getCognome().equals(cognome)){
            head = head.getNext();
        }

        Giocatore current = head;
        while(current != null){
            if(current.getCognome().equals(cognome)){
                return "Giocatore " + current.getNome() + " " + current.getCognome() + " eleminato.\n";
            }
            current = current.getNext();
        }

        return "Giocatore non trovato\n";
    }

}
