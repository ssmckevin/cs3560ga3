create database dispatch;
use dispatch; 
create table caller_table(
    phoneNumber int,
    name_ varchar(255),
    location varchar(255),
    primary key (phoneNumber)
);

create table call_table(
    time_ varchar(255),
    problem varchar(255),
    callType varchar(255),
    severity varchar(255)
);

create table police_station_table(
    stationId int, 
    location varchar(255),
    staffAmount int,
    primary key (stationId)
);

create table officer_table(
    id int,
    name_ varchar(255),
    location varchar(255),
    primary key (id)
);

create table call_officer_table(
    callId int,
    officer_id int,
    primary key( callId, officer_id)
);

ALTER TABLE call_table
ADD FOREIGN KEY (phoneNumber) REFERENCES caller_table(phoneNumber);

alter table call_officer_table
add foreign key (callId) references caller_table(phoneNumber),
add foreign key (officer_id) references officer_table(id);

alter table officer_table
add column stationId int,
add foreign key (stationId) references police_station_table(stationId);