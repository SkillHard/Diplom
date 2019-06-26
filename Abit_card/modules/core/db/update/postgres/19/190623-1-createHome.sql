create table ABITCARD_HOME (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    REGION_REGION varchar(255),
    CITY_CITY varchar(255),
    DISTRICT_DISTRICT varchar(255),
    STREET_STREET varchar(255),
    --
    primary key (ID)
);