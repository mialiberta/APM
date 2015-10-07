/*==============================================================*/
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     9/27 星期日 1:06:26                             */
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
   user                 decimal comment '显示在用户级别(application)运行使用 CPU 总时间的百分比',
   nice                 decimal comment '显示在用户级别，用于nice操作，所占用 CPU 总时间的百分比',
   system               decimal comment '在核心级别(kernel)运行所使用 CPU 总时间的百分比',
   iowait               decimal comment '显示用于等待I/O操作占用 CPU 总时间的百分比',
   steal                decimal comment '管理程序(hypervisor)为另一个虚拟进程提供服务而等待虚拟 CPU 的百分比',
   idle                 decimal comment '显示 CPU 空闲时间占用 CPU 总时间的百分比',
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
   tps                  decimal comment '每秒进行的传输数',
   rd_sec               decimal comment '每秒从磁盘读取的扇区数',
   wr_sec               decimal comment '每秒从磁盘写入的扇区数',
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
   io_tps               decimal comment '每秒钟物理设备的 I/O 传输总量',
   rtps                 decimal comment '每秒钟从物理设备读入的数据总量',
   wtps                 decimal comment '每秒钟向物理设备写入的数据总量',
   bwrtn                decimal comment '每秒钟向物理设备写入的数据量，单位为 块/s',
   bread                decimal comment '每秒钟从物理设备读入的数据量/块',
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
   kbmemfree            decimal comment '此时可用内存的数量',
   kbmemused            decimal comment '此时已使用的内存数量',
   memused              decimal comment '已使用内存的百分比  ',
   kbbuffers            decimal comment '用作缓冲区的内存百分比',
   kbcacheed            decimal comment '内核中作为缓存使用百分比',
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
   rxpck                decimal comment '每秒钟接收的数据包',
   txpck                decimal comment '每秒钟发送的数据包',
   rxbyt                decimal comment '每秒钟接收的字节数
            ',
   txbyt                decimal comment '每秒钟发送出去的字节数',
   rxerr                decimal comment '每秒钟接收到的损坏的包的数目',
   txerr                decimal comment '每秒钟发送的坏数据包',
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
   account              varchar(30) comment '账户',
   name                 varchar(30) comment '姓名',
   password             varchar(30) comment '密码',
   email                varchar(30) comment '邮箱',
   phone                numeric(11,0) comment '电话',
   primary key (user_id)
);

/*==============================================================*/
/* Table: vmInfo                                                */
/*==============================================================*/
create table vmInfo
(
   vm_id                char(15) not null,
   user_id              char(30),
   ip                   varchar(15) comment 'ip地址',
   hostname             varchar(50),
   state                int,
   opreation_system     varchar(50) comment '操作系统',
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

