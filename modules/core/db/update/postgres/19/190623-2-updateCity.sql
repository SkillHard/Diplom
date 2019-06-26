alter table city add column ID uuid ^
update city set ID = newid() where ID is null ;
alter table city alter column ID set not null ;
