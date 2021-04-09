package fr.epsi.service;

import java.util.List;

import fr.epsi.entite.Idee;

public interface IdeeService {

	List<Idee> getIdee();
	
	List<Idee> getTopClassementIdee();
	
	List<Idee> getBestClassementIdee();
	
	void ajouter(Idee idee); 
}
