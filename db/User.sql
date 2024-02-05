drop table if exists User CASCADE;
create table User(
    userId bigint not null auto_increment,
    userProfileId varchar not null,
    userEmail varchar not null,
    userPassword varchar not null,
    userName varchar not null,
    userSex varchar,
    primary key(userId)
);