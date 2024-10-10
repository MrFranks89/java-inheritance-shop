package it.lessons.opp.sistema_pagamento.model;

public class BankTransfer extends PaymentMethod{

	@Override
	public void pay(double cost) {
		System.out.println("Il costo è " + applyFee(cost));
	}

	@Override
	public double applyFee(double cost) {
		return cost;
	}

	@Override
	public String getSystemName() {
		return "Bank Transfer";
	}

	@Override
	protected boolean hasPhysicalInstrument() {
		return false;
	}

	@Override
	protected String getPercentualFee() {
		return null;
	}

}
