package bean;

public class Operazione {
    private String nome; //nome dell'operazione
    private String stato; //stato dell'operazione

    private Operazione next; //riferimento a prossimo elemento

    @Override
    public String toString() {
        return nome + ", stato: " + stato;
    }

    public Operazione(String nome, String stato) {
        this.nome = nome;
        this.stato = stato;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getStato() {
        return stato;
    }

    public void setStato(String stato) {
        this.stato = stato;
    }

    public Operazione getNext() {
        return next;
    }

    public void setNext(Operazione next) {
        this.next = next;
    }
}
