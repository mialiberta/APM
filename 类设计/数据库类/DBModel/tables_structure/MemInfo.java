package tables_structure;

public class MemInfo extends BaseTable{
	private String vm_id;
	private float swap_total;
	private float total;
    public MemInfo(){
    }
    public void setAll(String[] str)
    {
    	vm_id=str[0];
    	swap_total=Float.parseFloat(str[1]);
    	total=Float.parseFloat(str[2]);
    }
	@Override
	public String getTableName() {
		return "memInfo";
	}
	public String getVm_id() {
		return vm_id;
	}
	public void setVm_id(String vm_id) {
		this.vm_id = vm_id;
	}
	public float getSwap_total() {
		return swap_total;
	}
	public void setSwap_total(float swap_total) {
		this.swap_total = swap_total;
	}
	public float getTotal() {
		return total;
	}
	public void setTotal(float total) {
		this.total = total;
	}
	@Override
	public String toString() {
		return "MemInfo [vm_id=" + vm_id + ", swap_total=" + swap_total
				+ ", total=" + total + "]";
	}
}