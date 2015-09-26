package tables_structure;

public class MemInfo extends BaseTable{
	public String mem_id;
	public String vm_id;
	public Date mem_time;
	public float kbmemfree;
	public float kbmemused;
	public float memused; 
	public float kbbuffers;
	public float kbcacheed;
    public MemInfo(){
    }
    public void setAll(String[] str)
    {
    	mem_id=str[0];
    	vm_id=str[1];
    	mem_time.date=str[2];
    	kbmemfree=Float.parseFloat(str[3]);
    	kbmemused=Float.parseFloat(str[4]);
    	memused=Float.parseFloat(str[5]); 
       	kbbuffers=Float.parseFloat(str[6]);
    	kbcacheed=Float.parseFloat(str[7]);
    }
	@Override
	public String getTableName() {
		return "memInfo";
	}
}