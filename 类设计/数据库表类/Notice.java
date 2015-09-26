package tables_structure;

public class Notice extends BaseTable {
	public String notice_id;
	public String user_id;
	public Date notice_time;
	public String content;
	public int isread;

	public Notice() {
	}

	public void setAll(String[] str) {
		notice_id = str[0];
		user_id = str[1];
		notice_time.date = (str[2]);
		content = str[3];
		isread = Integer.parseInt(str[4]);
	}

	@Override
	public String getTableName() {
		return "notice";
	}
}