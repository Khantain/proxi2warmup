package fr.formation.presentation;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

public class IndexServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Logger logger = Logger.getLogger(IndexServlet.class.getClass());

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		logger.info("entree dans le doGet de IndexServlet");

		this.getServletContext().getRequestDispatcher("/WEB-INF/views/conn.jsp").forward(req, resp);
	}

	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

	String username = req.getParameter("username");
	String password = req.getParameter("password");
	
	if (username.equals("toto") && password.equals("toto")){
		resp.sendRedirect(this.getServletContext().getContextPath() + "/home.html");
	} else {
		this.getServletContext().getRequestDispatcher("/WEB-INF/views/conn.jsp").forward(req, resp);
	}
	
	}
}
