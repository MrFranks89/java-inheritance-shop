package it.lessons.payments;

public class CreditCard extends PaymentMethod{
	public CreditCard(double amount) {
		super (amount);
	}
	
	@Override
	public double applyFee() {
		return amount * 0.03;
	}
	
	@Override
	public void pay() {
		double total = amount + applyFee();
		System.out.println("Hai pagato un importo totale di " + total + "€");
	}
}
