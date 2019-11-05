package pt.iade.carradio.models;

import javafx.collections.ObservableList;

public class Playlist {

	private String name;
	private ObservableList <Music> songs;
	
	public Playlist(String name, ObservableList<Music> songs) {
		super();
		this.name = name;
		this.songs = songs;
	}

	public String getName() {
		return name;
	}

	public ObservableList<Music> getSongs() {
		return songs;
	}


	
	
}