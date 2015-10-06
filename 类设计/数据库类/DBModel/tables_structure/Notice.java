package tables_structure;

public class Notice extends BaseTable {
	private String notice_id;
	private String user_id;
	private String vm_id;
	private String notice_time;
	private String content;
	private int isread;

	public Notice() {
	}

	public void setAll(String[] str) {
		notice_id = str[0];
		user_id = str[1];
		vm_id = str[2];
		notice_time = (str[3]);
		content = str[4];
		isread = Integer.parseInt(str[5]);
	}

	@Override
	public String getTableName() {
		return "notice";
	}

	public String getNotice_id() {
		return notice_id;
	}

	public void setNotice_id(String notice_id) {
		this.notice_id = notice_id;
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

	public String getNotice_time() {
		return notice_time;
	}

	public void setNotice_time(String notice_time) {
		this.notice_time = notice_time;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public int getIsread() {
		return isread;
	}

	public void setIsread(int isread) {
		this.isread = isread;
	}

	@Override
	public String toString() {
		return "Notice [notice_id=" + notice_id + ", user_id=" + user_id
				+ ", vm_id=" + vm_id + ", notice_time=" + notice_time
				+ ", content=" + content + ", isread=" + isread + "]";
	}
}