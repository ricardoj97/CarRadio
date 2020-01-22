package pt.iade.carradio.models.daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import pt.iade.carradio.models.Music;
import pt.iade.carradio.controllers.GenreController;
import pt.iade.carradio.controllers.PlaylistController;

/**
 * Esta classe � a respons�vel por ir buscar � base dados os dados relativos �s m�sicas.
 * @author ricardo.joaquim 
 * @author bruno.flores
 *
 */

public final class MusicDAO {
	private MusicDAO() {}

	/**
	 * M�todo que retorna uma lista das m�sicas de uma determinada playlist.
	 * @param playlistID
	 */
	
	public static ObservableList<Music> getSongs(int playlistID) {
		ObservableList<Music> songs=FXCollections.observableArrayList();
		Connection con = DBConnector.getConnection();
		String sql = "select m.NomeMusica, a.NomeArtista, m.Duracao, m.Imagem, p.PlaylistID from MusicasPlaylists mp join Musicas m on m.MusicaID=mp.MusicaID join Playlists p on p.PlaylistID=mp.PlaylistID join Artistas a on a.ArtistaID=m.ArtistaID where mp.PlaylistID=?;";
		try (PreparedStatement stat = con.prepareStatement(sql)) {
			stat.setInt(1, PlaylistController.getPlaylistClicked());
			try (ResultSet rs = stat.executeQuery()) {
				while (rs.next()) {
					String nomeMusica = rs.getString("NomeMusica");
					String nomeArtista = rs.getString("NomeArtista");
					String  linkImagem=rs.getString("Imagem");
					LocalTime duracao = LocalTime.parse(rs.getString("Duracao"), DateTimeFormatter.ofPattern("HH:mm:ss"));
					songs.add(new Music(nomeMusica, nomeArtista, duracao, linkImagem));
				}
				
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return songs;
	}

	/**
	 * M�todo que vai buscar � base dados o caminho da imagem de cada m�sica
	 * @return
	 */
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
	
	/**
	 * M�todo que vai buscar � base dados o nome da m�sica para colocar no Player.
	 */
	
	public static String getNomeMusica1(int playlistID) {
		String nomeMusica1 = "";
		Connection conn = DBConnector.getConnection();
		String sql = "select m.NomeMusica from MusicasPlaylists mp join Musicas m on m.MusicaID=mp.MusicaID join Playlists p on p.PlaylistID=mp.PlaylistID where mp.PlaylistID=? LIMIT 1;";
		try (PreparedStatement stat = conn.prepareStatement(sql)) {
			stat.setInt(1, PlaylistController.getPlaylistClicked());
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
			stat.setInt(1, PlaylistController.getPlaylistClicked());
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
	


public static String getNomeArtista1(int playlistID) {
	String nomeArtista1 = "";
	Connection conn = DBConnector.getConnection();
	String sql = "select a.NomeArtista from MusicasPlaylists mp join Musicas m on m.MusicaID=mp.MusicaID join Playlists p on p.PlaylistID=mp.PlaylistID join Artistas a on a.ArtistaID=m.ArtistaID where mp.PlaylistID=? LIMIT 1;";
	try (PreparedStatement stat = conn.prepareStatement(sql)) {
		stat.setInt(1, PlaylistController.getPlaylistClicked());
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

/**
 * M�todo que retorna da base dados todas as m�sicas de acordo com o g�nero escolhido.
 * @param genreClicked
 * @return
 */
	
public static ObservableList<Music> getSongsByGenre(int genreClicked) {
	ObservableList<Music> songsG=FXCollections.observableArrayList();
	Connection con = DBConnector.getConnection();
	String sql = "select m.NomeMusica, a.NomeArtista, m.Duracao from Musicas m join Artistas a on a.ArtistaID=m.ArtistaID where GeneroID=?;";
	try (PreparedStatement stat = con.prepareStatement(sql)) {
		stat.setInt(1, GenreController.getGenreClicked());
		try (ResultSet rs = stat.executeQuery()) {
			while (rs.next()) {
				String nomeMusica = rs.getString("NomeMusica");
				String nomeArtista = rs.getString("NomeArtista");
				LocalTime duracao = LocalTime.parse(rs.getString("Duracao"), DateTimeFormatter.ofPattern("HH:mm:ss"));
				songsG.add(new Music(nomeMusica, nomeArtista, duracao));
				System.out.println(nomeMusica);
			}
		}
	} catch (SQLException e) {
		e.printStackTrace();
	}
	return songsG;
}

}








