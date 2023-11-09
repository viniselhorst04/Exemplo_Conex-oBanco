/** 

Treino de Banco de Dados
Autor: Vitor de Jesus
Data: 07/11/2023

*/

CREATE DATABASE db_senai_java;

USE db_senai_java;

CREATE TABLE departamento(
idDepartamento int NOT NULL,
nome varchar(45) NOT NULL,
sigla varchar (15) NOT NULL,
PRIMARY KEY (idDepartamento)
);

SELECT * FROM departamento;

CREATE TABLE funcionario(
idFuncionario int NOT NULL,
nome varchar(45) NOT NULL,
sobrenome varchar (45) NOT NULL,
matricula varchar (45) NOT NULL,
permissao int NOT NULL,
departamento_FK int,
primary key(idFuncionario),
CONSTRAINT FKDepartamento FOREIGN KEY (departamento_FK) REFERENCES departamento (idDepartamento)

);

SELECT * FROM funcionario;

CREATE TABLE chefe_departamento(
idChefe int NOT NULL,
idfuncionario_FK int,
departamento_FK int,
primary key (idChefe),
CONSTRAINT FKFuncionario FOREIGN KEY (idfuncionario_FK) REFERENCES funcionario (idFuncionario),  
CONSTRAINT FKDepartamentoCH FOREIGN KEY (departamento_FK) REFERENCES departamento (idDepartamento)
);



INSERT INTO departamento(idDepartamento, nome, sigla)values
(1,"Tecnologia da Informacao", "TI."),
(2,"Engenharia de Software", "ENGS"),
(3,"Infraestrutura", "INF");

)

