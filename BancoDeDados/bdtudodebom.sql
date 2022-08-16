

-CREATE SCHEMA IF NOT EXISTS `bdtudodebom` DEFAULT CHARACTER SET utf8 ;
USE `bdtudodebom` ;

-- -----------------------------------------------------
-- Table `bdtudodebom`.`cliente`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `bdtudodebom`.`cliente` (
  `IDcliente` INT NOT NULL AUTO_INCREMENT,
  `nome` VARCHAR(50) NOT NULL,
  `cpf` VARCHAR(15) NOT NULL,
  `email` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`IDcliente`),
  UNIQUE INDEX `cpf_UNIQUE` (`cpf` ASC) ,
  UNIQUE INDEX `email_UNIQUE` (`email` ASC) )
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `bdtudodebom`.`produto`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `bdtudodebom`.`produto` (
  `codigo` INT NOT NULL AUTO_INCREMENT,
  `nome` VARCHAR(60) NULL,
  `descricao` TEXT NULL,
  `preco` DOUBLE NULL,
  `estoque` INT NOT NULL,
  `tipo` VARCHAR(45) NULL,
  PRIMARY KEY (`codigo`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `bdtudodebom`.`pedido`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `bdtudodebom`.`pedido` (
  `codigo` INT NOT NULL AUTO_INCREMENT,
  `data_pedido` DATE NULL,
  `status` VARCHAR(20) NULL,
  `valor_bruto` DOUBLE NULL,
  `desconto` DOUBLE NULL,
  `valor_final` DOUBLE NULL,
  `cliente_id` INT NOT NULL,
  PRIMARY KEY (`codigo`),
  INDEX `fk_pedido_cliente1_idx` (`cliente_id` ASC),
  CONSTRAINT `fk_pedido_cliente1`
    FOREIGN KEY (`cliente_id`)
    REFERENCES `bdtudodebom`.`cliente` (`IDcliente`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `bdtudodebom`.`item_pedido`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `bdtudodebom`.`item_pedido` (
  `numero` INT NOT NULL AUTO_INCREMENT,
  `quantidade` INT NOT NULL,
  `valor_unitario` DOUBLE NOT NULL,
  `valor_total` DOUBLE NOT NULL,
  `produto_codigo` INT NOT NULL,
  `pedido_codigo` INT NOT NULL,
  INDEX `fk_medicamento_has_item_pedido_item_pedido1_idx` (`pedido_codigo` ASC) ,
  INDEX `fk_medicamento_has_item_pedido_medicamento1_idx` (`produto_codigo` ASC) ,
  PRIMARY KEY (`numero`),
  CONSTRAINT `fk_medicamento_has_item_pedido_medicamento1`
    FOREIGN KEY (`produto_codigo`)
    REFERENCES `bdtudodebom`.`produto` (`codigo`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_medicamento_has_item_pedido_item_pedido1`
    FOREIGN KEY (`pedido_codigo`)
    REFERENCES `bdtudodebom`.`pedido` (`codigo`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `bdtudodebom`.`endereco`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `bdtudodebom`.`endereco` (
  `IDendereco` INT NOT NULL AUTO_INCREMENT,
  `estado` VARCHAR(45) NOT NULL,
  `cidade` VARCHAR(45) NOT NULL,
  `cep` VARCHAR(15) NOT NULL,
  `rua` VARCHAR(45) NULL,
  `cliente_clienteID` INT NOT NULL,
  PRIMARY KEY (`IDendereco`),
  UNIQUE INDEX `cep_UNIQUE` (`cep` ASC),
  INDEX `fk_endereco_cliente1_idx` (`cliente_clienteID` ASC) ,
  CONSTRAINT `fk_endereco_cliente1`
    FOREIGN KEY (`cliente_clienteID`)
    REFERENCES `bdtudodebom`.`cliente` (`IDcliente`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;
USE `bdtudodebom` ;
desc cliente;
INSERT INTO cliente VALUES (null, "Jose Neves","968.654.391-00","jose45@mail.com");
INSERT INTO cliente VALUES (null, "Pedro Oliveira","865.432.987-10","pedroolv@mail.com");
INSERT INTO cliente VALUES (null, "Bruna Brito","143.456.779-00","brunabrito@mail.com");
 --- endereco
 select * from endereco;
 alter table endereco modify column
estado varchar(2);

INSERT INTO endereco VALUES (null, "estado","cidade","cep","rua");
INSERT INTO endereco VALUES (null, "SP","Sao Paulo","01234-567","Major Silva",1);
INSERT INTO endereco VALUES (null,"ES","Vitoria","06543-123","Heitor Vila Lobos",1);
INSERT INTO endereco VALUES (null,"BA","Salvador","41500-610","Parque São Cristóvão	",2);
INSERT INTO endereco VALUES (null,"RJ","Rio de Janeiro","20020-000","Avenida Erasmo",2);



INSERT INTO endereco VALUES (null,"Rua","Heitor Vila Lobos",98,"Casa 2","Vila das Flores","Osasco","06543-123","SP",2);
INSERT INTO endereco VALUES (null,"Av","Raquel Meyer",173,"Ap 42 Bl 1","Centro","Vitoria","32987-122","ES",3);

select * from cliente;

select * from bdtudodebom.endereco;
