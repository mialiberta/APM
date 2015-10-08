package tables_structure;

public class VmInfo extends BaseTable {
	public String vm_id;
	public String user_id;
	public String ip;
	public String hostname;
	public int state;
	public String opreation_system;
	public String cpu_info;
	public String mem_info;
	public String disk_info;

	public VmInfo() {
	}

	public void setAll(String[] str) {
		vm_id = str[0];
		user_id = str[1];
		ip = str[2];
		hostname = str[3];
		state = Integer.parseInt(str[4]);
		opreation_system = str[5];
		cpu_info = str[6];
		mem_info = str[7];
		disk_info = str[8];

	}

	@Override
	public String getTableName() {
		return "vmInfo";
	}
}