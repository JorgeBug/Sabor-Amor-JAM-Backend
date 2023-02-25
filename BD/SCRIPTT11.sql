-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `mydb` DEFAULT CHARACTER SET utf8 ;
USE `mydb` ;

-- -----------------------------------------------------
-- Table `mydb`.`Usuario`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Usuario` (
  `idUsuario` INT UNSIGNED NOT NULL AUTO_INCREMENT,
  `Nombre` VARCHAR(100) NULL,
  `Apellido` VARCHAR(100) NULL,
  `Email` VARCHAR(45) NULL,
  `Telefono` VARCHAR(20) NULL,
  PRIMARY KEY (`idUsuario`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`DatosEnvio`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`DatosEnvio` (
  `IdEnvio` INT UNSIGNED NOT NULL AUTO_INCREMENT,
  `Calle` VARCHAR(100) NOT NULL,
  `NumExterior` VARCHAR(45) NOT NULL,
  `Interior` VARCHAR(45) NULL,
  `Colonia` VARCHAR(45) NOT NULL,
  `Municipio` VARCHAR(45) NOT NULL,
  `Estado` VARCHAR(45) NOT NULL,
  `CP` INT NOT NULL,
  `Usuario_idUsuario` INT UNSIGNED NOT NULL,
  PRIMARY KEY (`IdEnvio`, `Usuario_idUsuario`),
  INDEX `fk_DatosEnvio_Usuario1_idx` (`Usuario_idUsuario` ASC) VISIBLE,
  CONSTRAINT `fk_DatosEnvio_Usuario1`
    FOREIGN KEY (`Usuario_idUsuario`)
    REFERENCES `mydb`.`Usuario` (`idUsuario`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Producto`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Producto` (
  `IdProducto` INT NOT NULL AUTO_INCREMENT,
  `Nombre` VARCHAR(45) NOT NULL,
  `Precio` VARCHAR(45) NOT NULL,
  `Contenido` VARCHAR(45) NOT NULL,
  `Descripcion` VARCHAR(100) NOT NULL,
  `IMGLink` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`IdProducto`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`MetodoPago`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`MetodoPago` (
  `IdTarjeta` INT UNSIGNED NOT NULL AUTO_INCREMENT,
  `NumeroTarjeta` VARCHAR(45) NOT NULL,
  `TitularTarjeta` VARCHAR(100) NOT NULL,
  `Banco` VARCHAR(45) NOT NULL,
  `Usuario_idUsuario` INT UNSIGNED NOT NULL,
  PRIMARY KEY (`IdTarjeta`),
  INDEX `fk_MetodoPago_Usuario1_idx` (`Usuario_idUsuario` ASC) VISIBLE,
  CONSTRAINT `fk_MetodoPago_Usuario1`
    FOREIGN KEY (`Usuario_idUsuario`)
    REFERENCES `mydb`.`Usuario` (`idUsuario`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Carrito`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Carrito` (
  `idCarrito` INT NOT NULL AUTO_INCREMENT,
  `Usuario_idUsuario` INT UNSIGNED NOT NULL,
  PRIMARY KEY (`idCarrito`, `Usuario_idUsuario`),
  UNIQUE INDEX `idCarrito_UNIQUE` (`idCarrito` ASC) VISIBLE,
  INDEX `fk_Carrito_Usuario1_idx` (`Usuario_idUsuario` ASC) VISIBLE,
  CONSTRAINT `fk_Carrito_Usuario1`
    FOREIGN KEY (`Usuario_idUsuario`)
    REFERENCES `mydb`.`Usuario` (`idUsuario`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Pedido`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Pedido` (
  `idPedido` INT NOT NULL AUTO_INCREMENT,
  `FechaPedido` DATE NULL,
  `FechaEntrega` DATE NULL,
  `Monto` DECIMAL(5,2) NULL,
  `Carrito_idCarrito` INT NOT NULL,
  PRIMARY KEY (`idPedido`),
  INDEX `fk_Pedido_Carrito1_idx` (`Carrito_idCarrito` ASC) VISIBLE,
  CONSTRAINT `fk_Pedido_Carrito1`
    FOREIGN KEY (`Carrito_idCarrito`)
    REFERENCES `mydb`.`Carrito` (`idCarrito`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Empleado`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Empleado` (
  `idEmpleado` INT NOT NULL AUTO_INCREMENT,
  `Nombre` VARCHAR(45) NOT NULL,
  `Apellido` VARCHAR(45) NOT NULL,
  `Puesto` VARCHAR(45) NOT NULL,
  `FechaNacimiento` DATE NOT NULL,
  `Salario` DECIMAL(7,2) NULL,
  PRIMARY KEY (`idEmpleado`),
  UNIQUE INDEX `idEmpleado_UNIQUE` (`idEmpleado` ASC) VISIBLE)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Carrito_has_Producto`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Carrito_has_Producto` (
  `Carrito_idCarrito` INT NOT NULL,
  `Producto_IdProducto` INT NOT NULL,
  `Cantidad` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`Carrito_idCarrito`, `Producto_IdProducto`),
  INDEX `fk_Carrito_has_Producto_Producto1_idx` (`Producto_IdProducto` ASC) VISIBLE,
  INDEX `fk_Carrito_has_Producto_Carrito1_idx` (`Carrito_idCarrito` ASC) VISIBLE,
  CONSTRAINT `fk_Carrito_has_Producto_Carrito1`
    FOREIGN KEY (`Carrito_idCarrito`)
    REFERENCES `mydb`.`Carrito` (`idCarrito`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Carrito_has_Producto_Producto1`
    FOREIGN KEY (`Producto_IdProducto`)
    REFERENCES `mydb`.`Producto` (`IdProducto`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
