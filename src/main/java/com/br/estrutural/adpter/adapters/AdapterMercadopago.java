package com.br.estrutural.adpter.adapters;

import com.br.estrutural.adpter.mercadopago.MercadoPago;
import com.br.estrutural.adpter.paypall.IPayPalPayments;
import com.br.estrutural.adpter.util.Token;

public class AdapterMercadopago implements IPayPalPayments {
	
	private MercadoPago mercadoPago;
	
	public AdapterMercadopago (MercadoPago mercadoPago) {
	
		this.mercadoPago = mercadoPago;
	}

	@Override
	public Token authToken() {
		// TODO Auto-generated method stub
		return mercadoPago.authToken();
	}

	@Override
	public void paypalPayment() {
		mercadoPago.mercadoPagoPayment();
		
	}

	@Override
	public void paypalReceive() {
		mercadoPago.mercadoPagoReceive();
		
	}

}
