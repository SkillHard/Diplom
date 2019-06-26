alter table ABITCARD_HOME rename column street_street to street_street__u82188 ;
alter table ABITCARD_HOME rename column district_district to district_district__u06960 ;
alter table ABITCARD_HOME rename column city_city to city_city__u57992 ;
alter table ABITCARD_HOME rename column region_region to region_region__u40114 ;
alter table ABITCARD_HOME add column REGION_ID uuid ;
alter table ABITCARD_HOME add column CITY_ID uuid ;
alter table ABITCARD_HOME add column STREET_ID uuid ;
alter table ABITCARD_HOME add column DISTRICT_ID uuid ;
