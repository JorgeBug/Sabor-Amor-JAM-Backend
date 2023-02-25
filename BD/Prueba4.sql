-- Usuario
INSERT INTO usuario(Nombre, Apellido, Email, Telefono)
VALUES("José", "Fernández", "masterdelingles@generation.mx", "55 54-673823"),
("Juan", "Herrera", "juanverdadero@generation.mx", "2222893821"),
("Karla", "Arenas", "tapatia@generation.mx", "3336256243"),
("Luis", "Soto", "emo@generation.mx", "3194637593"),
("Francisco", "Betancourt", "pax@generation.mx", "5544928374"),
("José", "Guevara", "guevi@buap.mx", "2221849572");

-- Método de pago
INSERT INTO metodopago(NumeroTarjeta, TitularTarjeta, Banco, Usuario_idUsuario)
VALUES ("2387-6574-6187-4152", "José Enrique Fernández Mora", "BanBajío", "1"),
("8374-6574-6127-3452", "José Enrique Fernández Mora", "HSBC", "1"),
("8374-0235-6127-7283", "Juan Antonio Herrera González", "Santander", "2"),
("9382-8283-7384-9123", "Karla Sofía Arenas Valerio", "Banamex", "3"),
("6237-8293-7645-6624", "Luis Gabriel Soto Montaño", "BBVA", "4"),
("7384-7723-2213-9384", "Edgar Francisco Betancourt García", "Banamex", "5"),
("8394-7329-9843-1234", "José Manuel Herrera Guevara", "Banorte", "6");

 
 -- Datos de envío
INSERT INTO datosenvio(Calle, NumExterior, Colonia, Municipio, Estado, CP, Usuario_idUsuario)
VALUES ("Emiliano Zapata", "2501", "Revolución", "Zapopan", "Jalisco", "44100", "3"),
("Avenida Miguel Hidalgo", "275", "Independencia", "Puebla", "Puebla", "72500", "1"),
("Avenida siempre viva", "123", "Tlaquepaque", "Xochimilco", "CDMX", "44100", "1"); -- Correr aquí
INSERT INTO datosenvio(Calle, NumExterior, Interior, Colonia, Municipio, Estado, CP, Usuario_idUsuario)
VALUES ("Volkswagen", "52", "7", "Lomas de San Alfonso", "Puebla", "Puebla", "72575", "2"),
("Avenida Reforma", "3029", "A", "Reforma", "Tepic", "Nayarit", "63000", "4"); -- Aquí 
INSERT INTO datosenvio(Calle, NumExterior, Colonia, Municipio, Estado, CP, Usuario_idUsuario)
VALUES ("Pitágoras", "15", "Del Valle", "Benito Juárez", "Ciudad de México", "03100", "5"),
("Avenida Casiopea", "3001", "San Bernardino Tlaxcalancingo", "Puebla", "Puebla", "72821", "6"); -- Tambien aquí
 
 -- Carrito
INSERT INTO carrito(Usuario_idUsuario)
VALUES ("1"), ("2"), ("3"), ("4"), ("5"), ("6");
 
-- Producto
INSERT INTO producto(Nombre, Precio, Contenido, Descripcion, IMGLink)
VALUES("Salsa Chilapeña", "70.00", "250 ml", "Hecha a base de chipotles dulces", "pendiente"),
("Salsa Macha", " 60.00", "185 gm", "En tres presentacion normal, de arandano y extra picante", "pendiente"),
("Salsa de chile morita", "70.00", "250 ml", "Muy picosa, perfecta para acompañar un buen corte de carne", "pendiente"),
("Mermelada de mango", "65.00", "250 gms", "Dulce y deliciosa", "pendiente"),
("Mermelada de Maracuyá", "70.00", "250 gms", "De temporada, ácida y dulce a la vez", "pendiente");

-- Carrito has producto
INSERT INTO carrito_has_producto(Carrito_idCarrito, Producto_idProducto, Cantidad)
VALUES ("2", "1", "1"),("2", "2", "1"),("2", "3", "1"), ("2", "4", "1"), ("2", "5", "1"); -- Enter
-- Agregando al carrito de Karla y Francisco
INSERT INTO carrito_has_producto(Carrito_idCarrito, Producto_idProducto, Cantidad)
VALUES ("3", "1", "1"), ("3", "3", "1"), ("3", "5", "1"), ("5", "1", "1"), ("5", "5", "1"); -- Enter
-- Agregando al carrito que no va a completar pedido 
INSERT INTO carrito_has_producto(Carrito_idCarrito, Producto_idProducto, Cantidad)
VALUES ("4", "3", "2"), ("4", "4", "3"), ("4", "5", "1"); -- Enter
 
 -- Pedido
 SELECT * FROM pedido;
INSERT INTO pedido(FechaPedido, FechaEntrega, Monto, Carrito_idCarrito)
VALUES ("2023-02-18", "2023-02-24", "335.00", "2"),
("2023-01-23", "2023-01-29", "210.00", "3"),
("2023-02-14", "2023-02-18", "140.00", "5");

-- Tabla empleado
INSERT INTO empleado(Nombre, Apellido, Puesto, FechaNacimiento, Salario)
VALUES ("Adolfo", "Mendoza", "Gerente General", "1988-05-05", "20000.00"),
("Josefina", "Calderón", "Gerente de Ventas", "1985-03-14", "16000.00"),
("Manuel", "López", "Cocinero", "1990-04-12", "10000.00"),
("Mariana", "García", "Empaquetadora", "1993-09-15", "8000.00"),
("Clemente", "Ramírez", "Intendente", "1971-11-01", "7000.00");