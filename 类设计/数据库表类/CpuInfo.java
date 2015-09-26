package tables_structure;

public class CpuInfo extends BaseTable{
	public String cpu_id;
	public String vm_id;
	public Date cpu_time;
	public float user;
	public float nice;
	public float system; 
	public float iowait;
	public float steal;
	public float idle;
    public CpuInfo(){
    }
    public void setAll(String[] str)
    {
    	cpu_id=str[0];
    	vm_id=str[1];
    	cpu_time.date=str[2];
    	user=Float.parseFloat(str[3]);
    	nice=Float.parseFloat(str[4]);
    	system=Float.parseFloat(str[5]); 
    	iowait=Float.parseFloat(str[6]);
    	steal=Float.parseFloat(str[7]);
    	idle=Float.parseFloat(str[8]);
    }
	@Override
	public String getTableName() {
		
		return "cpuInfo";
	}
}