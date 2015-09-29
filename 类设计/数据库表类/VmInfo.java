package tables_structure;

public class VmInfo extends BaseTable {
	public String vm_id;
	public String ip;
	public String hostname;
	public int state;
	public String operation_system;
	public Date build_time;
	public VmInfo() {
	}

	public void setAll(String[] str) {
		vm_id = str[0];
		ip = str[1];
		hostname = str[2];
		state = Integer.parseInt(str[3]);
		operation_system = str[4];
		build_time.date=str[5];
	}

	@Override
	public String getTableName() {
		return "vmInfo";
	}
}