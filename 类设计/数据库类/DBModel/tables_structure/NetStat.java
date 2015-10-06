package tables_structure;

public class NetStat extends BaseTable{
	private String net_id;
	private String vm_id;
	private String net_time;
	private float rxpck;
	private float txpck;
	private float rxbyt; 
	private float txbyt;
	private float rxerr;
	private float txerr;
    public NetStat(){
    }
    public void setAll(String[] str)
    {
    	net_id=str[0];
    	vm_id=str[1];
    	net_time=str[2];
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
	public String getNet_id() {
		return net_id;
	}
	public void setNet_id(String net_id) {
		this.net_id = net_id;
	}
	public String getVm_id() {
		return vm_id;
	}
	public void setVm_id(String vm_id) {
		this.vm_id = vm_id;
	}
	public String getNet_time() {
		return net_time;
	}
	public void setNet_time(String net_time) {
		this.net_time = net_time;
	}
	public float getRxpck() {
		return rxpck;
	}
	public void setRxpck(float rxpck) {
		this.rxpck = rxpck;
	}
	public float getTxpck() {
		return txpck;
	}
	public void setTxpck(float txpck) {
		this.txpck = txpck;
	}
	public float getRxbyt() {
		return rxbyt;
	}
	public void setRxbyt(float rxbyt) {
		this.rxbyt = rxbyt;
	}
	public float getTxbyt() {
		return txbyt;
	}
	public void setTxbyt(float txbyt) {
		this.txbyt = txbyt;
	}
	public float getRxerr() {
		return rxerr;
	}
	public void setRxerr(float rxerr) {
		this.rxerr = rxerr;
	}
	public float getTxerr() {
		return txerr;
	}
	public void setTxerr(float txerr) {
		this.txerr = txerr;
	}
	@Override
	public String toString() {
		return "NetStat [net_id=" + net_id + ", vm_id=" + vm_id + ", net_time="
				+ net_time + ", rxpck=" + rxpck + ", txpck=" + txpck
				+ ", rxbyt=" + rxbyt + ", txbyt=" + txbyt + ", rxerr=" + rxerr
				+ ", txerr=" + txerr + "]";
	}
}