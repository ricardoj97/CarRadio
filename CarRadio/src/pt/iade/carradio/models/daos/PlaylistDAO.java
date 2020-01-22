package pt.iade.carradio.models.daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import pt.iade.carradio.controllers.PlaylistController;
import pt.iade.carradio.controllers.UserController;
import pt.iade.carradio.models.Playlist;

/**
 * Esta classe é a responsável por ir buscar à base dados os dados relativos às playlists.
 * @author ricardo.joaquim 
 * @author bruno.flores
 *
 */

public final class PlaylistDAO {
	private PlaylistDAO() {}
	
	/**
	 * Método que retorna as playlists de acordo com o utilziador selecionado.
	 * @param userClicked
	 * @return
	 */
	public static ObservableList<Playlist> getPlaylists(int userClicked) {
		ObservableList<Playlist> playlists=FXCollections.observableArrayList();
		Connection con = DBConnector.getConnection();
		String sql = "SELECT PlaylistID, NomePlaylist FROM Playlists WHERE Utilizador = ?;";
		try (PreparedStatement stat = con.prepareStatement(sql)) {
			stat.setInt(1, UserController.getUserClicked());
			try (ResultSet rs = stat.executeQuery()) {
				while (rs.next()) {
					int playlistID = rs.getInt("PlaylistID");
					String nomePlaylist = rs.getString("NomePlaylist");
					playlists.add(new Playlist(nomePlaylist, playlistID));
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return playlists;
	}
	
	/**
	 * Método que retorna o nome da playlist selecionada
	 */
	
	public static String getPlaylistChosen(int playlistID) {
		String nomePlaylist1 = "";
		Connection conn = DBConnector.getConnection();
		String sql = "select NomePlaylist FROM Playlists WHERE PlaylistID = ?;";
		try (PreparedStatement stat = conn.prepareStatement(sql)) {
			stat.setInt(1, PlaylistController.getPlaylistClicked());
			try (ResultSet rs = stat.executeQuery()) {
				while (rs.next()) {
					nomePlaylist1 = rs.getString("NomePlaylist");
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return nomePlaylist1;
	}










	

}



