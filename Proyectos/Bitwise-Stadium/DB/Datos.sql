use db_estadio;

/*Llenar partidos*/
insert into Partidos(equipo_local, equipo_visitante, fecha, hora) 
	values('Oriente', 'Bloomig', '2021-05-30', '13:30');  /*1*/
insert into Partidos(equipo_local, equipo_visitante, fecha, hora) 
	values('Oriente', 'Aurora', '2021-05-30', '15:35');  /*2*/
insert into Partidos(equipo_local, equipo_visitante, fecha, hora) 
	values('Barcelona', 'Real Madrid', '2021-05-30', '17:40');  /*3*/
insert into Partidos(equipo_local, equipo_visitante, fecha, hora) 
	values('Bayern', 'Schalke04', '2021-05-30', '19:45');  /*4*/

/*Llenar clientes*/
insert into Clientes values('6273795', 'Enrique N');
insert into Clientes values('7777777', 'Jose Andres H');
insert into Clientes values('7777778', 'Sebastian F');
insert into Clientes values('7777779', 'Miguel T');

/*Llenar Secciones*/
insert into Secciones values(1, 'S1', 40.5, 120);
insert into Secciones values(2, 'S2', 30.0, 100);
insert into Secciones values(3, 'S3', 200, 50);
insert into Secciones values(4, 'S4', 200, 50);
insert into Secciones values(5, 'S5', 30.0, 100);
insert into Secciones values(6, 'S6', 40.5, 120);

/*Llenar tickets - (seccion, partido, nro_asiento)*/
insert into Tickets(id_seccion, id_partido, nro_asiento)
	values(2, 1, 10);
insert into Tickets(id_seccion, id_partido, nro_asiento) 
	values(2, 1, 11);
insert into Tickets(id_seccion, id_partido, nro_asiento)
	values(2, 1, 12);
insert into Tickets(id_seccion, id_partido, nro_asiento)
	values(1, 1, 10);
insert into Tickets(id_seccion, id_partido, nro_asiento)
	values(1, 1, 11);
insert into Tickets(id_seccion, id_partido, nro_asiento)
	values(1, 1, 12);
insert into Tickets(id_seccion, id_partido, nro_asiento)
	values(3, 1, 12);
insert into Tickets(id_seccion, id_partido, nro_asiento)
	values(4, 1, 12);

insert into Tickets(id_seccion, id_partido, nro_asiento)
	values(2, 2, 10);
insert into Tickets(id_seccion, id_partido, nro_asiento)
	values(2, 2, 11);
insert into Tickets(id_seccion, id_partido, nro_asiento)
	values(2, 2, 12);
insert into Tickets(id_seccion, id_partido, nro_asiento)
	values(1, 2, 10);
insert into Tickets(id_seccion, id_partido, nro_asiento)
	values(1, 2, 11);
insert into Tickets(id_seccion, id_partido, nro_asiento)
	values(1, 2, 12);
insert into Tickets(id_seccion, id_partido, nro_asiento)
	values(3, 2, 12);
insert into Tickets(id_seccion, id_partido, nro_asiento)
	values(4, 2, 12);

insert into Tickets(id_seccion, id_partido, nro_asiento)
	values(2, 3, 10);
insert into Tickets(id_seccion, id_partido, nro_asiento)
	values(2, 3, 11);
insert into Tickets(id_seccion, id_partido, nro_asiento)
	values(2, 3, 12);
insert into Tickets(id_seccion, id_partido, nro_asiento)
	values(1, 3, 10);
insert into Tickets(id_seccion, id_partido, nro_asiento)
	values(1, 3, 11);
insert into Tickets(id_seccion, id_partido, nro_asiento)
	values(1, 3, 12);
insert into Tickets(id_seccion, id_partido, nro_asiento)
	values(3, 3, 12);
insert into Tickets(id_seccion, id_partido, nro_asiento)
	values(4, 3, 12);

insert into Tickets(id_seccion, id_partido, nro_asiento)
	values(2, 4, 10);
insert into Tickets(id_seccion, id_partido, nro_asiento)
	values(2, 4, 11);
insert into Tickets(id_seccion, id_partido, nro_asiento)
	values(2, 4, 12);
insert into Tickets(id_seccion, id_partido, nro_asiento)
	values(1, 4, 10);
insert into Tickets(id_seccion, id_partido, nro_asiento)
	values(1, 4, 11);
insert into Tickets(id_seccion, id_partido, nro_asiento)
	values(1, 4, 12);
insert into Tickets(id_seccion, id_partido, nro_asiento)
	values(3, 4, 12);
insert into Tickets(id_seccion, id_partido, nro_asiento)
	values(4, 4, 12);

/*Llenar ventas*/
insert into Ventas values(1, '6273795');
insert into Ventas values(2, '6273795');
insert into Ventas values(3, '6273795');
insert into Ventas values(4, '6273795');
insert into Ventas values(5, '6273795');
insert into Ventas values(6, '6273795');
insert into Ventas values(7, '6273795');
insert into Ventas values(8, '6273795');
insert into Ventas values(9, '6273795');
insert into Ventas values(10, '6273795');

insert into Ventas values(11, '7777777');
insert into Ventas values(12, '7777777');
insert into Ventas values(13, '7777777');
insert into Ventas values(14, '7777777');
insert into Ventas values(15, '7777777');
insert into Ventas values(16, '7777777');
insert into Ventas values(17, '7777777');
insert into Ventas values(18, '7777777');
insert into Ventas values(19, '7777777');
insert into Ventas values(20, '7777777');

insert into Ventas values(21, '7777778');
insert into Ventas values(22, '7777778');
insert into Ventas values(23, '7777778');
insert into Ventas values(24, '7777778');
insert into Ventas values(25, '7777778');
insert into Ventas values(26, '7777778');
insert into Ventas values(27, '7777778');
insert into Ventas values(28, '7777778');
insert into Ventas values(29, '7777778');
insert into Ventas values(30, '7777778');

insert into Ventas values(31, '7777779');
insert into Ventas values(32, '7777779');