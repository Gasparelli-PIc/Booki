CREATE DATABASE projeto_a3;

USE projeto_a3;

CREATE TABLE users (
id INT PRIMARY KEY AUTO_INCREMENT,
nome VARCHAR(200) NOT NULL,
idade INT NOT NULL,
administrador BOOLEAN NOT NULL,
login VARCHAR(200) NOT NULL UNIQUE,
senha VARCHAR(200) NOT NULL
);

CREATE TABLE tipoLivro (
id INT PRIMARY KEY AUTO_INCREMENT,
tipo VARCHAR(50) NOT NULL UNIQUE
);

CREATE TABLE livro (
id INT PRIMARY KEY AUTO_INCREMENT,
titulo varchar(200) NOT NULL,
autor varchar(200) NOT NULL,
idTipoLivro INT,
FOREIGN KEY (idTipoLivro) REFERENCES tipoLivro (id)
);

CREATE TABLE tipo_preferido (
id INT PRIMARY KEY AUTO_INCREMENT,
idUsers INT,
idTipoLivro INT,
FOREIGN KEY (idUsers) REFERENCES users (id),
FOREIGN KEY (idTipoLivro) REFERENCES tipolivro (id)
);

INSERT INTO tipoLivro(tipo) VALUES ("Sustentabilidade"), ("Tecnologia"), ("Ciência e Sociedade");
