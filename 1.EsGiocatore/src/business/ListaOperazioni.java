package business;

import bean.Operazione;

public class ListaOperazioni {
    private Operazione head;

    //Costrutore
    public ListaOperazioni(){
        head = null;
    }


    //metodo per aggiungere nuovo elemento nella lista
    public void add(Operazione operazione){
        if(head == null){
            head = operazione;
        }else{
            Operazione current = head;
            while(current.getNext() != null){
                current = current.getNext();

            }
            current.setNext(operazione);
        }
    }

    //Metodo per aggiungere nuovo operazione
    public void aggiungiOperazione(String nome, String stato){
        Operazione nuovoOperazione = new Operazione(nome, stato);
        add(nuovoOperazione);
    }

    //Metodo per visualizza tutti elementi della lista
    public String listaOperazioni(){
        String elenco = "";
        Operazione current = head;
        while(current != null){
            elenco += current.toString() + "\n";
            current = current.getNext();
        }

        return elenco;
    }

}
