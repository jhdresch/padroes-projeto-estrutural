package com.br.estrutural.adpter.paypall;

import com.br.estrutural.adpter.util.Token;

public interface IPayPalPayments {
	
	public Token authToken();
	
	public void paypalPayment();
	
	public void paypalReceive();

}
