alter table ABITCARD_CONNECTION rename column direction_id to direction_id__u40288 ;
drop index IDX_ABITCARD_CONNECTION_ON_DIRECTION ;
alter table ABITCARD_CONNECTION drop constraint FK_ABITCARD_CONNECTION_ON_DIRECTION ;
alter table ABITCARD_CONNECTION rename column disciplin_three to disciplin_three__u27775 ;
alter table ABITCARD_CONNECTION rename column disciplin_two to disciplin_two__u02504 ;
alter table ABITCARD_CONNECTION rename column disciplin_one to disciplin_one__u53276 ;
alter table ABITCARD_CONNECTION add column SECOND_ID uuid ;
alter table ABITCARD_CONNECTION add column THIRD_ID uuid ;
alter table ABITCARD_CONNECTION add column FIRST_ID uuid ;
