/* REGISTRAR PARTIDO */
CREATE DEFINER=`root`@`localhost` PROCEDURE `registrar_partido`(
	in e_local varchar(25),
    in e_visitante varchar(25),
    in fecha date,
    in hora time
)
BEGIN
	insert into Partidos(equipo_local, equipo_visitante, fecha, hora)
		values(e_local, e_visitante, fecha, hora);
END
/* EDITAR PARTIDO */
CREATE DEFINER=`root`@`localhost` PROCEDURE `editar_partido`(
	in id int,
    in e_local varchar(25),
    in e_visitante varchar(25),
    in n_fecha date,
    in n_hora time
)
BEGIN
	update Partidos
		set 
			equipo_local = e_local,
            equipo_visitante = e_visitante,
            fecha = n_fecha,
            hora = n_hora
        where id_partido = id;
END
/* ELIMINAR PARTIDO */
CREATE DEFINER=`root`@`localhost` PROCEDURE `eliminar_partido`(
	in id int
)
BEGIN
	delete from Partidos where id_partido = id;
END