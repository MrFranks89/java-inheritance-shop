package it.lessons.payments;

public abstract class PaymentMethod {
	
	public abstract void pay (double amount);
	
	public double applyFee(double amount) {
		return amount;
	}
}	

