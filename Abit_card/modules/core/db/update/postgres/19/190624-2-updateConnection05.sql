alter table ABITCARD_CONNECTION add constraint FK_ABITCARD_CONNECTION_ON_SECOND foreign key (SECOND_ID) references ABITCARD_DIRECTION(ID);
create index IDX_ABITCARD_CONNECTION_ON_SECOND on ABITCARD_CONNECTION (SECOND_ID);