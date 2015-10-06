package tables_structure;

public class User extends BaseTable {
	private String user_id;
	private String account;
	private String name;
	private String password;
	private String email;
	private String phone;

	public User() {
	}

	public void setAll(String[] str) {
		user_id = str[0];
		account = str[1];
		name = str[2];
		password =str[3];
		email = str[4];
		phone = (str[5]);
	}

	@Override
	public String getTableName() {
		return "user";
	}

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "User [user_id=" + user_id + ", account=" + account + ", name="
				+ name + ", password=" + password + ", email=" + email
				+ ", phone=" + phone + "]";
	}
}