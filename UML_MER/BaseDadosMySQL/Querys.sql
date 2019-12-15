-- QUERYS A UTILIZAR NA APLICAÇÃO

-- Todas as músicas com o seu artista e sua duração.
Select m.NomeMusica, a.NomeArtista, m.Duracao 
from Musicas m 
join Artistas a on a.ArtistaID=m.ArtistaID;

-- Selecionar apenas a 1º música de uma determinada playlist
select m.NomeMusica 
from MusicasPlaylists mp 
join Musicas m on m.MusicaID=mp.MusicaID 
join Playlists p on p.PlaylistID=mp.PlaylistID 
where mp.PlaylistID=2 LIMIT 1;

-- ________________________________________________________________________________________________________
-- QUERYS GERAIS PARA A CADEIRA DE BASE DADOS

-- Quais as Playlists mais longas? 
select p.NomePlaylist, SEC_TO_TIME(SUM(TIME_TO_SEC(Duracao))) as 'Duração Total' 
from MusicasPlaylists mp
join Musicas m on m.MusicaID=mp.MusicaID 
join Playlists p on p.PlaylistID=mp.PlaylistID
group by p.PlaylistID
order by SEC_TO_TIME(SUM(TIME_TO_SEC(Duracao))) desc;
 
-- Número de músicas por playlist
select p.NomePlaylist, COUNT(m.MusicaID) as 'Nº Musicas p/Playlist' 
from MusicasPlaylists mp 
join Musicas m on m.MusicaID=mp.MusicaID 
join Playlists p on p.PlaylistID=mp.PlaylistID
group by p.PlaylistID;

-- Que músicas existem de artistas portugueses?
select a.NomeArtista, m.NomeMusica 
from Artistas a
join Musicas m on m.ArtistaID = a.ArtistaID
where a.Nacionalidade = 'Portuguesa';

-- Que músicas pertencem ao utilizador Ricardo que sejam da Playlist 'Work' cujo género seja Hip-hop / Pop / R&B?
select u.NomeUtilizador, p.NomePlaylist, m.NomeMusica, a.NomeArtista, g.NomeGenero
from MusicasPlaylists mp 
inner join Musicas m on m.MusicaID=mp.MusicaID 
inner join Playlists p on p.PlaylistID=mp.PlaylistID
left join Artistas a on a.ArtistaID=m.ArtistaID
left join Generos g on g.GeneroID=m.GeneroID
right join Utilizadores u on u.Utilizador=p.Utilizador
where u.Utilizador=1 and g.GeneroID in (1,5,7) and p.NomePlaylist='Work';

-- 


-- VIEWS
select * from AllSongsByPlaylist where NomePlaylist='Chill'; -- Músicas da Playlist 'Chill'.

-- STORE PROCEDURES
call NumeroMusicas(); -- Saber quantas músicas existem na base dados.
call NumeroChamadasPorDia('2019-11-13'); -- Saber quantos registos chamadas existiram no dia 13/11/2019.


 