package fr.epsi.servlet;

import java.io.IOException;
import java.security.Principal;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import fr.epsi.entite.User;
import fr.epsi.service.NoteService;
import fr.epsi.service.UserService;


public class AccueilServlet extends HttpServlet{

	@EJB
	private UserService serviceUser;
	
	@EJB
	private NoteService serviceNote;
	
	@Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	HttpSession session = req.getSession();
		if(req.getParameter("disconnect") != null && req.getParameter("disconnect").equals("true")) {
			System.out.println("Vous êtes déconnecté ");
			session.removeAttribute("user");
		} else if(req.getUserPrincipal() != null) {
	    	User user = serviceUser.get(req.getUserPrincipal().toString());
	    	session.setAttribute("user", user);
	    	resp.sendRedirect("list-idee");
		}
		serviceNote.verifierDonneesTopFlop();
		
		this.getServletContext().getRequestDispatcher("/WEB-INF/pages/Accueil.jsp").forward(req, resp);
    }
    
}
