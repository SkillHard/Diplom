alter table ABITCARD_ABIT_CARD add constraint FK_ABITCARD_ABIT_CARD_ON_FIRST_DIRECTION foreign key (FIRST_DIRECTION_ID) references ABITCARD_FIRST_DIRECTION(ID);
create index IDX_ABITCARD_ABIT_CARD_ON_FIRST_DIRECTION on ABITCARD_ABIT_CARD (FIRST_DIRECTION_ID);