package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import model.bean.QuestionSick;
import model.bean.Sick;
import util.DatabaseConnection;

public class QuestionDAO {
	private Connection conn;
	private Statement st;
	private ResultSet rs;
	private PreparedStatement pst;
	
	public ArrayList<QuestionSick> getItems(int idSick){
		ArrayList<QuestionSick> items = new ArrayList<>();
		String sql = "Select * From question Where id_tenbenh = ?";
		try {
			conn = DatabaseConnection.getConnection();
			pst = conn.prepareStatement(sql);
			pst.setInt(1, idSick);
			rs = pst.executeQuery();
			while(rs.next()) {
				int id = rs.getInt("id_question");
				String question = rs.getString("name_question");
				QuestionSick objQ = new QuestionSick(id, question);
				items.add(objQ);
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
		return items;
	}
}
