drop schema if exists projeto_bd;
create schema projeto_bd;
use projeto_bd;

create table pessoa(
	id integer primary key auto_increment not null,
	nome varchar(30),
	idade int,
	foto varchar(300));

create table amizade(
	idPessoa1 integer not null,
	idPessoa2 integer not null,
	rotulo varchar(300),

	foreign key (idPessoa1) references pessoa(id)
		on delete cascade
		on update cascade,
	foreign key(idPessoa2) references pessoa(id)
		on delete cascade
		on update cascade);

create table post(
	id integer primary key auto_increment not null,
	datap char(10),
	texto varchar(500) not null,
	idPessoa int,
	
	foreign key(idPessoa) references pessoa(id)
		on delete cascade
		on update cascade);

create table foto(
	id integer primary key auto_increment not null,
	imagem varchar(300),
	idPost int,
	
	foreign key(idPost) references post(id)
		on delete cascade
		on update cascade);

create table curtePost(
	idPessoa int,
	idPost int,
	
	foreign key(idPessoa) references pessoa(id)
		on delete cascade
		on update cascade,
	foreign key(idPost) references post(id)
		on delete cascade
		on update cascade);

create table comentario(
	id integer primary key auto_increment not null,
	texto varchar(500) not null,
	datac char(10),
	idPost int,
	idPessoa int,
	
	foreign key (idPost) references post(id)
		on delete cascade
		on update cascade,
	foreign key(idPessoa) references pessoa(id)
		on delete cascade
		on update cascade);

create table curteComentario(
	idPessoa int,
	idComentario int,
	
	foreign key(idPessoa) references pessoa(id)
		on delete cascade
		on update cascade,
	foreign key(idComentario) references comentario(id)
		on delete cascade
		on update cascade);


