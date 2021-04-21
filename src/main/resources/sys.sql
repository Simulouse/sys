create database medicine_management;
use medidcine_management;
DROP TABLE IF EXISTS tb_order;
create table IF NOT EXISTS tb_order (
    order_id varchar(255) NOT NULL primary key ,
    pharmacist_id varchar(255),
    supplier_id varchar(255),
    medicine_id varchar(255),
    nums int,
    time timestamp,
    state int
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

DROP TABLE IF EXISTS tb_entering;
create table IF NOT EXISTS tb_entering(
    order_id  varchar(255) NOT NULL primary key ,
    entering_time timestamp
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

DROP TABLE IF EXISTS tb_pharmacist;
create table IF NOT EXISTS tb_pharmacist(
    pharmacist_id varchar(255) NOT NULL primary key,
    password varchar(255),
    name varchar(255)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

DROP TABLE IF EXISTS tb_supplier;
create table IF NOT EXISTS tb_supplier(
    supplier_id varchar(255)  NOT NULL primary key,
    name varchar(255)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

DROP TABLE IF EXISTS tb_medicine;
create table IF NOT EXISTS tb_medicine(
    medicine_id varchar(255) primary key,
    name varchar(255),
    price decimal(5,2),
    rest_nums int,
    expired_time timestamp
)ENGINE=InnoDB DEFAULT CHARSET=utf8;