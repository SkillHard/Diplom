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
    FACUTLY varchar(255),
    DIRECTION varchar(255),
    --
    primary key (ID)
);