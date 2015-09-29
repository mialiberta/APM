package tables_structure;

public class NetStat extends BaseTable{
	public String net_id;
	public String vm_id;
	public Date net_time;
	public float rxpck;
	public float txpck;
	public float rxbyt; 
	public float txbyt;
	public float rxerr;
	public float txerr;
    public NetStat(){
    }
    public void setAll(String[] str)
    {
    	net_id=str[0];
    	vm_id=str[1];
    	net_time.date=str[2];
    	rxpck=Float.parseFloat(str[3]);
    	txpck=Float.parseFloat(str[4]);
    	rxbyt=Float.parseFloat(str[5]); 
    	txbyt=Float.parseFloat(str[6]);
    	rxerr=Float.parseFloat(str[7]);
    	txerr=Float.parseFloat(str[8]);
   }
	@Override
	public String getTableName() {
		return "netStat";
	}
}