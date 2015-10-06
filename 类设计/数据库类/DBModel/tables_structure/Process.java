package tables_structure;

public class Process extends BaseTable{
	private String vm_id;
	private int PID;
	private String process_state;
	private String process_user;
	private float cpu_percentage;
	private float mem_percentage;
	private String cmd;
	public Process(){
    }
    public void setAll(String[] str)
    {
    	vm_id=str[0];
    	PID=Integer.parseInt(str[1]);
    	process_state=str[2];
    	process_user=str[3];
    	cpu_percentage=Float.parseFloat(str[4]);
    	mem_percentage=Float.parseFloat(str[5]);
    	cmd=str[6];
    	}
	@Override
	public String getTableName() {
		return "process";
	}
	public String getVm_id() {
		return vm_id;
	}
	public void setVm_id(String vm_id) {
		this.vm_id = vm_id;
	}
	public int getPID() {
		return PID;
	}
	public void setPID(int pID) {
		PID = pID;
	}
	public String getProcess_state() {
		return process_state;
	}
	public void setProcess_state(String process_state) {
		this.process_state = process_state;
	}
	public String getProcess_user() {
		return process_user;
	}
	public void setProcess_user(String process_user) {
		this.process_user = process_user;
	}
	public float getCpu_percentage() {
		return cpu_percentage;
	}
	public void setCpu_percentage(float cpu_percentage) {
		this.cpu_percentage = cpu_percentage;
	}
	public float getMem_percentage() {
		return mem_percentage;
	}
	public void setMem_percentage(float mem_percentage) {
		this.mem_percentage = mem_percentage;
	}
	public String getCmd() {
		return cmd;
	}
	public void setCmd(String cmd) {
		this.cmd = cmd;
	}
	@Override
	public String toString() {
		return "Process [vm_id=" + vm_id + ", PID=" + PID + ", process_state="
				+ process_state + ", process_user=" + process_user
				+ ", cpu_percentage=" + cpu_percentage + ", mem_percentage="
				+ mem_percentage + ", cmd=" + cmd + "]";
	}
}