create table dsrpt_usuario(
    id       number primary key,
    name     varchar2(50) not null,
    password varchar2(16) not null,
    userType varchar2(3)  not null
);

create table dsrpt_pistas(
  id number primary key,
  latitude varchar2(12) not null,
  longitude varchar2(12) not null,
  elevacao varchar2(9),
  nome varchar2(50) not null,
  cidade varchar2(50) not null,
  pais varchar2(50) not null,
  info varchar2(280)
);

drop table dsrpt_usuario;
insert INTO dsrpt_usuario(id,name,password,userType) values (1, 'admin','a','adm');
insert INTO dsrpt_usuario(id,name,password,userType) values (2, 'cli','c','cli');
insert into dsrpt_pistas(id, latitude, longitude, elevacao, nome, cidade, pais, info) VALUES (1,'515074','01278','11','London City','London','England','-');
insert into dsrpt_pistas(id, latitude, longitude, elevacao, nome, cidade, pais, info) VALUES (2,'425063','15218','1023','Andorra la Vella City','Andorra la Vella','Andorra','Andorra is a tiny, independent principality situated between France and Spain in the Pyrenees mountains.');
commit;

select * from dsrpt_usuario;
select * from dsrpt_pistas;
