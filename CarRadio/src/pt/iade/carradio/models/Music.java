package pt.iade.carradio.models;

import java.time.LocalTime;

public class Music {
	protected String nomeMusica;
	protected String nomeArtista;
	protected LocalTime duracao;
	protected String imagem;
	
	public Music(String nomeMusica, String nomeArtista, LocalTime duracao, String imagem) {

		this.nomeMusica = nomeMusica;
		this.nomeArtista = nomeArtista;
		this.duracao = duracao;
		this.imagem = imagem;
		
	}
	public Music(String nomeMusica, String nomeArtista, LocalTime duracao) {

		this.nomeMusica = nomeMusica;
		this.nomeArtista = nomeArtista;
		this.duracao = duracao;
		
	}

	
	public String getNomeMusica() {
		return nomeMusica.toString();
	}

	public LocalTime getDuracao() {
		return duracao;
	}

	public String toStringDuracao() {
		return duracao.toString();
	}

	public String getNomeArtista() {
		return nomeArtista.toString();
	}

	public String getImagem() {
		return imagem;
	}
	

	

}
