package tables_structure;

public class Platfrom extends BaseTable{
	private String vm_id;
	private String GOOARCH;
	private String GOOS;
	private String hardware_platfrom;
	private String kernel_name;
	private String kernel_release;
	private String kernel_version;
	private String machine;
	private String os;
	private String processor;
	private String pythonV;
	
    public Platfrom(){
    }
    public void setAll(String[] str)
    {
    	vm_id=str[0];
    	GOOARCH=str[1];
    	GOOS=str[2];
    	hardware_platfrom=str[3];
    	kernel_name=str[4];
    	kernel_release=str[5];
    	kernel_version=str[6];
    	machine=str[7];
    	os=str[8];
    	processor=str[9];
    	pythonV=str[10];
    	
    	
   }
	@Override
	public String getTableName() {
		return "platfrom";
	}
	public String getVm_id() {
		return vm_id;
	}
	public void setVm_id(String vm_id) {
		this.vm_id = vm_id;
	}
	public String getGOOARCH() {
		return GOOARCH;
	}
	public void setGOOARCH(String gOOARCH) {
		GOOARCH = gOOARCH;
	}
	public String getGOOS() {
		return GOOS;
	}
	public void setGOOS(String gOOS) {
		GOOS = gOOS;
	}
	public String getHardware_platfrom() {
		return hardware_platfrom;
	}
	public void setHardware_platfrom(String hardware_platfrom) {
		this.hardware_platfrom = hardware_platfrom;
	}
	public String getKernel_name() {
		return kernel_name;
	}
	public void setKernel_name(String kernel_name) {
		this.kernel_name = kernel_name;
	}
	public String getKernel_release() {
		return kernel_release;
	}
	public void setKernel_release(String kernel_release) {
		this.kernel_release = kernel_release;
	}
	public String getKernel_version() {
		return kernel_version;
	}
	public void setKernel_version(String kernel_version) {
		this.kernel_version = kernel_version;
	}
	public String getMachine() {
		return machine;
	}
	public void setMachine(String machine) {
		this.machine = machine;
	}
	public String getOs() {
		return os;
	}
	public void setOs(String os) {
		this.os = os;
	}
	public String getProcessor() {
		return processor;
	}
	public void setProcessor(String processor) {
		this.processor = processor;
	}
	public String getPythonV() {
		return pythonV;
	}
	public void setPythonV(String pythonV) {
		this.pythonV = pythonV;
	}
	@Override
	public String toString() {
		return "Platfrom [vm_id=" + vm_id + ", GOOARCH=" + GOOARCH + ", GOOS="
				+ GOOS + ", hardware_platfrom=" + hardware_platfrom
				+ ", kernel_name=" + kernel_name + ", kernel_release="
				+ kernel_release + ", kernel_version=" + kernel_version
				+ ", machine=" + machine + ", os=" + os + ", processor="
				+ processor + ", pythonV=" + pythonV + "]";
	}
}