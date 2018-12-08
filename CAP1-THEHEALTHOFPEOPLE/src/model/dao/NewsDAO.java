package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.ArrayList;

import constant.Define;
import model.bean.Categories;
import model.bean.News;
import util.DatabaseConnection;

public class NewsDAO {
	private Connection conn;
	private Statement st;
	private ResultSet rs;
	private PreparedStatement pst;
	public ArrayList<News> getItems() {
		ArrayList<News> items = new ArrayList<>();

		String sql = "SELECT new.id AS nid, new.name AS nname, preview_text, detail_text, date_create, picture, cat_id.id_cat AS cid, cat_id.name AS cname FROM new"
				+ " INNER JOIN cat_id ON new.id_cat = cat_id.id_cat ORDER BY nid DESC";
		try {
			conn = DatabaseConnection.getConnection();
			st = conn.createStatement();
			rs = st.executeQuery(sql);
			while (rs.next()) {
				int id = rs.getInt("nid");
				String name = rs.getString("nname");
				String previewText = rs.getString("preview_text");
				String detailText = rs.getString("detail_text");
				Timestamp createAt = rs.getTimestamp("date_create");
				String picture = rs.getString("picture");
				int  categoryID = rs.getInt("cid");
				String categoryName = rs.getString("cname");
				Categories category = new Categories(categoryID, categoryName);
				News objDM = new News(id, name, previewText, detailText, createAt, picture, category);
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
	public int countItem() {
		int result = 0;
		String sql = "SELECT COUNT(*) AS sumNews FROM cat_id INNER JOIN  new ON cat_id.id_cat = new.id_cat";
		try {
			conn = DatabaseConnection.getConnection();
			st = conn.createStatement();
			rs = st.executeQuery(sql);
			if(rs.next()) {
				result = rs.getInt("sumNews");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch(Exception e){
			e.printStackTrace();
		}finally {
			if( rs != null && st != null && conn != null) {
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
		return result;
		
	}
	public ArrayList<News> getItemPagination(int offset) {
		ArrayList<News> items = new ArrayList<>();

		String sql = "SELECT new.id AS nid, new.name AS nname, preview_text, detail_text, date_create, picture, cat_id.id_cat AS cid, cat_id.name AS cname FROM new"
				+ " INNER JOIN cat_id ON new.id_cat = cat_id.id_cat ORDER BY nid DESC LIMIT ?,? ";
		try {
			conn = DatabaseConnection.getConnection();
			pst = conn.prepareStatement(sql);
			pst.setInt(1, offset);
			pst.setInt(2, Define.ROW_COUNT_ADMIN);
			rs = pst.executeQuery();
			while (rs.next()) {
				int id = rs.getInt("nid");
				String name = rs.getString("nname");
				String previewText = rs.getString("preview_text");
				String detailText = rs.getString("detail_text");
				Timestamp createAt = rs.getTimestamp("date_create");
				String picture = rs.getString("picture");
				int  categoryID = rs.getInt("cid");
				String categoryName = rs.getString("cname");
				Categories category = new Categories(categoryID, categoryName);
				News objDM = new News(id, name, previewText, detailText, createAt, picture, category);
				items.add(objDM);
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
		return items;
	}
	public News getItem(int idNews) {
		News objNews = null;
		String sql = "SELECT new.id AS nid, new.name AS nname, preview_text, detail_text, date_create, picture, cat_id.id_cat AS cid, cat_id.name AS cname FROM new"  
							+ " INNER JOIN cat_id ON new.id_cat = cat_id.id_cat WHERE new.id = ?";
		
		try {
			conn = DatabaseConnection.getConnection();
			pst = conn.prepareStatement(sql);
			pst.setInt(1, idNews);
			rs = pst.executeQuery();
			if(rs.next()) {
				int id = rs.getInt("nid");
				String name = rs.getString("nname");
				String previewText = rs.getString("preview_text");
				String detailText = rs.getString("detail_text");
				Timestamp createAt = rs.getTimestamp("date_create");
				String picture = rs.getString("picture");
				int  categoryID = rs.getInt("cid");
				String categoryName = rs.getString("cname");
				Categories category = new Categories(categoryID, categoryName);
				objNews = new News(id, name, previewText, detailText,createAt,picture,category);
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
		return objNews;
	}
	public ArrayList<News> getNews(int cid) {
		ArrayList<News> items = new ArrayList<>();
		String sql = "SELECT new.id AS nid, new.name AS nname, preview_text, detail_text, date_create, picture, cat_id.id_cat AS cid, cat_id.name AS cname FROM new"
				+ " INNER JOIN cat_id ON new.id_cat = cat_id.id_cat WHERE new.id_cat = ? ";
		try {
			conn = DatabaseConnection.getConnection();
			pst = conn.prepareStatement(sql);
			pst.setInt(1, cid);
			rs = pst.executeQuery();
			while (rs.next()) {
				int id = rs.getInt("nid");
				String name = rs.getString("nname");
				String previewText = rs.getString("preview_text");
				String detailText = rs.getString("detail_text");
				Timestamp createAt = rs.getTimestamp("date_create");
				String picture = rs.getString("picture");
				int  categoryID = rs.getInt("cid");
				String categoryName = rs.getString("cname");
				Categories category = new Categories(categoryID, categoryName);
				News objDM = new News(id, name, previewText, detailText, createAt, picture, category);
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
	public int countItems(int id) {
		int result = 0;
		String sql = "SELECT COUNT(*) AS sumNews FROM cat_id INNER JOIN  new ON cat_id.id_cat = new.id_cat WHERE new.id_cat =  " + id;
		
		try {
			conn = DatabaseConnection.getConnection();
			pst = conn.prepareStatement(sql);
			rs = pst.executeQuery();
			if(rs.next()) {
				result = rs.getInt("sumNews");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch(Exception e){
			e.printStackTrace();
		}finally {
			if( rs != null && pst != null && conn != null) {
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
		return result;
	}
	public ArrayList<News> getIinLienQuan(int idCat, int idNews) {
		ArrayList<News> items = new ArrayList<>();

		String sql = "SELECT new.id AS nid, new.name AS nname, preview_text, detail_text, date_create, picture, cat_id.id_cat AS cid, cat_id.name AS cname FROM new"
				+ " INNER JOIN cat_id ON new.id_cat = cat_id.id_cat WHERE cat_id.id_cat = " + idCat + " && new.id != " + idNews + " ORDER BY nid DESC LIMIT 2";
		try {
			conn = DatabaseConnection.getConnection();
			pst = conn.prepareStatement(sql);
			rs = pst.executeQuery();
			while (rs.next()) {
				int id = rs.getInt("nid");
				String name = rs.getString("nname");
				String previewText = rs.getString("preview_text");
				String detailText = rs.getString("detail_text");
				Timestamp createAt = rs.getTimestamp("date_create");
				String picture = rs.getString("picture");
				int  categoryID = rs.getInt("cid");
				String categoryName = rs.getString("cname");
				Categories category = new Categories(categoryID, categoryName);
				News objDM = new News(id, name, previewText, detailText, createAt, picture, category);
				items.add(objDM);
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
		return items;
	}
}
