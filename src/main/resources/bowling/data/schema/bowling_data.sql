
delete from league;

INSERT INTO league(id, name, start_dt, external_id)
values(1,'NELSON STUMPFT HDCP LEAGUE','2011-09-01 18:30:00',404);

INSERT INTO team(id,league_id,name,team_nbr,external_id)
values(1,1,'ANCHOR EXCAVATION',7,NULL);

INSERT INTO player(id,team_id,name,external_id)
values(1,1,'DAN IDOUX',11341);

INSERT INTO player(id,team_id,name,external_id)
values(2,1,'JIM NEWTON',429);

INSERT INTO player(id,team_id,name,external_id)
values(3,1,'BILL KIRTLINK',428);

INSERT INTO player(id,team_id,name,external_id)
values(4,1,'GENE ERLINGER',427);

INSERT INTO player(id,team_id,name,external_id)
values(5,1,'PAUL FLAHAN',1434);

delete from game;

INSERT INTO game(id,player_id,nbr,game_dt,lane_nbr) value(1,1,1,'2012-03-08',27);
INSERT INTO game(id,player_id,nbr,game_dt,lane_nbr) value(2,1,2,'2012-03-08',28);
INSERT INTO game(id,player_id,nbr,game_dt,lane_nbr) value(3,1,3,'2012-03-08',27);


INSERT INTO game(id,player_id,nbr,game_dt,lane_nbr) value(4,2,1,'2012-03-08',27);
INSERT INTO game(id,player_id,nbr,game_dt,lane_nbr) value(5,2,2,'2012-03-08',28);
INSERT INTO game(id,player_id,nbr,game_dt,lane_nbr) value(6,2,3,'2012-03-08',27);


INSERT INTO game(id,player_id,nbr,game_dt,lane_nbr) value(7,3,1,'2012-03-08',27);
INSERT INTO game(id,player_id,nbr,game_dt,lane_nbr) value(8,3,2,'2012-03-08',28);
INSERT INTO game(id,player_id,nbr,game_dt,lane_nbr) value(9,3,3,'2012-03-08',27);


INSERT INTO game(id,player_id,nbr,game_dt,lane_nbr) value(10,4,1,'2012-03-08',27);
INSERT INTO game(id,player_id,nbr,game_dt,lane_nbr) value(11,4,2,'2012-03-08',28);
INSERT INTO game(id,player_id,nbr,game_dt,lane_nbr) value(12,4,3,'2012-03-08',27);


INSERT INTO game(id,player_id,nbr,game_dt,lane_nbr) value(13,5,1,'2012-03-08',27);
INSERT INTO game(id,player_id,nbr,game_dt,lane_nbr) value(14,5,2,'2012-03-08',28);
INSERT INTO game(id,player_id,nbr,game_dt,lane_nbr) value(15,5,3,'2012-03-08',27);

select * from game

