alter table ABITCARD_ABIT_CARD rename column region to region__u25113 ;
alter table ABITCARD_ABIT_CARD rename column street to street__u30633 ;
alter table ABITCARD_ABIT_CARD rename column district to district__u50229 ;
alter table ABITCARD_ABIT_CARD add column DISTRICT_DISTRICT varchar(255) ;
alter table ABITCARD_ABIT_CARD add column STREET_STREET varchar(255) ;
alter table ABITCARD_ABIT_CARD add column REGION_REGION varchar(255) ;
