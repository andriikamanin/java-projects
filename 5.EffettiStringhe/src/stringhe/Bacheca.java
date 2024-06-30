package stringhe;

public class Bacheca {

	private String[] string;
	
	public Bacheca(String... string) {	
		this.string = string;

	}

	public String getMessaggio(int i) {
		return string[i];
	}
}
