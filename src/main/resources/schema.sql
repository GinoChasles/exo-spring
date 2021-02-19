CREATE SCHEMA test AUTHORIZATION SA;

use
test;

CREATE TABLE saison
(
    id   INTEGER PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(50) NOT NULL
);

CREATE TABLE mois
(
    id        INTEGER PRIMARY KEY AUTO_INCREMENT,
    name      VARCHAR(50) NOT NULL,
    saison_id INT,
    foreign key (saison_id) references saison (id)
);

CREATE TABLE fruit
(
    id        INTEGER PRIMARY KEY AUTO_INCREMENT,
    name      VARCHAR(50) NOT NULL,
    mois_id INT,
    foreign key (mois_id) references mois (id)
);

CREATE TABLE legume
(
    id        INTEGER PRIMARY KEY AUTO_INCREMENT,
    name      VARCHAR(50) NOT NULL,
    mois_id INT,
    foreign key (mois_id) references mois (id)
);

CREATE TABLE herbes_aromatique
(
    id        INTEGER PRIMARY KEY AUTO_INCREMENT,
    name      VARCHAR(50) NOT NULL,
    mois_id INT,
    foreign key (mois_id) references mois (id)
);
CREATE TABLE mois_fruit
(
    mois_id INT,
    fruit_id INT,
    primary key (mois_id, fruit_id),
    foreign key (fruit_id) references fruit (id),
    foreign key (mois_id) references mois (id)

)
;
CREATE TABLE mois_legumes
(

    mois_id INT,
    legume_id INT,
    primary key (mois_id, legume_id),

    foreign key (mois_id) references mois (id),
    foreign key (legume_id) references legume (id)
);