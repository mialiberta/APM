package tables_structure;

public class CpuInfo extends BaseTable{
	private String vm_id;
	private int chche_size;
	private int cpu_cores;
	private int family;
	private float mhz;
	private int model; 
	private String model_name;
	private int stepping;
	private String vendor_id;
    public CpuInfo(){
    }
    public void setAll(String[] str)
    {
    	vm_id=str[0];
    	chche_size=Integer.parseInt(str[1]);
    	cpu_cores=Integer.parseInt(str[2]);
    	family=Integer.parseInt(str[3]);
    	mhz=Float.parseFloat(str[4]);
    	model=Integer.parseInt(str[5]); 
    	model_name=(str[6]);
    	stepping=Integer.parseInt(str[7]);
    	vendor_id=(str[8]);
    }
	@Override
	public String getTableName() {
		
		return "cpuInfo";
	}
	public String getVm_id() {
		return vm_id;
	}
	public void setVm_id(String vm_id) {
		this.vm_id = vm_id;
	}
	public int getChche_size() {
		return chche_size;
	}
	public void setChche_size(int chche_size) {
		this.chche_size = chche_size;
	}
	public int getCpu_cores() {
		return cpu_cores;
	}
	public void setCpu_cores(int cpu_cores) {
		this.cpu_cores = cpu_cores;
	}
	public int getFamily() {
		return family;
	}
	public void setFamily(int family) {
		this.family = family;
	}
	public float getMhz() {
		return mhz;
	}
	public void setMhz(float mhz) {
		this.mhz = mhz;
	}
	public int getModel() {
		return model;
	}
	public void setModel(int model) {
		this.model = model;
	}
	public String getModel_name() {
		return model_name;
	}
	public void setModel_name(String model_name) {
		this.model_name = model_name;
	}
	public int getStepping() {
		return stepping;
	}
	public void setStepping(int stepping) {
		this.stepping = stepping;
	}
	public String getVendor_id() {
		return vendor_id;
	}
	public void setVendor_id(String vendor_id) {
		this.vendor_id = vendor_id;
	}
	@Override
	public String toString() {
		return "CpuInfo [vm_id=" + vm_id + ", chche_size=" + chche_size
				+ ", cpu_cores=" + cpu_cores + ", family=" + family + ", mhz="
				+ mhz + ", model=" + model + ", model_name=" + model_name
				+ ", stepping=" + stepping + ", vendor_id=" + vendor_id + "]";
	}
}