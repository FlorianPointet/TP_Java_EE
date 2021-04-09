package fr.epsi.service;

import javax.annotation.Resource;
import javax.ejb.Stateless;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.UserTransaction;

import fr.epsi.dao.NoteDAO;
import fr.epsi.dao.NoteDAOlmpl;

@Stateless
@TransactionManagement(TransactionManagementType.BEAN)
public class NoteServiceImpl implements NoteService{

	@PersistenceContext
	EntityManager em;
	
	@Resource
	UserTransaction utx;
	
	public void verifierDonneesTopFlop() {
		NoteDAO dao = new NoteDAOlmpl(em, utx);
		dao.verifierDonnesFlopTop();
	}

}
