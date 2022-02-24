package model;

import java.time.LocalDate;

public abstract class Compte {

    protected String nom;
    protected String prenom;
	protected String mail;
    protected String password;
    protected static int cpt=0;
    protected int idCompte;
    protected LocalDate dateNaissance;
    
    
	public Compte(String nom, String prenom, String mail, String password, LocalDate dateNaissance) {
		cpt++;
		this.nom = nom;
		this.prenom = prenom;
		this.mail = mail;
		this.password = password;
		this.idCompte = cpt;
		this.dateNaissance = dateNaissance;
	}
			
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getIdCompte() {
		return idCompte;
	}
	public void setIdCompte(int idCompte) {
		this.idCompte = idCompte;
	}
	public static int getCpt() {
		return cpt;
	}
	public LocalDate getDateNaissance() {
		return dateNaissance;
	}
	public void setDateNaissance(LocalDate dateNaissance) {
		this.dateNaissance = dateNaissance;
	}
	

    

}
