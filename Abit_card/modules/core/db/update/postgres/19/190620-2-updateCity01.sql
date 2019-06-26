update city set CITY = '' where CITY is null ;
alter table city alter column CITY set not null ;
