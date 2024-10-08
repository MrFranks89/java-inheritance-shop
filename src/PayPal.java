
public class PayPal extends PaymentMethod{
	
	public PayPal (double amount) {
		super(amount);
	}
	
	@Override
	public double applyFee() {
		return amount * 0.02;
	}
	
	@Override
	public void pay() {
		double total = amount + applyFee();
		System.out.println("Hai pagato un importo totale di " + total + "€");
	}
}
