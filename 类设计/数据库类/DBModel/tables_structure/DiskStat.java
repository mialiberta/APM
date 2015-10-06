package tables_structure;

public class DiskStat extends BaseTable{
	private String disk_id;
	private String vm_id;
	private String disk_time;
	private float tps;
	private float rd_sec; 
	private float wr_sec;
	private float free;
	private float in_use;
	private float used;
	private float disk_await;
    public DiskStat(){
    }
    public void setAll(String[] str)
    {
    	disk_id=str[0];
    	vm_id=str[1];
    	disk_time=str[2];
    	tps=Float.parseFloat(str[3]);
    	rd_sec=Float.parseFloat(str[4]);
    	wr_sec=Float.parseFloat(str[5]); 
    	free=Float.parseFloat(str[6]);
    	in_use=Float.parseFloat(str[7]);
    	used=Float.parseFloat(str[8]);
    	disk_await=Float.parseFloat(str[9]);
    }
	@Override
	public String getTableName() {
		return "diskStat";
	}
	public String getDisk_id() {
		return disk_id;
	}
	public void setDisk_id(String disk_id) {
		this.disk_id = disk_id;
	}
	public String getVm_id() {
		return vm_id;
	}
	public void setVm_id(String vm_id) {
		this.vm_id = vm_id;
	}
	public String getDisk_time() {
		return disk_time;
	}
	public void setDisk_time(String disk_time) {
		this.disk_time = disk_time;
	}
	public float getTps() {
		return tps;
	}
	public void setTps(float tps) {
		this.tps = tps;
	}
	public float getRd_sec() {
		return rd_sec;
	}
	public void setRd_sec(float rd_sec) {
		this.rd_sec = rd_sec;
	}
	public float getWr_sec() {
		return wr_sec;
	}
	public void setWr_sec(float wr_sec) {
		this.wr_sec = wr_sec;
	}
	public float getFree() {
		return free;
	}
	public void setFree(float free) {
		this.free = free;
	}
	public float getIn_use() {
		return in_use;
	}
	public void setIn_use(float in_use) {
		this.in_use = in_use;
	}
	public float getUsed() {
		return used;
	}
	public void setUsed(float used) {
		this.used = used;
	}
	public float getDisk_await() {
		return disk_await;
	}
	public void setDisk_await(float disk_await) {
		this.disk_await = disk_await;
	}
	@Override
	public String toString() {
		return "DiskStat [disk_id=" + disk_id + ", vm_id=" + vm_id
				+ ", disk_time=" + disk_time + ", tps=" + tps + ", rd_sec="
				+ rd_sec + ", wr_sec=" + wr_sec + ", free=" + free
				+ ", in_use=" + in_use + ", used=" + used + ", disk_await="
				+ disk_await + "]";
	}
}