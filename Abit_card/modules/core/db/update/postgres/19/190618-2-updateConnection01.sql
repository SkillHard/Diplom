alter table ABITCARD_CONNECTION add constraint FK_ABITCARD_CONNECTION_ON_DIRECTION foreign key (DIRECTION_ID) references ABITCARD_FIRST_DIRECTION(ID);
create index IDX_ABITCARD_CONNECTION_ON_DIRECTION on ABITCARD_CONNECTION (DIRECTION_ID);
