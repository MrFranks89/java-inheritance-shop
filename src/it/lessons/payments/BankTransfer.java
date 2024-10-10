package it.lessons.payments;

public class BankTransfer extends PaymentMethod{

	@Override
	public void pay(double amount) {
	    System.out.printf("Pagamento di %.2f€ effettuato con Bonifico Bancario.\n", amount);
	}

    @Override
    public double applyFee(double amount) {
        return amount;  // Nessuna commissione
    }

}
