package pt.iade.carradio.models;

import java.sql.Time;
import java.sql.Timestamp;
import java.time.LocalTime;
import java.time.temporal.TemporalAccessor;
import java.util.Date;

public class Music {
	protected String nomeMusica;
	protected LocalTime duracao;
	
	public Music(String nomeMusica, LocalTime duracao) {

		this.nomeMusica = nomeMusica;
		this.duracao = duracao;
	}
	
	public String getNomeMusica() {
		return nomeMusica;
	}
	public LocalTime getDuracao() {
		return duracao;
	}

	public void setNomeMusica(String nomeMusica) {
		this.nomeMusica = nomeMusica;
	}

	public void setDuracao(LocalTime duracao) {
		this.duracao = duracao;
	}
	

/*
	@Override
	public String toString() {
		return "Music [playlist=" + ", nomeMusica=" + nomeMusica + ", imagem=" + imagem + ", artista="
				+ artista + ", duracao="+"]";
	}
	*/
	

}
