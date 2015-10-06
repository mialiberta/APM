package test;

import tables_structure.*;
import DBconnect.JConnectUser;

public class Test {
	public static void main(String[] args) {
		testTableInsertAndFind(); 
	}
    
	public static void testTableInsertAndFind() {
		// TODO Auto-generated method stub
		String tableName = null;
		JConnectUser jcu = new JConnectUser("wanghuan", "321321");  //创建连接
		// 测试user
		tableName = "User";
		String[] st = { "user1", "wanghuan", "王焕", "321321", "1221@qq.com",
				"15111139783" };
		test(jcu, tableName, st);
		// 测试vminfo
		tableName = "VmInfo";
		String[] st1 = { "vm_1", "127.0.0.1", "localhost", "1", "linux",
				"2015-09-05 11:53:43" };
		test(jcu, tableName, st1);
		// 测试user_vm
		tableName = "User_vm";
		String[] st2 = { "user1", "vm_1" };
		test(jcu, tableName, st2);
		// 测试cpustat
		tableName = "CpuStat";
		String[] st3 = { "cpu_1", "vm_1", "2015-09-05 11:53:43", "0.228",
				"0.00", "0.209", "0.01", "0.00", "0.601" };
		test(jcu, tableName, st3);
		// 测试cpuInfo
		tableName = "CpuInfo";
		String[] st4 = { "vm_1", "1", "4", "2", "2.00", "1", "ADRsdge", "1",
				"Hongji" };
		test(jcu, tableName, st4);
		// 测试config
		tableName = "Config";
		String[] st5 = { "config_1", "vm_1", "1", "1" };
		test(jcu, tableName, st5);
		// 测试diskstat
		tableName = "DiskStat";
		String[] st6 = { "dist_1", "vm_1", "2015-09-05 11:53:43", "0.228",
				"0.02", "0.209", "0.01", "5", "0.01", "5" };
		test(jcu, tableName, st6);
		// 测试iostat
		tableName = "IoStat";
		String[] st7 = { "io_1", "vm_1", "2015-09-05 11:53:43", "0.228",
				"0.00", "0.209", "0.01", "0.00","0.00", "0.209", "0.01", "0.00","0.00", "0.209"};
		test(jcu, tableName, st7);
		// 测试meminfo
		tableName = "MemInfo";
		String[] st8 = { "vm_1", "256", "12024" };
		test(jcu, tableName, st8);
		// 测试memstat
		tableName = "MemStat";
		String[] st9 = { "mem_1", "vm_1", "2015-09-05 11:53:43", "0.228",
				"0.00", "0.209", "0.01", "0.601", "0.209", "0.01", "0.601" };
		test(jcu, tableName, st9);
		// 测试netinfo
		tableName = "NetInfo";
		String[] st10 = { "vm_1", "1244::dr::sdf:d34", "ca::34:sd:423" };
		test(jcu, tableName, st10);
		// 测试netstat
		tableName = "NetStat";
		String[] st11 = { "net_1", "vm_1", "2015-09-05 11:53:43", "0.228",
				"0.00", "0.209", "0.01", "0.00", "0.601" };
		test(jcu, tableName, st11);
		// 测试notice
		tableName = "Notice";
		String[] st12 = { "motice_1", "user1", "vm_1", "2015-09-05 11:53:43",
				"cpu过高", "1" };
		test(jcu, tableName, st12);
		// 测试platfrom
		tableName = "Platfrom";
		String[] st13 = { "vm_1", "gooarch", "goos", "hardplat", "name",
				"release", "version", "machine", "os", "processor", "pythonv" };
		test(jcu, tableName, st13);
		// 测试process
		tableName = "Process";
		String[] st14 = { "vm_1", "2245", "1", "wanghuan", "0.55", "0.209",
				"mysql" };
		test(jcu, tableName, st14);
		// 测试filestat
		tableName = "IoStat";
		String[] st15 = { "file_1", "vm_1", "2015-09-05 11:53:43", "0.228",
				"0.00", "0.209", "0.01", "0.00","0.00", "0.209" };
		test(jcu, tableName, st7);
		// 测试Loadstat
		tableName = "LoadStat";
		String[] st16 = { "io_1", "vm_1", "2015-09-05 11:53:43", "2",
				"3", "0.209", "0.01", "0.00" };
		test(jcu, tableName, st7);
	}

	public static void test(JConnectUser jcu, String tablename, String[] data) {
		jcu.create(tablename, data);//参数为表名,数据
		BaseTable[] ci = jcu.retrieve(tablename, 7, 1);//参数为表名,提取数据条目数,步长
		for (int i = 0; i < 1; i++) {
			System.out.println(ci[i].toString());
		}
	}
}