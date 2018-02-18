insert into pessoa(nome, idade ,foto) values ("luiza", 22, "foto");
insert into pessoa(nome, idade ,foto) values ("vitória", 42, "foto");
insert into pessoa(nome, idade ,foto) values ("pedro", 13, "foto");
insert into pessoa(nome, idade ,foto) values ("douglas", 45, "foto");
insert into pessoa(nome, idade ,foto) values ("evele", 32, "foto");
insert into pessoa(nome, idade ,foto) values ("alice", 67, "foto");
insert into pessoa(nome, idade ,foto) values ("eduarda", 11, "foto");
insert into pessoa(nome, idade ,foto) values ("luana", 26, "foto");

insert into amizade(idPessoa1, idPessoa2) values(1, 2);
insert into amizade(idPessoa1, idPessoa2) values(1, 8);
insert into amizade(idPessoa1, idPessoa2) values(1, 4);
insert into amizade(idPessoa1, idPessoa2) values(2, 3);
insert into amizade(idPessoa1, idPessoa2) values(2, 8);
insert into amizade(idPessoa1, idPessoa2) values(2, 4);
insert into amizade(idPessoa1, idPessoa2) values(3, 6);
insert into amizade(idPessoa1, idPessoa2) values(4, 8);

insert into post(datap, texto, idPessoa) values("01/12/2016", "publicação numero 1", 1);
insert into post(datap, texto, idPessoa) values("12/04/1998", "publicação numero 2", 1);
insert into post(datap, texto, idPessoa) values("04/05/2011", "publicação numero 3", 1);
insert into post(datap, texto, idPessoa) values("01/12/2016", "publicação numero 4", 2);
insert into post(datap, texto, idPessoa) values("09/06/2015", "publicação numero 5", 3);
insert into post(datap, texto, idPessoa) values("12/12/2012", "publicação numero 6", 4);
insert into post(datap, texto, idPessoa) values("16/04/2017", "publicação numero 7", 4);
insert into post(datap, texto, idPessoa) values("02/18/2014", "publicação numero 8", 7);

insert into foto(imagem, idPost) values("foto", 1);
insert into foto(imagem, idPost) values("foto", 2);
insert into foto(imagem, idPost) values("foto", 3);
insert into foto(imagem, idPost) values("foto", 4);
insert into foto(imagem, idPost) values("foto", 5);
insert into foto(imagem, idPost) values("foto", 6);
insert into foto(imagem, idPost) values("foto", 7);
insert into foto(imagem, idPost) values("foto", 7);

insert into curtePost(idPessoa, idPost) values(1,1);
insert into curtePost(idPessoa, idPost) values(1,2);
insert into curtePost(idPessoa, idPost) values(1,3);
insert into curtePost(idPessoa, idPost) values(1,4);
insert into curtePost(idPessoa, idPost) values(2,2);
insert into curtePost(idPessoa, idPost) values(3,2);
insert into curtePost(idPessoa, idPost) values(4,2);
insert into curtePost(idPessoa, idPost) values(5,2);

insert into comentario(texto, datac, idPost, idPessoa) values("comentario numero 1", "01/12/2016", 1, 1);
insert into comentario(texto, datac, idPost, idPessoa) values("comentario numero 2", "09/02/2011", 1, 2);
insert into comentario(texto, datac, idPost, idPessoa) values("comentario numero 3", "09/08/2012", 1, 2);
insert into comentario(texto, datac, idPost, idPessoa) values("comentario numero 4", "01/11/2014", 2, 3);
insert into comentario(texto, datac, idPost, idPessoa) values("comentario numero 5", "11/05/1996", 8, 4);
insert into comentario(texto, datac, idPost, idPessoa) values("comentario numero 6", "06/09/2012", 8, 2);
insert into comentario(texto, datac, idPost, idPessoa) values("comentario numero 7", "12/04/2016", 2, 6);
insert into comentario(texto, datac, idPost, idPessoa) values("comentario numero 8", "04/08/1995", 7, 7);

insert into curteComentario(idPessoa, idComentario) values(1,1);
insert into curteComentario(idPessoa, idComentario) values(1,2);
insert into curteComentario(idPessoa, idComentario) values(1,3);
insert into curteComentario(idPessoa, idComentario) values(1,4);
insert into curteComentario(idPessoa, idComentario) values(2,2);
insert into curteComentario(idPessoa, idComentario) values(3,2);
insert into curteComentario(idPessoa, idComentario) values(4,2);
insert into curteComentario(idPessoa, idComentario) values(5,2);

