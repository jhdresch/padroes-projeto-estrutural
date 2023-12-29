package com.br.estrutural.adpter.paypall;

import com.br.estrutural.adpter.util.Token;

public class PayPal implements IPayPalPayments {

	private Token token;

	@Override
	public Token authToken() {
		return new Token();
	}

	@Override
	public void paypalPayment() {
		this.token = authToken();
		System.out.println("enviado pagamento via paypal");

	}

	@Override
	public void paypalReceive() {
		System.out.println("Recebendo pagamento via paypal");

	}

}
