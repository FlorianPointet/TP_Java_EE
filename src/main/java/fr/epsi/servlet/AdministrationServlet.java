package fr.epsi.servlet;

import java.io.IOException;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import fr.epsi.entite.User;
import fr.epsi.service.UserService;

public class AdministrationServlet extends HttpServlet {

	@EJB
	private UserService service;
	
	@Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	HttpSession session = req.getSession();
    	User user = (User) session.getAttribute("user");
    	if(user.getRang() == 1) {
    		req.setAttribute("listInscription", service.getAttenteInscription());
    		this.getServletContext().getRequestDispatcher("/WEB-INF/pages/Administration.jsp").forward(req, resp);
    	}
    }
    
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	HttpSession session = req.getSession();
    	User user = (User) session.getAttribute("user");
    	if(user.getRang() == 1) {
    		service.approuverInscription(Long.parseLong(req.getParameter("id")));
    		req.setAttribute("listInscription", service.getAttenteInscription());
    		this.getServletContext().getRequestDispatcher("/WEB-INF/pages/Administration.jsp").forward(req, resp);
    	}
    }
}
