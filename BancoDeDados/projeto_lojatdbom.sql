-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema ljtudodebom
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema ljtudodebom
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `ljtudodebom` DEFAULT CHARACTER SET utf8 ;
USE `ljtudodebom` ;

-- -----------------------------------------------------
-- Table `ljtudodebom`.`cliente`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `ljtudodebom`.`cliente` (
  `id_cliente` INT NOT NULL AUTO_INCREMENT,
  `nome` VARCHAR(100) NOT NULL,
  `cpf` VARCHAR(15) NOT NULL,
  `email` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id_cliente`),
  UNIQUE INDEX `cpf_UNIQUE` (`cpf` ASC) VISIBLE,
  UNIQUE INDEX `email_UNIQUE` (`email` ASC) VISIBLE)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `ljtudodebom`.`pedido`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `ljtudodebom`.`pedido` (
  `numero_pedido` INT NOT NULL AUTO_INCREMENT,
  `data_pedido` DATE NULL,
  `valor_bruto` DOUBLE NULL,
  `desconto` DOUBLE NULL,
  `valor_final` DOUBLE NULL,
  `cliente_id_cliente` INT NOT NULL,
  PRIMARY KEY (`numero_pedido`),
  INDEX `fk_pedido_cliente_idx` (`cliente_id_cliente` ASC) VISIBLE,
  CONSTRAINT `fk_pedido_cliente`
    FOREIGN KEY (`cliente_id_cliente`)
    REFERENCES `ljtudodebom`.`cliente` (`id_cliente`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `ljtudodebom`.`produto`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `ljtudodebom`.`produto` (
  `id_produto` INT NOT NULL AUTO_INCREMENT,
  `nome` VARCHAR(45) NULL,
  `descricao` TEXT NULL,
  `preco` DOUBLE NULL,
  `quantidade` INT NULL,
  `link_foto` VARCHAR(255) NULL,
  `flag_generico` VARCHAR(1) NULL,
  `flag_remedio` VARCHAR(1) NULL,
  PRIMARY KEY (`id_produto`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `ljtudodebom`.`itens_pedido`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `ljtudodebom`.`itens_pedido` (
  `num_sequencial` VARCHAR(45) NOT NULL,
  `numero_pedido` INT NOT NULL,
  `id_produto` INT NOT NULL,
  `quantidade` INT NULL,
  `valor_unitario` DOUBLE NULL,
  `valor_total` DOUBLE NULL,
  PRIMARY KEY (`num_sequencial`),
  INDEX `fk_pedido_has_produto_produto1_idx` (`id_produto` ASC) VISIBLE,
  INDEX `fk_pedido_has_produto_pedido1_idx` (`numero_pedido` ASC) VISIBLE,
  CONSTRAINT `fk_pedido_has_produto_pedido1`
    FOREIGN KEY (`numero_pedido`)
    REFERENCES `ljtudodebom`.`pedido` (`numero_pedido`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_pedido_has_produto_produto1`
    FOREIGN KEY (`id_produto`)
    REFERENCES `ljtudodebom`.`produto` (`id_produto`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
