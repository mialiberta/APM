package tables_structure;

public class MemInfo extends BaseTable{
	public String vm_id;
	public float swap_total;
	public float total;
    public MemInfo(){
    }
    public void setAll(String[] str)
    {
    	vm_id=str[0];
    	swap_total=Float.parseFloat(str[1]);
    	total=Float.parseFloat(str[2]);
    }
	@Override
	public String getTableName() {
		return "memInfo";
	}
}