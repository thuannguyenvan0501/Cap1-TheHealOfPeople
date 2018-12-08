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

/**
 * Servlet implementation class PublicIndexNewsDetailController
 */

public class PublicIndexNewsDetailController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PublicIndexNewsDetailController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		NewsDAO newDAO = new NewsDAO();
		CategoryDAO catDAO = new CategoryDAO();
		int idNews = 0 ;
		try {
			idNews = Integer.parseInt(request.getParameter("idNews"));
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
		News objNews = newDAO.getItem(idNews);
		request.setAttribute("objNews", objNews);
		
		ArrayList<News> listTLQ = newDAO.getIinLienQuan(objNews.getCategory().getId(), idNews);
		request.setAttribute("listTLQ", listTLQ);
		ArrayList<Categories> objCat = catDAO.getItems();
		request.setAttribute("objCat", objCat);
		RequestDispatcher rd = request.getRequestDispatcher("/news_detail.jsp");
		rd.forward(request, response);
		return;
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
