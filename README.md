# API - Tudo de Bom

Esta é uma RESTful API que permite o cadastro de novos clientes, incluindo dados pessoais, dados para contato e controle de estoque.

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

Essa é a rota que será utilizada para cadastrar um novo cliente no sistema.

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
    {
        "nome": "Vinícios Carlos",
        "cpf": "012.567.789-10",
        "email": "vinicios@gmail.com",
        "idcliente": 4
    },
    {
        "nome": "Daniel Cunha",
        "cpf": "428.986.030-31",
        "email": "Daniel@hotmail.com",
        "idcliente": 10
    },
    {
        "nome": "Gabriel Carvalho",
        "cpf": "411.897.990-06",
        "email": "carvalho@hotmail.com",
        "idcliente": 12
    },
    {
        "nome": "Antonio Alves",
        "cpf": "693.493.600-04",
        "email": "antonio@gmail.com",
        "idcliente": 13
    }
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
      "nome": "Uallace Gomes Silva",
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
