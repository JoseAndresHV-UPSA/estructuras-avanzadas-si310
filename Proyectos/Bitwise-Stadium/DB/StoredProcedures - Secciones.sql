/*-------PROCEDIMIENTOS ALMACENADOS SECCIONES-------*/
DELIMITER //
create procedure registrar_seccion(
	in id_seccion int,
    in nombre_seccion varchar(40),
    in precio_asiento float,
    in nro_asientos int
)
begin
    insert into Secciones
		values(id_seccion, nombre_seccion, precio_asiento, nro_asientos);
end;


create procedure editar_seccion(
	/*Solo se puede editar nombre, precio, cantAsientos*/
    in id int,
    in nombre varchar(40),
    in precio float,
    in nro int
)
begin
    update Secciones
		set nombre_seccion = nombre,
			precio_asiento = precio,
            nro_asientos = nro
		where id_seccion = id;
end //

create procedure eliminar_seccion(
	in id int
)
begin
	delete from Secciones where id_seccion = id;
end //

DELIMITER ;