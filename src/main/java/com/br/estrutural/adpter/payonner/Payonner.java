package com.br.estrutural.adpter.payonner;

import com.br.estrutural.adpter.util.Token;

public class Payonner implements IPayonnerPayments{

	private Token token;

	@Override
	public Token authToken() {
		return new Token();
	}

	@Override
	public void payonnerPayment() {
		this.token = authToken();
		System.out.println("enviado pagamento via Payonner");

	}

	@Override
	public void payonnerPayReceive() {
		System.out.println("Recebendo pagamento via Payonner");

	}
	
}
