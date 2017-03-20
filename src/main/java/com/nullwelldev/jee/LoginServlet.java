package com.nullwelldev.jee;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/login.do")
public class LoginServlet extends HttpServlet {

	UserValidationService service = new UserValidationService();

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// getting parameters from requests
		// String name = request.getParameter("name");
		// request.setAttribute("name", name);
		request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// getting parameters from requests
		String name = request.getParameter("name");
		request.setAttribute("name", name);

		String password = request.getParameter("password");
		request.setAttribute("password", password);

		if (service.isUserValid(name, password))
			request.getRequestDispatcher("/WEB-INF/views/welcome.jsp").forward(request, response);
		else {
			request.setAttribute("errorMessage", "Invalid Crdentials");
			request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response);
		}

	}

}
