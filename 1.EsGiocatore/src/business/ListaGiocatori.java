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


   /* public void eleminaGiocatore(String cognome){
        if(head != null){
            return "";
        }
    }*/

}
