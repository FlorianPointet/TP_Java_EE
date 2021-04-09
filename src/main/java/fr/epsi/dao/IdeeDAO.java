package fr.epsi.dao;

import java.util.List;

import fr.epsi.entite.Idee;

public interface IdeeDAO {

	List<Idee> getIdee();
	
	List<Idee> getTopClassementIdee();
	
	List<Idee> getBestClassementIdee();
	
	void ajouter(Idee idee);
	
}
