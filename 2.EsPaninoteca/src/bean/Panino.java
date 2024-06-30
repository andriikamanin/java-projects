package bean;

public class Panino {

	private String nome;
	public Panino next;

	public Panino(String[] dettagli) {
		this.nome = dettagli[0];
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
