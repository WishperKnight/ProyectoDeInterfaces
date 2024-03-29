-- Tabla Usuario en PostgreSQL
CREATE TABLE `usuario` (
  `id_usuario` INT AUTO_INCREMENT PRIMARY KEY,
  `nombre_usuario` VARCHAR(50) UNIQUE NOT NULL,
  `contrasena` VARCHAR(255) DEFAULT NULL,
  `telefono` VARCHAR(15) DEFAULT NULL,
  `direccion_envio` VARCHAR(100) DEFAULT NULL,
  `correo` VARCHAR(100) DEFAULT NULL,
  `nombre` VARCHAR(50) NOT NULL,
  `apellidos` VARCHAR(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- Cambios en los datos de la tabla `usuario`
LOCK TABLES `usuario` WRITE;
/*!40000 ALTER TABLE `usuario` DISABLE KEYS */;

/*!40000 ALTER TABLE `usuario` ENABLE KEYS */;
UNLOCK TABLES;

-- Tabla Productos
CREATE TABLE Productos (
    id_producto INT PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL,
    stock INT,
    clasificacion VARCHAR(50),
    precio DECIMAL(10, 2) NOT NULL
);

-- Tabla Cesta de la compra
CREATE TABLE CestaCompra (
    id_cesta INT PRIMARY KEY,
    id_usuario INT,
    id_producto INT,
    fecha DATE,
    importe DECIMAL(10, 2),
    FOREIGN KEY (id_usuario) REFERENCES Usuario(id_usuario),
    FOREIGN KEY (id_producto) REFERENCES Productos(id_producto)
);

-- Insertar 10 productos de alimentación en la tabla Productos
INSERT INTO Productos (id_producto, nombre, stock, clasificacion, precio)
VALUES
    (1, 'Arroz blanco', 50, 'Alimentos', 2.0),
    (2, 'Pasta integral', 30, 'Alimentos', 2.5),
    (3, 'Aceite de oliva virgen', 20, 'Alimentos', 5.0),
    (4, 'Atún enlatado', 40, 'Alimentos', 3.5),
    (5, 'Sopa de tomate en lata', 25, 'Alimentos', 1.8),
    (6, 'Galletas integrales', 50, 'Alimentos', 2.2),
    (7, 'Leche desnatada', 35, 'Lácteos', 1.5),
    (8, 'Yogur natural', 40, 'Lácteos', 1.0),
    (9, 'Huevos (docena)', 30, 'Alimentos', 4.0),
    (10, 'Manzanas (kg)', 15, 'Frutas', 2.8);
	