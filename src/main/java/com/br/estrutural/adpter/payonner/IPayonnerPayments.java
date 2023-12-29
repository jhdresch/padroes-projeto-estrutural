package com.br.estrutural.adpter.payonner;

import com.br.estrutural.adpter.util.Token;

public interface IPayonnerPayments {
	
	public Token authToken();
	
	public void payonnerPayment();
	
	public void payonnerPayReceive();

}
