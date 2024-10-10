
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Carrello {
	
	private List<Prodotto> prodotti;
	 
	public Carrello() {
		prodotti = new ArrayList<>();
	}
	
	public void aggiungiProdotto(Prodotto prodotto) {
        prodotti.add(prodotto);
    }
	
	public void mostraProdotti() {
        if (prodotti.isEmpty()) {
            System.out.println("Il carrello è vuoto.");
        } else {
            System.out.println("Prodotti nel carrello:");
            for (Prodotto prodotto : prodotti) {
                System.out.println(prodotto);  // Usa il toString di ogni prodotto
            }
        }
    }
	
	//metodo per fare la somma
	
	public void sommaTotale() {
		double sommaProdotto = 0;
		for (Prodotto prodotto : prodotti) {
			
			double prezzoProdotto = prodotto.getPrezzoIva();
			sommaProdotto += prezzoProdotto;
		
		}
		System.out.printf("Somma totale dei prodotti (con IVA): %.2f€\n", sommaProdotto);
		
	}
	
	
	
	// Metodo principale per gestire l'interazione con l'utente
    public static void main(String[] args) {
        // Carrello senza limiti di capacità
        Carrello carrello = new Carrello();
        Scanner scanner = new Scanner(System.in);
        boolean continua = true;  // Variabile per controllare il ciclo

        // Ciclo per permettere all'utente di inserire più prodotti
        while (continua) {
            System.out.println("Che prodotto vuoi aggiungere al carrello? (1: Smartphone, 2: Cuffie, 3: Televisore, 0: Esci)");
            int scelta = scanner.nextInt();
            scanner.nextLine();

            switch (scelta) {
                case 0:
                    continua = false;
                    break;

                case 1:
                    ProdottoSmartphone smartphone = new ProdottoSmartphone("Redmi Note 13", "Xiaomi", 699.99, 0.22);
                    carrello.aggiungiProdotto(smartphone);
                    System.out.println("Smartphone aggiunto al carrello.");
                    break;

                case 2:
                    Cuffie cuffie = new Cuffie("Quiet Comfort", "Bose", 199.99, 0.22, "Nere", true);
                    carrello.aggiungiProdotto(cuffie);
                    System.out.println("Cuffie aggiunte al carrello.");
                    break;
                    
                case 3:
                	ProdottoTelevisore televisore = new ProdottoTelevisore("OLED 4K TV", "Samsung", 1099.99, 0.22, 55, true);
                	carrello.aggiungiProdotto(televisore);
                	System.out.println("Televisore aggiunto al carrello.");
                	break;
                	

                default:
                    System.out.println("Scelta non valida, riprova.");
                    break;
            }
        }

        carrello.mostraProdotti();
        carrello.sommaTotale();

        scanner.close(); 
    }
	
}
