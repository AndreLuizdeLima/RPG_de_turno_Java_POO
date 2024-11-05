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
    id int primary key,
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

create table IF NOT EXISTS batalhas (
    id int primary key,
    lutador1_id int,
    lutador2_id int,
    vencedor_id int,
    Foreign Key (lutador1_id) REFERENCES personagens(id),
    Foreign Key (lutador2_id) REFERENCES personagens(id),
    Foreign Key (vencedor_id) REFERENCES personagens(id)
);