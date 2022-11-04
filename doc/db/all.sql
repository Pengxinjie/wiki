show databases ;
DROP TABLE IF EXISTS test;
create table test(
     id bigint not null comment 'id',
     name varchar(50) comment '名称',
     age int comment '年龄',
     primary key (id)
)engine=innodb default charset=utf8mb4 comment '测试';

select * from test;


# 创建demo表测试
drop table if exists demo;
create table demo(
    id bigint not null comment 'id',
    name varchar(50) comment '名称',
    primary key (id)
)engine=innodb default charset=utf8mb4 comment='测试';

insert into demo (id, name) VALUES (1,'测试');

select * from demo;