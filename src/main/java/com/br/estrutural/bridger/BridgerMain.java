package com.br.estrutural.bridger;

import com.br.estrutural.bridger.cliente.plataforma.IPlataform;
import com.br.estrutural.bridger.plataforma.facebook.Facebook;
import com.br.estrutural.bridger.plataforma.twitchtv.TwitchTv;
import com.br.estrutural.bridger.plataforma.youtube.Youtube;
import com.br.estrutural.bridger.transmisao.Live;

public class BridgerMain {

	public static void main(String[] args) {
		iniciaTransmissao(new Youtube());
		iniciaTransmissao(new Facebook());
		iniciaTransmissao(new TwitchTv());

	}
	
	
	public static void iniciaTransmissao(IPlataform plataforma) {
		Live live = new Live(plataforma);
		live.broadCasting();
		live.result();
		
	}

}
