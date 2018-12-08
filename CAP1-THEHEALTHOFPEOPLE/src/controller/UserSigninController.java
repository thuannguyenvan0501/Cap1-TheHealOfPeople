package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.bean.User;
import model.dao.UserDAO;
import util.AuthUtil;

/**
 * Servlet implementation class UserSigninController
 */

public class UserSigninController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private UserDAO userDAO;   
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserSigninController() {
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
		ArrayList<User> user = userDAO.getItems();
		request.setAttribute("user", user);
		RequestDispatcher rd = request.getRequestDispatcher("/index_login.jsp");
		rd.forward(request, response);
		return;
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
