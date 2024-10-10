package it.task.shop.cart;


public class Cuffie extends Prodotto{

	String colore;
	boolean wireless;
	
	Cuffie (String nome, String marca, double prezzo, double iva, String colore, boolean wireless){
		super(nome, marca, prezzo, iva);
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
			return "Wireless";
		} else {
			return "Cablate";
		}
	}
	
	public static void main(String[] args) {
		 Cuffie cuffie = new Cuffie("Quiet Comfort", "Bose", 199.99, 0.22, "Nere", true);

	        System.out.println(cuffie.toString());
	    }
	
	 @Override
	    public String getTipoProdotto() {
	        return "Cuffie";
	    }
	
	@Override
    public String toString() {
    	return "Cuffie " + getNome() + ", Marca " + getMarca() +", Colore " 
    + colore + " , Tipo: " + infoWireless() + ", Prezzo: " + getPrezzoIva() + "€";
    }
	
	
}
