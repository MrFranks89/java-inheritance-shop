package it.lessons.opp.sistema_pagamento.model;

import it.lessons.oop.sistema_pagamento.interfacce.Payment;

public abstract class PaymentMethod implements Payment {
	
	@Override
	public void pay(double cost) {
		System.out.println("Il costo è " + cost + ", "
				+ " applicando il fee del " + getPercentualFee() +
				" pagherai " + applyFee(cost));
	}

	protected abstract String getPercentualFee();
	
	public abstract String getSystemName();
	
	protected abstract boolean hasPhysicalInstrument();
	
}
