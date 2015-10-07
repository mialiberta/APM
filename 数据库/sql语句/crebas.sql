/*==============================================================*/
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     9/27 ������ 1:06:26                             */
/*==============================================================*/


drop table if exists config;

drop table if exists cpuInfo;

drop table if exists diskInfo;

drop table if exists ioInfo;

drop table if exists memInfo;

drop table if exists netInfo;

drop table if exists notice;

drop table if exists user;

drop table if exists vmInfo;

/*==============================================================*/
/* Table: config                                                */
/*==============================================================*/
create table config
(
   conf_id              int not null,
   vm_id                char(15),
   cpu_threshold        decimal,
   mem_threshold        decimal,
   disk_threshold       decimal,
   net_threshold        decimal,
   io_threshold         decimal,
   primary key (conf_id)
);

/*==============================================================*/
/* Table: cpuInfo                                               */
/*==============================================================*/
create table cpuInfo
(
   cpu_id               char(30) not null,
   vm_id                char(15),
   cpu_time             datetime,
   user                 decimal comment '��ʾ���û�����(application)����ʹ�� CPU ��ʱ��İٷֱ�',
   nice                 decimal comment '��ʾ���û���������nice��������ռ�� CPU ��ʱ��İٷֱ�',
   system               decimal comment '�ں��ļ���(kernel)������ʹ�� CPU ��ʱ��İٷֱ�',
   iowait               decimal comment '��ʾ���ڵȴ�I/O����ռ�� CPU ��ʱ��İٷֱ�',
   steal                decimal comment '�������(hypervisor)Ϊ��һ����������ṩ������ȴ����� CPU �İٷֱ�',
   idle                 decimal comment '��ʾ CPU ����ʱ��ռ�� CPU ��ʱ��İٷֱ�',
   primary key (cpu_id)
);

/*==============================================================*/
/* Table: diskInfo                                              */
/*==============================================================*/
create table diskInfo
(
   disk_id              char(30) not null,
   vm_id                char(15),
   disk_time            datetime,
   Dev                  varchar(30),
   tps                  decimal comment 'ÿ����еĴ�����',
   rd_sec               decimal comment 'ÿ��Ӵ��̶�ȡ��������',
   wr_sec               decimal comment 'ÿ��Ӵ���д���������',
   primary key (disk_id)
);

/*==============================================================*/
/* Table: ioInfo                                                */
/*==============================================================*/
create table ioInfo
(
   io_id                char(30) not null,
   vm_id                char(15),
   io_time              datetime,
   io_tps               decimal comment 'ÿ���������豸�� I/O ��������',
   rtps                 decimal comment 'ÿ���Ӵ������豸�������������',
   wtps                 decimal comment 'ÿ�����������豸д�����������',
   bwrtn                decimal comment 'ÿ�����������豸д�������������λΪ ��/s',
   bread                decimal comment 'ÿ���Ӵ������豸�����������/��',
   primary key (io_id)
);

/*==============================================================*/
/* Table: memInfo                                               */
/*==============================================================*/
create table memInfo
(
   mem_id               char(30) not null,
   vm_id                char(15),
   mem_time             datetime,
   kbmemfree            decimal comment '��ʱ�����ڴ������',
   kbmemused            decimal comment '��ʱ��ʹ�õ��ڴ�����',
   memused              decimal comment '��ʹ���ڴ�İٷֱ�  ',
   kbbuffers            decimal comment '�������������ڴ�ٷֱ�',
   kbcacheed            decimal comment '�ں�����Ϊ����ʹ�ðٷֱ�',
   primary key (mem_id)
);

/*==============================================================*/
/* Table: netInfo                                               */
/*==============================================================*/
create table netInfo
(
   net_id               char(30) not null,
   vm_id                char(15),
   net_time             datetime not null,
   rxpck                decimal comment 'ÿ���ӽ��յ����ݰ�',
   txpck                decimal comment 'ÿ���ӷ��͵����ݰ�',
   rxbyt                decimal comment 'ÿ���ӽ��յ��ֽ���
            ',
   txbyt                decimal comment 'ÿ���ӷ��ͳ�ȥ���ֽ���',
   rxerr                decimal comment 'ÿ���ӽ��յ����𻵵İ�����Ŀ',
   txerr                decimal comment 'ÿ���ӷ��͵Ļ����ݰ�',
   primary key (net_id)
);

/*==============================================================*/
/* Table: notice                                                */
/*==============================================================*/
create table notice
(
   notice_id            char(30) not null,
   user_id              char(30),
   notice_time          datetime,
   content              varchar(1000),
   isread               int,
   primary key (notice_id)
);

/*==============================================================*/
/* Table: user                                                  */
/*==============================================================*/
create table user
(
   user_id              char(30) not null,
   account              varchar(30) comment '�˻�',
   name                 varchar(30) comment '����',
   password             varchar(30) comment '����',
   email                varchar(30) comment '����',
   phone                numeric(11,0) comment '�绰',
   primary key (user_id)
);

/*==============================================================*/
/* Table: vmInfo                                                */
/*==============================================================*/
create table vmInfo
(
   vm_id                char(15) not null,
   user_id              char(30),
   ip                   varchar(15) comment 'ip��ַ',
   hostname             varchar(50),
   state                int,
   opreation_system     varchar(50) comment '����ϵͳ',
   cpu_info             varchar(50),
   mem_info             varchar(20),
   disk_info            varchar(20),
   primary key (vm_id)
);

alter table config add constraint FK_Relationship_11 foreign key (vm_id)
      references vmInfo (vm_id) on delete restrict on update restrict;

alter table cpuInfo add constraint FK_Relationship_7 foreign key (vm_id)
      references vmInfo (vm_id) on delete restrict on update restrict;

alter table diskInfo add constraint FK_Relationship_5 foreign key (vm_id)
      references vmInfo (vm_id) on delete restrict on update restrict;

alter table ioInfo add constraint FK_Relationship_6 foreign key (vm_id)
      references vmInfo (vm_id) on delete restrict on update restrict;

alter table memInfo add constraint FK_Relationship_3 foreign key (vm_id)
      references vmInfo (vm_id) on delete restrict on update restrict;

alter table netInfo add constraint FK_Relationship_8 foreign key (vm_id)
      references vmInfo (vm_id) on delete restrict on update restrict;

alter table notice add constraint FK_Relationship_1 foreign key (user_id)
      references user (user_id) on delete restrict on update restrict;

alter table vmInfo add constraint FK_Relationship_2 foreign key (user_id)
      references user (user_id) on delete restrict on update restrict;

