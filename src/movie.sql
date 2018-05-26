-- 创建数据库
create database movie DEFAULT CHARACTER SET utf8;

--创建数据表
create table movie(
    id int primary key auto_increment,
    movie_name varchar(30) not null default '未定义电影名称' comment '电影名称',
    movie_url varchar(300) not null default  '' comment '已上映电影的观看地址',
    movie_photo varchar(100) not null default '' comment '图片地址,目前存了一张,后期会改进',
    status tinyint not null default 1 comment '电影状态,目前有两种,1-未上映,2-已上映'
) engine = Innodb default charset = utf8 comment='电影表';