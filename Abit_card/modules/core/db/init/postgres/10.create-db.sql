-- begin ABITCARD_ABIT_CARD
create table ABITCARD_ABIT_CARD (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    FIRSTNAME varchar(255),
    SECONDNAME varchar(255),
    PATRONYMIC varchar(255),
    DATE_ date,
    GENDER varchar(50),
    TRAINING_FORM varchar(50),
    EDUCATION_FORM varchar(50),
    NUMBER_PHONE varchar(255),
    EMAIL varchar(50),
    FIRST_EDUCATION varchar(50),
    FIRST_ID uuid,
    SECOND_ID uuid,
    THIRD_ID uuid,
    DISCIPLIN1 varchar(50),
    BALL1 integer,
    DISCIPLIN2 varchar(50),
    BALL2 integer,
    DISCIPLIN3 varchar(50),
    BALL3 integer,
    DISCIPLIN4 varchar(50),
    BALL4 integer,
    DISCIPLIN5 varchar(50),
    BALL5 integer,
    DATE_SURRENDER date,
    INDIVIDUAL_ACHIEVEMENTS varchar(50),
    BALL6 integer,
    NATION integer,
    ID_DOCUMENTS varchar(50),
    SERIAS_NUMBER varchar(255),
    PLACE varchar(255),
    DATE_PASSPORT date,
    COUNTRY varchar(255),
    REGION_REGION varchar(255),
    CITY_CITY varchar(255),
    DISTRICT_DISTRICT varchar(255),
    STREET_STREET varchar(255),
    HOUSE varchar(255),
    FLAT varchar(255),
    POSTINDEX varchar(6),
    --
    primary key (ID)
)^
-- end ABITCARD_ABIT_CARD

-- begin ABITCARD_FIRST_DIRECTION
create table ABITCARD_FIRST_DIRECTION (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    SHIFR varchar(255),
    FACULTY varchar(255),
    DIRECTION varchar(255),
    --
    primary key (ID)
)^
-- end ABITCARD_FIRST_DIRECTION
-- begin ABITCARD_CONNECTION
create table ABITCARD_CONNECTION (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    FIRST_ID uuid,
    SECOND_ID uuid,
    THIRD_ID uuid,
    --
    primary key (ID)
)^
-- end ABITCARD_CONNECTION
-- begin ABITCARD_FIRST_LIST
create table ABITCARD_FIRST_LIST (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    ID_PERSON integer AUTO_INCREMENT,
    NAME varchar(255),
    DISCIPLIN_BALL1 integer,
    DISCIPLIN_BALL2 integer,
    DISCIPLIN_BALL3 integer,
    SUMBALL integer,
    --
    primary key (ID)
)^
-- end ABITCARD_FIRST_LIST

-- begin REGION
create table region (
    region varchar(255),
    --
    primary key (region)
)^
-- end REGION
-- begin CITY
create table city (
    city varchar(255),
    --
    primary key (city)
)^
-- end CITY
-- begin DISTRICT
create table district (
    district varchar(255),
    --
    primary key (district)
)^
-- end DISTRICT
-- begin STREET
create table street (
    street varchar(255),
    --
    primary key (street)
)^
-- end STREET
-- begin ABITCARD_DIRECTION
create table ABITCARD_DIRECTION (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    SHIFR varchar(255),
    FACULTY varchar(255),
    DIRECTION varchar(255),
    --
    primary key (ID)
)^
-- end ABITCARD_DIRECTION
