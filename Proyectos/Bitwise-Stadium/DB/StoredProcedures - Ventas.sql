/*REGISTRAR VENTA*/
CREATE DEFINER=`root`@`localhost` PROCEDURE `registrar_venta`(
	in id_ticket int,
    in ci_cliente int
)
BEGIN
	insert into Ventas
		values(id_ticket, ci_cliente);
END
/*ELIMINAR VENTA*/
CREATE DEFINER=`root`@`localhost` PROCEDURE `eliminar_venta`(
	in id int
)
BEGIN
	delete from Ventas where id_ticket = id;
    delete from Tickets where id_ticket = id;
END