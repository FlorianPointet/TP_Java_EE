package fr.epsi.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.transaction.HeuristicMixedException;
import javax.transaction.HeuristicRollbackException;
import javax.transaction.NotSupportedException;
import javax.transaction.RollbackException;
import javax.transaction.SystemException;
import javax.transaction.UserTransaction;

import fr.epsi.entite.Idea;
import fr.epsi.entite.Idee;
import fr.epsi.entite.Note;
import fr.epsi.entite.Rate;

public class IdeeDAOlmpl implements IdeeDAO {
	
	EntityManager em;
	UserTransaction utx;
	
	public IdeeDAOlmpl(EntityManager em, UserTransaction utx) {
		this.em=em;
		this.utx=utx;
	}

	public List<Idee> getIdee() {
		return em.createQuery("Select i from Idee i", Idee.class).getResultList();
	
	}
	


	public List<Idee> getTopClassementIdee() {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Idee> getBestClassementIdee() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	public void ajouter(Idee idee) {
		try {
			utx.begin();
			em.persist(idee);
			utx.commit();
		} catch (NotSupportedException e) {
			e.printStackTrace();
		} catch (SystemException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (IllegalStateException e) {
			e.printStackTrace();
		} catch (RollbackException e) {
			e.printStackTrace();
		} catch (HeuristicMixedException e) {
			e.printStackTrace();
		} catch (HeuristicRollbackException e) {
			e.printStackTrace();
		}
	}


}
