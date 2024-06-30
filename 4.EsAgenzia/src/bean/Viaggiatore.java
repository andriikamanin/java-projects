package bean;

public class Viaggiatore {
	private String metaScelta;
	private boolean statoPagamento;
	private String periodoPartenza;
	
	public Viaggiatore(String metaScelta, boolean statoPagamento,String periodoPartenza ) {
		this.metaScelta = metaScelta;
		this.periodoPartenza = periodoPartenza;
		this.statoPagamento = statoPagamento;
	}

	@Override
	public String toString() {
		String s = metaScelta + "   " + (statoPagamento?"Saldato":"Sospeso") + "   " + periodoPartenza;
		return s;
	}
	
	public String getMetaScelta() {
		return metaScelta;
	}

	public void setMetaScelta(String metaScelta) {
		this.metaScelta = metaScelta;
	}

	public boolean isStatoPagamento() {
		return statoPagamento;
	}

	public void setStatoPagamento(boolean statoPagamento) {
		this.statoPagamento = statoPagamento;
	}

	public String getPeriodoPartenza() {
		return periodoPartenza;
	}

	public void setPeriodoPartenza(String periodoPartenza) {
		this.periodoPartenza = periodoPartenza;
	}
	
	
}
