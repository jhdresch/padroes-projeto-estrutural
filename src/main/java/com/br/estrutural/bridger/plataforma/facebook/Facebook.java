package com.br.estrutural.bridger.plataforma.facebook;

import com.br.estrutural.bridger.cliente.plataforma.IPlataform;

public class Facebook implements IPlataform{
	
	public Facebook() {
		configureRMTP();
		System.out.println("Facebook: iniciando transmissao");
	}

	@Override
	public void configureRMTP() {
		autToken();
		System.out.println("Facebook: conta autoriazada");
		
	}

	@Override
	public void autToken() {
		System.out.println("Facebook: autoriazando aplicação");
		
	}

}
