package fr.epsi.servlet;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import fr.epsi.entite.Idee;
import fr.epsi.entite.User;
import fr.epsi.service.IdeeService;
import fr.epsi.service.UserService;

public class CreationIdeeServlet extends HttpServlet {

	@EJB
	private IdeeService service;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		this.getServletContext().getRequestDispatcher("/WEB-INF/pages/CreationIdee.jsp").forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String titre = req.getParameter("titre");
    	String description = req.getParameter("description");
		String type = req.getParameter("type");
    	String image = req.getParameter("image");
    	HttpSession session = req.getSession();
    	User user = (User) session.getAttribute("user");

    	Date today = new Date();
    	
    	Idee idee = new Idee();
    	idee.settitre(titre);
    	idee.setDescription(description);
    	idee.setimage(image);
    	idee.settype(type);
    	idee.setDate(today);
    	idee.setUser(user);
    	
    	service.ajouter(idee);
    	req.setAttribute("C'est bon", "Votre idée est publié");
    	
    	this.getServletContext().getRequestDispatcher("/WEB-INF/pages/CreationIdee-idea.jsp").forward(req, resp);
		
	}

}
