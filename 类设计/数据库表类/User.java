package tables_structure;

public class User extends BaseTable {
	public String user_id;
	public String account;
	public String name;
	public String password;
	public String email;
	public int phone;

	public User() {
	}

	public void setAll(String[] str) {
		user_id = str[0];
		account = str[1];
		name = str[2];
		password =str[3];
		email = str[4];
		phone = Integer.parseInt(str[5]);
	}

	@Override
	public String getTableName() {
		return "user";
	}
}