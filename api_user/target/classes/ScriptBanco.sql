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
    sexo BIT NOT NULL,
    DataNascimento DATE NOT NULL,
    PRIMARY KEY (id)
)