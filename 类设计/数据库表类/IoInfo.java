package tables_structure;

public class IoInfo extends BaseTable{
	public String io_id;
	public String vm_id;
	public Date io_time;
	public float io_tps;
	public float rtps;
	public float wtps; 
	public float bwrtn;
	public float bread;
    public IoInfo(){
    }
    public void setAll(String[] str)
    {
    	io_id=str[0];
    	vm_id=str[1];
    	io_time.date=str[2];
        io_tps=Float.parseFloat(str[3]);
    	rtps=Float.parseFloat(str[4]);
    	wtps=Float.parseFloat(str[5]); 
    	bwrtn=Float.parseFloat(str[6]);
    	bread=Float.parseFloat(str[7]);
    }
	@Override
	public String getTableName() {
		return "ioInfo";
	}
}