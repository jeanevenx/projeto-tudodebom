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
    -   email
    -   CPF

#### **Exemplo de requisição**

```javascript
// POST /cliente
{
      "nome": "Uallace Gomes",
      "email": "uallace@gmail.com",
      "CPF": "032.565.984-76"
}
```

#### **Exemplos de resposta**

```javascript
// HTTP Status 200 / 201 / 204
{
   "mensagem": "Cliente cadastrado com sucesso!"
}
```

```javascript
// HTTP Status 400 / 401 / 403 / 404
{
    "mensagem": "Não foi possivel cadastrar o cliente."
}
