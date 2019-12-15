-- Utilizadores

insert into Utilizadores (NomeUtilizador, DataNascimento, Idade, DataUltimoLogin) Values ('Ricardo', '1997/08/17',TIMESTAMPDIFF(YEAR, datanascimento, CURDATE()), SYSDATE());
insert into Utilizadores (NomeUtilizador, DataNascimento, Idade, DataUltimoLogin) Values ('Bruno', '1997/02/04',TIMESTAMPDIFF(YEAR, datanascimento, CURDATE()), SYSDATE());
insert into Utilizadores (NomeUtilizador, DataNascimento, Idade, DataUltimoLogin) Values ('Maria', '1996/09/12',TIMESTAMPDIFF(YEAR, datanascimento, CURDATE()), SYSDATE());

-- Grupo Contactos

insert into GrupoContactos (NomeGrupo, Utilizador) Values ('Família', 1);
insert into GrupoContactos (NomeGrupo, Utilizador) Values ('Amigos', 1);
insert into GrupoContactos (NomeGrupo, Utilizador) Values ('Escola', 1);
insert into GrupoContactos (NomeGrupo, Utilizador) Values ('Trabalho', 1);
insert into GrupoContactos (NomeGrupo, Utilizador) Values ('Familiares', 2);
insert into GrupoContactos (NomeGrupo, Utilizador) Values ('Futebol', 2);
insert into GrupoContactos (NomeGrupo, Utilizador) Values ('Empresa', 2);
insert into GrupoContactos (NomeGrupo, Utilizador) Values ('Faculdade', 3);
insert into GrupoContactos (NomeGrupo, Utilizador) Values ('Viagens', 3);

-- Contactos

insert into Contactos (NomeContacto, Grupo, Telemovel, TelemovelSecundario, Favorito, DataCriacao, DataUltimaAtualizacao, Utilizador) values('Santiago Silva',1,936045920,216348926,0,SYSDATE(),SYSDATE(),1);
insert into Contactos (NomeContacto, Grupo, Telemovel, TelemovelSecundario, Favorito, DataCriacao, DataUltimaAtualizacao, Utilizador) values('João Santos',3,911568437,214949131,0,SYSDATE(),SYSDATE(),1);
insert into Contactos (NomeContacto, Grupo, Telemovel, TelemovelSecundario, Favorito, DataCriacao, DataUltimaAtualizacao, Utilizador) values('Francisco Ferreira',2,932516135,NULL,0,SYSDATE(),SYSDATE(),1);
insert into Contactos (NomeContacto, Grupo, Telemovel, TelemovelSecundario, Favorito, DataCriacao, DataUltimaAtualizacao, Utilizador) values('Rodrigo Pereira',1,917873495,NULL,0,SYSDATE(),SYSDATE(),1);
insert into Contactos (NomeContacto, Grupo, Telemovel, TelemovelSecundario, Favorito, DataCriacao, DataUltimaAtualizacao, Utilizador) values('Martim Oliveira',2,969555544,NULL,1,SYSDATE(),SYSDATE(),1);
insert into Contactos (NomeContacto, Grupo, Telemovel, TelemovelSecundario, Favorito, DataCriacao, DataUltimaAtualizacao, Utilizador) values('Afonso Costa',1,967800414,NULL,0,SYSDATE(),SYSDATE(),1);
insert into Contactos (NomeContacto, Grupo, Telemovel, TelemovelSecundario, Favorito, DataCriacao, DataUltimaAtualizacao, Utilizador) values('Tomás Rodrigues',2,936348926,218474642,0,SYSDATE(),SYSDATE(),1);
insert into Contactos (NomeContacto, Grupo, Telemovel, TelemovelSecundario, Favorito, DataCriacao, DataUltimaAtualizacao, Utilizador) values('Miguel Martins',2,914949131,NULL,0,SYSDATE(),SYSDATE(),1);
insert into Contactos (NomeContacto, Grupo, Telemovel, TelemovelSecundario, Favorito, DataCriacao, DataUltimaAtualizacao, Utilizador) values('Duarte Jesus',4,961589237,NULL,1,SYSDATE(),SYSDATE(),1);
insert into Contactos (NomeContacto, Grupo, Telemovel, TelemovelSecundario, Favorito, DataCriacao, DataUltimaAtualizacao, Utilizador) values('Gabriel Sousa',3,918790276,NULL,1,SYSDATE(),SYSDATE(),1);
insert into Contactos (NomeContacto, Grupo, Telemovel, TelemovelSecundario, Favorito, DataCriacao, DataUltimaAtualizacao, Utilizador) values('Lourenço Fernandes',4,915981954,NULL,0,SYSDATE(),SYSDATE(),1);
insert into Contactos (NomeContacto, Grupo, Telemovel, TelemovelSecundario, Favorito, DataCriacao, DataUltimaAtualizacao, Utilizador) values('Gonçalo Gonçalves',3,968474642,NULL,1,SYSDATE(),SYSDATE(),1);
insert into Contactos (NomeContacto, Grupo, Telemovel, TelemovelSecundario, Favorito, DataCriacao, DataUltimaAtualizacao, Utilizador) values('Pedro Gomes',4,964584902,NULL,0,SYSDATE(),SYSDATE(),1);
insert into Contactos (NomeContacto, Grupo, Telemovel, TelemovelSecundario, Favorito, DataCriacao, DataUltimaAtualizacao, Utilizador) values('Guilherme Lopes',1,933026472,NULL,0,SYSDATE(),SYSDATE(),1);
insert into Contactos (NomeContacto, Grupo, Telemovel, TelemovelSecundario, Favorito, DataCriacao, DataUltimaAtualizacao, Utilizador) values('Tiago Marques',3,933527447,NULL,1,SYSDATE(),SYSDATE(),1);
insert into Contactos (NomeContacto, Grupo, Telemovel, TelemovelSecundario, Favorito, DataCriacao, DataUltimaAtualizacao, Utilizador) values('Dinis Alves',4,934606210,213078414,0,SYSDATE(),SYSDATE(),1);
insert into Contactos (NomeContacto, Grupo, Telemovel, TelemovelSecundario, Favorito, DataCriacao, DataUltimaAtualizacao, Utilizador) values('Rafael Almeida',2,934950092,219952726,0,SYSDATE(),SYSDATE(),1);
insert into Contactos (NomeContacto, Grupo, Telemovel, TelemovelSecundario, Favorito, DataCriacao, DataUltimaAtualizacao, Utilizador) values('Diogo Ribeiro',1,931771919,218886036,0,SYSDATE(),SYSDATE(),1);
insert into Contactos (NomeContacto, Grupo, Telemovel, TelemovelSecundario, Favorito, DataCriacao, DataUltimaAtualizacao, Utilizador) values('Lucas Pinto',1,937896160,217082200,0,SYSDATE(),SYSDATE(),1);
insert into Contactos (NomeContacto, Grupo, Telemovel, TelemovelSecundario, Favorito, DataCriacao, DataUltimaAtualizacao, Utilizador) values('Salvador Carvalho',2,964774285,217808749,0,SYSDATE(),SYSDATE(),1);
insert into Contactos (NomeContacto, Grupo, Telemovel, TelemovelSecundario, Favorito, DataCriacao, DataUltimaAtualizacao, Utilizador) values('Gustavo Teixeira',3,965639910,218110900,0,SYSDATE(),SYSDATE(),1);
insert into Contactos (NomeContacto, Grupo, Telemovel, TelemovelSecundario, Favorito, DataCriacao, DataUltimaAtualizacao, Utilizador) values('David Moreira',2,917086938,218600292,0,SYSDATE(),SYSDATE(),1);
insert into Contactos (NomeContacto, Grupo, Telemovel, TelemovelSecundario, Favorito, DataCriacao, DataUltimaAtualizacao, Utilizador) values('Vicente Correia',3,931384618,213949939,0,SYSDATE(),SYSDATE(),1);
insert into Contactos (NomeContacto, Grupo, Telemovel, TelemovelSecundario, Favorito, DataCriacao, DataUltimaAtualizacao, Utilizador) values('Simão Mendes',1,913406451,NULL,0,SYSDATE(),SYSDATE(),1);
insert into Contactos (NomeContacto, Grupo, Telemovel, TelemovelSecundario, Favorito, DataCriacao, DataUltimaAtualizacao, Utilizador) values('José Nunes',1,962993225,NULL,0,SYSDATE(),SYSDATE(),1);
insert into Contactos (NomeContacto, Grupo, Telemovel, TelemovelSecundario, Favorito, DataCriacao, DataUltimaAtualizacao, Utilizador) values('Mateus Soares',2,933682082,NULL,0,SYSDATE(),SYSDATE(),1);
insert into Contactos (NomeContacto, Grupo, Telemovel, TelemovelSecundario, Favorito, DataCriacao, DataUltimaAtualizacao, Utilizador) values('Diego Vieira',2,933078414,NULL,1,SYSDATE(),SYSDATE(),1);
insert into Contactos (NomeContacto, Grupo, Telemovel, TelemovelSecundario, Favorito, DataCriacao, DataUltimaAtualizacao, Utilizador) values('Manuel Monteiro',2,919952726,213982830,0,SYSDATE(),SYSDATE(),1);
insert into Contactos (NomeContacto, Grupo, Telemovel, TelemovelSecundario, Favorito, DataCriacao, DataUltimaAtualizacao, Utilizador) values('Henrique Cardoso',6,938886036,215680909,1,SYSDATE(),SYSDATE(),2);
insert into Contactos (NomeContacto, Grupo, Telemovel, TelemovelSecundario, Favorito, DataCriacao, DataUltimaAtualizacao, Utilizador) values('António Rocha',6,967082200,213472671,0,SYSDATE(),SYSDATE(),2);
insert into Contactos (NomeContacto, Grupo, Telemovel, TelemovelSecundario, Favorito, DataCriacao, DataUltimaAtualizacao, Utilizador) values('Daniel Raposo',6,967808749,215218840,1,SYSDATE(),SYSDATE(),2);
insert into Contactos (NomeContacto, Grupo, Telemovel, TelemovelSecundario, Favorito, DataCriacao, DataUltimaAtualizacao, Utilizador) values('Vasco Neves',7,918110900,211988653,0,SYSDATE(),SYSDATE(),2);
insert into Contactos (NomeContacto, Grupo, Telemovel, TelemovelSecundario, Favorito, DataCriacao, DataUltimaAtualizacao, Utilizador) values('Leonardo Coelho',6,968600292,NULL,1,SYSDATE(),SYSDATE(),2);
insert into Contactos (NomeContacto, Grupo, Telemovel, TelemovelSecundario, Favorito, DataCriacao, DataUltimaAtualizacao, Utilizador) values('Bernardo Cruz',6,933949939,NULL,1,SYSDATE(),SYSDATE(),2);
insert into Contactos (NomeContacto, Grupo, Telemovel, TelemovelSecundario, Favorito, DataCriacao, DataUltimaAtualizacao, Utilizador) values('André Cunha',6,967273092,NULL,1,SYSDATE(),SYSDATE(),2);
insert into Contactos (NomeContacto, Grupo, Telemovel, TelemovelSecundario, Favorito, DataCriacao, DataUltimaAtualizacao, Utilizador) values('Luís Pires',6,933982830,NULL,0,SYSDATE(),SYSDATE(),2);
insert into Contactos (NomeContacto, Grupo, Telemovel, TelemovelSecundario, Favorito, DataCriacao, DataUltimaAtualizacao, Utilizador) values('Enzo Ramos',7,915680909,218392522,0,SYSDATE(),SYSDATE(),2);
insert into Contactos (NomeContacto, Grupo, Telemovel, TelemovelSecundario, Favorito, DataCriacao, DataUltimaAtualizacao, Utilizador) values('Eduardo Reis',7,913472671,218893938,0,SYSDATE(),SYSDATE(),2);
insert into Contactos (NomeContacto, Grupo, Telemovel, TelemovelSecundario, Favorito, DataCriacao, DataUltimaAtualizacao, Utilizador) values('Alexandre Simões',6,935218840,217554129,0,SYSDATE(),SYSDATE(),2);
insert into Contactos (NomeContacto, Grupo, Telemovel, TelemovelSecundario, Favorito, DataCriacao, DataUltimaAtualizacao, Utilizador) values('Isaac Antunes',7,961988653,NULL,0,SYSDATE(),SYSDATE(),2);
insert into Contactos (NomeContacto, Grupo, Telemovel, TelemovelSecundario, Favorito, DataCriacao, DataUltimaAtualizacao, Utilizador) values('Kevin Matos',7,938392522,NULL,0,SYSDATE(),SYSDATE(),2);
insert into Contactos (NomeContacto, Grupo, Telemovel, TelemovelSecundario, Favorito, DataCriacao, DataUltimaAtualizacao, Utilizador) values('Rúben Fonseca',5,968893938,NULL,0,SYSDATE(),SYSDATE(),2);
insert into Contactos (NomeContacto, Grupo, Telemovel, TelemovelSecundario, Favorito, DataCriacao, DataUltimaAtualizacao, Utilizador) values('Filipe Machado',6,967554129,NULL,0,SYSDATE(),SYSDATE(),2);
insert into Contactos (NomeContacto, Grupo, Telemovel, TelemovelSecundario, Favorito, DataCriacao, DataUltimaAtualizacao, Utilizador) values('Matias Araújo',7,932312065,214594672,0,SYSDATE(),SYSDATE(),2);
insert into Contactos (NomeContacto, Grupo, Telemovel, TelemovelSecundario, Favorito, DataCriacao, DataUltimaAtualizacao, Utilizador) values('Leandro Barbosa',7,937277988,216525024,0,SYSDATE(),SYSDATE(),2);
insert into Contactos (NomeContacto, Grupo, Telemovel, TelemovelSecundario, Favorito, DataCriacao, DataUltimaAtualizacao, Utilizador) values('Xavier Tavares',7,915313825,NULL,1,SYSDATE(),SYSDATE(),2);
insert into Contactos (NomeContacto, Grupo, Telemovel, TelemovelSecundario, Favorito, DataCriacao, DataUltimaAtualizacao, Utilizador) values('Bruno Lourenço',7,964594672,NULL,0,SYSDATE(),SYSDATE(),2);
insert into Contactos (NomeContacto, Grupo, Telemovel, TelemovelSecundario, Favorito, DataCriacao, DataUltimaAtualizacao, Utilizador) values('Samuel Castro',7,936525024,NULL,0,SYSDATE(),SYSDATE(),2);
insert into Contactos (NomeContacto, Grupo, Telemovel, TelemovelSecundario, Favorito, DataCriacao, DataUltimaAtualizacao, Utilizador) values('Artur Figueiredo',6,915585976,NULL,0,SYSDATE(),SYSDATE(),2);
insert into Contactos (NomeContacto, Grupo, Telemovel, TelemovelSecundario, Favorito, DataCriacao, DataUltimaAtualizacao, Utilizador) values('Nuno Azevedo',6,932248216,211228055,1,SYSDATE(),SYSDATE(),2);
insert into Contactos (NomeContacto, Grupo, Telemovel, TelemovelSecundario, Favorito, DataCriacao, DataUltimaAtualizacao, Utilizador) values('Maria Freitas',5,937336601,218654805,0,SYSDATE(),SYSDATE(),2);
insert into Contactos (NomeContacto, Grupo, Telemovel, TelemovelSecundario, Favorito, DataCriacao, DataUltimaAtualizacao, Utilizador) values('Matilde Magalhães',6,935515847,219276378,1,SYSDATE(),SYSDATE(),2);
insert into Contactos (NomeContacto, Grupo, Telemovel, TelemovelSecundario, Favorito, DataCriacao, DataUltimaAtualizacao, Utilizador) values('Leonor Henriques',6,935108091,215656452,0,SYSDATE(),SYSDATE(),2);
insert into Contactos (NomeContacto, Grupo, Telemovel, TelemovelSecundario, Favorito, DataCriacao, DataUltimaAtualizacao, Utilizador) values('Carolina Lima',7,934695522,NULL,0,SYSDATE(),SYSDATE(),2);
insert into Contactos (NomeContacto, Grupo, Telemovel, TelemovelSecundario, Favorito, DataCriacao, DataUltimaAtualizacao, Utilizador) values('Beatriz Guerreiro',7,931228055,NULL,1,SYSDATE(),SYSDATE(),2);
insert into Contactos (NomeContacto, Grupo, Telemovel, TelemovelSecundario, Favorito, DataCriacao, DataUltimaAtualizacao, Utilizador) values('Mariana Batista',7,938654805,NULL,0,SYSDATE(),SYSDATE(),2);
insert into Contactos (NomeContacto, Grupo, Telemovel, TelemovelSecundario, Favorito, DataCriacao, DataUltimaAtualizacao, Utilizador) values('Ana Pinheiro',6,939276378,NULL,0,SYSDATE(),SYSDATE(),2);
insert into Contactos (NomeContacto, Grupo, Telemovel, TelemovelSecundario, Favorito, DataCriacao, DataUltimaAtualizacao, Utilizador) values('Sofia Faria',5,935656452,212816182,1,SYSDATE(),SYSDATE(),2);
insert into Contactos (NomeContacto, Grupo, Telemovel, TelemovelSecundario, Favorito, DataCriacao, DataUltimaAtualizacao, Utilizador) values('Inês Miranda',5,915456143,217875158,1,SYSDATE(),SYSDATE(),2);
insert into Contactos (NomeContacto, Grupo, Telemovel, TelemovelSecundario, Favorito, DataCriacao, DataUltimaAtualizacao, Utilizador) values('Margarida Barros',7,912816182,219117440,0,SYSDATE(),SYSDATE(),2);
insert into Contactos (NomeContacto, Grupo, Telemovel, TelemovelSecundario, Favorito, DataCriacao, DataUltimaAtualizacao, Utilizador) values('Francisca Morais',6,937875158,216752372,0,SYSDATE(),SYSDATE(),2);
insert into Contactos (NomeContacto, Grupo, Telemovel, TelemovelSecundario, Favorito, DataCriacao, DataUltimaAtualizacao, Utilizador) values('Lara Nogueira',7,969117440,NULL,0,SYSDATE(),SYSDATE(),2);
insert into Contactos (NomeContacto, Grupo, Telemovel, TelemovelSecundario, Favorito, DataCriacao, DataUltimaAtualizacao, Utilizador) values('Laura Esteves',6,936752372,NULL,0,SYSDATE(),SYSDATE(),2);
insert into Contactos (NomeContacto, Grupo, Telemovel, TelemovelSecundario, Favorito, DataCriacao, DataUltimaAtualizacao, Utilizador) values('Alice Anjos',5,915749221,NULL,0,SYSDATE(),SYSDATE(),2);
insert into Contactos (NomeContacto, Grupo, Telemovel, TelemovelSecundario, Favorito, DataCriacao, DataUltimaAtualizacao, Utilizador) values('Joana Baptista',5,965094357,NULL,0,SYSDATE(),SYSDATE(),2);
insert into Contactos (NomeContacto, Grupo, Telemovel, TelemovelSecundario, Favorito, DataCriacao, DataUltimaAtualizacao, Utilizador) values('Clara Campos',7,963497040,21,0,SYSDATE(),SYSDATE(),2);
insert into Contactos (NomeContacto, Grupo, Telemovel, TelemovelSecundario, Favorito, DataCriacao, DataUltimaAtualizacao, Utilizador) values('Diana Mota',5,936119983,21,0,SYSDATE(),SYSDATE(),2);
insert into Contactos (NomeContacto, Grupo, Telemovel, TelemovelSecundario, Favorito, DataCriacao, DataUltimaAtualizacao, Utilizador) values('Madalena Andrade',9,938533558,21,1,SYSDATE(),SYSDATE(),3);
insert into Contactos (NomeContacto, Grupo, Telemovel, TelemovelSecundario, Favorito, DataCriacao, DataUltimaAtualizacao, Utilizador) values('Mara Brito',8,915634195,NULL,0,SYSDATE(),SYSDATE(),3);
insert into Contactos (NomeContacto, Grupo, Telemovel, TelemovelSecundario, Favorito, DataCriacao, DataUltimaAtualizacao, Utilizador) values('Luana Sá',9,913158898,NULL,0,SYSDATE(),SYSDATE(),3);
insert into Contactos (NomeContacto, Grupo, Telemovel, TelemovelSecundario, Favorito, DataCriacao, DataUltimaAtualizacao, Utilizador) values('Benedita Nascimento',8,917051355,NULL,1,SYSDATE(),SYSDATE(),3);
insert into Contactos (NomeContacto, Grupo, Telemovel, TelemovelSecundario, Favorito, DataCriacao, DataUltimaAtualizacao, Utilizador) values('Constança Leite',8,931129356,NULL,0,SYSDATE(),SYSDATE(),3);
insert into Contactos (NomeContacto, Grupo, Telemovel, TelemovelSecundario, Favorito, DataCriacao, DataUltimaAtualizacao, Utilizador) values('Mafalda Abreu',8,932303997,213208219,0,SYSDATE(),SYSDATE(),3);
insert into Contactos (NomeContacto, Grupo, Telemovel, TelemovelSecundario, Favorito, DataCriacao, DataUltimaAtualizacao, Utilizador) values('Bianca Borges',9,916512729,219365138,0,SYSDATE(),SYSDATE(),3);
insert into Contactos (NomeContacto, Grupo, Telemovel, TelemovelSecundario, Favorito, DataCriacao, DataUltimaAtualizacao, Utilizador) values('Íris Melo',8,965143204,219307153,0,SYSDATE(),SYSDATE(),3);
insert into Contactos (NomeContacto, Grupo, Telemovel, TelemovelSecundario, Favorito, DataCriacao, DataUltimaAtualizacao, Utilizador) values('Sara Vaz',8,933707693,211201538,1,SYSDATE(),SYSDATE(),3);
insert into Contactos (NomeContacto, Grupo, Telemovel, TelemovelSecundario, Favorito, DataCriacao, DataUltimaAtualizacao, Utilizador) values('Camila Pinho',8,968379737,NULL,1,SYSDATE(),SYSDATE(),3);
insert into Contactos (NomeContacto, Grupo, Telemovel, TelemovelSecundario, Favorito, DataCriacao, DataUltimaAtualizacao, Utilizador) values('Gabriela Vicente',9,939651894,NULL,0,SYSDATE(),SYSDATE(),3);
insert into Contactos (NomeContacto, Grupo, Telemovel, TelemovelSecundario, Favorito, DataCriacao, DataUltimaAtualizacao, Utilizador) values('Rita Gaspar',9,911201538,NULL,1,SYSDATE(),SYSDATE(),3);
insert into Contactos (NomeContacto, Grupo, Telemovel, TelemovelSecundario, Favorito, DataCriacao, DataUltimaAtualizacao, Utilizador) values('Eva Assunção',9,968700063,NULL,0,SYSDATE(),SYSDATE(),3);
insert into Contactos (NomeContacto, Grupo, Telemovel, TelemovelSecundario, Favorito, DataCriacao, DataUltimaAtualizacao, Utilizador) values('Carlota Maia',8,919360000,213138072,0,SYSDATE(),SYSDATE(),3);
insert into Contactos (NomeContacto, Grupo, Telemovel, TelemovelSecundario, Favorito, DataCriacao, DataUltimaAtualizacao, Utilizador) values('Letícia Moura',9,939140145,214917400,0,SYSDATE(),SYSDATE(),3);
insert into Contactos (NomeContacto, Grupo, Telemovel, TelemovelSecundario, Favorito, DataCriacao, DataUltimaAtualizacao, Utilizador) values('Vitória Valente',8,933208219,213182301,1,SYSDATE(),SYSDATE(),3);
insert into Contactos (NomeContacto, Grupo, Telemovel, TelemovelSecundario, Favorito, DataCriacao, DataUltimaAtualizacao, Utilizador) values('Ema Domingues',9,939365138,213668048,1,SYSDATE(),SYSDATE(),3);
insert into Contactos (NomeContacto, Grupo, Telemovel, TelemovelSecundario, Favorito, DataCriacao, DataUltimaAtualizacao, Utilizador) values('Luísa Garcia',8,969307153,218915774,0,SYSDATE(),SYSDATE(),3);
insert into Contactos (NomeContacto, Grupo, Telemovel, TelemovelSecundario, Favorito, DataCriacao, DataUltimaAtualizacao, Utilizador) values('Catarina Carneiro',8,966043504,217326579,0,SYSDATE(),SYSDATE(),3);
insert into Contactos (NomeContacto, Grupo, Telemovel, TelemovelSecundario, Favorito, DataCriacao, DataUltimaAtualizacao, Utilizador) values('Ariana Loureiro',9,917983167,NULL,1,SYSDATE(),SYSDATE(),3);
insert into Contactos (NomeContacto, Grupo, Telemovel, TelemovelSecundario, Favorito, DataCriacao, DataUltimaAtualizacao, Utilizador) values('Yasmin Neto',9,933138072,NULL,0,SYSDATE(),SYSDATE(),3);
insert into Contactos (NomeContacto, Grupo, Telemovel, TelemovelSecundario, Favorito, DataCriacao, DataUltimaAtualizacao, Utilizador) values('Yara Amaral',8,964917400,NULL,0,SYSDATE(),SYSDATE(),3);
insert into Contactos (NomeContacto, Grupo, Telemovel, TelemovelSecundario, Favorito, DataCriacao, DataUltimaAtualizacao, Utilizador) values('Carminho Branco',8,933182301,217414690,0,SYSDATE(),SYSDATE(),3);
insert into Contactos (NomeContacto, Grupo, Telemovel, TelemovelSecundario, Favorito, DataCriacao, DataUltimaAtualizacao, Utilizador) values('Miriam Leal',9,933668048,213538158,0,SYSDATE(),SYSDATE(),3);
insert into Contactos (NomeContacto, Grupo, Telemovel, TelemovelSecundario, Favorito, DataCriacao, DataUltimaAtualizacao, Utilizador) values('Marta Pacheco',9,918915774,215506864,0,SYSDATE(),SYSDATE(),3);
insert into Contactos (NomeContacto, Grupo, Telemovel, TelemovelSecundario, Favorito, DataCriacao, DataUltimaAtualizacao, Utilizador) values('Alícia Macedo',8,937326579,213977691,0,SYSDATE(),SYSDATE(),3);
insert into Contactos (NomeContacto, Grupo, Telemovel, TelemovelSecundario, Favorito, DataCriacao, DataUltimaAtualizacao, Utilizador) values('Rafaela Paiva',8,915352444,211833557,0,SYSDATE(),SYSDATE(),3);
insert into Contactos (NomeContacto, Grupo, Telemovel, TelemovelSecundario, Favorito, DataCriacao, DataUltimaAtualizacao, Utilizador) values('Luena Matias',9,917414690,211530417,0,SYSDATE(),SYSDATE(),3);
insert into Contactos (NomeContacto, Grupo, Telemovel, TelemovelSecundario, Favorito, DataCriacao, DataUltimaAtualizacao, Utilizador) values('Victória Amorim',9,933538158,NULL,0,SYSDATE(),SYSDATE(),3);
insert into Contactos (NomeContacto, Grupo, Telemovel, TelemovelSecundario, Favorito, DataCriacao, DataUltimaAtualizacao, Utilizador) values('Núria Torres',9,915506864,NULL,0,SYSDATE(),SYSDATE(),3);
insert into Contactos (NomeContacto, Grupo, Telemovel, TelemovelSecundario, Favorito, DataCriacao, DataUltimaAtualizacao, Utilizador) values('Kyara Caniço',9,963977691,NULL,0,SYSDATE(),SYSDATE(),3);
insert into Contactos (NomeContacto, Grupo, Telemovel, TelemovelSecundario, Favorito, DataCriacao, DataUltimaAtualizacao, Utilizador) values('Helena Marques',8,961833557,NULL,0,SYSDATE(),SYSDATE(),3);
insert into Contactos (NomeContacto, Grupo, Telemovel, TelemovelSecundario, Favorito, DataCriacao, DataUltimaAtualizacao, Utilizador) values('Ricardo Joaquim',8,961530417,NULL,0,SYSDATE(),SYSDATE(),3);

-- Registo Chamadas

insert into RegistoChamadas (Contacto, DataHora, Duracao, Utilizador) values(21,'2019-11-14 17:20:50','00:01:10',1);
insert into RegistoChamadas (Contacto, DataHora, Duracao, Utilizador) values(19,'2019-11-14 15:10:35','00:02:32',1);
insert into RegistoChamadas (Contacto, DataHora, Duracao, Utilizador) values(14,'2019-11-15 16:26:39','00:00:46',1);
insert into RegistoChamadas (Contacto, DataHora, Duracao, Utilizador) values(06,'2019-11-13 12:11:16','00:01:20',1);
insert into RegistoChamadas (Contacto, DataHora, Duracao, Utilizador) values(02,'2019-11-12 09:00:05','00:31:10',1);
insert into RegistoChamadas (Contacto, DataHora, Duracao, Utilizador) values(16,'2019-10-29 22:30:30','00:10:06',1);
insert into RegistoChamadas (Contacto, DataHora, Duracao, Utilizador) values(28,'2019-11-14 17:20:50','00:01:10',2);
insert into RegistoChamadas (Contacto, DataHora, Duracao, Utilizador) values(40,'2019-11-15 15:10:35','00:02:12',2);
insert into RegistoChamadas (Contacto, DataHora, Duracao, Utilizador) values(44,'2019-11-13 16:26:39','00:03:46',2);
insert into RegistoChamadas (Contacto, DataHora, Duracao, Utilizador) values(47,'2019-11-13 12:11:16','00:11:20',2);
insert into RegistoChamadas (Contacto, DataHora, Duracao, Utilizador) values(70,'2019-10-30 10:30:30','00:10:06',3);
insert into RegistoChamadas (Contacto, DataHora, Duracao, Utilizador) values(75,'2019-11-14 13:20:50','00:01:10',3);
insert into RegistoChamadas (Contacto, DataHora, Duracao, Utilizador) values(80,'2019-11-15 19:10:35','00:00:12',3);
insert into RegistoChamadas (Contacto, DataHora, Duracao, Utilizador) values(81,'2019-11-13 17:26:39','00:01:46',3);
insert into RegistoChamadas (Contacto, DataHora, Duracao, Utilizador) values(88,'2019-11-13 12:11:16','00:11:20',3);

-- Playlists

insert into Playlists (NomePlaylist, Utilizador, DataUltimoRegisto) values('Work', '1', sysdate());
insert into Playlists (NomePlaylist, Utilizador, DataUltimoRegisto) values('Chill', '1', sysdate());
insert into Playlists (NomePlaylist, Utilizador, DataUltimoRegisto) values('Workout', '1', sysdate());
insert into Playlists (NomePlaylist, Utilizador, DataUltimoRegisto) values('Studying', '1', sysdate());
insert into Playlists (NomePlaylist, Utilizador, DataUltimoRegisto) values('Gaming', '2', sysdate());
insert into Playlists (NomePlaylist, Utilizador, DataUltimoRegisto) values('Driving', '2', sysdate());
insert into Playlists (NomePlaylist, Utilizador, DataUltimoRegisto) values('Party', '2', sysdate());
insert into Playlists (NomePlaylist, Utilizador, DataUltimoRegisto) values('Family Time', '3', sysdate());
insert into Playlists (NomePlaylist, Utilizador, DataUltimoRegisto) values('Sad Vibes', '3', sysdate());
insert into Playlists (NomePlaylist, Utilizador, DataUltimoRegisto) values('Nostalogia', '3', sysdate());
insert into Playlists (NomePlaylist, Utilizador, DataUltimoRegisto) values('Sleep', '3', sysdate());

-- Generos

insert into Generos (NomeGenero) values ('Hip-Hop');
insert into Generos (NomeGenero) values ('Rock');
insert into Generos (NomeGenero) values ('Eletrónica');
insert into Generos (NomeGenero) values ('Funk');
insert into Generos (NomeGenero) values ('Pop');
insert into Generos (NomeGenero) values ('Punk');
insert into Generos (NomeGenero) values ('R&B');

-- Artistas

insert into Artistas (nomeartista, nacionalidade) values ('Wet Bed Gang','Portuguesa');
insert into Artistas (nomeartista, nacionalidade) values ('Dillaz','Portuguesa');
insert into Artistas (nomeartista, nacionalidade) values ('Travis Scott','Americana');
insert into Artistas (nomeartista, nacionalidade) values ('Post Malone','Americana');
insert into Artistas (nomeartista, nacionalidade) values ('Queen','Inglesa');
insert into Artistas (nomeartista, nacionalidade) values ('U2','Irlandesa');
insert into Artistas (nomeartista, nacionalidade) values ('Bon Jovi','Americana');
insert into Artistas (nomeartista, nacionalidade) values ('Xutos & Pontapés','Portuguesa');
insert into Artistas (nomeartista, nacionalidade) values ('Tiesto','Holandesa');
insert into Artistas (nomeartista, nacionalidade) values ('Martin Garrix','Holandesa');
insert into Artistas (nomeartista, nacionalidade) values ('Timmy Trumpet','Australiana');
insert into Artistas (nomeartista, nacionalidade) values ('Diego Miranda','Portuguesa');
insert into Artistas (nomeartista, nacionalidade) values ('MC Kevinho','Brasileira');
insert into Artistas (nomeartista, nacionalidade) values ('MC Pedrinho','Brasileira');
insert into Artistas (nomeartista, nacionalidade) values ('Anitta','Brasileira');
insert into Artistas (nomeartista, nacionalidade) values ('MC Brinquedo','Brasileira');
insert into Artistas (NomeArtista, Nacionalidade) VALUES ('The Misfits', 'Americana');
insert into Artistas (NomeArtista, Nacionalidade) VALUES ('The Ramones', 'Americana');
insert into Artistas (NomeArtista, Nacionalidade) VALUES ('Blondie', 'Americana');
insert into Artistas (NomeArtista, Nacionalidade) VALUES ('Katy Perry', 'Americana');
insert into Artistas (NomeArtista, Nacionalidade) VALUES ('Sex Pistols', 'Inglesa');
insert into Artistas (NomeArtista, Nacionalidade) VALUES ('Ariana Grande', 'Americana');
insert into Artistas (NomeArtista, Nacionalidade) VALUES ('Harry Styles', 'Inglesa');
insert into Artistas (NomeArtista, Nacionalidade) VALUES ('BlackPink', 'Coreana');
insert into Artistas (NomeArtista, Nacionalidade) VALUES ('Diogo Piçarra', 'Portuguesa');
insert into Artistas (NomeArtista, Nacionalidade) VALUES ('Mariah Carey', 'Americana');
insert into Artistas (NomeArtista, Nacionalidade) VALUES ('Taeyang', 'Coreana');
insert into Artistas (NomeArtista, Nacionalidade) VALUES ('Chris Brown','Americana'); 
insert into Artistas (NomeArtista, Nacionalidade) VALUES ('Ne-yo', 'Americana');

-- Musicas

insert into Musicas (Nomemusica, Imagem, ArtistaID, Duracao, GeneroID) values ('Devia Ir','../images/musicas/DeviaIr.png',1,'00:03:34',1);
insert into Musicas (Nomemusica, Imagem, ArtistaID, Duracao, GeneroID) values ('MoBoy','../images/musicas/MoBoy.png',2,'00:02:30',1);
insert into Musicas (Nomemusica, Imagem, ArtistaID, Duracao, GeneroID) values ('goosebumps','../images/musicas/goosebumps.png',3,'00:02:40',1);
insert into Musicas (Nomemusica, Imagem, ArtistaID, Duracao, GeneroID) values ('Sunflowers','../images/musicas/Sunflowers.png',4,'00:04:20',1);
insert into Musicas (Nomemusica, Imagem, ArtistaID, Duracao, GeneroID) values ('Circles','../images/musicas/Circles.png',4,'00:01:55',1);
insert into Musicas (Nomemusica, Imagem, ArtistaID, Duracao, GeneroID) values ('Bohemian Rhapsody','../images/musicas/BohemianRhapsody.png',5,'00:05:54',2);
insert into Musicas (Nomemusica, Imagem, ArtistaID, Duracao, GeneroID) values ('We Will Rock you','../images/musicas/Circles.png',5,'00:02:02',2);
insert into Musicas (Nomemusica, Imagem, ArtistaID, Duracao, GeneroID) values ('Beautiful Day','../images/musicas/BeautifulDay.png',6,'00:04:08',2);
insert into Musicas (Nomemusica, Imagem, ArtistaID, Duracao, GeneroID) values ('Its My Life','../images/musicas/ItsMyLife.png',7,'00:03:44',2);
insert into Musicas (Nomemusica, Imagem, ArtistaID, Duracao, GeneroID) values ('A Minha Casinha','../images/musicas/AMinhaCasinha.png',8,'00:02:24',2);
insert into Musicas (Nomemusica, Imagem, ArtistaID, Duracao, GeneroID) values ('BOOM','../images/musicas/BOOM.png',9,'00:02:59',3);
insert into Musicas (Nomemusica, Imagem, ArtistaID, Duracao, GeneroID) values ('Red Lights','../images/musicas/RedLights.png',9,'00:04:22',3);
insert into Musicas (Nomemusica, Imagem, ArtistaID, Duracao, GeneroID) values ('Summer Days','../images/musicas/SummerDays.png',10,'00:02:43',3);
insert into Musicas (Nomemusica, Imagem, ArtistaID, Duracao, GeneroID) values ('Oracle','../images/musicas/Oracle.png',11,'00:03:00',3);
insert into Musicas (Nomemusica, Imagem, ArtistaID, Duracao, GeneroID) values ('Boomshakalak','../images/musicas/Boomshakalak.png',12,'00:02:51',3);
insert into Musicas (Nomemusica, Imagem, ArtistaID, Duracao, GeneroID) values ('Terremoto','../images/musicas/Terremoto.png',13,'00:02:11',4);
insert into Musicas (Nomemusica, Imagem, ArtistaID, Duracao, GeneroID) values ('Se Prepara','../images/musicas/SePrepara.png',14,'00:02:27',4);
insert into Musicas (Nomemusica, Imagem, ArtistaID, Duracao, GeneroID) values ('Complicado','../images/musicas/Complicado.png',15,'00:03:21',4);
insert into Musicas (Nomemusica, Imagem, ArtistaID, Duracao, GeneroID) values ('Contatinho','../images/musicas/Contatinho.png',15,'00:02:49',4);
insert into Musicas (Nomemusica, Imagem, ArtistaID, Duracao, GeneroID) values ('Roça Roça','../images/musicas/RoçaRoça.png',16,'00:04:34',4);
insert into Musicas (Nomemusica, Imagem, ArtistaID, Duracao, GeneroID) values ('Dig Up Her Bones','../images/musicas/DigUpHerBones.png',17,'00:03:34',6);
insert into Musicas (Nomemusica, Imagem, ArtistaID, Duracao, GeneroID) values ('I Wanna Be Sedated','../images/musicas/IWannaBeSedated.png',18,'00:03:20',6);
insert into Musicas (Nomemusica, Imagem, ArtistaID, Duracao, GeneroID) values ('Heart Of Glass','../images/musicas/HeartOfGlass.png',19,'00:03:44',6);
insert into Musicas (Nomemusica, Imagem, ArtistaID, Duracao, GeneroID) values ('God Save The Queen','../images/musicas/GodSaveTheQueen.png',20,'00:04:10',6);
insert into Musicas (Nomemusica, Imagem, ArtistaID, Duracao, GeneroID) values ('Dark Horse','../images/musicas/DarkHorse.png',21,'00:03:22',5);
insert into Musicas (Nomemusica, Imagem, ArtistaID, Duracao, GeneroID) values ('7 Rings','../images/musicas/7Rings.png',22,'00:03:24',5);
insert into Musicas (Nomemusica, Imagem, ArtistaID, Duracao, GeneroID) values ('Lights Up','../images/musicas/LightsUp.png',23,'00:02:14',5);
insert into Musicas (Nomemusica, Imagem, ArtistaID, Duracao, GeneroID) values ('As If Its Your Last','../images/musicas/AsItsYourLast.png',24,'00:03:51',5);
insert into Musicas (Nomemusica, Imagem, ArtistaID, Duracao, GeneroID) values ('Coração','../images/musicas/Coracao.png',25,'00:03:12',5);
insert into Musicas (Nomemusica, Imagem, ArtistaID, Duracao, GeneroID) values ('Butterfly','../images/musicas/Butterfly.png',26,'00:03:54',7);
insert into Musicas (Nomemusica, Imagem, ArtistaID, Duracao, GeneroID) values ('Wedding Dress','../images/musicas/WeddingDress.png',27,'00:03:27',7);
insert into Musicas (Nomemusica, Imagem, ArtistaID, Duracao, GeneroID) values ('Only Look At Me','../images/musicas/OnlyLookAtMe.png',27,'00:03:41',7);
insert into Musicas (Nomemusica, Imagem, ArtistaID, Duracao, GeneroID) values ('With You','../images/musicas/WithYou.png',28,'00:03:34',7);
insert into Musicas (Nomemusica, Imagem, ArtistaID, Duracao, GeneroID) values ('So Sick','../images/musicas/SoSick.png',29,'00:03:11',7);

insert into MusicasPlaylists (MusicaID, PlaylistID) values (1,6);
insert into MusicasPlaylists (MusicaID, PlaylistID) values (2,9);
insert into MusicasPlaylists (MusicaID, PlaylistID) values (3,9);
insert into MusicasPlaylists (MusicaID, PlaylistID) values (6,6);
insert into MusicasPlaylists (MusicaID, PlaylistID) values (6,7);
insert into MusicasPlaylists (MusicaID, PlaylistID) values (8,6);
insert into MusicasPlaylists (MusicaID, PlaylistID) values (8,9);
insert into MusicasPlaylists (MusicaID, PlaylistID) values (9,6);
insert into MusicasPlaylists (MusicaID, PlaylistID) values (10,3);
insert into MusicasPlaylists (MusicaID, PlaylistID) values (11,7);
insert into MusicasPlaylists (MusicaID, PlaylistID) values (11,5);
insert into MusicasPlaylists (MusicaID, PlaylistID) values (12,9);
insert into MusicasPlaylists (MusicaID, PlaylistID) values (13,6);
insert into MusicasPlaylists (MusicaID, PlaylistID) values (13,8);
insert into MusicasPlaylists (MusicaID, PlaylistID) values (14,4);
insert into MusicasPlaylists (MusicaID, PlaylistID) values (15,1);
insert into MusicasPlaylists (MusicaID, PlaylistID) values (16,5);
insert into MusicasPlaylists (MusicaID, PlaylistID) values (16,6);
insert into MusicasPlaylists (MusicaID, PlaylistID) values (16,4);
insert into MusicasPlaylists (MusicaID, PlaylistID) values (16,7);
insert into MusicasPlaylists (MusicaID, PlaylistID) values (16,10);
insert into MusicasPlaylists (MusicaID, PlaylistID) values (17,10);
insert into MusicasPlaylists (MusicaID, PlaylistID) values (18,1);
insert into MusicasPlaylists (MusicaID, PlaylistID) values (19,4);
insert into MusicasPlaylists (MusicaID, PlaylistID) values (19,3);
insert into MusicasPlaylists (MusicaID, PlaylistID) values (21,8);
insert into MusicasPlaylists (MusicaID, PlaylistID) values (22,7);
insert into MusicasPlaylists (MusicaID, PlaylistID) values (24,9);
insert into MusicasPlaylists (MusicaID, PlaylistID) values (25,2);
insert into MusicasPlaylists (MusicaID, PlaylistID) values (25,11);
insert into MusicasPlaylists (MusicaID, PlaylistID) values (27,1);
insert into MusicasPlaylists (MusicaID, PlaylistID) values (27,7);
insert into MusicasPlaylists (MusicaID, PlaylistID) values (29,6);
insert into MusicasPlaylists (MusicaID, PlaylistID) values (29,1);
insert into MusicasPlaylists (MusicaID, PlaylistID) values (29,11);
insert into MusicasPlaylists (MusicaID, PlaylistID) values (30,9);
insert into MusicasPlaylists (MusicaID, PlaylistID) values (30,7);
insert into MusicasPlaylists (MusicaID, PlaylistID) values (31,10);
insert into MusicasPlaylists (MusicaID, PlaylistID) values (31,1);
insert into MusicasPlaylists (MusicaID, PlaylistID) values (32,7);
insert into MusicasPlaylists (MusicaID, PlaylistID) values (32,9);
insert into MusicasPlaylists (MusicaID, PlaylistID) values (33,11);
insert into MusicasPlaylists (MusicaID, PlaylistID) values (33,9);
insert into MusicasPlaylists (MusicaID, PlaylistID) values (34,10);
insert into MusicasPlaylists (MusicaID, PlaylistID) values (34,8);
insert into MusicasPlaylists (MusicaID, PlaylistID) values (9,1);
insert into MusicasPlaylists (MusicaID, PlaylistID) values (5,2);
insert into MusicasPlaylists (MusicaID, PlaylistID) values (11,3);
insert into MusicasPlaylists (MusicaID, PlaylistID) values (7,5);
insert into MusicasPlaylists (MusicaID, PlaylistID) values (17,4);
insert into MusicasPlaylists (MusicaID, PlaylistID) values (3,5);
insert into MusicasPlaylists (MusicaID, PlaylistID) values (5,1);
insert into MusicasPlaylists (MusicaID, PlaylistID) values (12,2);
insert into MusicasPlaylists (MusicaID, PlaylistID) values (30,3);
insert into MusicasPlaylists (MusicaID, PlaylistID) values (30,2);
insert into MusicasPlaylists (MusicaID, PlaylistID) values (6,8);
insert into MusicasPlaylists (MusicaID, PlaylistID) values (17,9);
insert into MusicasPlaylists (MusicaID, PlaylistID) values (26,7);
insert into MusicasPlaylists (MusicaID, PlaylistID) values (28,1);
insert into MusicasPlaylists (MusicaID, PlaylistID) values (23,1);
insert into MusicasPlaylists (MusicaID, PlaylistID) values (19,11);
insert into MusicasPlaylists (MusicaID, PlaylistID) values (32,2);
insert into MusicasPlaylists (MusicaID, PlaylistID) values (21,2);
insert into MusicasPlaylists (MusicaID, PlaylistID) values (27,9);
insert into MusicasPlaylists (MusicaID, PlaylistID) values (2,7);
insert into MusicasPlaylists (MusicaID, PlaylistID) values (30,4);
insert into MusicasPlaylists (MusicaID, PlaylistID) values (13,1);
insert into MusicasPlaylists (MusicaID, PlaylistID) values (15,7);
insert into MusicasPlaylists (MusicaID, PlaylistID) values (28,2);
insert into MusicasPlaylists (MusicaID, PlaylistID) values (3,8);
insert into MusicasPlaylists (MusicaID, PlaylistID) values (4,5);
insert into MusicasPlaylists (MusicaID, PlaylistID) values (13,4);
insert into MusicasPlaylists (MusicaID, PlaylistID) values (1,1);
insert into MusicasPlaylists (MusicaID, PlaylistID) values (20,10);
insert into MusicasPlaylists (MusicaID, PlaylistID) values (27,11);
insert into MusicasPlaylists (MusicaID, PlaylistID) values (20,8);
insert into MusicasPlaylists (MusicaID, PlaylistID) values (3,10);
insert into MusicasPlaylists (MusicaID, PlaylistID) values (17,3);
insert into MusicasPlaylists (MusicaID, PlaylistID) values (34,2);
insert into MusicasPlaylists (MusicaID, PlaylistID) values (12,4);
insert into MusicasPlaylists (MusicaID, PlaylistID) values (14,6);
insert into MusicasPlaylists (MusicaID, PlaylistID) values (8,5);
insert into MusicasPlaylists (MusicaID, PlaylistID) values (26,1);
insert into MusicasPlaylists (MusicaID, PlaylistID) values (20,1);
insert into MusicasPlaylists (MusicaID, PlaylistID) values (15,3);
insert into MusicasPlaylists (MusicaID, PlaylistID) values (27,2);
insert into MusicasPlaylists (MusicaID, PlaylistID) values (5,5);



















