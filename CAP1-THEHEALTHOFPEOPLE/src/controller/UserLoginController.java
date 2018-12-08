package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import jdk.nashorn.internal.ir.RuntimeNode.Request;
import model.bean.User;
import model.dao.UserDAO;
import util.StringUtil;

/**
 * Servlet implementation class UserLoginController
 */

public class UserLoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private UserDAO userDAO;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserLoginController() {
        super();
        // TODO Auto-generated constructor stub
        userDAO = new UserDAO();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession();
		User userLogin = (User) session.getAttribute("userLogin"); // trả về đối tượng user
		if(userLogin != null) {
			response.sendRedirect(request.getContextPath() + "/index?msg=1");
			return;
		}
		RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
		rd.forward(request, response);
		return;
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession();
		User userLogin = (User) session.getAttribute("userLogin");
		
		if(userLogin != null) {
			response.sendRedirect(request.getContextPath() + "/index?msg=1");
			return;
		}
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		if("".equals(password)) {
			RequestDispatcher rd = request.getRequestDispatcher("/signin.jsp");
			return;
		}
		password = StringUtil.md5(password);
		userLogin = userDAO.checkLogin(username, password);
		if(userLogin != null) {
			// login thành công và chuyển vào trang index
			session.setAttribute("userLogin", userLogin);
			
			response.sendRedirect(request.getContextPath() + "/index?msg=1");
			return;
		}else {
			// thất bại
			RequestDispatcher rd = request.getRequestDispatcher("/login.jsp?err=1");
			rd.forward(request, response);
			return;
		}
		
	}

}
