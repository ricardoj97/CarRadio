package pt.iade.carradio.models.daos;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Time;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import pt.iade.carradio.models.Music;

public final class MusicDAO {
	private MusicDAO() {}
	
	
	public static List<Music> getMusics()  {
		List<Music> songs = new ArrayList<>();
		Connection conn = DBConnector.getConnection();
		
		try (	Statement stat = conn.createStatement();
				ResultSet rs = stat.executeQuery(
						"Select g.Genero as 'GeneroMSkdjhs', NomeMusica, Imagem, Artista, Duracao from musicas join genero g on g.generoID=musicas.genero;")){
			while (rs.next()) {
				
				String  nomeMusica=rs.getString("nomeMusica");
				String  nomeGenero=rs.getString("GeneroMSkdjhs");
				String  imagem=rs.getString("imagem");
				int  artista=rs.getInt("artista");
				Time duracao = (rs.getTime("duracao"));
			

				songs.add(new Music(nomeMusica, imagem, artista, duracao));
				System.out.println(nomeGenero + " - " +nomeMusica +" - "+ duracao);
			}	
		} catch (SQLException e) {
			e.printStackTrace();
		} 
		System.out.println(Arrays.toString(songs.toArray()));
		return songs;
	}
}