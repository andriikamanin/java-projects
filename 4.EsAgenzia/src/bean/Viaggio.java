package bean;

public class Viaggio {
	private String meta;
	private int durata;
	private int costo;
	private boolean disponibilità;

	public Viaggio(String meta, int costo, int durata, boolean disponibilità) {
		this.costo = costo;
		this.disponibilità = disponibilità;
		this.durata = durata;
		this.meta = meta;
	}
	
	@Override
	public String toString() {
		String dettagli = meta + "   " + costo + "   " + durata + "   " + (disponibilità?"SI":"NO");
		
		return dettagli;
	}
	
	public String getMeta() {
		return meta;
	}

	public void setMeta(String meta) {
		this.meta = meta;
	}

	public int getDurata() {
		return durata;
	}

	public void setDurata(int durata) {
		this.durata = durata;
	}

	public int getCosto() {
		return costo;
	}

	public void setCosto(int costo) {
		this.costo = costo;
	}

	public boolean isDisponibilità() {
		return disponibilità;
	}

	public void setDisponibilità(boolean disponibilità) {
		this.disponibilità = disponibilità;
	}


}
