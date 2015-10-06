package DBconnect;

import java.lang.reflect.Field;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

import tables_structure.*;

;
public class JConnectUser {
	private String url = "jdbc:mysql://127.0.0.1:3306/monitorDB";
	private String account;
	private String password;
	private Statement statement;
	private Connection connection;

	public JConnectUser(String saccount, String spassword) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection(url, saccount, spassword);
			statement = connection.createStatement();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public boolean create(String tableName, String[] value) {
		try {
			String sql = "insert into " + tableName + " values(";
			Class _class = Class.forName("tables_structure." + tableName);
			Field[] fields = _class.getDeclaredFields();
			int i = 0;
			for (; i < fields.length - 1; i++) {
				if (fields[i].getType().getName().equals("float")
						|| fields[i].getType().getName().equals("int"))
					sql += value[i] + ",";
				else
					sql += "'" + value[i] + "',";
			}
	        if (fields[i].getType().getName().equals("float")
					|| fields[i].getType().getName().equals("int"))
				sql += value[i] + ")";
			else
				sql += "'" + value[i] + "')";
			//System.out.println(sql);
			if (statement.execute(sql))
				return statement.execute("commit");
			return false;
		} catch (ClassNotFoundException e) {
			return false;
		} catch (SQLException e) {
			return false;
		}
	}

	public BaseTable[] retrieve(String tableName, int n ,int step) {
		BaseTable[] bt = new BaseTable[n];
		String sql = "select * from " + tableName;
		try {
			Class _class = Class.forName("tables_structure." + tableName);
			ResultSet rs = statement.executeQuery(sql);
			int row = 0;
			ResultSetMetaData rsmd = rs.getMetaData();
			int ncolum = rsmd.getColumnCount();
			String[] tempStr = new String[ncolum];
			while (rs.next() && row < n) {
				for (int i = 1; i <= ncolum; i++) {
					tempStr[i - 1] = rs.getString(rsmd.getColumnName(i));
				}
				bt[row] = (BaseTable) _class.newInstance();
				bt[row].setAll(tempStr);
				row++;
				for (int i = 1; i <= step-1; i++) {
					rs.next();
				}
			}
			rs.close();
			return bt;
		} catch (SQLException e) {
			return null;
		} catch (IllegalArgumentException e) {
			return null;
		} catch (ClassNotFoundException e) {
			return null;
		} catch (InstantiationException e) {
			return null;
		} catch (IllegalAccessException e) {
			return null;
		}

	}

	protected void finalize() {
		try {
			super.finalize();
			statement.close();
			connection.close();
		} catch (Throwable e) {
			e.printStackTrace();
		}
		// other finalization code...

	}

	public void reConnect() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			connection = DriverManager.getConnection(url, account, password);
			statement = connection.createStatement();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Statement getStatement() {
		return statement;
	}

	public Connection getConnection() {
		return connection;
	}

}
