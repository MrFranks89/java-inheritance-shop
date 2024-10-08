

import java.util.Random;

/*Un prodotto è caratterizzato da:
- codice (numero intero)
- nome
- descrizione
- prezzo
- iva
Usate opportunamente attributi ed altri metodi per fare in modo che:
- ci sia un metodo che valorizzi il codice prodotto con un numero random V
- il prodotto esponga un metodo per avere il prezzo base V
- il prodotto esponga un metodo per avere il prezzo comprensivo di iva V
- il prodotto esponga un metodo per avere il nome esteso, ottenuto concatenando codice-nome V */ 

//Nello stesso package aggiungete una classe Main 
//con metodo main nella quale 
//testate tutte le funzionalità della classe Prodotto.

/*
 * Usate opportunamente i livelli di accesso (public, private), 
 * i costruttori, i metodi getter e setter ed eventuali 
 * altri metodi di “utilità” per fare in modo che:
- il codice prodotto sia accessibile solo in lettura
- gli altri attributi siano accessibili sia in lettura che in scrittura
Lo shop gestisce diversi tipi di prodotto:
- Smarphone, caratterizzati anche dal codice IMEI e dalla quantità di memoria
- Televisori, caratterizzati dalle dimensioni e dalla proprietà di essere 
smart oppure no
- Cuffie, caratterizzate dal colore e se sono wireless o cablate
Utilizzate l’ereditarietà per riutilizzare il codice di 
Prodotto nella stesura delle classi che gestiscono i vari sotto tipi di prodotto.
*/

public class Prodotto {

		private int codice;
		protected String nome;
		//private String descrizione;
		protected String marca;
		protected double prezzo;
		protected double iva;
		
		Prodotto(String nome, String marca, double prezzo, double iva){
			setCodice();
			setIva(iva);
			setNome(nome);
			setMarca(marca);
			setPrezzo(prezzo);
			
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
		/*Prodotto(){
			setCodice();
			this.iva = 1.22;
		}
		
		Prodotto(String nome, String descrizione, double prezzo){
			this();
			this.nome = nome;
			this.descrizione = descrizione;
			this.prezzo = prezzo;
		}*/
	
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
		
		public String getPrezzoIva() {
			return String.format("%.2f", prezzo + (prezzo * iva));
		}
		
		/*double calcolaPrezzoConIVA() {
	        double importoIVA = this.prezzo * (this.iva / 100);
	        return this.prezzo + importoIVA;
	    }*/
		
		public String getNomeEsteso () {
			return codice + " - " + nome;
		}
		
		@Override
		public String toString() {
			return "Prodotto: " + nome + ", Prezzo: " + prezzo + " EUR";
		}
		
		/*@Override
		public String toString() {
			return String.format("Il prodotto %s, della marca %s, costa €%s", 
					getNomeEsteso(), getMarca(), getPrezzoIva());
					
		}
		public String getDescrizione () {
			return this.descrizione;
		}
		
	
		public void setDescrizione(String descrizione) {
			this.descrizione = descrizione;
		}
		*/
	}


