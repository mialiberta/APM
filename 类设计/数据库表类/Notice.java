package tables_structure;

public class Notice extends BaseTable {
	public String notice_id;
	public String user_id;
	public String vm_id;
	public Date notice_time;
	public String content;
	public int isread;

	public Notice() {
	}

	public void setAll(String[] str) {
		notice_id = str[0];
		user_id = str[1];
		vm_id = str[2];
		notice_time.date = (str[3]);
		content = str[4];
		isread = Integer.parseInt(str[5]);
	}

	@Override
	public String getTableName() {
		return "notice";
	}
}