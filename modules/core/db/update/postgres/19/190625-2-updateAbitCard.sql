alter table ABITCARD_ABIT_CARD rename column date_surrender to date_surrender__u65048 ;
alter table ABITCARD_ABIT_CARD rename column number_phone to number_phone__u56722 ;
alter table ABITCARD_ABIT_CARD rename column gender to gender__u58690 ;
alter table ABITCARD_ABIT_CARD add column GENDER varchar(50) ;
alter table ABITCARD_ABIT_CARD add column NUMBER_PHONE varchar(255) ;
alter table ABITCARD_ABIT_CARD add column DATE_SURRENDER date ;
