alter table ABITCARD_FIRST_LIST rename column disciplin3 to disciplin3__u07205 ;
alter table ABITCARD_FIRST_LIST rename column disciplin2 to disciplin2__u12165 ;
alter table ABITCARD_FIRST_LIST rename column disciplin to disciplin__u18963 ;
alter table ABITCARD_FIRST_LIST rename column direction_id to direction_id__u02143 ;
drop index IDX_ABITCARD_FIRST_LIST_ON_DIRECTION ;
alter table ABITCARD_FIRST_LIST drop constraint FK_ABITCARD_FIRST_LIST_ON_DIRECTION ;
alter table ABITCARD_FIRST_LIST add column DISCIPLIN_BALL3 integer ;
alter table ABITCARD_FIRST_LIST add column SUMBALL integer ;
alter table ABITCARD_FIRST_LIST add column DISCIPLIN_BALL2 integer ;
alter table ABITCARD_FIRST_LIST add column NAME varchar(255) ;
-- alter table ABITCARD_FIRST_LIST add column ID_PERSON integer ^
-- update ABITCARD_FIRST_LIST set ID_PERSON = <default_value> ;
-- alter table ABITCARD_FIRST_LIST alter column ID_PERSON set not null ;
alter table ABITCARD_FIRST_LIST add column ID_PERSON integer ;
alter table ABITCARD_FIRST_LIST add column DISCIPLIN_BALL1 integer ;
