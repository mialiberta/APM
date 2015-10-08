/*==============================================================*/
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     10/6 星期二 19:42:32                            */
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
   user                 decimal comment '显示在用户级别(application)运行使用 CPU 总时间的百分比',
   nice                 decimal comment '显示在用户级别，用于nice操作，所占用 CPU 总时间的百分比',
   system               decimal comment '在核心级别(kernel)运行所使用 CPU 总时间的百分比',
   iowait               decimal comment '显示用于等待I/O操作占用 CPU 总时间的百分比',
   steal                decimal comment '管理程序(hypervisor)为另一个虚拟进程提供服务而等待虚拟 CPU 的百分比',
   idle                 decimal comment '显示 CPU 空闲时间占用 CPU 总时间的百分比',
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
   tps                  decimal comment '每秒进行的传输数',
   rd_sec               decimal comment '每秒从磁盘读取的扇区数',
   wr_sec               decimal comment '每秒从磁盘写入的扇区数',
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
   io_tps               decimal comment '每秒钟物理设备的 I/O 传输总量',
   rtps                 decimal comment '每秒钟从物理设备读入的数据总量',
   wtps                 decimal comment '每秒钟向物理设备写入的数据总量',
   bwrtn                decimal comment '每秒钟向物理设备写入的数据量，单位为 块/s',
   bread                decimal comment '每秒钟从物理设备读入的数据量/块',
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
   kbmemfree            decimal comment '此时可用内存的数量',
   kbmemused            decimal comment '此时已使用的内存数量',
   memused              decimal comment '已使用内存的百分比  ',
   kbbuffers            decimal comment '用作缓冲区的内存数量',
   kbcacheed            decimal comment '用作高速缓存使用内存数',
   kbswpfree            decimal comment '交换区的空闲容量',
   kbswpused            decimal comment '使用中的交换区容量',
   swpused              decimal comment '已使用交换区的百分比',
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
   account              varchar(30) comment '账户',
   name                 varchar(30) comment '姓名',
   password             varchar(30) comment '密码',
   email                varchar(30) comment '邮箱',
   phone                char(11) comment '电话',
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
   ip                   varchar(15) comment 'ip地址',
   hostname             varchar(50),
   state                int,
<<<<<<< HEAD
   operation_system     varchar(50) comment '操作系统',
   build_time           datetime,
=======
   opreation_system     varchar(50) comment '操作系统',
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

