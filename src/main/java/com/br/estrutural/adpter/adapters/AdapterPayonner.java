package com.br.estrutural.adpter.adapters;

import com.br.estrutural.adpter.payonner.Payonner;
import com.br.estrutural.adpter.paypall.IPayPalPayments;
import com.br.estrutural.adpter.util.Token;

public class AdapterPayonner implements IPayPalPayments{
	private Payonner payonner;
	
	
	public AdapterPayonner(Payonner payonner) {
		this.payonner = payonner;
		System.out.println("Adaptando metodos de Paypal para payonner");
	}

	@Override
	public Token authToken() {
		
		return new Token();
	}

	@Override
	public void paypalPayment() {
		
		payonner.payonnerPayment();
		
	}

	@Override
	public void paypalReceive() {
		payonner.payonnerPayReceive();
		
	}

}
