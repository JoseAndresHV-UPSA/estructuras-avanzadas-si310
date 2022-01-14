/*REGISTRAR CLIENTE*/
CREATE DEFINER=`root`@`localhost` PROCEDURE `registrar_cliente`(
	in ci_cliente varchar(40),
    in nombre varchar(40)
)
BEGIN
	insert into Clientes values(ci_cliente, nombre);
END
/*EDITAR CLIENTE*/
CREATE DEFINER=`root`@`localhost` PROCEDURE `editar_cliente`(
	in ci varchar(40),
    in nombre varchar(40)
)
BEGIN
	update Clientes
		set
			nombre_cliente = nombre
		where ci_cliente = ci;
END
/*ELMINAR CLIENTE*/
CREATE DEFINER=`root`@`localhost` PROCEDURE `eliminar_cliente`(
	in ci varchar(40)
)
BEGIN
	delete from Clientes where ci_cliente = ci;
END