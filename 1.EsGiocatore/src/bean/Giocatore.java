package bean;

public class Giocatore {
    private String nome;
    private String cognome;
    private String club;


    private Giocatore next;

    @Override
    public String toString() {
        return super.toString();
    }

    public Giocatore(String nome, String cognome, String club) {
        this.club = club;
        this.cognome = cognome;

        this.nome = nome;
    }

    public String getClub() {
        return club;
    }

    public void setClub(String club) {
        this.club = club;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }



    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Giocatore getNext() {
        return next;
    }

    public void setNext(Giocatore next) {
        this.next = next;
    }
}
