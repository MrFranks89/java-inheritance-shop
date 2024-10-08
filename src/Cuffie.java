

public class Cuffie extends Prodotto{

	String colore;
	boolean wireless;
	
	Cuffie (Prodotto prodotto, String colore, boolean wireless){
		super(prodotto.getNome(), prodotto.getMarca(), prodotto.getPrezzo(), prodotto.getIva());
		this.colore = colore;
		this.wireless = wireless;
	}
	public void setColore(String colore) {
		this.colore = colore;
	}
	
	public String getColore() {
		return colore;
	}
	
	public void setWireless(boolean wireless) {
		this.wireless = wireless;
	}
	
	public boolean isWireless() {
		return wireless;
	}
	
	public String infoWireless() {
		if (wireless) {
			return "Sono Wireless";
		} else {
			return "Sono cablate";
		}
	}
	
	@Override
	public String toString() {
		return String.format("il prodotto %s, marchio %s, costa €%s \nColore %s e $s", getNomeEsteso(), 
				getMarca(), getPrezzoIva(), getColore(), infoWireless());
	}
}
