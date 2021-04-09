package fr.epsi.servlet;

import java.io.IOException;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.epsi.service.IdeeService;

public class ListeIdeeServlet extends HttpServlet{

	@EJB
	private IdeeService service;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setAttribute("listIdee", service.getIdee());
		this.getServletContext().getRequestDispatcher("/WEB-INF/pages/ListeIdee.jsp").forward(req, resp);
	}
}
