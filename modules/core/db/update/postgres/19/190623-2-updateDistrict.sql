alter table district add column ID uuid ^
update district set ID = newid() where ID is null ;
alter table district alter column ID set not null ;
