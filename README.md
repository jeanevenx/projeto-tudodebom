# API - Tudo de Bom

Esta é uma RESTful API que permite o cadastro de novos clientes, incluindo dados pessoais, dados para contato e controle de estoque de produtos.

## **Endpoints**

### **Cadastrar um cliente**
#### `POST` `/cliente`

Essa é a rota que será utilizada para cadastrar um novo cliente no sistema.

-   **Requisição**  
    Sem parâmetros de rota ou de query.  
    O corpo (body) deverá possuir um objeto com as seguintes propriedades (respeitando estes nomes):

    -   nome
    -   CPF
    -   email

#### **Exemplo de requisição**

```
// POST /cliente
{
      "nome": "Uallace Gomes",
      "CPF": "032.565.984-76",
      "email": "uallace@gmail.com"
      
}
```

#### **Exemplos de resposta**

```
{
      "nome": "Uallace Gomes",
      "CPF": "032.565.984-76",
      "email": "uallace@gmail.com",
      "idcliente": 12
}
```

### **Retortar todos os cliente**
#### `GET` `/cliente`

Essa é a rota que será utilizada para mostrar todos os clientes cadastrados no sistema.

-   **Requisição**  
    Sem parâmetros de rota ou de query.  
    O corpo (body) deverá possuir um objeto com as seguintes propriedades (respeitando estes nomes):

    -   nome
    -   email
    -   CPF

#### **Exemplo de requisição**

```
// GET /cliente

```

#### **Exemplos de resposta**

```
[
    {
        "nome": "Ana Marroquim Arruda",
        "cpf": "489.616.580-26",
        "email": "anama@hotmail.com",
        "idcliente": 1
    },
    {
        "nome": "Liliana Palhares Regueira",
        "cpf": "453.172.450-01",
        "email": "palhares@gmail.com",
        "idcliente": 2
    },
    {
        "nome": "Bruna Brito",
        "cpf": "143.456.779-00",
        "email": "brunabrito@mail.com",
        "idcliente": 3
    },
] 

```
   
### **Atualizar um cliente**
#### `PUT` `/cliente`

Essa é a rota que será utilizada para editar um cliente no sistema através do id.

-   **Requisição**  
    Sem parâmetros de rota ou de query.  
    O corpo (body) deverá possuir um objeto com as seguintes propriedades (respeitando estes nomes):

    -   idcliente
    -   nome
    -   cpf
    -   email

#### **Exemplo de requisição**

```
// PUT /cliente
{
      "idcliente": 7
      "nome": "Uallace Gomes",
      "CPF": "032.565.984-76",
      "email": "uallace@gmail.com"
      
}
```

#### **Exemplos de resposta**

```
{
      "nome": "Uallace Gomes",
      "CPF": "032.565.984-76",
      "email": "uallace@gmail.com",
      "idcliente": 7
}
```

### **Deletar um cliente**

#### `DELETE` `/cliente/:idcliente`

Essa é a rota que será utilizada para deletar um cliente no sistema.

-   **Requisição**  
    O parâmetro de rota será o id do Cliente.  
    

#### **Exemplo de requisição**

```
// DELETE /cliente/:idcliente

```

#### **Exemplos de resposta**

```
// HTTP Status 200 
{
   "mensagem": "Cliente deletado com sucesso!"
}
```

### **Pesquisar todos os produtos**
#### `GET` `/produtos`

Essa é a rota que será utilizada para retornar todos os produtos cadastrados no sistema.

-   **Requisição**  
    Sem parâmetros de query.  

#### **Exemplo de requisição**

```
// GET /produtos

```

#### **Exemplos de resposta**

```
   {
		"codigo": 1,
		"nome": "Duloxetina 30mg",
		"descricao": "Duloxetina 30mg Genérico EMS 15 Cápsulas a é um medicamento da classe dos inibidores da recaptação de serotonina e noradrenalina.",
		"preco": 24.79,
		"estoque": 5,
		"tipo": "Genérico",
		"descontoValido": 4.958
	},
    {
		"codigo": 2,
		"nome": "Clotrimazol Creme 10mg 20g Medley",
		"descricao": "Este creme é um medicamento para o tratamento de micoses da pele.",
		"preco": 4.99,
		"estoque": 25,
		"tipo": "Genérico",
		"descontoValido": 0.9980000000000001
	}
```

### **Cadastrar um produto**
#### `POST` `/produtos`

Essa é a rota que será utilizada para cadastrar um novo produto no sistema.

-   **Requisição**  
    Sem parâmetros de rota ou de query.  
    O corpo (body) deverá possuir um objeto com as seguintes propriedades (respeitando estes nomes):

    -   nome
    -   descricao
    -   preco
    -   estoque
    -   tipo

#### **Exemplo de requisição**

```
// POST /produtos
{
        "nome": "Nimesulida",
		"descricao": "O Nimesulida Gel Neo Química Genérico 20mg/G 40g é um anti-inflamatório que age no local das dores em geral.",
		"preco": 11.74,
		"estoque": 30,
		"tipo": "Referência"
      
}
```

#### **Exemplos de resposta**

```
{
    "codigo": 20,
	"nome": "Nimesulida",
	"descricao": "O Nimesulida Gel Neo Química Genérico 20mg/G 40g é um anti-inflamatório que age no local das dores em geral.",
	"preco": 11.74,
	"estoque": 30,
	"tipo": "Referência",
	"descontoValido": 0.0

}
```

### **Atualizar um produto**
#### `PUT` `/produtos`

Essa é a rota que será utilizada para editar um produto no sistema através do codigo no body da requisição.

-   **Requisição**  
    Sem parâmetros de rota ou de query.  
    O corpo (body) deverá possuir um objeto com as seguintes propriedades (respeitando estes nomes):

    -   codigo
    -   nome
    -   descricao
    -   preco
    -   estoque
    -   tipo

#### **Exemplo de requisição**

```
// PUT /produtos
{
        "codigo": 20,
		"nome": "Nimesulida",
		"descricao": "O Nimesulida Gel Neo Química Genérico 20mg/G 40g é um anti-inflamatório que age no local das dores em geral.",
		"preco": 11.74,
		"estoque": 30,
		"tipo": "Genérico"
}
```

#### **Exemplos de resposta**

```
{
    "codigo": 20,
	"nome": "Nimesulida",
	"descricao": "O Nimesulida Gel Neo Química Genérico 20mg/G 40g é um anti-inflamatório que age no local das dores em geral.",
	"preco": 11.74,
	"estoque": 30,
	"tipo": "Genérico",
	"descontoValido": 2.3480000000000003

}
```

### **Deletar um produto**

#### `DELETE` `/produtos/:codigo`

Essa é a rota que será utilizada para deletar um produto no sistema.

-   **Requisição**  
    O parâmetro de rota será o codigo do Produto.  
    

#### **Exemplo de requisição**

```
// DELETE `/produtos/:codigo`

```

#### **Exemplos de resposta**

```
// HTTP Status 200 
{
    "mensagem: "Este foi o produto excluido"
    "codigo": 20,
	"nome": "Nimesulida",
	"descricao": "O Nimesulida Gel Neo Química Genérico 20mg/G 40g é um anti-inflamatório que age no local das dores em geral.",
	"preco": 11.74,
	"estoque": 30,
	"tipo": "Genérico",
	"descontoValido": 2.3480000000000003

}
```
