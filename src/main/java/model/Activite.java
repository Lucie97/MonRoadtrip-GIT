package model;

import java.time.LocalDate;
import java.time.LocalTime;

public class Activite {

    private LocalDate date;
    private LocalTime heure;
    private double prix;
    private Adresse adresse;
    private String categorie;
    private int nbPlaces;
    private int note; //1-10
    private Organisateur organisateur;
    
    
	public Activite(LocalDate date, LocalTime heure, double prix, Adresse adresse, String categorie, int nbPlaces, int note,
			Organisateur organisateur) {
		super();
		this.date = date;
		this.heure = heure;
		this.prix = prix;
		this.adresse = adresse;
		this.categorie = categorie;
		this.nbPlaces = nbPlaces;
		this.note = note;
		this.organisateur = organisateur;
	}
	
	public LocalDate getDate() {
		return date;
	}
	public LocalTime getHeure() {
		return heure;
	}
	public double getPrix() {
		return prix;
	}
	public String getCategorie() {
		return categorie;
	}
	public int getNbPlaces() {
		return nbPlaces;
	}
	public int getNote() {
		return note;
	}
	public Organisateur getOrganisateur() {
		return organisateur;
	}	
	public Adresse getAdresse() {
		return adresse;
	}
	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public void setHeure(LocalTime heure) {
		this.heure = heure;
	}
	public void setPrix(double prix) {
		this.prix = prix;
	}
	public void setCategorie(String categorie) {
		this.categorie = categorie;
	}
	public void setNbPlaces(int nbPlaces) {
		this.nbPlaces = nbPlaces;
	}
	public void setNote(int note) {
		this.note = note;
	}
	public void setOrganisateur(Organisateur organisateur) {
		this.organisateur = organisateur;
	}

	@Override
	public String toString() {
		return "Activite [date=" + date + ", heure=" + heure + ", prix=" + prix + ", adresse=" + adresse
				+ ", categorie=" + categorie + ", nbPlaces=" + nbPlaces + ", note=" + note + ", organisateur="
				+ organisateur + "]";
	}

	
    
}
