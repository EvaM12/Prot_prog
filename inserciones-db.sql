/*graficas*/
insert into producto values (
    'Gigabyte GeForce RTX 3070 Ti GAMING OC',/*nombre*/
    889.89,/*precio*/
    'NVIDIA',/*marca*/
    10/*stock*/
);

insert into grafica values (
    'Gigabyte GeForce RTX 3070 Ti GAMING OC',/*nombre*/
    '8GB',/*memoria*/
    '1830MHz',/*frequencia*/
    'GDDR6X'/*tipo ram*/
);

insert into producto values (
    'Gigabyte GeForce GTX 1660 SUPER OC',/*nombre*/
    319.90,/*precio*/
    'NVIDIA',/*marca*/
    10/*stock*/
);

insert into grafica values (
    'Gigabyte GeForce GTX 1660 SUPER OC',/*nombre*/
    '8GB',/*memoria*/
    '1830MHz',/*frequencia*/
    'GDDR6X'/*tipo ram*/
);

insert into producto values (
    'PULSE AMD Radeon RX',/*nombre*/
    379.89,/*precio*/
    'Sapphire',/*marca*/
    10/*stock*/
);

insert into grafica values (
    'PULSE AMD Radeon RX',/*nombre*/
    '8GB',/*memoria*/
    '2044MHz',/*frequencia*/
    'GDDR6X'/*tipo ram*/
);

insert into producto values (
    'ROG Strix GeForce RTX 3090 Gaming OC',/*nombre*/
    1899.91,/*precio*/
    'Asus /NVIDIA',/*marca*/
    10/*stock*/
);

insert into grafica values (
    'ROG Strix GeForce RTX 3090 Gaming OC',/*nombre*/
    '24GB',/*memoria*/
    '2044MHz',/*frequencia*/
    'GDDR6X'/*tipo ram*/
);

/*procesadores*/
insert into producto values (
    'Intel Core i5-10400F', /*NOMBRE*/
	119.9, /*PRECIO*/
	'Intel',	/*MARCA*/
    10 /*Stock*/
);

insert into procesador values (
    'Intel Core i5-10400F', /*NOMBRE*/
    'LGA 1200',	/*SOCKET*/
	'2.9 GHz',	/*FRECUENCIA*/
	6 ,	/*NUCLEOS*/
	12 ,		/*HILOS*/
);

insert into producto values (
    'Intel Core i5-12600K',
	279.9,
	'Intel',
	10	
);

insert into procesador values (
    'Intel Core i5-12600K',
    'LGA 1700',
	'3.7GHz',
	10,
	16
);

insert into producto values (
    'Intel Core i9-12900KS',	
	789.89,
	'Intel' ,
	10
);

insert into procesador values (
    'Intel Core i9-12900KS',	
    'LGA 1700',
	'5.5 GHz',
	16,
	24
);

insert into producto values (
    'AMD Ryzen 5 5500',	
	149.89,
	'AMD',
	10
);

insert into procesador values (
    'AMD Ryzen 5 5500',	
    'AM4',
	'3.6 GHz' ,
	6,
	12
);

/*disco duros*/
insert into producto values(
    'One Touch 2.5"',/*nombre*/
    52.99,/*precio*/
    'Seagate',/*marca*/
    10/*stock*/
);

insert into disco_duro values (
    'One Touch 2.5"',/*nombre*/
    'HDD',/*tipo*/
    '1TB',/*capacidad*/
    '?',/*vlec*/
    '?'/*vesc*/
);

insert into producto values(
    'Expansion Portable 2.5"',
    95.99,
    'Seagate',
    10
);

insert into disco_duro values (
    'Expansion Portable 2.5"',
    'HDD',
    '4TB',
    '?',
    '?'
);

insert into producto values(
    'Blue SN570',
    89.99,
    'WD',
    10
);

insert into disco_duro values (
    'Blue SN570',
    'SSD',
    '500GB',
    '3500 MB/s',
    '2300 MB/s'
);

insert into producto values(
    'NV1',
    48.98,
    'Kingston',
    10
);

insert into disco_duro values (
    'NV1',
    'SSD',
    '500GB',
    '2100 MB/s',
    '1700 MB/s'
);

insert into producto values(
    'Black SN850',
    137.99,
    'WD',
    10
);

insert into disco_duro values (
    'Black SN850',
    'SSD',
    '1TB',
    '7000MB/s',
    '5300MB/s'
);

/*caja*/
insert into producto values(
    'iCUE 120T RGB',/*nombre*/
    69.99,/*precio*/
    'Corsair',/*marca*/
    10/*stock*/
);

insert into caja values (
    'iCUE 120T RGB'/*nombre*/
);

insert into producto values(
    'Soul RGB',
    31.99,
    'Tempest',
    10
);

insert into caja values (
    'Soul RGB'
);

insert into producto values(
    'MAG Vampiric 010',
    49.99,
    'MSI',
    10
);

insert into caja values (
    'MAG Vampiric 010',
);

insert into producto values(
    'Krater',
    69.95,
    'Nfortec',
    10
);

insert into caja values (
    'Krater'
);

insert into producto values(
    'MAG Vampiric 010M',
    44.99,
    'MSI',
    10
);

insert into caja values (
    'MAG Vampiric 010M',
);

/*alimentacion*/
insert into producto values(
    'MPG A750GF',
    93.98,
    'MSI',
    10
);

insert into alimentacion values (
    'MPG A750GF',
    '80 Plus Gold',
    750
);

insert into producto values(
    'Urano VX',
    50.25,
    'Nox',
    10
);

insert into alimentacion values (
    'Urano VX',
    '80 PLUS Bronze',
    750
);

insert into producto values(
    'HX1200',
    219.99,
    'Corsair',
    10
);

insert into alimentacion values (
    'HX1200',
    '80 Plus Platinum',
    1200
);

insert into producto values(
    'Hummer Alpha',
    37.9,
    'Nox',
    10
);

insert into alimentacion values (
    'Hummer Alpha',
    '80 Plus Bronce',
    60
);

insert into producto values(
    'ROG Strix 1000G',
    199.99,
    'Asus',
    10
);

insert into alimentacion values (
    'ROG Strix 1000G',
    '80 Plus Gold Modular',
    1000
);

/*placa base*/
insert into producto values(
    'Gigabyte B660 GAMING X',/*nombre*/
    139.9,/*precio*/
    'Gigabyte',/*marca*/
    10/*stock*/ 
);

insert into placa_base values (
    'Gigabyte B660 GAMING X',
    'LGA 1700',/*socket*/
    'ATX'/*tipo*/
);

insert into producto values(
    'Asus TUF GAMING B550',
    149.89,
    'Asus',
    10
);

insert into placa_base values (
    'Asus TUF GAMING B550',
    'AM4',
    'ATX'
);

insert into producto values(
    'MSI MAG Z590 TOMAHAWK',
    139.9,
    'MSI',
    10
);

insert into placa_base values (
    'MSI MAG Z590 TOMAHAWK',
    'LGA 1200',
    'ATX'
);

/*ram*/

insert into producto values(
    'Kingston FURY Beast',/*nombre*/
    39.53,/*precio*/
    'Kingston',/*marca*/
    10/*stock*/

);

insert into ram values (
    'Kingston FURY Beast',
    'DDR4',/*tipo*/
    '3200 MHz',/*frequencia*/
    '8 GB',/*capacidad*/
    'CL16'/*latencia*/
);

insert into producto values(
    'Corsair Vengeance LPX',
    69.99,
    'CORSAIR',
    10
);

insert into ram values (
    'Corsair Vengeance LPX',
    'DDR4',
    '3200 MHz' ,
    '16 GB',
    'CL16'
);

insert into producto values(
    'Kingston FURY Beast',
    57.57,
    'Kingston',
    10
);

insert into ram values (
    'Kingston FURY Beast',
    'DDR4',
    '2666 MHz',
    '8 GB 2x4 GB',
    'CL16'
);

/*teclado*/
insert into producto values(
    'BlackWidow V3 Pro',/*nombre*/
    183.77,/*precio*/
    'Razer',/*marca*/
    10/*stock*/
);

inssert into teclado values (
    'BlackWidow V3 Pro',
    'mecanico'/*tipo*/
);

insert into producto values(
    'Doom H-Mech',
    16.99,
    'Tempest',
    10
);

inssert into teclado values (
    'Doom H-Mech',
    'retroiluminado'
);

insert into producto values(
    'BlackWidow V3 Teclado Gaming USA Green Switch Cuarzo Rosa',
    102.23,
    'Razer',
    10
);

inssert into teclado values (
    'BlackWidow V3 Teclado Gaming USA Green Switch Cuarzo Rosa',
    'retroiluminado'
);

insert into producto values(
    'Smart Backlit Teclado Bluetooth con Touchpad Plata',
    28.23, 
    'Subblim',
    10
);

inssert into teclado values (
    'Smart Backlit Teclado Bluetooth con Touchpad Plata',
    'Touchpad'
);

insert into producto values(
    'G84-5500 Teclado con TouchPad Negro',
    154.75,
    'Cherry',
    10
);

inssert into teclado values (
    'G84-5500 Teclado con TouchPad Negro',
    'Touchpad'
);

/*refiregeracion*/
insert into producto values(
    'Liquid Cooler 360 RGB',/*nombre*/
    58,/*precio*/
    'Tempest',/*marca*/
    10/*stock*/
);

insert into refiregeracion values (
    'Liquid Cooler 360 RGB',/*nombre*/
    'liquida'/*tipo*/
);

insert into producto values(
    'Hydrus V2 120 Red',
    29.95,
    'Nfortec',
    10
);

insert into refiregeracion values (
    'Hydrus V2 120 Red',
    'liquida'
);

insert into producto values(
    'Frost RGB Ventilador 120mm',
    6.50,
    'Aerocool',
    10
);

insert into refiregeracion values (
    'Frost RGB Ventilador 120mm',
    'aire'
);

insert into producto values(
    'Force Ventilador 120mm',
    5.51,
    'Aerocool',
    10
);

insert into refiregeracion values (
    'Force Ventilador 120mm',
    'aire'
);

insert into producto values(
    'MAG CoreLiquid 240R V2',
    79.95,
    'MSI',
    10
);

insert into refiregeracion values (
    'MAG CoreLiquid 240R V2',
    'liquida'
);


/*pantalla*/
insert into producto values(
    'Optix G27C7',/*nombre*/
    199,/*precio*/
    'MSI',/*marca*/
    10/*stock*/
);

insert into monitor values (
    'Optix G27C7',/*nombre*/
    '27"',/*tamaño*/
    'FullHD'/*resolucion*/
);

insert into producto values(
    'X27',
    251.99,
    'HP',
    10
);

insert into monitor values (
    'X27',
    '27"',
    'FullHD'
);

insert into producto values(
    'Icarus RGB',
    319.98,
    'Newskill',
    10
);

insert into monitor values (
    'Icarus RGB',
    '27"',
    'QHD'
);

insert into producto values(
    'Optix G32CQ4',/*nombre*/
    298.99,/*precio*/
    'MSI',/*marca*/
    10/*stock*/
);

insert into monitor values (
    'Optix G32CQ4',/*nombre*/
    '31.5"',/*tamaño*/
    'WQHD'/*resolucion*/
);

insert into producto values(
    'Nitro KG2 KG272 S',
    179,
    'Acer',
    10
);

insert into monitor values (
    'Nitro KG2 KG272 S',
    '27"',
    'FullHD'
);

/*raton*/
insert into producto values(
    'Z3700 Blanco',/*nombre*/
    11.98,/*precio*/
    'HP',/*marcca*/
    10/*stock*/
);

insert into raton values (
    'Z3700 Blanco',/*nombre*/
    'optico',/*sensor*/
    1200/*dpi*/
);

insert into producto values(
    'MS100 Paladin Ratón Gaming',
    2.49,
    'Tempest',
    10
);

insert into raton values (
    'MS100 Paladin Ratón Gaming',
    'optico',
    1600
);

insert into producto values(
    'Omen Vector Essential Ratón Gaming',
    19.99,
    'HP',
    10
);

insert into raton values (
    'Omen Vector Essential Ratón Gaming',
    'omen',
    7200
);

insert into producto values(
    'X20 Vigilant RGB Ratón Gaming',
    14.99,
    'Tempest',
    10
); 

insert into raton values (
    'X20 Vigilant RGB Ratón Gaming',
    '3389 IC',
    16000 
);

insert into producto values(
    'Basilisk V3 Ratón Gaming Óptico RGB',
    51.10,
    'Razer',
    10
);

insert into raton values (
    'Basilisk V3 Ratón Gaming Óptico RGB',
    'optico',
    26000
);