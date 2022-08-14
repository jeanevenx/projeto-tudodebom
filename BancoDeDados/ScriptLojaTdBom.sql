use ljtudodebom;
-- tabela cliente

INSERT INTO cliente VALUES (1, "Jose Alberto Neves","98.876.123-99","josealberto@mail.com");
INSERT INTO cliente VALUES (null, "Antonio Oliveira","12.983.256-72","antoniooli@mail.com");
INSERT INTO cliente VALUES (null,"Regina Brito","83.235.645-90","reginabrito@mail.com");
INSERT INTO cliente VALUES (null,"Roberto Brito","33.265.567-76","roberto@mail.com");

select * from cliente;

-- tabela pedido

INSERT INTO pedido VALUES (1,"2022-01-10",20,0,20,1);
INSERT INTO pedido VALUES (4,"2022-04-15",50,0.20,30,4);
INSERT INTO pedido VALUES (6,"2022-06-20",11.50,0.20,6.90,3);

select * from pedido;

-- tabela produto
INSERT INTO produto VALUES (1, "Omeprazol"," 20mg Genérico Cimed 56 Cápsulas", 19.25,10,"omeprazol-20mg-generico-cimed-56-capsulas.png","S","S");
INSERT INTO produto VALUES (null, "Creme Hidratante "," Cetaphil 453g", 78.67,300,"creme-hidratante-cetaphil-453g.png","N","N");
INSERT INTO produto VALUES (null, "ibuprofeno +paracetamol "," Luftafem 200mg/500mg 12 Comprimidos Revestidos", 24.49,100,"Luftafem-ibuprofeno-paracetamol-500mg.png","S","N");

select * from produto;

-- tabela itens

INSERT INTO itens_pedido VALUES (1, 1, 1, 2, 19.25, 38.5);
INSERT INTO itens_pedido VALUES (2, 4, 2, 3, 78.67, 236.0);
select * from  itens_pedido;




    