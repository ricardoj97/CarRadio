package pt.iade.carradio.models;

import javafx.collections.ObservableList;
import pt.iade.carradio.models.daos.PlaylistDAO;

public class Playlist {

	private  String nomePlaylist;
	private ObservableList <Music> songs;
	private static  int playlistID;
	
	public Playlist(String nomePlaylist, ObservableList<Music> songs, int playlistID) {
		this.nomePlaylist = nomePlaylist;
		this.songs = songs;
		this.playlistID= playlistID;
	}
	
	public Playlist(String nomePlaylist) {
		this.nomePlaylist = nomePlaylist;
	}
	
	public Playlist(String nomePlaylist, int playlistID) {
		this.nomePlaylist = nomePlaylist;
		this.playlistID= playlistID;
	}
		
	public static int getPlaylistID() {
		 return playlistID;
	}

	public String getNomePlaylist() {
		return nomePlaylist.toString();
	}
	
	public ObservableList<Music> getSongs() {
		return songs;
	}

	
	public int setPlaylistID(int playlistID) {
		return playlistID;
	}
	
	
}



