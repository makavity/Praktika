create table hibernate_sequence (
    next_val bigint
) engine=MyISAM;

insert into hibernate_sequence values ( 1 );

CREATE TABLE prognoz (

    number BIGINT NOT NULL,
    forecastDate date not null,
    minimumTemperature varchar(256) not null,
    maximumTemperature varchar(256) not null,
    notes varchar(256) not null,
    PRIMARY KEY (number)

) engine=MyISAM;