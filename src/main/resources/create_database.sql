CREATE DATABASE IF NOT EXISTS rpg;

USE rpg;

create table IF NOT EXISTS racas (
    id int primary key AUTO_INCREMENT,
    nome varchar(255),
    bonusVida int,
    bonusEscudo int,
    bonusPoderFisico int,
    bonusPoderHabilidade int

);

create table IF NOT EXISTS arquetipos (
    id int primary key AUTO_INCREMENT,
    nome varchar(255),
    bonusVida int,
    bonusEscudo int,
    bonusPoderFisico int,
    bonusPoderHabilidade int
);

create table IF NOT EXISTS personagens (
    id int primary key AUTO_INCREMENT,
    nome varchar(255),
    vida int,
    escudo int,
    poderFisico int,
    poderHabilidade int,
    racaId int,
    arquetipoId int,
    Foreign Key (racaId) REFERENCES racas(id),
    Foreign Key (arquetipoId) REFERENCES arquetipos(id)
);

create table IF NOT EXISTS batalhaResultado (
    id int primary key AUTO_INCREMENT,
    lutador1 varchar(255),
    lutador2 varchar(255),
    vencedor varchar(255)
);