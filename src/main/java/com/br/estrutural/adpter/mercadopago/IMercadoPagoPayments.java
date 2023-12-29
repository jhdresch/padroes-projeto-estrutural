package com.br.estrutural.adpter.mercadopago;

import com.br.estrutural.adpter.util.Token;

public interface IMercadoPagoPayments {
		
	public Token authToken();
	
	public void mercadoPagoPayment();
	
	public void mercadoPagoReceive();

}
