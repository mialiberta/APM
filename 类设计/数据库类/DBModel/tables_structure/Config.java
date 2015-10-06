package tables_structure;

public class Config extends BaseTable{
	
	private String conf_id;
	private String vm_id;
	private float threshold_name;
	private float threshold_value ;

    public Config(){
    }
    public void setAll(String[] str)
    {
    	conf_id=str[0];
    	vm_id=str[1];
    	threshold_name=Float.parseFloat(str[2]);
    	threshold_value=Float.parseFloat(str[3]);
   }
	@Override
	public String getTableName() {
		return "config";
	}
	public String getConf_id() {
		return conf_id;
	}
	public void setConf_id(String conf_id) {
		this.conf_id = conf_id;
	}
	public String getVm_id() {
		return vm_id;
	}
	public void setVm_id(String vm_id) {
		this.vm_id = vm_id;
	}
	public float getThreshold_name() {
		return threshold_name;
	}
	public void setThreshold_name(float threshold_name) {
		this.threshold_name = threshold_name;
	}
	public float getThreshold_value() {
		return threshold_value;
	}
	public void setThreshold_value(float threshold_value) {
		this.threshold_value = threshold_value;
	}
	@Override
	public String toString() {
		return "Config [conf_id=" + conf_id + ", vm_id=" + vm_id
				+ ", threshold_name=" + threshold_name + ", threshold_value="
				+ threshold_value + "]";
	}
}