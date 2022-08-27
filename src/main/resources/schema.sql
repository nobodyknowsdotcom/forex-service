create table if not exists exchange_value (
    id int not null primary key,
    currency_from varchar(10),
    currency_to varchar(10),
    conversion_multiple float,
    port int);