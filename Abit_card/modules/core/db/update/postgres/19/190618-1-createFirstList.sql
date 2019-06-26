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
    DIRECTION_ID uuid,
    DISCIPLIN varchar(50),
    DISCIPLIN2 varchar(50),
    DISCIPLIN3 varchar(50),
    LIST_ID uuid,
    --
    primary key (ID)
);