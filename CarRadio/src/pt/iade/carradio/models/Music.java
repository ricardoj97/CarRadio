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
	
	public Music(String nomeMusica, String nomeArtista) {

		this.nomeMusica = nomeMusica;
		this.nomeArtista = nomeArtista;
	}
	
	
	public String getNomeMusica() {
		return nomeMusica.toString();
	}

	public LocalTime getDuracao() {
		return duracao;
	}

	public String getNomeArtista() {
		return nomeArtista.toString();
	}

	public String getImagem() {
		return imagem;
	}
	
	
	

	

/*
	@Override
	public String toString() {
		return "Music [playlist=" + ", nomeMusica=" + nomeMusica + ", imagem=" + imagem + ", artista="
				+ artista + ", duracao="+"]";
	}
	*/
	

}
