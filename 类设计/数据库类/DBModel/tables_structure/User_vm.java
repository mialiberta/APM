package tables_structure;

public class User_vm extends BaseTable {
	private String user_id;
	private String vm_id;

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

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public String getVm_id() {
		return vm_id;
	}

	public void setVm_id(String vm_id) {
		this.vm_id = vm_id;
	}

	@Override
	public String toString() {
		return "User_vm [user_id=" + user_id + ", vm_id=" + vm_id + "]";
	}
}