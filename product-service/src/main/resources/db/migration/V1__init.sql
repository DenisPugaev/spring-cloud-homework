create table products (
    id          bigserial primary key,
    title       varchar(255),
    price       decimal,
    manufacturer    varchar(255)
);

insert into products (title, price, manufacturer)
values ('Sleek Iron Bottle', 10424,' Iron INC'),
       ('Fantastic Granite Car', 20563,'Granite LLC'),
       ('Rustic Cotton Bench', 305353,'Iron INC'),
       ('Fantastic Steel Computer', 70240,'Iron INC'),
       ('Small Marble Bench', 80632,'Granite LLC'),
       ('Big Glass Stick', 20032,'Iron INC'),
       ('Fantastic Wooden Mobile', 180632,'Granite LLC'),
       ('Little Cotton Book', 10632,'Granite LLC'),
       ('Rustic Wooden Computer', 110900,'Iron INC');
