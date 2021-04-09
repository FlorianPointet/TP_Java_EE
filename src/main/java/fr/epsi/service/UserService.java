package fr.epsi.service;

import java.util.List;

import fr.epsi.entite.User;

public interface UserService {

	User get(String email);
	
	void inscription(User user);
	
	List<User> getAttenteInscription();
	
	void approuverInscription(Long id);
	
	List<User> getBestClassementUser();
}
