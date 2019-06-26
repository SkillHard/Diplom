alter table ABITCARD_HOME add constraint FK_ABITCARD_HOME_ON_REGION_REGION foreign key (REGION_REGION) references region(region);
