package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class DatabaseConnection {
	private static String db = "health";
	private static String url = "jdbc:mysql://localhost:3306/"+ db + "?useUnicode=true&characterEncoding=UTF-8";
	private static String user = "root";
	private static String password = "";
	private static Connection connection = null;
	public static Connection getConnection() {
				try {
			// tìm và nạp driver
			Class.forName("com.mysql.jdbc.Driver");
			// tạo kết nối với hệ quản trị cơ sở dữ liệu
			
			connection = DriverManager.getConnection(url, user, password);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return connection;
	} 

	public static void close(Statement st, ResultSet rs, Connection conn) {
		// TODO Auto-generated method stub
		
	}

}
