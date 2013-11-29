drop database if exists gongyi;

create database gongyi;

use gongyi;


drop table if exists gy_ads;

drop table if exists gy_company;

drop table if exists gy_donation;

drop table if exists gy_prov;

drop table if exists gy_seeker;

drop table if exists gy_user;

drop table if exists gy_zone;

/*==============================================================*/
/* User: gongyi                                                 */
/*==============================================================*/

/*==============================================================*/
/* Table: gy_ads                                                */
/*==============================================================*/
create table gy_ads
(
   ad_id                bigint not null,
   company_id           bigint not null,
   ad_name              varchar(255) not null,
   ad_desc              varchar(1000),
   ad_url               varchar(255),
   max_amount           double not null,
   min_amount           double not null,
   use_amount           double not null,
   done_date            timestamp not null,
   rec_status           int not null comment '0：注销；1：正常',
   notes                varchar(255),
   primary key (ad_id)
);

alter table gy_ads comment '广告表';

/*==============================================================*/
/* Table: gy_company                                            */
/*==============================================================*/
create table gy_company
(
   company_id           bigint not null,
   company_type         int not null comment '0：机构组织
            1：农林牧渔
            2：医药卫生
            3：建筑建材
            4：冶金矿产
            5：石油化工
            6：水利水电
            7：交通运输
            8：信息产业
            9：机械机电
            10：轻工食品
            11：服装纺织
            12：专业服务
            13：安全防护
            14：环保绿化
            15：旅游休闲
            16：办公文教
            17：电子电工
            18：玩具礼品
            19：家居用品
            20：物资专材
            21：包装用品
            22：体育用品
            23：办公家具
            24：其他
            ',
   company_name         varchar(255) not null,
   company_addr         varchar(255),
   done_date            timestamp not null,
   rec_status           int not null comment '0：注销；1：正常',
   notes                varchar(255),
   primary key (company_id)
);

alter table gy_company comment '厂商表';

/*==============================================================*/
/* Table: gy_donation                                           */
/*==============================================================*/
create table gy_donation
(
   user_id              bigint not null,
   seeker_id              bigint not null,
   ad_id                bigint not null,
   help_type            int not null comment '0：企业；1：个人',
   help_amount          double,
   done_date            timestamp not null,
   rec_status           int not null comment '0：注销；1：正常',
   notes                varchar(255),
   primary key (user_id, seeker_id, help_type)
);

alter table gy_donation comment '捐助信息表（已捐助）
';

/*==============================================================*/
/* Table: gy_prov                                               */
/*==============================================================*/
create table gy_prov
(
   id                   bigint not null,
   prov_id              int not null,
   prov_name            varchar(30) not null,
   done_date            timestamp not null,
   rec_status           int not null comment '0：注销；1：正常',
   notes                varchar(255),
   primary key (id)
);

alter table gy_prov comment '省份表
';

/*==============================================================*/
/* Table: gy_seeker                                             */
/*==============================================================*/
create table gy_seeker
(
   seeker_id            bigint not null,
   ad_id				bigint not null,
   seeker_name          varchar(30) not null,
   photo                varchar(255),
   prov_id              int not null,
   seeker_addr          varchar(255),
   seeker_desc          varchar(5000),
   need_amount          double not null,
   help_amount          double,
   help_count           int,
   browse_count         int,
   create_date          timestamp,
   zone_id              int not null,
   done_date            timestamp not null,
   rec_status           int not null comment '0：注销；1：正常',
   notes                varchar(255),
   primary key (seeker_id,ad_id)
);

alter table gy_seeker comment '求助信息表
';


/*==============================================================*/
/* Table: gy_user                                               */
/*==============================================================*/
create table gy_user
(
   user_id              bigint not null,
   user_type            int not null comment '0：普通用户；1：管理员',
   user_acct            varchar(50) not null,
   user_name            varchar(30),
   password             varchar(100) not null,
   age_type             int comment '0：80以上；1:60~80；2:40~60；3:20~40；4:20以下',
   gender               int comment '0：男；1：女',
   prov_id              int,
   zone_id              int,
   create_date          timestamp,
   done_date            timestamp not null,
   rec_status           int not null comment '0：注销；1：正常',
   notes                varchar(255),
   primary key (user_id)
);

alter table gy_user comment '用户表';

/*==============================================================*/
/* Table: gy_zone                                               */
/*==============================================================*/
create table gy_zone
(
   id                   bigint not null,
   zone_id              int not null,
   zone_name            varchar(255) not null,
   prov_id              int not null,
   done_date            timestamp not null,
   rec_status           int not null comment '0：注销；1：正常',
   notes                varchar(255),
   primary key (id)
);

alter table gy_zone comment '地市表
';

