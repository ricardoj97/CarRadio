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
import pt.iade.carradio.controllers.PlaylistController;
import pt.iade.carradio.models.Music;
import pt.iade.carradio.models.Playlist;

public final class PlaylistDAO {
	private PlaylistDAO() {}
	
	public static ObservableList<Playlist> getPlaylists(int playlistID) {
		ObservableList<Playlist> playlists=FXCollections.observableArrayList();
		Connection con = DBConnector.getConnection();
		String sql = "SELECT NomePlaylist FROM Playlists WHERE PlaylistID = ?;";
		try (PreparedStatement stat = con.prepareStatement(sql)) {
			stat.setInt(1, playlistID);
			try (ResultSet rs = stat.executeQuery()) {
				while (rs.next()) {
					String nomePlaylist = rs.getString("NomePlaylist");
					playlists.add(new Playlist(nomePlaylist));
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return playlists;
	}

}


