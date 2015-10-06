package tables_structure;

public class CpuStat extends BaseTable{
	private String cpu_id;
	private String vm_id;
	private String cpu_time;
	private float user;
	private float nice;
	private float system; 
	private float iowait;
	private float steal;
	private float idle;
    public CpuStat(){
    }
    public void setAll(String[] str)
    {
    	cpu_id=str[0];
    	vm_id=str[1];
    	cpu_time=str[2];
    	user=Float.parseFloat(str[3]);
    	nice=Float.parseFloat(str[4]);
    	system=Float.parseFloat(str[5]); 
    	iowait=Float.parseFloat(str[6]);
    	steal=Float.parseFloat(str[7]);
    	idle=Float.parseFloat(str[8]);
    }
	@Override
	public String getTableName() {
		
		return "cpuStat";
	}
	public String getCpu_id() {
		return cpu_id;
	}
	public void setCpu_id(String cpu_id) {
		this.cpu_id = cpu_id;
	}
	public String getVm_id() {
		return vm_id;
	}
	public void setVm_id(String vm_id) {
		this.vm_id = vm_id;
	}
	public String getCpu_time() {
		return cpu_time;
	}
	public void setCpu_time(String cpu_time) {
		this.cpu_time = cpu_time;
	}
	public float getUser() {
		return user;
	}
	public void setUser(float user) {
		this.user = user;
	}
	public float getNice() {
		return nice;
	}
	public void setNice(float nice) {
		this.nice = nice;
	}
	public float getSystem() {
		return system;
	}
	public void setSystem(float system) {
		this.system = system;
	}
	public float getIowait() {
		return iowait;
	}
	public void setIowait(float iowait) {
		this.iowait = iowait;
	}
	public float getSteal() {
		return steal;
	}
	public void setSteal(float steal) {
		this.steal = steal;
	}
	public float getIdle() {
		return idle;
	}
	public void setIdle(float idle) {
		this.idle = idle;
	}
	@Override
	public String toString() {
		return "CpuStat [cpu_id=" + cpu_id + ", vm_id=" + vm_id + ", cpu_time="
				+ cpu_time + ", user=" + user + ", nice=" + nice + ", system="
				+ system + ", iowait=" + iowait + ", steal=" + steal
				+ ", idle=" + idle + "]";
	}
}