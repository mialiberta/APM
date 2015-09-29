package tables_structure;

public class CpuInfo extends BaseTable{
	public String vm_id;
	public int chche_size;
	public int cpu_cores;
	public int family;
	public float mhz;
	public int model; 
	public String model_name;
	public int stepping;
	public String vendor_id;
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
}