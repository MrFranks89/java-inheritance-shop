
public class BankTransfer extends PaymentMethod{
	public BankTransfer(double amount) {
		super(amount);
	}
	
	@Override
	public void pay() {
		double total = amount + applyFee();
		System.out.println("Hai pagato un importo totale di " + total + "€");
	}

}
