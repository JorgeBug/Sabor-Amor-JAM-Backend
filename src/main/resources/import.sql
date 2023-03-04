--Empleados
INSERT INTO empleado(nombre, apellido, puesto, fecha_nacimiento, salario) VALUES ("Adolfo", "Mendoza", "Gerente General", "1988-05-05", "20000.00")
INSERT INTO empleado(nombre, apellido, puesto, fecha_nacimiento, salario) VALUES ("Josefina", "Calderón", "Gerente de Ventas", "1985-03-14", "16000.00")
INSERT INTO empleado(nombre, apellido, puesto, fecha_nacimiento, salario) VALUES ("Manuel", "López", "Cocinero", "1990-04-12", "10000.00")
INSERT INTO empleado(nombre, apellido, puesto, fecha_nacimiento, salario) VALUES ("Mariana", "García", "Empaquetadora", "1993-09-15", "8000.00")
INSERT INTO empleado(nombre, apellido, puesto, fecha_nacimiento, salario) VALUES ("Clemente", "Ramírez", "Intendente", "1971-11-01", "7000.00")


--Usuarios
INSERT INTO usuario(nombre, apellido, email, telefono, contrasenia) VALUES ("José", "Fernández", "masterdelingles@generation.mx", "55 54-673823","123");
INSERT INTO usuario(nombre, apellido, email, telefono, contrasenia) VALUES ("Juan", "Herrera", "juanverdadero@generation.mx", "2222893821","123");
INSERT INTO usuario(nombre, apellido, email, telefono, contrasenia) VALUES ("Karla", "Arenas", "tapatia@generation.mx", "3336256243","123");
INSERT INTO usuario(nombre, apellido, email, telefono, contrasenia) VALUES ("Luis", "Soto", "emo@generation.mx", "3194637593","123");
INSERT INTO usuario(nombre, apellido, email, telefono, contrasenia) VALUES ("Francisco", "Betancourt", "pax@generation.mx", "5544928374","123");
INSERT INTO usuario(nombre, apellido, email, telefono, contrasenia) VALUES ("José", "Guevara", "guevi@buap.mx", "2221849572","123");


--Carrito
INSERT INTO carrito(fk_id_usuario) VALUES ("1");


--Productos
INSERT INTO producto(nombre, precio, contenido, img_link, descripcion,spicy,categoria) VALUES ("MI SUPER SALSITA",70,250,"#"," Texto de descripcion","3","salsa");
INSERT INTO producto(nombre, precio, contenido, img_link, descripcion,spicy,categoria) VALUES ("MI MERMELADITA",190,100,"#"," Texto de descripcion","3","mermelada");
