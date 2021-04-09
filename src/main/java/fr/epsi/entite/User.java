package fr.epsi.entite;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String prenom;
	private String nom;
	private String mail;
	private String motdepasse;
	private int rang;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getprenom() {
		return prenom;
	}
	public void setprenom(String prenom) {
		this.prenom = prenom;
	}
	public String getnom() {
		return nom;
	}
	public void setnom(String nom) {
		this.nom = nom;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getmotdepasse() {
		return motdepasse;
	}
	public void setmotdepasse(String motdepasse) {
		this.motdepasse = motdepasse;
	}
	
	public void setRang(int rang) {
		this.rang = rang;
	}
	public int getRang() {
		return rang;
	}
	
}
