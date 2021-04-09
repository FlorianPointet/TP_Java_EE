package fr.epsi.dao;

import java.util.List;


import fr.epsi.entite.Idee;
import fr.epsi.entite.NoteIdee;

public interface NoteIdeeDAO {

	List<NoteIdeeDAO> getNoteIdee(Idee idee);
	
	void ajouter(NoteIdeeDAO noteIdee);
}
