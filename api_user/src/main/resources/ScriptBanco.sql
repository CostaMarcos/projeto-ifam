-- Apagar o banco de dados
drop database dbCrud;
-- Criar o banco de dados
create database dbCrud;
-- Atribuir os privilégios de acesso aos objetos do banco
-- para o usuário root
GRANT ALL PRIVILEGES ON banco.* TO 'root' @'localhost';
-- Acesar o banco de dados: banco
USE banco;
-- Criar a tabela: cliente
CREATE TABLE cliente(
    id int AUTO_INCREMENT,
    cpf varchar(11) NOT NULL,
    nome varchar(64) NOT NULL,
    sexo varchar(1) NOT NULL,
    DataNascimento DATE NOT NULL,
    login varchar(64) NOT NULL,
    senha varchar(64) NOT NULL,
    email varchar(64) NOT NULL,
    FOREIGN KEY (endereco), 
    PRIMARY KEY (id)
)

CREATE TABLE endereco(
    id int AUTO_INCREMENT,
    cep varchar(11) NOT NULL,
    rua varchar(64) NOT NULL,
    bairro varchar(64) NOT NULL,
    numero int NOT NULL,
    cidade varchar(64) NOT NULL,
    uf varchar(2) NOT NULL,
    PRIMARY KEY (id)
)