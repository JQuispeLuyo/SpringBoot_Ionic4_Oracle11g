Create table USUARIO(
    IDPER number primary key,
    NOMPER varchar(100),
    APEPER varchar(100)
);

CREATE SEQUENCE USUARIO_IDPER_SEQ 
MINVALUE 1 MAXVALUE 999999999999999999999999 
INCREMENT BY 1 START WITH 6
CACHE 20 
NOORDER  NOCYCLE;


insert into USUARIO (IDPER,NOMPER,APEPER) values ('1','Jose', 'Quispe');
insert into USUARIO (IDPER,NOMPER,APEPER) values ('2','Carlos', 'Torres');
insert into USUARIO (IDPER,NOMPER,APEPER) values ('3','Ciurlizza', 'Ascencio');
insert into USUARIO (IDPER,NOMPER,APEPER) values ('4','James', 'Casas');
insert into USUARIO (IDPER,NOMPER,APEPER) values ('5','Jhordy', 'Caceres');



