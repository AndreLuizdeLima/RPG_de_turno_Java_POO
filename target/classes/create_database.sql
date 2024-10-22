CREATE DATABASE IF NOT EXISTS rpg;

USE rpg;

create table IF NOT EXISTS racas (
    id int primary key,
    nome varchar(255),
    bonus_vida int,
    bonus_escudo int,
    bonus_poder_fisico int,
    bonus_poder_habilidade int
);

create table IF NOT EXISTS arquetipos (
    id int primary key,
    nome varchar(255),
    bonus_vida int,
    bonus_escudo int,
    bonus_poder_fisico int,
    bonus_poder_habilidade int
);

create table IF NOT EXISTS personagens (
    id int primary key,
    nome varchar(255),
    vida int,
    escudo int,
    poder_fisico int,
    poder_habilidade int,
    raca_id int,
    arquetipo_id int,
    Foreign Key (raca_id) REFERENCES racas(id),
    Foreign Key (arquetipo_id) REFERENCES arquetipos(id)
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