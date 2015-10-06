package tables_structure;

public class FileStat extends BaseTable {
	private String file_id;
	private String vm_id;
	private String file_time;
	private float dentunusd;
	private float file_nr;
	private float inode_nr;
	private float pty_nr;
	private float inode_free;
	private float inode_in_use;
	private float inode_used;

	public FileStat() {
	}

	public void setAll(String[] str) {
		file_id = str[0];
		vm_id = str[1];
		file_time = str[2];
		dentunusd=Float.parseFloat(str[3]);
		file_nr=Float.parseFloat(str[4]);
		inode_nr=Float.parseFloat(str[5]);
		pty_nr=Float.parseFloat(str[6]);
		inode_free=Float.parseFloat(str[7]);
		inode_in_use=Float.parseFloat(str[8]);
		inode_used=Float.parseFloat(str[9]);
	}

	@Override
	public String getTableName() {
		return "fileStat";
	}

	public String getFile_id() {
		return file_id;
	}

	public void setFile_id(String file_id) {
		this.file_id = file_id;
	}

	public String getVm_id() {
		return vm_id;
	}

	public void setVm_id(String vm_id) {
		this.vm_id = vm_id;
	}

	public String getFile_time() {
		return file_time;
	}

	public void setFile_time(String file_time) {
		this.file_time = file_time;
	}

	public float getDentunusd() {
		return dentunusd;
	}

	public void setDentunusd(float dentunusd) {
		this.dentunusd = dentunusd;
	}

	public float getFile_nr() {
		return file_nr;
	}

	public void setFile_nr(float file_nr) {
		this.file_nr = file_nr;
	}

	public float getInode_nr() {
		return inode_nr;
	}

	public void setInode_nr(float inode_nr) {
		this.inode_nr = inode_nr;
	}

	public float getPty_nr() {
		return pty_nr;
	}

	public void setPty_nr(float pty_nr) {
		this.pty_nr = pty_nr;
	}

	public float getInode_free() {
		return inode_free;
	}

	public void setInode_free(float inode_free) {
		this.inode_free = inode_free;
	}

	public float getInode_in_use() {
		return inode_in_use;
	}

	public void setInode_in_use(float inode_in_use) {
		this.inode_in_use = inode_in_use;
	}

	public float getInode_used() {
		return inode_used;
	}

	public void setInode_used(float inode_used) {
		this.inode_used = inode_used;
	}

	@Override
	public String toString() {
		return "FileStat [file_id=" + file_id + ", vm_id=" + vm_id
				+ ", file_time=" + file_time + ", dentunusd=" + dentunusd
				+ ", file_nr=" + file_nr + ", inode_nr=" + inode_nr
				+ ", pty_nr=" + pty_nr + ", inode_free=" + inode_free
				+ ", inode_in_use=" + inode_in_use + ", inode_used="
				+ inode_used + "]";
	}
}