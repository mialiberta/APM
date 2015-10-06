package tables_structure;

public class LoadStat extends BaseTable {
	private String load_id;
	private String vm_id;
	private String load_time;
	private int runq_sz;
	private int plist_sz;
	private float ldavg_1;
	private float ldavg_5;
	private float ldavg_15;
	
	public LoadStat() {
	}

	public void setAll(String[] str) {
		load_id = str[0];
		vm_id = str[1];
		load_time = str[2];
		runq_sz=Integer.parseInt(str[3]);
		plist_sz=Integer.parseInt(str[4]);
		ldavg_1=Float.parseFloat(str[5]);
		ldavg_5=Float.parseFloat(str[6]);
		ldavg_15=Float.parseFloat(str[7]);
	}
    
	@Override
	public String toString() {
		return "LoadStat [load_id=" + load_id + ", vm_id=" + vm_id
				+ ", load_time=" + load_time + ", runq_sz=" + runq_sz
				+ ", plist_sz=" + plist_sz + ", ldavg_1=" + ldavg_1
				+ ", ldavg_5=" + ldavg_5 + ", ldavg_15=" + ldavg_15 + "]";
	}

	public String getLoad_id() {
		return load_id;
	}

	public void setLoad_id(String load_id) {
		this.load_id = load_id;
	}

	public String getVm_id() {
		return vm_id;
	}

	public void setVm_id(String vm_id) {
		this.vm_id = vm_id;
	}

	public String getLoad_time() {
		return load_time;
	}

	public void setLoad_time(String load_time) {
		this.load_time = load_time;
	}

	public int getRunq_sz() {
		return runq_sz;
	}

	public void setRunq_sz(int runq_sz) {
		this.runq_sz = runq_sz;
	}

	public int getPlist_sz() {
		return plist_sz;
	}

	public void setPlist_sz(int plist_sz) {
		this.plist_sz = plist_sz;
	}

	public float getLdavg_1() {
		return ldavg_1;
	}

	public void setLdavg_1(float ldavg_1) {
		this.ldavg_1 = ldavg_1;
	}

	public float getLdavg_5() {
		return ldavg_5;
	}

	public void setLdavg_5(float ldavg_5) {
		this.ldavg_5 = ldavg_5;
	}

	public float getLdavg_15() {
		return ldavg_15;
	}

	public void setLdavg_15(float ldavg_15) {
		this.ldavg_15 = ldavg_15;
	}

	@Override
	public String getTableName() {
		return "loadStat";
	}
}