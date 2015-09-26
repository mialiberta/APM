package tables_structure;

public class Config extends BaseTable{
	public String conf_id;
	public String vm_id;
	public float cpu_threshold;
	public float mem_threshold ;
	public float disk_threshold ;
	public float net_threshold ;
	public float io_threshold ;
	
    public Config(){
    }
    public void setAll(String[] str)
    {
    	conf_id=str[0];
    	vm_id=str[1];
    	cpu_threshold=Float.parseFloat(str[2]);
    	mem_threshold=Float.parseFloat(str[3]);
    	disk_threshold=Float.parseFloat(str[4]); 
    	net_threshold=Float.parseFloat(str[5]);
    	io_threshold=Float.parseFloat(str[6]);
    }
	@Override
	public String getTableName() {
		return "config";
	}
}