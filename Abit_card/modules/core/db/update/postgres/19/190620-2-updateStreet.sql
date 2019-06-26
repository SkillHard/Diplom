update street set STREET = '' where STREET is null ;
alter table street alter column STREET set not null ;
