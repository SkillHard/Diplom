alter table ABITCARD_ABIT_CARD rename column direction_id to direction_id__u92938 ;
drop index IDX_ABITCARD_ABIT_CARD_ON_DIRECTION ;
alter table ABITCARD_ABIT_CARD drop constraint FK_ABITCARD_ABIT_CARD_ON_DIRECTION ;
alter table ABITCARD_ABIT_CARD add column FIRST_DIRECTION_ID uuid ;
