

public class ProdottoSmartphone extends Prodotto {
	
		int memoria = 128;
	
		ProdottoSmartphone(String nome, String marca, double prezzo, double iva) {
		super(nome, marca, prezzo, iva);
	}
		
		@Override
        public String toString() {
        	return "Smartphone " + getNome() + ", Marca " + getMarca() +", Memoria " + memoria + "GB" + ", Prezzo: " + getPrezzoIva() + "€";
        }

	public static void main(String[] args) {
		 ProdottoSmartphone smartphone = new ProdottoSmartphone("Redmi Note 13", "Xiaomi", 699.99, 0.22);

	        System.out.println(smartphone.toString());
	    }
        
    }

