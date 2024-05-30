# SpringMart: Gerenciamento de Produtos

## Descrição

SpringMart é uma aplicação de gerenciamento de produtos construída com Java e Spring Framework. A aplicação permite que os usuários adicionem, editem, visualizem e excluam produtos de um catálogo, oferecendo funcionalidades básicas para um sistema de gerenciamento de produtos.

## Funcionalidades

- Adicionar novos produtos
- Editar informações dos produtos existentes
- Visualizar a lista de produtos
- Excluir produtos (marcando-os como inativos)
- Pesquisar produtos ativos

## Tecnologias Utilizadas

- Java 17
- Spring Boot 3.1.0
- Spring Data JPA
- Spring Validation
- PostgreSQL
- Maven
- Lombok (para reduzir o boilerplate de código)

## Pré-requisitos

- JDK 17 ou superior
- Maven 3.6 ou superior
- PostgreSQL

## Instalação

1. Clone o repositório para a sua máquina local:

   ```bash
   git clone https://github.com/JVictor011/SpringMart.git
   ```

2. Navegue até o diretório do projeto:

   ```bash
   cd springmart
   ```

3. Configure o banco de dados PostgreSQL no arquivo `application.properties`:
   ```bash
   spring.datasource.url=jdbc:postgresql://localhost:5432/springmart
   spring.datasource.username=seu-usuario
   spring.datasource.password=sua-senha
   ```

## Estrutura do Projeto

- A estrutura do projeto segue o padrão comum de projetos Spring Boot:

  ```bash
  springmart/
  ├── src/
  │   ├── main/
  │   │   ├── java/
  │   │   │   └── com/
  │   │   │       └── example/
  │   │   │           └── crud/
  │   │   │               ├── controllers/
  │   │   │               │   └── ProductController.java
  │   │   │               ├── domain/
  │   │   │               │   └── product/
  │   │   │               │       ├── Product.java
  │   │   │               │       ├── ProductRepository.java
  │   │   │               │       ├── RequestProduct.java
  │   │   │               ├── infra/
  │   │   │               │   ├── ExceptionDTO.java
  │   │   │               │   └── RequestsExceptionHandler.java
  │   │   │               ├── CrudApplication.java
  │   │   │               └── ServletInitializer.java
  │   │   ├── resources/
  │   │       └── db/
  │   │           └── migration/
  │   │               └── V1__create-table-product.sql
  │   │               └── V2__alter-table-procuct.sql
  │   │       └── application.properties
  │   └── test/
  │       ├── java/
  │       └── resources/
  └── pom.xml

  ```

  ## Estrutura do Projeto

  - **controllers**: Contém os controladores Spring MVC.
  - **domain.product**: Contém as classes de modelo (entidades JPA), repositórios e DTOs.
  - **infra**: Contém classes de infraestrutura, como manipuladores de exceções.
  - **application.properties**: Arquivo de configuração da aplicação.

  ## Endpoints da API

  ### `GET /product`

  Retorna todos os produtos ativos.

  ### `POST /product`

  Cadastra um novo produto.

  - **Corpo da requisição**: JSON contendo `name` (String) e `price_in_cents` (Integer).

  ### `PUT /product`

  Atualiza um produto existente.

  - **Corpo da requisição**: JSON contendo `id` (String), `name` (String) e `price_in_cents` (Integer).

  ### `DELETE /product/{id}`

  Desativa um produto (marca como inativo).

  - **Parâmetro**: `id` do produto (String).
