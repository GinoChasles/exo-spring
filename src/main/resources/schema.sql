CREATE SCHEMA test AUTHORIZATION SA;

use test;

CREATE TABLE saison (
    id INTEGER PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(50) NOT NULL
    );

CREATE TABLE mois (
    id INTEGER PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(50) NOT NULL,
    saison_id INT,
    foreign key (saison_id) references saison(id)
    );

CREATE TABLE fruit (
    id INTEGER PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(50) NOT NULL,
    saison_id INT,
    foreign key (saison_id) references saison(id)
    );

CREATE TABLE legume (
    id INTEGER PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(50) NOT NULL,
    saison_id INT,
    foreign key (saison_id) references saison(id)
    );