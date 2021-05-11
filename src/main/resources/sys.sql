create database medicine_management;
use medicine_management;
create table admin
(
    account  varchar(15) not null
        primary key,
    password varchar(30) not null,
    name     varchar(10) not null
)
    charset = utf8;

create table delivery
(
    delivery_id   varchar(255)                        not null,
    deliver_id    varchar(255)                        not null,
    delivery_time timestamp default CURRENT_TIMESTAMP not null on update CURRENT_TIMESTAMP
)
    charset = utf8;

create table delivery_storage
(
    delivery_id varchar(255) not null,
    storage_id  varchar(255) not null,
    nums        int          not null,
    primary key (delivery_id, storage_id)
)
    charset = utf8;

create table entering
(
    order_id      varchar(255)                        not null,
    entering_time timestamp default CURRENT_TIMESTAMP not null on update CURRENT_TIMESTAMP,
    entering_id   varchar(255)                        not null
        primary key
)
    charset = utf8;

create table medicine
(
    medicine_id   varchar(255) null,
    medicine_name varchar(100) null,
    constraint medicine_medicine_id_uindex
        unique (medicine_id)
)
    charset = utf8;

create table order_medicine
(
    order_id    varchar(255) not null,
    medicine_id varchar(255) not null,
    nums        int          null,
    constraint order_medicine_pk
        unique (order_id, medicine_id)
)
    charset = utf8;

create table pharmacist
(
    pharmacist_id   varchar(255) not null
        primary key,
    password        varchar(255) null,
    pharmacist_name varchar(255) null
)
    charset = utf8;

create table storage
(
    storage_id   varchar(255)  not null
        primary key,
    price        decimal(5, 2) not null,
    rest_nums    int           null,
    order_id     varchar(255)  null,
    medicine_id  varchar(255)  null,
    expired_time date          null,
    state        int default 0 not null
)
    charset = utf8;

create table supplier
(
    supplier_id   varchar(255) not null
        primary key,
    supplier_name varchar(255) not null
)
    charset = utf8;

create table tb_order
(
    order_id      varchar(255)                        not null
        primary key,
    pharmacist_id varchar(255)                        null,
    supplier_id   varchar(255)                        null,
    time          timestamp default CURRENT_TIMESTAMP not null on update CURRENT_TIMESTAMP,
    state         int                                 null
)
    charset = utf8;

