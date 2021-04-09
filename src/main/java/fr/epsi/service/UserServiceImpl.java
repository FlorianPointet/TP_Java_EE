package fr.epsi.service;

import java.util.List;

import fr.epsi.entite.User;
import javax.annotation.Resource;
import javax.ejb.Stateless;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.UserTransaction;

import fr.epsi.dao.UserDAO;
import fr.epsi.dao.UserDAOlmpl;


@Stateless
@TransactionManagement(TransactionManagementType.BEAN)
public class UserServiceImpl implements UserService{

	@PersistenceContext
	EntityManager em;
	
	@Resource
	UserTransaction utx;
	
	public User get(String email) {
		UserDAO dao = new UserDAOlmpl(em, utx);
		return dao.get(email);
	}

	public void inscription(User user) {
		UserDAO dao = new UserDAOlmpl(em, utx);
		dao.inscription(user);
		
	}

	public List<User> getAttenteInscription() {
		UserDAO dao = new UserDAOlmpl(em, utx);
		return dao.getAttenteInscription();
	}

	public void approuverInscription(Long id) {
		UserDAO dao = new UserDAOlmpl(em, utx);
		dao.approuverInscription(id);
		
	}

	public List<User> getBestClassementUser() {
		// TODO Auto-generated method stub
		return null;
	}



}
