package it.lessons.opp.sistema_pagamento.model;

public class CreditCard extends PaymentMethod{
	
	private final double FEE = 1.03;

	@Override
	public void pay(double cost) {
		System.out.println("Il costo è " + cost + ", "
			+ " applicando il fee del 3% pagherai "	+
				applyFee(cost));
	}

	@Override
	public double applyFee(double cost) {
		return cost * FEE;
	}

	@Override
	public String getSystemName() {
		return "Credit Card";
	}

	@Override
	protected boolean hasPhysicalInstrument() {
		return true;
	}

	@Override
	protected String getPercentualFee() {
		// TODO Auto-generated method stub
		return "3%";
	}

}
