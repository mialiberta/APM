package tables_structure;

public class IoStat extends BaseTable{
	private String io_id;
	private String vm_id;
	private String io_time;
	private float io_tps;
	private float rtps;
	private float wtps; 
	private float bwrtn;
	private float bread;
	private float r_s;
	private float w_s;
	private float rkb_s;
	private float wkb_s;
	private float await;
	private float util;
    public IoStat(){
    }
    public void setAll(String[] str)
    {
    	io_id=str[0];
    	vm_id=str[1];
    	io_time=str[2];
        io_tps=Float.parseFloat(str[3]);
    	rtps=Float.parseFloat(str[4]);
    	wtps=Float.parseFloat(str[5]); 
    	bwrtn=Float.parseFloat(str[6]);
    	bread=Float.parseFloat(str[7]);
    	r_s=Float.parseFloat(str[8]);
    	w_s=Float.parseFloat(str[9]);
    	rkb_s=Float.parseFloat(str[10]);
    	wkb_s=Float.parseFloat(str[11]);
    	await=Float.parseFloat(str[12]);
    	util=Float.parseFloat(str[13]); 	
    }
	@Override
	public String toString() {
		return "IoStat [io_id=" + io_id + ", vm_id=" + vm_id + ", io_time="
				+ io_time + ", io_tps=" + io_tps + ", rtps=" + rtps + ", wtps="
				+ wtps + ", bwrtn=" + bwrtn + ", bread=" + bread + ", r_s="
				+ r_s + ", w_s=" + w_s + ", rkb_s=" + rkb_s + ", wkb_s="
				+ wkb_s + ", await=" + await + ", util=" + util + "]";
	}
	@Override
	public String getTableName() {
		return "ioStat";
	}
	public String getIo_id() {
		return io_id;
	}
	public void setIo_id(String io_id) {
		this.io_id = io_id;
	}
	public String getVm_id() {
		return vm_id;
	}
	public void setVm_id(String vm_id) {
		this.vm_id = vm_id;
	}
	public String getIo_time() {
		return io_time;
	}
	public void setIo_time(String io_time) {
		this.io_time = io_time;
	}
	public float getIo_tps() {
		return io_tps;
	}
	public void setIo_tps(float io_tps) {
		this.io_tps = io_tps;
	}
	public float getRtps() {
		return rtps;
	}
	public void setRtps(float rtps) {
		this.rtps = rtps;
	}
	public float getWtps() {
		return wtps;
	}
	public void setWtps(float wtps) {
		this.wtps = wtps;
	}
	public float getBwrtn() {
		return bwrtn;
	}
	public void setBwrtn(float bwrtn) {
		this.bwrtn = bwrtn;
	}
	public float getBread() {
		return bread;
	}
	public void setBread(float bread) {
		this.bread = bread;
	}
	public float getR_s() {
		return r_s;
	}
	public void setR_s(float r_s) {
		this.r_s = r_s;
	}
	public float getW_s() {
		return w_s;
	}
	public void setW_s(float w_s) {
		this.w_s = w_s;
	}
	public float getRkb_s() {
		return rkb_s;
	}
	public void setRkb_s(float rkb_s) {
		this.rkb_s = rkb_s;
	}
	public float getWkb_s() {
		return wkb_s;
	}
	public void setWkb_s(float wkb_s) {
		this.wkb_s = wkb_s;
	}
	public float getAwait() {
		return await;
	}
	public void setAwait(float await) {
		this.await = await;
	}
	public float getUtil() {
		return util;
	}
	public void setUtil(float util) {
		this.util = util;
	}


}