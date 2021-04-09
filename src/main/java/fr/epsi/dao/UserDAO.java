package fr.epsi.dao;

import java.util.List;

import fr.epsi.entite.User;

public interface UserDAO {

	User get(String email);
	
	void inscription(User user);
	
	List<User> getAttenteInscription();
	
	void approuverInscription(Long id);
		
}
