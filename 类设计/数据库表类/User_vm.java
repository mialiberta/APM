package tables_structure;

public class User_vm extends BaseTable {
	public String user_id;
	public String vm_id;

	public User_vm() {
	}

	public void setAll(String[] str) {
		user_id = str[0];
		vm_id = str[1];
	}

	@Override
	public String getTableName() {

		return "user_vm";
	}
}