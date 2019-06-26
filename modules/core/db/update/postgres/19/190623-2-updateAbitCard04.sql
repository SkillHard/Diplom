alter table ABITCARD_ABIT_CARD add constraint FK_ABITCARD_ABIT_CARD_ON_CITY_CITY foreign key (CITY_CITY) references city(city);
create index IDX_ABITCARD_ABIT_CARD_ON_CITY_CITY on ABITCARD_ABIT_CARD (CITY_CITY);
