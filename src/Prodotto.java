import java.util.Random;

public class Prodotto {

		private int codice;
		private String nome;
		private String descrizione;
		private String marca;
		private double prezzo;
		private double iva;
		
		public Prodotto(String nome, String marca, double prezzo, double iva){
			this.nome = nome;
	        this.marca = marca;
	        this.prezzo = prezzo;
	        this.iva = iva;
			
		}


		private void setCodice() {
			Random ran = new Random();
			codice = ran.nextInt(Integer.MAX_VALUE);
		}
		
		private void setCodice(int codice) {
			this.codice = codice;
		}
		
		public int getCodice() {
			return codice;
		}
		
		public void setNome(String nome) {
			this.nome = nome;
		}
		
		public String getNome() {
			return nome;
		}
		
		public void setMarca(String marca) {
			this.marca = marca;
		}
		
		public String getMarca() {
			return marca;
		}
	
		public void setPrezzo (double prezzoBase) {
	       this.prezzo = prezzo;
	    }
		
		public double getPrezzo() {
			return prezzo;
		}
		
		public void setIva(double iva) {
			if (iva == 0.04 || iva == 0.05 || iva == 0.1 || iva == 0.22) {
				this.iva = iva;
			} else {
				System.out.println("Valore Iva errato, inserirne uno corretto");
			}
		}
		
		public double getIva() {
			return iva;
		}
		
		/*public double getPrezzoIva() {
			return String.format("%.2f", prezzo + (prezzo * iva));
		}*/
		
		double getPrezzoIva() {
	        double importoIVA = this.prezzo * this.iva;
	        return Math.round((this.prezzo + importoIVA) * 100.0) / 100.0;
	    }
		
		public String getNomeEsteso () {
			return codice + " - " + nome;
		}
		
		
		@Override
		public String toString() {
			return String.format("Il prodotto %s, della marca %s, costa €%s", 
					getNome(), getMarca(), getPrezzoIva());
					
		}
		
		public String getDescrizione () {
			return this.descrizione;
		}
		
	
		public void setDescrizione(String descrizione) {
			this.descrizione = descrizione;
		}
	}


