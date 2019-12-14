package pt.iade.carradio.models.daos;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Time;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.cell.PropertyValueFactory;
import pt.iade.carradio.models.Music;
import pt.iade.carradio.controllers.MusicController;

public final class MusicDAO {
	private MusicDAO() {}
	
	public static ObservableList<Music> getSongs()  {
		ObservableList<Music> songs = FXCollections.observableArrayList();
		Connection conn = DBConnector.getConnection();
		
		try (	Statement stat = conn.createStatement();
				ResultSet rs = stat.executeQuery(
						"Select m.NomeMusica, a.NomeArtista, m.Duracao, m.Imagem from Musicas m join Artistas a on a.ArtistaID=m.ArtistaID;")){
			
			while (rs.next()) {
				String  nomeMusica=rs.getString("NomeMusica");
				String  nomeArtista=rs.getString("NomeArtista");
				String  imagem=rs.getString("Imagem");
				LocalTime duracao = LocalTime.parse(rs.getString("Duracao"), DateTimeFormatter.ofPattern("HH:mm:ss"));
				songs.add(new Music(nomeMusica, nomeArtista,duracao, imagem));
			}	
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}
	return songs;
	}
	
	public static String getNomePlaylist()  {
		String nomePlaylist = null;
		Connection conn = DBConnector.getConnection();
		
		try (	Statement stat = conn.createStatement();
				ResultSet rs = stat.executeQuery(
						"Select NomePlaylist from Playlists where PlaylistID=2;")){
			
			while (rs.next()) {
				
				nomePlaylist=rs.getString("NomePlaylist");
				
				
			}	
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}
	return nomePlaylist;

	}
	
	public static String getImagem()  {
		String imagem = null;
		Connection conn = DBConnector.getConnection();
		
		try (	Statement stat = conn.createStatement();
				ResultSet rs = stat.executeQuery(
						"Select Imagem from Musicas")){
			
			while (rs.next()) {
				
				imagem=rs.getString("Imagem");
				
				
			}	
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}
	return imagem;

	}


}