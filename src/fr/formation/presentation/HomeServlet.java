package fr.formation.presentation;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.formation.metier.Client;
import fr.formation.metier.ClientService;

public class HomeServlet extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private ClientService cls = ClientService.getInstance();
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		List<Client> clients =this.cls.getAll();
		req.setAttribute("clients", clients);
		this.getServletContext().getRequestDispatcher("/WEB-INF/views/home.jsp").forward(req, resp);
	}

}
