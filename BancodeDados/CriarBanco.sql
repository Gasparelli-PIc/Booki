CREATE DATABASE projeto_a3;

USE projeto_a3;

CREATE TABLE tipoLivro (
id INT PRIMARY KEY AUTO_INCREMENT,
tipo VARCHAR(50)
);

CREATE TABLE users (
id INT PRIMARY KEY AUTO_INCREMENT,
nome VARCHAR(200) NOT NULL,
idade INT,
administrador BOOLEAN NOT NULL,
login VARCHAR(200) NOT NULL UNIQUE,
senha VARCHAR(200) NOT NULL,
tipoPreferido1 int,
tipoPreferido2 int,
foreign key (tipoPreferido1) REFERENCES tipoLivro(id),
foreign key (tipoPreferido2) REFERENCES tipoLivro(id)
);

CREATE TABLE livrosLidos (
id INT PRIMARY KEY AUTO_INCREMENT,
titulo varchar(200) NOT NULL,
autor varchar(200) NOT NULL,
idTipo int,
idUsers INT,
FOREIGN KEY (idUsers) REFERENCES users (id),
FOREIGN KEY (idTipo) REFERENCES tipoLivro (id)
);

INSERT INTO tipoLivro (tipo) VALUES
('Cinema e Fotografia'),
('Autoajuda'),
('Aventura'),
('Ciência e Sociedade'),
('Direito'),
('Fantasia'),
('Filosofia'),
('História'),
('Poesia'),
('Política'),
('Romance'),
('Sustentabilidade'),
('Tecnologia'),
('Terror'),
('Turismo e Viagem'),
('');

INSERT INTO users(nome, idade, administrador, login, senha, tipoPreferido1, tipoPreferido2) VALUES ("administrador", 0, TRUE, "admin", "admin", 1, 1 );