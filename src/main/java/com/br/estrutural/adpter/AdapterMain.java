package com.br.estrutural.adpter;

import com.br.estrutural.adpter.adapters.AdapterMercadopago;
import com.br.estrutural.adpter.mercadopago.MercadoPago;
import com.br.estrutural.adpter.paypall.IPayPalPayments;

public class AdapterMain {

	
	public static void main(String[] args) {
		
		// chamada principal do paypal
		//IPayPalPayments payment = new PayPal();
		
		// chamada adaptada do paypal para payonner
		//IPayPalPayments  payment = new AdapterPayonner(new Payonner());
		
		// chamada adaptada do paypal para mercado pago
		IPayPalPayments  payment = new AdapterMercadopago(new MercadoPago());
		payment.paypalPayment();
		payment.paypalReceive();		
	}

}
