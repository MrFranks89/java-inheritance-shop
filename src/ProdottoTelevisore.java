

public class ProdottoTelevisore  extends Prodotto{
		
		int pollici;
		
		ProdottoTelevisore (Prodotto prodotto, int pollici){
			super (prodotto.getNome(), prodotto.getMarca(), prodotto.getPrezzo(), prodotto.getIva());
			this.pollici = pollici;
		}
		

		public void setPollici(int pollici) {
			this.pollici = pollici;
		}
		
		public int getPollici() {
			return pollici;
		}
		
		/*@Override
        public String toString() {
        	return "Televisore " + getNome() + ", Marca " + getMarca() + ", Prezzo: " + getPrezzoIva() + "€";
        }*/
		
		public String toString() {
			return String.format("il prodotto %s, marchio %s, costa €%s \nPollici %s e $s", getNomeEsteso(), 
					getMarca(), getPrezzoIva(), getPollici());
		}
	
}