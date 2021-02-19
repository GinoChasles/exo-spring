use test;

insert into saison(name) values ('été');
insert into saison(name) values ('automne');
insert into saison(name) values ('hiver');
insert into saison(name) values ('printemps');


insert into mois(name, saison_id) values ('janvier', 3);
insert into mois(name, saison_id) values ('fev', 3);
insert into mois(name, saison_id) values ('mar', 3);
insert into mois(name, saison_id) values ('avr', 4);
insert into mois(name, saison_id) values ('mai', 4);
insert into mois(name, saison_id) values ('juin', 4);
insert into mois(name, saison_id) values ('juillet', 1);
insert into mois(name, saison_id) values ('aou', 1);
insert into mois(name, saison_id) values ('sep', 1);
insert into mois(name, saison_id) values ('oct', 2);
insert into mois(name, saison_id) values ('nov', 2);
insert into mois(name, saison_id) values ('dec', 2);



insert into fruit(name, mois_id) values ('tomate',3);
insert into fruit(name) values ('clémentine');
insert into fruit(name) values ('pomme');
insert into fruit(name) values ('poire');
insert into fruit(name) values ('kiwi');



insert into legume(name) values ('poireau');
insert into legume(name) values ('choux');
insert into legume(name) values ('carotte');
insert into legume(name) values ('haricots');
insert into legume(name) values ('pomme de terre');

insert into herbes_aromatique (name) values ('persil');
insert into herbes_aromatique (name) values ('ciboulette');
insert into herbes_aromatique (name) values ('cumin');
insert into herbes_aromatique (name) values ('sesame');
insert into herbes_aromatique (name) values ('romarin');
