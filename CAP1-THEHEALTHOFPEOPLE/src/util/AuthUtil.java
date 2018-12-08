package util;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.bean.User;

public class AuthUtil {

	public static boolean checkLogin(HttpServletRequest request, HttpServletResponse response) throws IOException {
		HttpSession session = request.getSession();
		User userLogin = (User) session.getAttribute("userLogin"); // trả về đối tượng user
		if(userLogin != null) {
			return true;
		}
		response.sendRedirect(request.getContextPath() + "/login");
			return false;
		
	}

}
