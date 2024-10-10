package it.lessons.payments;

public class PaymentMethod {
	
	/*Dovete gestire un sistema di pagamento.
	Ciascun utente potrà pagare i propri ordini come preferisce, c'è chi userà un bonifico, c'è chi userà paypal e c'è chi userà la carta di credito
	La classe PaymentMethod dovrà provvedere ai metodi pay che accetta un double come parametro e applyFee per applicare una percentuale.
	- CreditCard gestisce il pagamento con carta che applica una commissione del 3%
	- Paypal gestisce il pagamento con paypal applicando una commissione del 2%
	- BankTransfer gestisce il pagamento tramite bonifico senza commissioni*/
	
	protected double amount;
	
	public PaymentMethod (double amount) {
		this.amount = amount;
	}
	
	public void pay () {
		
		double total = amount + applyFee();
		System.out.println("Hai pagato un importo totale di " + total + "€");
	};
	public double applyFee () {
		return 0.0;};
}
