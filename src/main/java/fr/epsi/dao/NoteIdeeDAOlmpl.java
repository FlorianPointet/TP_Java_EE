package fr.epsi.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.transaction.HeuristicMixedException;
import javax.transaction.HeuristicRollbackException;
import javax.transaction.NotSupportedException;
import javax.transaction.RollbackException;
import javax.transaction.SystemException;
import javax.transaction.UserTransaction;

import fr.epsi.entite.Idee;
import fr.epsi.entite.NoteIdee;

public class NoteIdeeDAOlmpl implements  NoteIdeeDAO{

	EntityManager em;
	UserTransaction utx;
	
	public NoteIdeeDAOlmpl(EntityManager em, UserTransaction utx) {
		this.em=em;
		this.utx=utx;
	}

	
	public List<NoteIdeeDAO> getNoteIdee(Idee idee) {
		return em.createQuery("Select r from NoteIdee r where r.idee=:idee", NoteIdee.class).setParameter("idee", idee).getResultList();
	}

	public void ajouter(NoteIdeeDAO noteIdee) {
		try {
			utx.begin();
			em.persist(noteIdee);
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
