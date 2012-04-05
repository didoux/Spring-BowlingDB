drop table league;
create table league(
	id BIGINT NOT NULL AUTO_INCREMENT,
	name varchar(255) NOT NULL,
	start_dt datetime NULL,
	external_id INTEGER NULL,
	PRIMARY KEY(id)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

drop table team;
create table team (
   id BIGINT NOT NULL AUTO_INCREMENT,
   league_id BIGINT NOT NULL REFERENCES league(id),
   name varchar(255) NOT NULL,
   team_nbr varchar(2) NOT NULL,
   external_id INTEGER NULL,
   PRIMARY KEY(id),
   FOREIGN KEY(league_id) REFERENCES league(id)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

drop table player;
create table player ( 
	id BIGINT NOT NULL AUTO_INCREMENT, 
	team_id BIGINT NOT NULL REFERENCES team(id),
	name varchar(255) NOT NULL,
	external_id INTEGER NULL,
	PRIMARY KEY (id),
	FOREIGN KEY(team_id) REFERENCES team(id)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;


drop table week;
create table week (
	id BIGINT NOT NULL AUTO_INCREMENT,
	weekNumber int NOT NULL,
	date DATE NOT NULL,
	team_id BIGINT NOT NULL REFERENCES team(id),
	PRIMARY KEY(id),
	FOREIGN KEY(team_id) REFERENCES team(id)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

drop table game;
create table game (
	id BIGINT NOT NULL AUTO_INCREMENT,
	player_id BIGINT NOT NULL REFERENCES player(id),
	week_id   BIGINT NOT NULL REFERENCES week(id),
	nbr INT NOT NULL, -- 1,2,3
	starting_lane_nbr INT NOT NULL,  -- Game1=Lane 19, Game2=Lane 20, Game3=Lane 19
	score int NULL,  -- This should match total from frames
	PRIMARY KEY(id),
	FOREIGN KEY(player_id) REFERENCES player(id)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

drop table frame;
create table frame (
	id BIGINT NOT NULL AUTO_INCREMENT,
	game_id BIGINT NOT NULL REFERENCES game(id),
	nbr INT NOT NULL, -- 1,2,..10
	lane_nbr INT NOT NULL,
	notes VARCHAR(255) NULL,
	PRIMARY KEY(id),
	FOREIGN KEY(game_id) REFERENCES game(id)
)  ENGINE=MyISAM DEFAULT CHARSET=latin1;

drop table throw;
create table throw (
	id BIGINT NOT NULL AUTO_INCREMENT,
	frame_id BIGINT NOT NULL REFERENCES frame(id),
	nbr int NOT NULL, -- 1, 2, or 3 (10th)
	nbrOfPinsDown INT NOT NULL,  -- (0-10)
	1PIN BIT,
	2PIN BIT,
	3PIN BIT,
	4PIN BIT,
	5PIN BIT,
	6PIN BIT,
	7PIN BIT,
	8PIN BIT,
	9PIN BIT,
	10PIN BIT,
	pinBinaryArray INT NULL,  -- 
	ballNameTxt varchar(255) NULL,
	target int NULL,
	position int NULL,
	noteTxt varchar(255) NULL,
	PRIMARY KEY(id),
	FOREIGN KEY(frame_id) REFERENCES frame(id)
)  ENGINE=MyISAM DEFAULT CHARSET=latin1;

/* Pin Binary Array
	1=2^9,2=2^8,3=2^7,4=2^6,5=2^5,6=2^4,7=2^3,8=2^2,9=2^1,10=2^0
	12345678910
	FFFFFFFFFT = 1 ( 10 PIN )
	FFFFTFFFFT = 32+1=33 (5-10 SPLIT)
	FFFFFFFFFF = 0 ( String ) 
	TTTTTTTTTT = Gutter Ball
*/	
