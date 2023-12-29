package com.br.estrutural.adpter.mercadopago;

import com.br.estrutural.adpter.util.Token;

public class MercadoPago implements IMercadoPagoPayments {

	private Token token;

	@Override
	public Token authToken() {

		System.out.println("iniciando transação mercado pago");
		return new Token();

	}

	@Override
	public void mercadoPagoPayment() {
		this.token = authToken();
		System.out.println("efetivando pagamentop mercado pago");

	}

	@Override
	public void mercadoPagoReceive() {
		System.out.println("recebendo pagamento mercado pago");

	}

}
