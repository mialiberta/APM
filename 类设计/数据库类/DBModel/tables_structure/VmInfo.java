package tables_structure;

public class VmInfo extends BaseTable {
	private String vm_id;
	private String ip;
	private String hostname;
	private int state;
	private String operation_system;
	private String build_time;
	public VmInfo() {
	}

	public void setAll(String[] str) {
		vm_id = str[0];
		ip = str[1];
		hostname = str[2];
		state = Integer.parseInt(str[3]);
		operation_system = str[4];
		build_time=str[5];
	}

	@Override
	public String getTableName() {
		return "vmInfo";
	}

	public String getVm_id() {
		return vm_id;
	}

	public void setVm_id(String vm_id) {
		this.vm_id = vm_id;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public String getHostname() {
		return hostname;
	}

	public void setHostname(String hostname) {
		this.hostname = hostname;
	}

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
	}

	public String getOperation_system() {
		return operation_system;
	}

	public void setOperation_system(String operation_system) {
		this.operation_system = operation_system;
	}

	public String getBuild_times() {
		return build_time;
	}

	public void setBuild_time(String build_time) {
		this.build_time = build_time;
	}

	@Override
	public String toString() {
		return "VmInfo [vm_id=" + vm_id + ", ip=" + ip + ", hostname="
				+ hostname + ", state=" + state + ", operation_system="
				+ operation_system + ", build_time=" + build_time + "]";
	}

}