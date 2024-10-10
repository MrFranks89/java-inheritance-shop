package it.lessons.payments;

public class PayPal extends PaymentMethod{
	
	@Override
	public void pay(double amount) {
	    System.out.printf("Pagamento di %.2f€ effettuato con Paypal.\n", amount);
	}

	    @Override
	    public double applyFee(double amount) {
	        return amount * 1.02;  // Commissione del 2%
	    }
}
