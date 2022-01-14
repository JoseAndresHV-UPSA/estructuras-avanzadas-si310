/*REGISTRAR TICKET*/
CREATE DEFINER=`root`@`localhost` PROCEDURE `registrar_ticket`(
	in id_seccion int,
    in id_partido int,
    in nro_asiento int
)
BEGIN
	insert into Tickets(id_seccion, id_partido, nro_asiento)
		values(id_seccion, id_partido, nro_asiento);
END
/*EDITAR TICKET*/
CREATE DEFINER=`root`@`localhost` PROCEDURE `editar_ticket`(
	in id int,
    in seccion int,
    in partido int,
    in asiento int
)
BEGIN
	update Tickets
		set
			id_seccion = seccion,
            id_partido = partido,
            nro_asiento = asiento
		where id_ticket = id;
END

/*ELIMINAR TICKET*/
CREATE DEFINER=`root`@`localhost` PROCEDURE `eliminar_ticket`(
	in id int
)
BEGIN
	delete from Tickets where id_ticket = id;
END