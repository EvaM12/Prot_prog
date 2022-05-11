create table persona (
    dni_persona varchar(9),
    nombre_persona varchar(50),
    apellidos_persona varchar(50),
    telefono_persona int,
    email_persona varchar(50),
    usuario_persona varchar(50),
    contraseña_persona varchar(20),
    constraint persona_pk primary key (dni_persona)
);

create table cliente (
    dni_cliente varchar(9),    
    saldo_cliente float,
    socio_cliente boolean,
    constraint cliente_pk primary key (dni_cliente),
    constraint cliente_fk foreign key (dni_cliente) references persona(dni_persona)
);
    
create table empleado (
    dni_empleado varchar(9),  
    salario_empleado float,
    gestor_empleado boolean,
    constraint empleado_pk primary key (dni_empleado),
    constraint empleado_fk foreign key (dni_empleado) references persona(dni_persona)
);

create table pedido (
    ID_pedido int,
    precio_total_pedido float,
    fecha_pedido date,
    constraint pedido_pk primary key (ID_pedido)
);
     
create table venta (
    ID_venta int,    
    dni_empleado varchar(9),
    dni_cliente varchar(9),
    constraint venta_pk primary key (ID_venta),
    constraint venta_fk1 foreign key (ID_venta) references pedido(ID_pedido),
    constraint venta_fk2 foreign key (dni_empleado) references empleado(dni_empleado),
    constraint venta_fk3 foreign key (dni_cliente) references cliente(dni_cliente)
);
    
create table compra (
    ID_compra int,    
    proveedor_compra varchar(40),
    constraint compra_pk primary key (ID_compra),
    constraint compra_fk foreign key (ID_compra) references pedido(ID_pedido)
);

create table producto (
    nombre_producto varchar(40),
    precio_producto float,
    marca_producto varchar(40),
    stock_producto int,
    pvp_producto float,
    constraint producto_pk primary key (nombre_producto)
);

create table placa_base (
    nombre_placa_base varchar(40),
    socket varchar(40),
    tipo varchar(40),
    constraint placa_base_pk primary key (nombre_placa_base),
    constraint placa_base_fk foreign key (nombre_placa_base) references producto(nombre_producto)
);

create table disco_duro (
    nombre_disco_duro varchar(40),     
    tipo_disco_duro varchar(50),
    capacidad_disco_duro int,
    velLectura_disco_duro int,
    velEscritura_disco_duro int,
    constraint disco_duro_pk primary key (nombre_disco_duro),
    constraint disco_duro_fk foreign key (nombre_disco_duro) references producto(nombre_producto)
);

create table caja (
    nombre varchar(40),
    constraint caja_pk primary key (nombre) 
);

create table grafica (
    nombre_grafica varchar(40),     
    memoria_grafica int,
    frecuencia_grafica varchar(10),
    tiporam_grafica varchar(7),
    constraint grafica_pk primary key (nombre_grafica),
    constraint grafica_fk foreign key (nombre_grafica) references producto(nombre_producto)
);

create table pantalla (
    nombre_pantalla varchar(40),   
    tamaño_pantalla float,
    resolucion_pantalla varchar(10),
    constraint pantalla_pk primary key (nombre_pantalla),
    constraint pantalla_fk foreign key (nombre_pantalla) references producto(nombre_producto)
);

CREATE TABLE procesador (
    nombre_procesador varchar(40),    
    socket_procesador varchar(10),
    frecuencia_procesador int,
    nucleos_procesador int,
    hilos_procesador int,
    constraint procesador_pk primary key (nombre_procesador),
    constraint procesador_fk foreign key (nombre_procesador) references producto(nombre_producto)
);
    
CREATE TABLE ram (
    nombre_ram varchar(40),    
    tipo_ram varchar(7),
    frecuencia_ram int,
    capacidad_ram int,
    latencia_ram varchar(10),
    constraint ram_pk primary key (nombre_ram),
    constraint ram_fk foreign key (nombre_ram) references producto(nombre_producto)
);
    
create table refrigeracion (
    nombre_refrigeracion varchar(40),    
    tipo_refrigeracion varchar(50),
    constraint refrigeracion_pk primary key (nombre_refrigeracion),
    constraint refrigeracion_fk foreign key (nombre_refrigeracion) references producto(nombre_producto)
);

create table fuente_alimentacion (
    nombre_fuente_alimentacion varchar(40),    
    certificacion_fuente_alimentacion varchar(50),
    potencia_fuente_alimentacion varchar(10),
    constraint fuente_alimentacion_pk primary key (nombre_fuente_alimentacion),
    constraint fuente_alimentacion_fk foreign key (nombre_fuente_alimentacion) references producto(nombre_producto)
);
    
create table raton (
    nombre_raton varchar(40),   
    sensor_raton varchar(50),
    dpi_raton int,
    constraint raton_pk primary key (nombre_raton),
    constraint raton_fk foreign key (nombre_raton) references producto(nombre_producto)
);

create table teclado (
    nombre_teclado varchar(40),    
    tipo_teclado varchar(50),
    constraint teclado_pk primary key (nombre_teclado),
    constraint teclado_fk foreign key (nombre_teclado) references producto(nombre_producto)
);

create table tiene (
    ID_pedido int,
    nombre_producto varchar(40),
    constraint tiene_pk primary key (ID_pedido, nombre_producto),
    CONSTRAINT tiene_FK1 FOREIGN KEY (ID_pedido) REFERENCES pedido(ID_pedido),
    CONSTRAINT tiene_FK2 FOREIGN KEY (nombre_producto) REFERENCES producto(nombre_producto)
);

create table tiene2 (
    ID_pedido int,
    nombre_producto varchar(40),
    constraint tiene2_pk primary key (ID_pedido,nombre_producto),
    constraint tiene2_fk1 foreign key (ID_pedido) references pedido(ID_pedido),
    constraint tiene2_fk2 foreign key (nombre_producto) references producto(nombre_producto)
);
