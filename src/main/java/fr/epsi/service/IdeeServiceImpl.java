package fr.epsi.service;

import java.util.List;

import fr.epsi.entite.Idee;
import javax.annotation.Resource;
import javax.ejb.Stateless;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.UserTransaction;

import fr.epsi.dao.IdeeDAO;
import fr.epsi.dao.IdeeDAOlmpl;

@Stateless
@TransactionManagement(TransactionManagementType.BEAN)
public class IdeeServiceImpl implements IdeeService{

	
	@PersistenceContext
	EntityManager em;
	
	@Resource
	UserTransaction utx;
	
	public List<Idee> getIdee() {
		IdeeDAO dao = new IdeeDAOlmpl(em, utx);
		return dao.getIdee();
	}

	public List<Idee> getTopClassementIdee() {
		IdeeDAO dao = new IdeeDAOlmpl(em, utx);
		return dao.getTopClassementIdee();
	}

	public List<Idee> getBestClassementIdee() {
		IdeeDAO dao = new IdeeDAOlmpl(em, utx);
		return dao.getBestClassementIdee();
	}

	public void ajouter(Idee idee) {
		IdeeDAO dao = new IdeeDAOlmpl(em, utx);
		dao.ajouter(idee);
	}



}
