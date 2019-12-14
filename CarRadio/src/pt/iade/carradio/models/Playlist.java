package pt.iade.carradio.models;

import javafx.collections.ObservableList;

public class Playlist {

	private String nomePlaylist;
	private ObservableList <Music> songs;
	
	public Playlist(String nomePLaylist, ObservableList<Music> songs) {
		this.nomePlaylist = nomePLaylist;
		this.songs = songs;
	}
	public Playlist(String nomePLaylist) {
		this.nomePlaylist = nomePLaylist;
	}

	public String getName() {
		return nomePlaylist;
	}
	
	public ObservableList<Music> getSongs() {
		return songs;
	}


	
	
}