package com.br.estrutural.bridger.plataforma.twitchtv;

import com.br.estrutural.bridger.cliente.plataforma.IPlataform;

public class TwitchTv implements IPlataform {
	
	
	public TwitchTv() {
		configureRMTP();
		System.out.println("TwitchTv: iniciando transmissao TwitchTv");
	}

	@Override
	public void configureRMTP() {
		autToken();
		System.out.println("TwitchTv: conta autoriazada");

	}

	@Override
	public void autToken() {
		System.out.println("TwitchTv: autoriazando aplicação");

	}

}
