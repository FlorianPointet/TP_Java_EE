package fr.epsi.dao;

import javax.persistence.EntityManager;
import javax.transaction.HeuristicMixedException;
import javax.transaction.HeuristicRollbackException;
import javax.transaction.NotSupportedException;
import javax.transaction.RollbackException;
import javax.transaction.SystemException;
import javax.transaction.UserTransaction;

import fr.epsi.entite.Note;
import fr.epsi.entite.Rate;

public class NoteDAOlmpl implements NoteDAO{
	
	EntityManager em;
	UserTransaction utx;
	
	public NoteDAOlmpl(EntityManager em, UserTransaction utx) {
		this.em=em;
		this.utx=utx;
	}

	public void verifierDonnesFlopTop() {
		
	Long count = (Long) em.createQuery("Select COUNT(r) from Note r").getSingleResult();
			
			if(count == 0) {
				Note noteTop = new Note();
				noteTop.setNom("Top");
				Note noteFlop = new Note();
				noteFlop.setNom("Flop");
				try {
					utx.begin();
					em.persist(noteFlop);
					em.persist(noteTop);
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

}
