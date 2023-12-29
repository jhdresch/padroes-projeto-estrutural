package com.br.estrutural.bridger.transmisao;

import com.br.estrutural.bridger.cliente.plataforma.IPlataform;

public class LiveAvancada extends Live{
	
	public LiveAvancada(IPlataform plataforma) {
		super.plataforma = plataforma;
	}

	public void subtitulos() {
		System.out.println("Legendas Ativadas na transmissao");
	}
	
	public void comments() {
		System.out.println("Comentario liberado");
	}
}
