drop table league;
create table league(
	id BIGINT NOT NULL,
	name varchar(255) NOT NULL,
	start_dt datetime NULL,
	external_id INTEGER NULL,
	PRIMARY KEY(id)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

drop table team;
create table team (
   id BIGINT NOT NULL,
   league_id BIGINT NOT NULL REFERENCES league(id),
   name varchar(255) NOT NULL,
   team_nbr varchar(2) NOT NULL,
   external_id INTEGER NULL,
   PRIMARY KEY(id),
   FOREIGN KEY(league_id) REFERENCES league(id)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

drop table player;
create table player ( 
	id BIGINT NOT NULL, 
	team_id BIGINT NOT NULL REFERENCES team(id),
	name varchar(255) NOT NULL,
	external_id INTEGER NULL,
	PRIMARY KEY (id),
	FOREIGN KEY(team_id) REFERENCES team(id)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

drop table game;
create table game (
	id BIGINT NOT NULL,
	player_id BIGINT NOT NULL REFERENCES player(id),
	nbr INT NOT NULL,
	game_dt DATE NOT NULL,
	lane_nbr INT NOT NULL,
	PRIMARY KEY(id),
	FOREIGN KEY(player_id) REFERENCES player(id)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

drop table frame;
create table frame (
	id BIGINT NOT NULL,
	game_id BIGINT NOT NULL REFERENCES game(id),
	nbr INT NOT NULL, -- 1,2,..10
	throw1 INT NOT NULL,
	throw2 INT NULL,
	throw3 INT NULL, 
	PRIMARY KEY(id),
	FOREIGN KEY(game_id) REFERENCES game(id)
)  ENGINE=MyISAM DEFAULT CHARSET=latin1;


