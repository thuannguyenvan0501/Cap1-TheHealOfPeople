package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import model.bean.Doctors;
import util.DatabaseConnection;

public class DoctorDAO {
	private Connection conn;
	private Statement st;
	private ResultSet rs;
	private PreparedStatement pst;
	
	public ArrayList<Doctors> getItems(){
		ArrayList<Doctors> item = new ArrayList<>();
		String sql = "Select id_doctor, name_doctor, khoa_phutrach, picture From doctor Order By name_doctor DESC";
		try {
			conn = DatabaseConnection.getConnection();
			st = conn.createStatement();
			rs = st.executeQuery(sql);
			while(rs.next()) {
				int id = rs.getInt("id_doctor");
				String name = rs.getString("name_doctor");
				String department = rs.getString("khoa_phutrach");
				String picture = rs.getString("picture");
				Doctors objDoctors = new Doctors(id, name, department, picture);
				item.add(objDoctors);
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(rs != null && st != null && conn != null) {
				try {
					rs.close();
					st.close();
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return item;
	}
	
}
