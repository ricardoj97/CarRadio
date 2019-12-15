create table Utilizadores
(Utilizador INTEGER NOT NULL AUTO_INCREMENT, NomeUtilizador VARCHAR(50), DataNascimento DATE, Idade INTEGER, DataUltimoLogin DATETIME, CONSTRAINT UtilizadorPK PRIMARY KEY(Utilizador));


create table GrupoContactos 
(Grupo INTEGER NOT NULL AUTO_INCREMENT, NomeGrupo VARCHAR(20), Utilizador INTEGER,
 CONSTRAINT GrupoPk PRIMARY KEY(Grupo), CONSTRAINT UtilizadorGrupoFK FOREIGN KEY(Utilizador) REFERENCES Utilizadores(Utilizador));

 
create table Contactos 
(ContactoID INTEGER NOT NULL AUTO_INCREMENT, NomeContacto VARCHAR(50), Grupo INTEGER, Telemovel INTEGER, TelemovelSecundario INTEGER, Favorito BOOLEAN, DataCriacao DATETIME, DataUltimaAtualizacao DATETIME, Utilizador INTEGER,
 CONSTRAINT ContactoPk PRIMARY KEY(ContactoID), CONSTRAINT GrupoFK FOREIGN KEY(Grupo) REFERENCES GrupoContactos(Grupo), CONSTRAINT UtilizadorContactoFK FOREIGN KEY(Utilizador) REFERENCES Utilizadores(Utilizador));

 
 create table RegistoChamadas 
(ChamadaID INTEGER NOT NULL AUTO_INCREMENT, Contacto INTEGER, DataHora DATETIME, Duracao TIME, Utilizador INTEGER,
 CONSTRAINT ChamadaPk PRIMARY KEY(ChamadaID), CONSTRAINT ContactoFK FOREIGN KEY(Contacto) REFERENCES Contactos(ContactoID), CONSTRAINT UtilizadorChamadaFK FOREIGN KEY(Utilizador) REFERENCES Utilizadores(Utilizador));

 
 create table Playlists 
(PlaylistID INTEGER NOT NULL AUTO_INCREMENT, NomePlaylist VARCHAR(30), Utilizador INTEGER, DataUltimoRegisto DATETIME,
 CONSTRAINT PlaylistPk PRIMARY KEY(PlaylistID), 
 CONSTRAINT UtilizadorPlaylistFK FOREIGN KEY(Utilizador) REFERENCES Utilizadores(Utilizador));

 
   create table Generos 
(GeneroID INTEGER NOT NULL AUTO_INCREMENT, NomeGenero VARCHAR(30), CONSTRAINT GeneroPk PRIMARY KEY(GeneroID));
 
create table Artistas
(ArtistaID INTEGER NOT NULL AUTO_INCREMENT, NomeArtista VARCHAR(30), Nacionalidade VARCHAR(20), CONSTRAINT ArtistaPk PRIMARY KEY(ArtistaID));
 
   create table Musicas 
(MusicaID INTEGER NOT NULL AUTO_INCREMENT, NomeMusica VARCHAR(30), Imagem VARCHAR(150), ArtistaID INTEGER, Duracao TIME, GeneroID INTEGER, 
 CONSTRAINT MusicaPK PRIMARY KEY(MusicaID),
 CONSTRAINT ArtistaPK FOREIGN KEY(ArtistaID) REFERENCES Artistas(ArtistaID),
 CONSTRAINT GeneroFK FOREIGN KEY(GeneroID) REFERENCES Generos(GeneroID)); 
 
 
    create table MusicasPlaylists 
(MusicaID INTEGER, PlaylistID INTEGER,  
 CONSTRAINT MusicaPlaylistPK PRIMARY KEY(MusicaID, PlaylistID),
 CONSTRAINT MusicaPlaylistFK FOREIGN KEY(MusicaID) REFERENCES Musicas(MusicaID),
 CONSTRAINT PlaylistMusicaFK FOREIGN KEY(PlaylistID) REFERENCES Playlists(PlaylistID));
 
 -- VIEWS
 -- Obter uma lista de todas as playlists com todas as músicas e seus artistas existentes na base dados
CREATE VIEW AllSongsByPlaylist AS
select p.NomePlaylist, m.NomeMusica, a.NomeArtista
from MusicasPlaylists mp 
join Musicas m on m.MusicaID=mp.MusicaID 
join Playlists p on p.PlaylistID=mp.PlaylistID
join Artistas a on a.ArtistaID=m.ArtistaID;

-- TRIGGERS
-- Sempre que existe alguma atualização num contacto a DataUltimaAtualizacao é registada.
CREATE TRIGGER TRG_DataUltimaAtualizacao_Contactos
BEFORE UPDATE ON Contactos
FOR EACH ROW
  SET NEW.DataUltimaAtualizacao = NOW();
  
-- STORE PROCEDURE
-- Obter o número de músicas existentes na base dados.
DELIMITER //
CREATE PROCEDURE NumeroMusicas()
BEGIN
DECLARE n_musicas INT DEFAULT 0;
SELECT COUNT(*) INTO n_musicas
FROM Musicas;
SELECT n_musicas from dual;
END //
DELIMITER ;  

-- Saber quantos registos de chamadas existiram num determinado dia.
DELIMITER //
CREATE PROCEDURE NumeroChamadasPorDia(IN dia DATE)
BEGIN
DECLARE n_chamadas INT DEFAULT 0;
SELECT COUNT(*) INTO n_chamadas
FROM RegistoChamadas
where DATE(datahora)= dia;
SELECT dia as 'Dia', n_chamadas as 'Nº Chamadas' from dual;
END //
DELIMITER ;



/*
drop table MusicasPlaylists;
drop table Musicas;
drop table Artistas;
drop table Generos;
drop table Playlists;
drop table RegistoChamadas;
drop table Contactos;
drop table GrupoContactos;
drop table Utilizadores;
drop view AllSongsByPlaylist;
drop procedure NumeroMusicas;
drop procedure NumeroChamadasPorDia;

*/

