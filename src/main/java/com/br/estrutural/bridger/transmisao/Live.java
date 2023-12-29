package com.br.estrutural.bridger.transmisao;

import com.br.estrutural.bridger.cliente.plataforma.IPlataform;

public class Live implements ITransmissao {

	protected IPlataform plataforma;

	public Live() {

	}

	public Live(IPlataform plataforma) {
		this.plataforma = plataforma;
	}

	@Override
	public void broadCasting() {
		System.out.println("Aguarde .......");
	}

	@Override
	public void result() {
		System.out.println("$$$$$ no AR $$$$$");

	}

}
