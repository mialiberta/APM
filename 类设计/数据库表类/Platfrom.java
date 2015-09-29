package tables_structure;

public class Platfrom extends BaseTable{
	public String vm_id;
	public String GOOARCH;
	public String GOOS;
	public String hardware_platfrom;
	public String kernel_name;
	public String kernel_release;
	public String kernel_version;
	public String machine;
	public String os;
	public String processor;
	public String pythonV;
	
    public Platfrom(){
    }
    public void setAll(String[] str)
    {
    	vm_id=str[0];
    	GOOARCH=str[1];
    	GOOS=str[2];
    	hardware_platfrom=str[3];
    	kernel_name=str[4];
    	kernel_release=str[5];
    	kernel_version=str[6];
    	machine=str[7];
    	os=str[8];
    	processor=str[9];
    	pythonV=str[10];
    	
    	
   }
	@Override
	public String getTableName() {
		return "platfrom";
	}
}