-- 创建数据库
create database movie DEFAULT CHARACTER SET utf8;

--创建数据表
create table movie(
    id int primary key auto_increment,
    movie_name varchar(30) not null default '未定义电影名称' comment '电影名称',
    movie_desc varchar(255) not null default '默认电影简介' comment '电影描述,最多255个字符',
    movie_show date not null default '1900-01-01' comment '电影上映时间,默认为1900年',
    movie_status tinyint not null default 3 comment '有几种状态,具体看MovieStatus这个枚举类的信息,因为后期可能会增加其他状态',
    movie_url varchar(300) not null default  '' comment '已上映电影的观看地址',
    movie_photo varchar(100) not null default '' comment '图片地址,目前存了一张,后期会改进',
    keep_count int not null default 1 comment '电影收藏人数,默认为1人',
    create_date datetime not null default  '1900-01-01 00:00:00' comment '电影实体类创建时间',
    update_date datetime not null default  '1900-01-01 00:00:00' comment '电影实体类修改时间'
) engine = Innodb default charset = utf8 comment='电影表';