package fr.epsi.servlet;

import java.io.IOException;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import fr.epsi.entite.Idee;
import fr.epsi.entite.Note;
import fr.epsi.entite.NoteIdee;
import fr.epsi.entite.User;
import fr.epsi.service.NoteIdeeService;

public class CreationNoteIdeeServlet extends HttpServlet {

	@EJB
	private NoteIdeeService service;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int idIdee = Integer.parseInt(req.getParameter("id"));
		int note = Integer.parseInt(req.getParameter("note"));
		req.setAttribute("note", note);
		req.setAttribute("id", idIdee);
		this.getServletContext().getRequestDispatcher("/WEB-INF/pages/CreationNoteIdee.jsp").forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Long idIdee = Long.parseLong(req.getParameter("idIdee"));
		int note = Integer.parseInt(req.getParameter("note"));
		String commentaire = req.getParameter("commentaire");
		
    	HttpSession session = req.getSession();
    	User user = (User) session.getAttribute("user");
    	
    	Idee idee = new Idee();
    	idee.setId(idIdee);
		
		Note note1 = new Note();
		if(note == 1) {
			note1.setId(Long.parseLong("2"));
			note1.setNom("Top");
		} else {
			note1.setId(Long.parseLong("1"));
			note1.setNom("Flop");
		}
		
		NoteIdee noteIdee = new NoteIdee();
		noteIdee.setCommentaire(commentaire);
		noteIdee.setUser(user);
		noteIdee.setIdea(idee);
		noteIdee.setNote(note1);
		
		service.ajouter(noteIdee);
		
		resp.sendRedirect("noteIdee?id="+idIdee);
	}
}
