package fr.epsi.servlet;

import java.io.IOException;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.epsi.entite.User;
import fr.epsi.service.UserService;

public class InscriptionServlet extends HttpServlet {

	@EJB
	private UserService service;

	@Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		this.getServletContext().getRequestDispatcher("/WEB-INF/pages/Inscription.jsp").forward(req, resp);
    }
    
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	
    	User user = new User();
    	user.setprenom(req.getParameter("firstname"));
    	user.setnom(req.getParameter("lastname"));
    	user.setMail(req.getParameter("email"));
    	user.setmotdepasse(req.getParameter("password"));
    	user.setRang(-1);
    	
    	service.inscription(user);
    	req.setAttribute("C'est bon !", "Votre inscriptionest en cours de traitement");
    	
    	this.getServletContext().getRequestDispatcher("/WEB-INF/pages/Inscription.jsp").forward(req, resp);
    }
	
}
