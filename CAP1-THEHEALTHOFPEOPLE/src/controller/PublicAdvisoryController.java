package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.bean.QuestionSick;
import model.bean.Sick;
import model.dao.QuestionDAO;
import model.dao.SickDAO;
import util.AuthUtil;

/**
 * Servlet implementation class PublicAdvisoryController
 */

public class PublicAdvisoryController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PublicAdvisoryController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		if(!AuthUtil.checkLogin(request, response)) {
    		return;
    	}
		int idSick = 0;
		try {
			idSick = Integer.parseInt(request.getParameter("idSick"));
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
		SickDAO sickDAO = new SickDAO();
		ArrayList<Sick> listSick = sickDAO.getItems();
		QuestionDAO quesDAO = new QuestionDAO();
		ArrayList<QuestionSick> listQuestion = new QuestionDAO().getItems(idSick);
		request.setAttribute("listSick", listSick);
		RequestDispatcher rd = request.getRequestDispatcher("/about.jsp");
		rd.forward(request, response);
		return;
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
