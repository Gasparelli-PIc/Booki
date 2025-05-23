
CREATE DATABASE projeto_a3;

USE projeto_a3;

CREATE TABLE users (
id INT PRIMARY KEY AUTO_INCREMENT,
nome VARCHAR(200) NOT NULL,
idade INT NOT NULL,
administrador BOOLEAN NOT NULL,
login VARCHAR(200) NOT NULL UNIQUE,
senha VARCHAR(200) NOT NULL,
tipoPreferido1 varchar(200),
tipoPreferido2 varchar(200)
);

CREATE TABLE livrosLidos (
id INT PRIMARY KEY AUTO_INCREMENT,
titulo varchar(200) NOT NULL,
autor varchar(200) NOT NULL,
tipoLivro varchar(200) NOT NULL,
idUsers INT,
FOREIGN KEY (idUsers) REFERENCES users (id)
)