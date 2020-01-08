package pt.iade.carradio.models;

import javafx.collections.ObservableList;

public class Playlist {

	private static String nomePlaylist;
	private ObservableList <Music> songs;
	private static int playlistID;
	
	public Playlist(String nomePlaylist, ObservableList<Music> songs, int playlistID) {
		Playlist.nomePlaylist = nomePlaylist;
		this.songs = songs;
		//this.playlistID= playlistID;
		
	}
	public Playlist(String nomePlaylist) {
		Playlist.nomePlaylist = nomePlaylist;
	}

	public String getNomePlaylist() {
		return nomePlaylist.toString();
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



