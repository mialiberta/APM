package tables_structure;

public class Process extends BaseTable{
	public String vm_id;
	public int PID;
	public String process_state;
	public String process_user;
	public float cpu_percentage;
	public float mem_percentage;
	public String cmd;
	public Process(){
    }
    public void setAll(String[] str)
    {
    	vm_id=str[0];
    	PID=Integer.parseInt(str[1]);
    	process_state=str[2];
    	process_user=str[3];
    	cpu_percentage=Float.parseFloat(str[4]);
    	mem_percentage=Float.parseFloat(str[5]);
    	cmd=str[6];
    	}
	@Override
	public String getTableName() {
		return "process";
	}
}