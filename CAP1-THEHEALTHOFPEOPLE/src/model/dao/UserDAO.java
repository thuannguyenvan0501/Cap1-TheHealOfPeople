package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import model.bean.User;
import util.DatabaseConnection;

public class UserDAO {
	private Connection conn;
	private Statement st;
	private ResultSet rs;
	private PreparedStatement pst;
	
	public ArrayList<User> getItems(){
		ArrayList<User> items = new ArrayList<>();
		String sql = "Select id, username, password, fullname, email, ngaysinh From user Order By id ASC";
		try {
			conn = DatabaseConnection.getConnection();
			st = conn.createStatement();
			rs = st.executeQuery(sql);
			while(rs.next()) {
				int id = rs.getInt("id");
				String username = rs.getString("username");
				String password = rs.getString("password");
				String fullname = rs.getString("fullname");
				String email = rs.getString("email");
				String ngaySinh = rs.getString("ngaysinh");
				User objUser = new User(id, username, password, fullname, email, ngaySinh);
				items.add(objUser);
			}
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			if(rs != null && st != null && conn != null ) {
				try {
					rs.close();
					st.close();
					conn.close();
				} catch (SQLException e) {
					// TODO: handle exception
					e.printStackTrace();
				}
			}
		}
		return items;
	}
	public int addUser(User item) {
		int result = 0;
		String sql = "INSERT INTO user(username, password, fullname, email, ngaysinh) VALUES(?,?,?,?,?)";
		
		try {
			conn = DatabaseConnection.getConnection();
			pst = conn.prepareStatement(sql);
			pst.setString(1, item.getUsername());
			pst.setString(2, item.getPassword());
			pst.setString(3, item.getFullname());
			pst.setString(4, item.getEmail());
			pst.setString(5, item.getNgaySinh());
			result = pst.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			if(pst != null && conn != null) {
				try {
					pst.close();
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		return result;
		
	}
	public User checkUser(String username) {
		User item = null;
		String sql = "SELECT id, username, password, fullname, email, ngaysinh FROM user WHERE username = ?";
		
		try {
			conn = DatabaseConnection.getConnection();
			pst = conn.prepareStatement(sql);
			pst.setString(1, username);
			rs = pst.executeQuery();
			while(rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getString("username");
				String password = rs.getString("password");
				String fullname = rs.getString("fullname");
				String email = rs.getString("email");
				String ngaysinh = rs.getString("ngaysinh");
				item = new User(id, name, password, fullname, email, ngaysinh);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			if(rs != null && pst != null && conn != null) {
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
	public User getItem(int idUser) {
		User objUser = null;
		String sql = "SELECT * FROM user WHERE id = ?";
		
		try {
			conn = DatabaseConnection.getConnection();
			pst = conn.prepareStatement(sql);
			pst.setInt(1, idUser);
			rs = pst.executeQuery();
			if(rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getString("username");
				String password = rs.getString("password");
				String fullname = rs.getString("fullname");
				String email = rs.getString("email");
				String ngaysinh = rs.getString("ngaysinh");
				objUser = new User(id, name, password, fullname, email, ngaysinh);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			if( rs != null && pst != null && conn != null) {
				try {
					
					pst.close();
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		return objUser;
	}
	public User checkLogin(String username, String password) {
		User user = null;
		String sql = "SELECT id, username, fullname, email, ngaysinh FROM user WHERE username = ? AND password = ?";
		
		try {
			conn = DatabaseConnection.getConnection();
			pst = conn.prepareStatement(sql);
			pst.setString(1, username);
			pst.setString(2, password);
			rs = pst.executeQuery();
			if(rs.next()) {
				int id = rs.getInt("id");
				String fullname = rs.getString("fullname");
				String email = rs.getString("email");
				String ngaySinh = rs.getString("ngaySinh");
				user = new User(id, username, null, fullname, email, ngaySinh);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			if(rs != null && pst != null && conn != null) {
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
		return user;
	}

}
