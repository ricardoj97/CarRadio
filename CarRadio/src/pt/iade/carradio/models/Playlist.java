package pt.iade.carradio.models;

import javafx.collections.ObservableList;

public class Playlist {

	private static String nomePlaylist;
	private ObservableList <Music> songs;
	private static int playlistID;
	
	public Playlist(String nomePLaylist, ObservableList<Music> songs, int playlistID) {
		Playlist.nomePlaylist = nomePLaylist;
		this.songs = songs;
		//this.playlistID= playlistID;
		
	}
	public Playlist(String nomePLaylist) {
		Playlist.nomePlaylist = nomePLaylist;
	}

	public static String getNomePlaylist() {
		return nomePlaylist;
	}
	
	public ObservableList<Music> getSongs() {
		return songs;
	}

	public static int getPlaylistID() {
		return playlistID;
	}
	
	public int setPlaylistID(int playlistID) {
		return playlistID;
	}
	
	
}



