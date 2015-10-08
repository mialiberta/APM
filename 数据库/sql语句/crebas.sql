/*==============================================================*/
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     10/6 ���ڶ� 19:42:32                            */
/*==============================================================*/


drop table if exists config;

drop table if exists cpuInfo;

drop table if exists cpuStat;

drop table if exists diskStat;

drop table if exists fileStat;

drop table if exists ioStat;

drop table if exists loadStat;

drop table if exists memInfo;

drop table if exists memStat;

drop table if exists netInfo;

drop table if exists netStat;

drop table if exists notice;

drop table if exists platfrom;

drop table if exists process;

drop table if exists user;

drop table if exists user_vm;

drop table if exists vmInfo;

/*==============================================================*/
/* Table: config                                                */
/*==============================================================*/
create table config
(
   conf_id              char(15) not null,
   vm_id                char(15),
   threshold_name       decimal,
   threshold_value      decimal,
   primary key (conf_id)
);

/*==============================================================*/
/* Table: cpuInfo                                               */
/*==============================================================*/
create table cpuInfo
(
   vm_id                char(15) not null,
   chche_size           int,
   cpu_cores            int,
   family               int,
   mhz                  decimal,
   model                int,
   model_name           varchar(50),
   stepping             int,
   vendor_id            varchar(30),
   primary key (vm_id)
);

/*==============================================================*/
/* Table: cpuStat                                               */
/*==============================================================*/
create table cpuStat
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
/* Table: diskStat                                              */
/*==============================================================*/
create table diskStat
(
   disk_id              char(30) not null,
   vm_id                char(15),
   disk_time            datetime,
   tps                  decimal comment 'ÿ����еĴ�����',
   rd_sec               decimal comment 'ÿ��Ӵ��̶�ȡ��������',
   wr_sec               decimal comment 'ÿ��Ӵ���д���������',
   free                 decimal,
   in_use               decimal,
   used                 decimal,
   disk_await           decimal,
   primary key (disk_id)
);

/*==============================================================*/
/* Table: fileStat                                              */
/*==============================================================*/
create table fileStat
(
   file_id              char(30) not null,
   vm_id                char(15),
   file_time            datetime,
   dentunusd            decimal,
   file_nr              decimal,
   inode_nr             decimal,
   pty_nr               decimal,
   inode_free           decimal,
   inode_in_use         decimal,
   inode_used           decimal,
   primary key (file_id)
);

/*==============================================================*/
/* Table: ioStat                                                */
/*==============================================================*/
create table ioStat
(
   io_id                char(30) not null,
   vm_id                char(15),
   io_time              datetime,
   io_tps               decimal comment 'ÿ���������豸�� I/O ��������',
   rtps                 decimal comment 'ÿ���Ӵ������豸�������������',
   wtps                 decimal comment 'ÿ�����������豸д�����������',
   bwrtn                decimal comment 'ÿ�����������豸д�������������λΪ ��/s',
   bread                decimal comment 'ÿ���Ӵ������豸�����������/��',
   r_s                  decimal,
   w_s                  decimal,
   rkb_s                decimal,
   wkb_s                decimal,
   await                decimal,
   util                 decimal,
   primary key (io_id)
);

/*==============================================================*/
/* Table: loadStat                                              */
/*==============================================================*/
create table loadStat
(
   load_id              char(30) not null,
   vm_id                char(15),
   load_time            datetime,
   runq_sz              int,
   plist_sz             int,
   ldavg_1              decimal,
   ldavg_5              decimal,
   ldavg_15             decimal,
   primary key (load_id)
);

/*==============================================================*/
/* Table: memInfo                                               */
/*==============================================================*/
create table memInfo
(
   vm_id                char(15) not null,
   swap_total           numeric(20,0),
   total                numeric(20,0),
   primary key (vm_id)
);

/*==============================================================*/
/* Table: memStat                                               */
/*==============================================================*/
create table memStat
(
   mem_id               char(30) not null,
   vm_id                char(15),
   mem_time             datetime,
   kbmemfree            decimal comment '��ʱ�����ڴ������',
   kbmemused            decimal comment '��ʱ��ʹ�õ��ڴ�����',
   memused              decimal comment '��ʹ���ڴ�İٷֱ�  ',
   kbbuffers            decimal comment '�������������ڴ�����',
   kbcacheed            decimal comment '�������ٻ���ʹ���ڴ���',
   kbswpfree            decimal comment '�������Ŀ�������',
   kbswpused            decimal comment 'ʹ���еĽ���������',
   swpused              decimal comment '��ʹ�ý������İٷֱ�',
   primary key (mem_id)
);

/*==============================================================*/
/* Table: netInfo                                               */
/*==============================================================*/
create table netInfo
(
   vm_id                char(15) not null,
   ipaddressv6          varchar(50),
   macaddress           varchar(50),
   primary key (vm_id)
);

/*==============================================================*/
/* Table: netStat                                               */
/*==============================================================*/
create table netStat
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
   vm_id                char(15),
   notice_time          datetime,
   content              varchar(1000),
   isread               int,
   primary key (notice_id)
);

/*==============================================================*/
/* Table: platfrom                                              */
/*==============================================================*/
create table platfrom
(
   vm_id                char(15) not null,
   GOOARCH              varchar(50),
   GOOS                 varchar(50),
   hardware_platfrom    varchar(30),
   kernel_name          varchar(50),
   kernel_release       varchar(50),
   kernel_version       varchar(50),
   machine              varchar(50),
   os                   varchar(50),
   processor            varchar(50),
   pythonV              varchar(50),
   primary key (vm_id)
);

/*==============================================================*/
/* Table: process                                               */
/*==============================================================*/
create table process
(
   vm_id                char(15) not null,
   PID                  int,
   process_state        varchar(50),
   process_user         varchar(50),
   cpu_percentage       decimal,
   mem_percentage       decimal,
   cmd                  varchar(50),
   primary key (vm_id)
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
   phone                char(11) comment '�绰',
   primary key (user_id)
);

/*==============================================================*/
/* Table: user_vm                                               */
/*==============================================================*/
create table user_vm
(
   user_id              char(30) not null,
   vm_id                char(15) not null,
   primary key (user_id, vm_id)
);

/*==============================================================*/
/* Table: vmInfo                                                */
/*==============================================================*/
create table vmInfo
(
   vm_id                char(15) not null,
   ip                   varchar(15) comment 'ip��ַ',
   hostname             varchar(50),
   state                int,
<<<<<<< HEAD
   operation_system     varchar(50) comment '����ϵͳ',
   build_time           datetime,
=======
   opreation_system     varchar(50) comment '����ϵͳ',
   cpu_info             varchar(50),
   mem_info             varchar(20),
   disk_info            varchar(20),
>>>>>>> master
   primary key (vm_id)
);

alter table config add constraint FK_Relationship_10 foreign key (vm_id)
      references vmInfo (vm_id) on delete restrict on update restrict;

alter table cpuInfo add constraint FK_Relationship_17 foreign key (vm_id)
      references vmInfo (vm_id) on delete restrict on update restrict;

alter table cpuStat add constraint FK_Relationship_7 foreign key (vm_id)
      references vmInfo (vm_id) on delete restrict on update restrict;

alter table diskStat add constraint FK_Relationship_5 foreign key (vm_id)
      references vmInfo (vm_id) on delete restrict on update restrict;

alter table fileStat add constraint FK_Relationship_21 foreign key (vm_id)
      references vmInfo (vm_id) on delete restrict on update restrict;

alter table ioStat add constraint FK_Relationship_6 foreign key (vm_id)
      references vmInfo (vm_id) on delete restrict on update restrict;

alter table loadStat add constraint FK_Relationship_22 foreign key (vm_id)
      references vmInfo (vm_id) on delete restrict on update restrict;

alter table memInfo add constraint FK_Relationship_19 foreign key (vm_id)
      references vmInfo (vm_id) on delete restrict on update restrict;

alter table memStat add constraint FK_Relationship_4 foreign key (vm_id)
      references vmInfo (vm_id) on delete restrict on update restrict;

alter table netInfo add constraint FK_Relationship_15 foreign key (vm_id)
      references vmInfo (vm_id) on delete restrict on update restrict;

alter table netStat add constraint FK_Relationship_8 foreign key (vm_id)
      references vmInfo (vm_id) on delete restrict on update restrict;

alter table notice add constraint FK_Relationship_1 foreign key (user_id)
      references user (user_id) on delete restrict on update restrict;

alter table notice add constraint FK_Relationship_20 foreign key (vm_id)
      references vmInfo (vm_id) on delete restrict on update restrict;

alter table platfrom add constraint FK_Relationship_13 foreign key (vm_id)
      references vmInfo (vm_id) on delete restrict on update restrict;

alter table process add constraint FK_Relationship_11 foreign key (vm_id)
      references vmInfo (vm_id) on delete restrict on update restrict;

alter table user_vm add constraint FK_Relationship_2 foreign key (user_id)
      references user (user_id) on delete restrict on update restrict;

alter table user_vm add constraint FK_Relationship_3 foreign key (vm_id)
      references vmInfo (vm_id) on delete restrict on update restrict;

