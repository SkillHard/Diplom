update district set DISTRICT = '' where DISTRICT is null ;
alter table district alter column DISTRICT set not null ;
