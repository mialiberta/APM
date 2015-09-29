package tables_structure;

public class DiskStat extends BaseTable{
	public String disk_id;
	public String vm_id;
	public Date disk_time;
	public float tps;
	public float rd_sec; 
	public float wr_sec;
	public float free;
	public float in_use;
	public float used;
	public float disk_await;
    public DiskStat(){
    }
    public void setAll(String[] str)
    {
    	disk_id=str[0];
    	vm_id=str[1];
    	disk_time.date=str[2];
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
}