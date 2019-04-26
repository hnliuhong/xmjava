/*删除商城数据库,如果存在*/
drop database if exists demo;
create database demo default character set utf8;
use demo;
drop table if exists product;

create table product
(
   id                  int not null auto_increment,
   name                varchar(20),
   price               decimal(8,2),
   remark              longtext,
   date                timestamp default CURRENT_TIMESTAMP,
   primary key (id)
);

/* 商品测试用例 */
insert into product (name,price,remark) values ('小米手机',3000.00,'这里是小米手机是简单介绍');
insert into product (name,price,remark) values ('华为手机',3000.00,'这里是华为手机是简单介绍');
insert into product (name,price,remark) values ('Iphone8',6000.00,'这里是Iphone8手机简单介绍');

select * from product where name like '%%';