
public class PaymentTest {
	public static void main(String[] args) {
		PaymentMethod creditCardPayment = new CreditCard(100.00);
		creditCardPayment.pay();
		
		 PaymentMethod paypalPayment = new PayPal(100.00);
	     paypalPayment.pay();

	     PaymentMethod bankTransferPayment = new BankTransfer(100.00);
	     bankTransferPayment.pay();
	}
}
