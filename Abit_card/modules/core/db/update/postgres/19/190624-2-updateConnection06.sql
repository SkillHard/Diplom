alter table ABITCARD_CONNECTION add constraint FK_ABITCARD_CONNECTION_ON_THIRD foreign key (THIRD_ID) references ABITCARD_DIRECTION(ID);
create index IDX_ABITCARD_CONNECTION_ON_THIRD on ABITCARD_CONNECTION (THIRD_ID);