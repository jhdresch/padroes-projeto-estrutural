package com.br.estrutural.bridger.plataforma.youtube;

import com.br.estrutural.bridger.cliente.plataforma.IPlataform;

public class Youtube implements IPlataform{

	public Youtube() {
		configureRMTP();
		System.out.println("Youtube: iniciando transmissao");
	}

	@Override
	public void configureRMTP() {
		autToken();
		System.out.println("Youtube: conta autoriazada");

	}

	@Override
	public void autToken() {
		System.out.println("Youtube: autoriazando aplicação");

	}

}
