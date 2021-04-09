package fr.epsi.service;

import java.util.List;

import fr.epsi.entite.Idee;
import fr.epsi.entite.NoteIdee;

public interface NoteIdeeService {

	void ajouter(NoteIdee noteIdee);

	List<NoteIdee> getNoteIdee(Idee idee);
}
