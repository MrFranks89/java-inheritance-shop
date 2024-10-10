package it.lessons.opp.sistema_pagamento.model;

public class Paypal extends PaymentMethod{

	private final double FEE = 1.02;

	@Override
	public double applyFee(double cost) {
		return cost * FEE;
	}

	@Override
	public String getSystemName() {
		return "Paypal";
	}

	@Override
	protected boolean hasPhysicalInstrument() {
		return false;
	}

	@Override
	protected String getPercentualFee() {
		return "2%";
	}

}
