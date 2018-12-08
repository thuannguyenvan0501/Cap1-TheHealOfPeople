package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.bean.User;
import model.dao.UserDAO;
import util.AuthUtil;
import util.StringUtil;

/**
 * Servlet implementation class UserAddController
 */

public class UserAddController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ServletRequest request;
	private UserDAO userDAO;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserAddController() {
        super();
        userDAO = new UserDAO();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/*if(!AuthUtil.checkLogin(request, response)) {
    		return;
		}*/
		RequestDispatcher rd = request.getRequestDispatcher("/signin.jsp");
		rd.forward(request, response);
		return;
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		
		// lấy dữ liệu từ form
		String username = request.getParameter("username");
		String password = StringUtil.md5(new String(request.getParameter("password")));
		//String password = request.getParameter("password");
		String fullname = request.getParameter("fullname");
		String email = request.getParameter("email");
		String ngaySinh = request.getParameter("ngaysinh");
		User item = new User(0, username, password, fullname, email, ngaySinh);
		if(userDAO.checkUser(username) != null) {
			// thêm thành công
			RequestDispatcher rd = request.getRequestDispatcher("/signin.jsp?check=1");
			rd.forward(request, response);
			return;
		}else {
			// chưa tồn tại
		}if(userDAO.addUser(item) > 0) {
			//thành công
			response.sendRedirect(request.getContextPath() + "/index_login?msg=1");
		}else {
			//thất bại
			RequestDispatcher rd = request.getRequestDispatcher("/signin.jsp?err=1");
			rd.forward(request, response);
			return;
		}
	}

}
