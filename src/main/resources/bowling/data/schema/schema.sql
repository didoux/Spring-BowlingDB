
    create table Album (
        ID integer not null,
        NAME varchar(255),
        ARTIST_ID integer,
        primary key (ID)
    );

    create table Artist (
        ID integer not null,
        NAME varchar(255),
        primary key (ID)
    );

    create table Genre (
        ID integer not null,
        NAME varchar(255),
        primary key (ID)
    );

    create table MOVIE (
        ID integer not null,
        NAME varchar(255),
        price double,
        time varchar(255),
        GENRE_ID integer,
        primary key (ID)
    );

    create table SONG (
        ID integer not null,
        NAME varchar(255),
        PRICE double,
        TIME varchar(255),
        ALBUM_ID integer,
        GENRE_ID integer,
        primary key (ID)
    );

    create table TV_SHOW (
        ID integer not null,
        NAME varchar(255),
        primary key (ID)
    );

    create table TV_EPISODE(
        ID integer not null,
        NAME varchar(255),
        PRICE double,
        TIME varchar(255),
        TV_SHOW_ID integer,
        GENRE_ID integer,
        primary key (ID)
    );

    create table USER_MOVIE (
        ID integer not null,
        USER_ID integer,
        MOVIE_ID integer,
        primary key (ID)
    );

    create table USER_SONG (
        ID integer not null,
        USER_ID integer,
        SONG_ID integer,
        primary key (ID)
    );

    create table USER_TV_EPISODE (
        ID integer not null,
        USER_ID integer,
        TV_EPISODE_ID integer,
        primary key (ID)
    );

    create table User (
        ID integer not null,
        USER_NAME varchar(255),
        PASSWORD varchar(255),
        primary key (ID)
    );

    alter table ALBUM
        add constraint FK34567102061BAB5 
        foreign key (ARTIST_ID)
        references Artist;

    alter table MOVIE
        add constraint FK46247102061BAB5
        foreign key (GENRE_ID)
        references Genre;

    alter table SONG 
        add constraint FK26ED152061BAB5 
        foreign key (GENRE_ID) 
        references Genre;

    alter table SONG 
        add constraint FK26ED15EC88335 
        foreign key (ALBUM_ID) 
        references Album;

    alter table TV_EPISODE
        add constraint FK26ED167061BAB5
        foreign key (GENRE_ID)
        references Genre;

    alter table TV_EPISODE
        add constraint FK26ED15EC88435
        foreign key (TV_SHOW_ID)
        references TV_SHOW;

    alter table USER_MOVIE
        add constraint FKC681499CAE283F95 
        foreign key (MOVIE_ID) 
        references MOVIE;

    alter table USER_MOVIE 
        add constraint FKC681499CF4CC169F 
        foreign key (USER_ID) 
        references User;

    alter table USER_SONG 
        add constraint FKBC176909F4CC169F 
        foreign key (USER_ID) 
        references User;

    alter table USER_SONG 
        add constraint FKBC17690984A51A5F 
        foreign key (SONG_ID) 
        references SONG;

    alter table USER_TV_EPISODE
        add constraint FKBC1769092FCC169F
        foreign key (USER_ID)
        references User;

    alter table USER_TV_EPISODE
        add constraint FKBC176902344A51A5F
        foreign key (TV_EPISODE_ID)
        references TV_EPISODE;
