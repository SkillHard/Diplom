alter table ABITCARD_CONNECTION add constraint FK_ABITCARD_CONNECTION_ON_FIRST foreign key (FIRST_ID) references ABITCARD_DIRECTION(ID);
create index IDX_ABITCARD_CONNECTION_ON_FIRST on ABITCARD_CONNECTION (FIRST_ID);
