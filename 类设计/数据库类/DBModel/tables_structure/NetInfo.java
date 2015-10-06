package tables_structure;

public class NetInfo extends BaseTable{
	private String vm_id;
	private String ipaddressv6;
	private String macaddress;
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
	public String getVm_id() {
		return vm_id;
	}
	public void setVm_id(String vm_id) {
		this.vm_id = vm_id;
	}
	public String getIpaddressv6() {
		return ipaddressv6;
	}
	public void setIpaddressv6(String ipaddressv6) {
		this.ipaddressv6 = ipaddressv6;
	}
	public String getMacaddress() {
		return macaddress;
	}
	public void setMacaddress(String macaddress) {
		this.macaddress = macaddress;
	}
	@Override
	public String toString() {
		return "NetInfo [vm_id=" + vm_id + ", ipaddressv6=" + ipaddressv6
				+ ", macaddress=" + macaddress + "]";
	}
}