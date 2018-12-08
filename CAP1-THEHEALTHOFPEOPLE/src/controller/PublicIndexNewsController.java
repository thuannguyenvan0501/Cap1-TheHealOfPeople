package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import constant.Define;
import model.bean.Categories;
import model.bean.News;
import model.dao.CategoryDAO;
import model.dao.NewsDAO;
import util.AuthUtil;

/**
 * Servlet implementation class PublicIndexNewsController
 */

public class PublicIndexNewsController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PublicIndexNewsController() {
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
		NewsDAO newDAO = new NewsDAO();
		CategoryDAO catDAO = new CategoryDAO();
		int sumNews = newDAO.countItem();
		int sumPage = (int) Math.ceil((float)sumNews/Define.ROW_COUNT_ADMIN);
		int current_page = 1;
		
		if(request.getParameter("page") != null) {
			current_page = Integer.parseInt(request.getParameter("page"));
		}
		int offset = (current_page - 1) * Define.ROW_COUNT_ADMIN;
		request.setAttribute("sumPage", sumPage);
		request.setAttribute("current_page", current_page);
		ArrayList<News> listNews = newDAO.getItemPagination(offset);
		request.setAttribute("listNews", listNews);
		ArrayList<Categories> objCat = catDAO.getItems();
		request.setAttribute("objCat", objCat);
		RequestDispatcher rd = request.getRequestDispatcher("/news.jsp");
		rd.forward(request, response);
		return;
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
