

public class ProdottoTelevisore  extends Prodotto{
		
		private int pollici;
		private boolean smart;
		
		
		public ProdottoTelevisore(String nome, String marca, double prezzo, double iva, int pollici, boolean smart) {
			super(nome, marca, prezzo, iva);
			this.pollici = pollici;
			this.smart = smart;
		}
		
		@Override
		public String toString() {
			return "Televisore: " + getNome() + ", Marca " + getMarca() + ", Pollici: " + 
		pollici + "\", Smart: " + (smart ? "Sì" : "No") + ", Prezzo " + getPrezzoIva() + "€";
					
		}
		

		public static void main(String[] args) {
			 ProdottoTelevisore televisore = new ProdottoTelevisore("OLED 4K TV", "Samsung", 699.99, 0.22, 55, true);

		        System.out.println(televisore.toString());
		    }
		
		/*private static ProdottoTelevisore creaTelevisoreAutomatico() {
	        String nome = "OLED 4K TV"; // Dati automatici
	        String marca = "Samsung";
	        double prezzo = 599.99;
	        int pollici = 55;
	        double iva = 0.22;
	        boolean smart = true;
	        System.out.println("Televisore aggiunto automaticamente: " + nome + " " + pollici + " pollici, Smart: " + (smart ? "Sì" : "No"));
	        return new ProdottoTelevisore(nome, marca, prezzo, iva, pollici, smart);
	    }
		
		
		/*ProdottoTelevisore (Prodotto prodotto, int pollici){
			super (prodotto.getNome(), prodotto.getMarca(), prodotto.getPrezzo(), prodotto.getIva());
			this.pollici = pollici;
		}
		

		public void setPollici(int pollici) {
			this.pollici = pollici;
		}
		
		public int getPollici() {
			return pollici;
		}
		
*/
		
	
}