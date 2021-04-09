package fr.epsi.servlet;


import java.io.IOException;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.epsi.service.IdeeService;
import fr.epsi.service.UserService;

public class ClassementServlet extends HttpServlet {

	
	@EJB
	private IdeeService serviceIdee;
	
	@EJB
	private UserService serviceUser;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setAttribute("listIdeasTopRating", serviceIdee.getTopClassementIdee());
		req.setAttribute("listIdeasBestRating", serviceIdee.getBestClassementIdee());
		req.setAttribute("listUsersBestRating", serviceUser.getBestClassementUser());
		this.getServletContext().getRequestDispatcher("/WEB-INF/pages/Classement.jsp").forward(req, resp);
	}
}
