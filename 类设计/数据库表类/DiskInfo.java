package tables_structure;

public class DiskInfo extends BaseTable{
	public String disk_id;
	public String vm_id;
	public Date disk_time;
	public float dev;
	public float tps;
	public float rd_sec; 
	public float wr_sec;
    public DiskInfo(){
    }
    public void setAll(String[] str)
    {
    	disk_id=str[0];
    	vm_id=str[1];
    	disk_time.date=str[2];
    	dev=Float.parseFloat(str[3]);
    	tps=Float.parseFloat(str[4]);
    	rd_sec=Float.parseFloat(str[5]); 
    	wr_sec=Float.parseFloat(str[6]);
    }
	@Override
	public String getTableName() {
		return "diskInfo";
	}
}