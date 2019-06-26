alter table ABITCARD_FIRST_LIST rename column list_id to list_id__u40581 ;
drop index IDX_ABITCARD_FIRST_LIST_ON_LIST ;
alter table ABITCARD_FIRST_LIST drop constraint FK_ABITCARD_FIRST_LIST_ON_LIST ;
