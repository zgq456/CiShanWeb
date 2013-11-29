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
   rec_status           int not null comment '0��ע����1������',
   notes                varchar(255),
   primary key (ad_id)
);

alter table gy_ads comment '����';

/*==============================================================*/
/* Table: gy_company                                            */
/*==============================================================*/
create table gy_company
(
   company_id           bigint not null,
   company_type         int not null comment '0��������֯
            1��ũ������
            2��ҽҩ����
            3����������
            4��ұ����
            5��ʯ�ͻ���
            6��ˮ��ˮ��
            7����ͨ����
            8����Ϣ��ҵ
            9����е����
            10���ṤʳƷ
            11����װ��֯
            12��רҵ����
            13����ȫ����
            14�������̻�
            15����������
            16���칫�Ľ�
            17�����ӵ繤
            18�������Ʒ
            19���Ҿ���Ʒ
            20������ר��
            21����װ��Ʒ
            22��������Ʒ
            23���칫�Ҿ�
            24������
            ',
   company_name         varchar(255) not null,
   company_addr         varchar(255),
   done_date            timestamp not null,
   rec_status           int not null comment '0��ע����1������',
   notes                varchar(255),
   primary key (company_id)
);

alter table gy_company comment '���̱�';

/*==============================================================*/
/* Table: gy_donation                                           */
/*==============================================================*/
create table gy_donation
(
   user_id              bigint not null,
   seeker_id              bigint not null,
   ad_id                bigint not null,
   help_type            int not null comment '0����ҵ��1������',
   help_amount          double,
   done_date            timestamp not null,
   rec_status           int not null comment '0��ע����1������',
   notes                varchar(255),
   primary key (user_id, seeker_id, help_type)
);

alter table gy_donation comment '������Ϣ���Ѿ�����
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
   rec_status           int not null comment '0��ע����1������',
   notes                varchar(255),
   primary key (id)
);

alter table gy_prov comment 'ʡ�ݱ�
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
   rec_status           int not null comment '0��ע����1������',
   notes                varchar(255),
   primary key (seeker_id,ad_id)
);

alter table gy_seeker comment '������Ϣ��
';


/*==============================================================*/
/* Table: gy_user                                               */
/*==============================================================*/
create table gy_user
(
   user_id              bigint not null,
   user_type            int not null comment '0����ͨ�û���1������Ա',
   user_acct            varchar(50) not null,
   user_name            varchar(30),
   password             varchar(100) not null,
   age_type             int comment '0��80���ϣ�1:60~80��2:40~60��3:20~40��4:20����',
   gender               int comment '0���У�1��Ů',
   prov_id              int,
   zone_id              int,
   create_date          timestamp,
   done_date            timestamp not null,
   rec_status           int not null comment '0��ע����1������',
   notes                varchar(255),
   primary key (user_id)
);

alter table gy_user comment '�û���';

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
   rec_status           int not null comment '0��ע����1������',
   notes                varchar(255),
   primary key (id)
);

alter table gy_zone comment '���б�
';

