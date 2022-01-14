use db_estadio;

create table Partidos
(
	id_partido int auto_increment,  /*PK*/
    equipo_local varchar(25),
    equipo_visitante varchar(25),
    fecha date,
    hora time,
    constraint pk_id_partido primary key(id_partido)
);

create table Clientes
(
	ci_cliente varchar(40),  /*PK*/
    nombre_cliente varchar(40),
    constraint pk_ci_cliente primary key(ci_cliente)
);

create table Secciones
(
	id_seccion int not null,  /*PK*/
    nombre_seccion varchar(40) not null,
    precio_asiento float not null,
    nro_asientos int not null,
    constraint pk_id_seccion primary key(id_seccion)
);

create table Tickets
(
	id_ticket int auto_increment,  /*PK*/
    id_seccion int not null,  /*FK*/
    id_partido int not null,  /*FK*/
    nro_asiento int not null,
    constraint pk_id_ticket primary key(id_ticket),
    constraint fk_id_seccion foreign key(id_seccion) references Secciones(id_seccion),
    constraint fk_id_partido foreign key(id_partido) references Partidos(id_partido)
);

create table Ventas
(
	id_ticket int not null,  /*PK - FK*/
    ci_cliente varchar(40),  /*PK - FK*/
    primary key(id_ticket, ci_cliente),
    constraint fk_id_ticket foreign key(id_ticket) references Tickets(id_ticket),
    constraint fk_ci_cliente foreign key(ci_cliente) references Clientes(ci_cliente)
);

/*
drop table Partidos
drop table Clientes
drop table Secciones
drop table Tickets
drop table Ventas
*/