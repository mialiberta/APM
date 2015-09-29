package tables_structure;

public class NetInfo extends BaseTable{
	public String vm_id;
	public String ipaddressv6;
	public String macaddress;
    public NetInfo(){
    }
    public void setAll(String[] str)
    {
    	vm_id=str[0];
    	ipaddressv6=str[1];
    	macaddress=str[2];
   }
	@Override
	public String getTableName() {
		return "netInfo";
	}
}