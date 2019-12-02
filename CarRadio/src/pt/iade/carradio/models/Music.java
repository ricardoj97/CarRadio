package pt.iade.carradio.models;

import java.sql.Time;

public class Music {
	protected String nomeMusica;
	protected String imagem;
	protected int artista;
	protected Time duracao;
	public Music(String nomeMusica, String imagem, int artista, Time duracao) {

		this.nomeMusica = nomeMusica;
		this.imagem = imagem;
		this.artista = artista;
		this.duracao = duracao;

	}

	public String getNomeMusica() {
		return nomeMusica;
	}
	public String getImagem() {
		return imagem;
	}
	public int getArtista() {
		return artista;
	}

	public Time getDuracao() {
		return duracao;
	}
/*
	@Override
	public String toString() {
		return "Music [playlist=" + ", nomeMusica=" + nomeMusica + ", imagem=" + imagem + ", artista="
				+ artista + ", duracao="+"]";
	}
	*/
	

}
