package pt.iade.carradio.models.daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
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
import pt.iade.carradio.models.Playlist;
import pt.iade.carradio.controllers.MusicController;

public final class MusicDAO {
	private MusicDAO() {}

	public static ObservableList<Music> getSongs(int playlistID) {
		ObservableList<Music> songs=FXCollections.observableArrayList();
		Connection con = DBConnector.getConnection();
		String sql = "select m.NomeMusica, a.NomeArtista, m.Duracao, m.Imagem, p.PlaylistID from MusicasPlaylists mp join Musicas m on m.MusicaID=mp.MusicaID join Playlists p on p.PlaylistID=mp.PlaylistID join Artistas a on a.ArtistaID=m.ArtistaID where mp.PlaylistID=?;";
		try (PreparedStatement stat = con.prepareStatement(sql)) {
			stat.setInt(1, playlistID);
			try (ResultSet rs = stat.executeQuery()) {
				while (rs.next()) {
					String nomeMusica = rs.getString("NomeMusica");
					String nomeArtista = rs.getString("NomeArtista");
					String  imagem=rs.getString("Imagem");
					LocalTime duracao = LocalTime.parse(rs.getString("Duracao"), DateTimeFormatter.ofPattern("HH:mm:ss"));
					songs.add(new Music(nomeMusica, nomeArtista, duracao, imagem));
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return songs;
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
	
	public static String getNomeMusica1(int playlistID) {
		
		String nomeMusica1 = "";
		
		Connection conn = DBConnector.getConnection();
		String sql = "select m.NomeMusica from MusicasPlaylists mp join Musicas m on m.MusicaID=mp.MusicaID join Playlists p on p.PlaylistID=mp.PlaylistID where mp.PlaylistID=? LIMIT 1;";
		try (PreparedStatement stat = conn.prepareStatement(sql)) {
			stat.setInt(1, playlistID);
			try (ResultSet rs = stat.executeQuery()) {
				while (rs.next()) {
					nomeMusica1 = rs.getString("NomeMusica");
		
					
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return nomeMusica1;
	}
	
public static String getImagem1(int playlistID) {
		
		String imagem1 = "";
		
		Connection conn = DBConnector.getConnection();
		String sql = "select m.Imagem from MusicasPlaylists mp join Musicas m on m.MusicaID=mp.MusicaID join Playlists p on p.PlaylistID=mp.PlaylistID where mp.PlaylistID=? LIMIT 1;";
		try (PreparedStatement stat = conn.prepareStatement(sql)) {
			stat.setInt(1, playlistID);
			try (ResultSet rs = stat.executeQuery()) {
				while (rs.next()) {
					imagem1 = rs.getString("Imagem");
		
					
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return imagem1;
	}
	
//public static LocalTime getDuracao1(int playlistID) {
//	
//	
//	
//	Connection conn = DBConnector.getConnection();
//	String sql = "select m.Duracao from MusicasPlaylists mp join Musicas m on m.MusicaID=mp.MusicaID join Playlists p on p.PlaylistID=mp.PlaylistID where mp.PlaylistID=? LIMIT 1;";
//	try (PreparedStatement stat = conn.prepareStatement(sql)) {
//		stat.setInt(1, playlistID);
//		try (ResultSet rs = stat.executeQuery()) {
//			while (rs.next()) {
//				LocalTime duracao1 = LocalTime.parse(rs.getString("Duracao"), DateTimeFormatter.ofPattern("HH:mm:ss"));
//	
//				
//			}
//		}
//	} catch (SQLException e) {
//		e.printStackTrace();
//	}
//	return duracao1;
//}

public static String getNomeArtista1(int playlistID) {
	
	String nomeArtista1 = "";
	
	Connection conn = DBConnector.getConnection();
	String sql = "select a.NomeArtista from MusicasPlaylists mp join Musicas m on m.MusicaID=mp.MusicaID join Playlists p on p.PlaylistID=mp.PlaylistID join Artistas a on a.ArtistaID=m.ArtistaID where mp.PlaylistID=? LIMIT 1;";
	try (PreparedStatement stat = conn.prepareStatement(sql)) {
		stat.setInt(1, playlistID);
		try (ResultSet rs = stat.executeQuery()) {
			while (rs.next()) {
				nomeArtista1 = rs.getString("NomeArtista");
			}
		}
	} catch (SQLException e) {
		e.printStackTrace();
	}
	return nomeArtista1;
}
	
}







