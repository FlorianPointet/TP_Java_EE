package fr.epsi.servlet;

import java.io.IOException;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.epsi.entite.Idee;
import fr.epsi.service.NoteIdeeService;

public class NoteIdeeServlet extends HttpServlet{

	@EJB
	private NoteIdeeService service;
	
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Idee idee = new Idee();
		idee.setId(Long.parseLong(req.getParameter("id")));
		
		req.setAttribute("idee", idee);
		req.setAttribute("listeNoteIdee", service.getNoteIdee(idee));
		this.getServletContext().getRequestDispatcher("/WEB-INF/page/NoteIdee.jsp").forward(req, resp);
	}
}
