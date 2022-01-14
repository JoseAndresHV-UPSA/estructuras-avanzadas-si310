create database ventas


// TABLAS 

create table cliente(
id_cliente int AUTO_INCREMENT primary key not null,
nombre varchar(20) not null,
telefono varchar(10),
direccion varchar(30)
);

create table categoria(
id_categoria int AUTO_INCREMENT primary key,
nombre char(30));

create table producto(
id_producto int AUTO_INCREMENT primary key,
descripcion char(40),
precio float,
stock int,
id_categoria int,
constraint foreign key(id_categoria)references categoria(id_categoria));


create table notaventa(
id_venta int AUTO_INCREMENT primary key,
fecha date,
id_cliente int,
monto float,
constraint fk_cliente_id foreign key(id_cliente) references cliente(id_cliente));

create table detalle_venta(
id_venta int,
id_producto int,
preciov float,
cantidad int,
primary key(id_venta,id_producto),
constraint fk_venta_id foreign key(id_venta) references notaventa(id_venta),
constraint fk_producto_id foreign  key(id_producto) references producto(id_producto));

// PROCEDIMIENTOS ALMACENADOS

CREATE DEFINER=`root`@`localhost` PROCEDURE `insertar_cliente`(
                                nom char(30), 
                                tel char(15), 
                                dir char(50))
begin
insert into cliente(nombre, telefono, direccion) values (nom,tel,dir);
end

CREATE DEFINER=`root`@`localhost` PROCEDURE `insertar_categoria`(
                                nom char(30))
begin
insert into categoria(nombre) values (nom);
end

CREATE DEFINER=`root`@`localhost` PROCEDURE `insertar_producto`(
                                des char(40),
								pre float,
								sto int,
								idc int
                                )
begin
insert into producto(descripcion, precio, stock, id_categoria) values (des, pre, sto, idc);
end

CREATE DEFINER=`root`@`localhost` PROCEDURE `insertar_detalle_venta`(
                                idv int,
								idp int,
								prv float,
								cnt int
                                )
begin
insert into detalle_venta(id_venta, id_producto, preciov, cantidad) values (idv, idp, prv, cnt);
end

CREATE DEFINER=`root`@`localhost` PROCEDURE `insertar_notaventa`(
                                fec date,
                                idc int,
                                mto float
                                )
begin
insert into notaventa(fecha, id_cliente, monto) values (fec, idc, mto);
end

CREATE DEFINER=`root`@`localhost` PROCEDURE `modificar_producto`(
								idp int,
                                des char(40),
								pre float,
								sto int,
								idc int
                                )
begin
update producto	set
		descripcion = des, precio = pre, stock = sto, id_categoria = idc
	where id_producto = idp;
end

CREATE DEFINER=`root`@`localhost` PROCEDURE `modificar_notaventa`(
											idv int,
											fec date,
											idc int,
											mto float
								)
begin
	update notaventa set
		fecha = fec,
        id_cliente = idc,
		monto = mto
	where id_venta = idv;
end

CREATE DEFINER=`root`@`localhost` PROCEDURE `modificar_detalle_venta`(
											idv int,
											idp int,
											prv float,
											cnt int
								)
begin
	update detalle_venta set
		id_venta = idv, id_producto=idp, preciov=prv, cantidad=cnt
	where id_venta = idv and id_producto = idp;
end

CREATE DEFINER=`root`@`localhost` PROCEDURE `modificar_cliente`(
	idc int,
	nom char(20),
	tel char(10),
	dir char(30))
begin
	update cliente	set
		nombre = nom,telefono=tel, direccion = dir
	where id_cliente = idc;
end

CREATE DEFINER=`root`@`localhost` PROCEDURE `modificar_categoria`(
	idc int,
	nom char(30))
begin
	update categoria	set
		nombre = nom
	where id_categoria = idc;
end

CREATE DEFINER=`root`@`localhost` PROCEDURE `eliminar_categoria`(
id int)
begin
   delete from categoria where id_categoria=id;
end

CREATE DEFINER=`root`@`localhost` PROCEDURE `eliminar_cliente`(
idc int)
begin
   delete from cliente where id_cliente=idc;
end

CREATE DEFINER=`root`@`localhost` PROCEDURE `eliminar_detalle_venta`(
											idv int,
											idp int
                                            )
begin
   delete from detalle_venta where id_venta = idv and id_producto = idp;
end

CREATE DEFINER=`root`@`localhost` PROCEDURE `eliminar_notaventa`(
											idv int)
begin
   delete from notaventa where id_venta=idv;
end

CREATE DEFINER=`root`@`localhost` PROCEDURE `eliminar_producto`(
								idp int
                                )
begin
	delete from producto where id_producto = idp;
end

CREATE DEFINER=`root`@`localhost` PROCEDURE `disminuir_stock`(
								idp int,
								cnt int
                                )
begin
update producto	set
		stock = stock - cnt
	where id_producto = idp;
end









