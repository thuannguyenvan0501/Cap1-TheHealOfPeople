package model.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.sql.PreparedStatement;



import model.bean.Categories;
import util.DatabaseConnection;

public class CategoryDAO {
	private Connection conn;
	private Statement st;
	private ResultSet rs;
	private PreparedStatement pst;

	public ArrayList<Categories> getItems() {
		ArrayList<Categories> items = new ArrayList<>();

		String sql = "SELECT id_cat, name FROM cat_id ORDER BY name DESC";
		try {
			conn = DatabaseConnection.getConnection();
			st = conn.createStatement();
			rs = st.executeQuery(sql);
			while (rs.next()) {
				int id = rs.getInt("id_cat");
				String name = rs.getString("name");
				Categories objDM = new Categories(id, name);
				items.add(objDM);
			}
		} catch (SQLException e) {
			// dùng để xử lý các lỗi JDBC(Java database connectivity)
			e.printStackTrace();
		} catch (Exception e) {
			// dùng để xử lý các lỗi cho Class.forName
			e.printStackTrace();
		} finally {
			if (rs != null && st != null && conn != null) {
				try {
					rs.close();
					st.close();
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
		}
		return items;
	}

	public Categories getItem(int id) {
		Categories item = null;
		String sql = "SELECT id_cat, name FROM cat_id WHERE name = ? DESC";
		try {
			conn = DatabaseConnection.getConnection();
			pst = conn.prepareStatement(sql);
			pst.setInt(1,  id);
			rs = pst.executeQuery();
			while (rs.next()) {
				String name = rs.getString("name");
				item = new Categories(id, name);
				
			}
		} catch (SQLException e) {
			// dùng để xử lý các lỗi JDBC(Java database connectivity)
			e.printStackTrace();
		} catch (Exception e) {
			// dùng để xử lý các lỗi cho Class.forName
			e.printStackTrace();
		} finally {
			if (rs != null && pst != null && conn != null) {
				try {
					rs.close();
					pst.close();
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
		}
		return item;
	}

}
