package it.lessons.payments;

public class CreditCard extends PaymentMethod{

	@Override
	public void pay(double amount) {
	    System.out.printf("Pagamento di %.2f€ effettuato con Carta di Credito.\n", amount);
	}
	
	@Override
    public double applyFee(double amount) {
        return amount * 1.03;  // Commissione del 3%
    }

}
