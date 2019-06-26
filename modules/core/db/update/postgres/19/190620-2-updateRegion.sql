update region set REGION = '' where REGION is null ;
alter table region alter column REGION set not null ;
