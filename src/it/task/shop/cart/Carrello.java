package it.task.shop.cart;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import it.lessons.oop.sistema_pagamento.interfacce.Payment;
import it.lessons.payments.BankTransfer;
import it.lessons.payments.CreditCard;
import it.lessons.payments.PayPal;
import it.lessons.payments.PaymentMethod;

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
	
	public double sommaTotale() {
		double sommaProdotto = 0;
		for (Prodotto prodotto : prodotti) {
			sommaProdotto += prodotto.getPrezzoIva();
		}
		System.out.printf("Il totale nel carrello (IVA inclusa) è: %.2f€\n", sommaProdotto);
		return sommaProdotto;
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
        //carrello.sommaTotale();
        
        double totale = carrello.sommaTotale();
            
        System.out.println("Scegli il metodo di pagamento: (1: Carta di Credito, 2: PayPal, 3: Bonifico Bancario. "
        		+ "Sono previste delle commissioni in aggiunta al totale.)");
        int metodoPagamento = scanner.nextInt();

        // Sistema di pagamento
        PaymentMethod paymentMethod;
        switch (metodoPagamento) {
        
            case 1:
                paymentMethod = new CreditCard();
                System.out.println("Il pagamento ha una commissione del 3%");
                break;
                
            case 2:
                paymentMethod = new PayPal();
                System.out.println("Il pagamento ha una commissione del 2%");
                break;
                
            case 3:
                paymentMethod = new BankTransfer();
                System.out.println("Il pagamento non prevede una commissione");
                break;
                
            default:
                System.out.println("Metodo di pagamento non valido, impostiamo bonifico bancario di default.");
                paymentMethod = new BankTransfer();
        }

        // Applica le commissioni e paga
        double totaleConCommissioni = paymentMethod.applyFee(totale);
        paymentMethod.pay(totaleConCommissioni);
        
        

        scanner.close();  // Chiudiamo lo scanner alla fine
    

    }
}
