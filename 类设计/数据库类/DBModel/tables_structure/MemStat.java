package tables_structure;

public class MemStat extends BaseTable{
	private String mem_id;
	private String vm_id;
	private String mem_time;
	private float kbmemfree;
	private float kbmemused;
	private float memused; 
	private float kbbuffers;
	private float kbcacheed;
	private float kbswpfree; 
	private float kbswpused;
	private float swpused;
    public MemStat(){
    }
    public void setAll(String[] str)
    {
    	mem_id=str[0];
    	vm_id=str[1];
    	mem_time=str[2];
    	kbmemfree=Float.parseFloat(str[3]);
    	kbmemused=Float.parseFloat(str[4]);
    	memused=Float.parseFloat(str[5]); 
       	kbbuffers=Float.parseFloat(str[6]);
    	kbcacheed=Float.parseFloat(str[7]);
    	kbswpfree=Float.parseFloat(str[8]);
    	kbswpused=Float.parseFloat(str[9]);
    	swpused=Float.parseFloat(str[10]);
    }
	@Override
	public String getTableName() {
		return "memStat";
	}
	@Override
	public String toString() {
		return "MemStat [mem_id=" + mem_id + ", vm_id=" + vm_id + ", mem_time="
				+ mem_time + ", kbmemfree=" + kbmemfree + ", kbmemused="
				+ kbmemused + ", memused=" + memused + ", kbbuffers="
				+ kbbuffers + ", kbcacheed=" + kbcacheed + ", kbswpfree="
				+ kbswpfree + ", kbswpused=" + kbswpused + ", swpused="
				+ swpused + "]";
	}
	public String getMem_id() {
		return mem_id;
	}
	public void setMem_id(String mem_id) {
		this.mem_id = mem_id;
	}
	public String getVm_id() {
		return vm_id;
	}
	public void setVm_id(String vm_id) {
		this.vm_id = vm_id;
	}
	public String getMem_time() {
		return mem_time;
	}
	public void setMem_time(String mem_time) {
		this.mem_time = mem_time;
	}
	public float getKbmemfree() {
		return kbmemfree;
	}
	public void setKbmemfree(float kbmemfree) {
		this.kbmemfree = kbmemfree;
	}
	public float getKbmemused() {
		return kbmemused;
	}
	public void setKbmemused(float kbmemused) {
		this.kbmemused = kbmemused;
	}
	public float getMemused() {
		return memused;
	}
	public void setMemused(float memused) {
		this.memused = memused;
	}
	public float getKbbuffers() {
		return kbbuffers;
	}
	public void setKbbuffers(float kbbuffers) {
		this.kbbuffers = kbbuffers;
	}
	public float getKbcacheed() {
		return kbcacheed;
	}
	public void setKbcacheed(float kbcacheed) {
		this.kbcacheed = kbcacheed;
	}
	public float getKbswpfree() {
		return kbswpfree;
	}
	public void setKbswpfree(float kbswpfree) {
		this.kbswpfree = kbswpfree;
	}
	public float getKbswpused() {
		return kbswpused;
	}
	public void setKbswpused(float kbswpused) {
		this.kbswpused = kbswpused;
	}
	public float getSwpused() {
		return swpused;
	}
	public void setSwpused(float swpused) {
		this.swpused = swpused;
	}

}