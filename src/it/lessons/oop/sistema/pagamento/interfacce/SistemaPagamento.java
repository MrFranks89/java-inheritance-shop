package it.lessons.oop.sistema.pagamento.interfacce;

import it.lessons.opp.sistema_pagamento.model.BankTransfer;
import it.lessons.opp.sistema_pagamento.model.CreditCard;
import it.lessons.opp.sistema_pagamento.model.PaymentMethod;
import it.lessons.opp.sistema_pagamento.model.Paypal;

public class SistemaPagamento {
	
	public static void main(String[] args) {
	PaymentMethod paypal = new Paypal();
	
	PaymentMethod bank = new BankTransfer();
	
	PaymentMethod credit = new CreditCard();
	
	System.out.println(paypal.getSystemName());
	paypal.pay(100);
	
	System.out.println(bank.getSystemName());
	bank.pay(80);
	
	System.out.println(credit.getSystemName());
	credit.pay(30);
}
}
