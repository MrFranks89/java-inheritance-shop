package it.lessons.oop.sistema_pagamento.interfacce;

public interface Payment {

	public void pay(double cost);
	
	public double applyFee(double cost);
}
