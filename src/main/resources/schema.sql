create table if not exists Shawarma_Order (
    id identity,
    delivery_Name varchar(50) not null,
    delivary_Street varchar(50) not null,
    delivery_City varchar(50) not null,
    delivery_State varchar(2) not null,
    delivery_Zip varchar(10) not null,
    cc_number varchar(16) not null,
    cc_expiration varchar(5) not null,
    cc_cvv varchar(3) not null,
    placed_at timestamp not null
    );

create table if not exists Shawarma (
    id identity,
    name varchar(50) not null,
    shawarma_order bigint not null,
    shawarma_order_key bigint not null,
    created_at timestamp not null
);

create table if not exists Ingredient_Ref (
    ingredient varchar(4) not null,
    shawarma bigint not null,
    shawarma_key bigint not null
);

create table if not exists Ingredient (
    id varchar(4) not null,
    name varchar(25) not null,
    type varchar(50) not null
);

alter table Ingredient add primary key (id);

alter table Shawarma
add foreign key (shawarma_order) references Shawarma_Order(id);

alter table Ingredient_Ref
add foreign key (ingredient) references Ingredient(id);