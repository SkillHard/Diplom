alter table ABITCARD_ABIT_CARD add constraint FK_ABITCARD_ABIT_CARD_ON_FIRST foreign key (FIRST_ID) references ABITCARD_DIRECTION(ID);
alter table ABITCARD_ABIT_CARD add constraint FK_ABITCARD_ABIT_CARD_ON_SECOND foreign key (SECOND_ID) references ABITCARD_DIRECTION(ID);
alter table ABITCARD_ABIT_CARD add constraint FK_ABITCARD_ABIT_CARD_ON_THIRD foreign key (THIRD_ID) references ABITCARD_DIRECTION(ID);
alter table ABITCARD_ABIT_CARD add constraint FK_ABITCARD_ABIT_CARD_ON_REGION_REGION foreign key (REGION_REGION) references region(region);
alter table ABITCARD_ABIT_CARD add constraint FK_ABITCARD_ABIT_CARD_ON_CITY_CITY foreign key (CITY_CITY) references city(city);
alter table ABITCARD_ABIT_CARD add constraint FK_ABITCARD_ABIT_CARD_ON_DISTRICT_DISTRICT foreign key (DISTRICT_DISTRICT) references district(district);
alter table ABITCARD_ABIT_CARD add constraint FK_ABITCARD_ABIT_CARD_ON_STREET_STREET foreign key (STREET_STREET) references street(street);
create index IDX_ABITCARD_ABIT_CARD_ON_FIRST on ABITCARD_ABIT_CARD (FIRST_ID);
create index IDX_ABITCARD_ABIT_CARD_ON_SECOND on ABITCARD_ABIT_CARD (SECOND_ID);
create index IDX_ABITCARD_ABIT_CARD_ON_THIRD on ABITCARD_ABIT_CARD (THIRD_ID);
create index IDX_ABITCARD_ABIT_CARD_ON_REGION_REGION on ABITCARD_ABIT_CARD (REGION_REGION);
create index IDX_ABITCARD_ABIT_CARD_ON_CITY_CITY on ABITCARD_ABIT_CARD (CITY_CITY);
create index IDX_ABITCARD_ABIT_CARD_ON_DISTRICT_DISTRICT on ABITCARD_ABIT_CARD (DISTRICT_DISTRICT);
create index IDX_ABITCARD_ABIT_CARD_ON_STREET_STREET on ABITCARD_ABIT_CARD (STREET_STREET);
