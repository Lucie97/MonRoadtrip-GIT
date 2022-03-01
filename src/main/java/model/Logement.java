package model;

import java.time.LocalDate;

public class Logement {

	private LocalDate date;
    private double prix;
    private Adresse adresse;
    private int nbPlaces;
    private int note; //1-10
    private Hote hote;
    private Integer id;
    
	public Logement(Integer id, LocalDate date, double prix, Adresse adresse, int nbPlaces, int note, Hote hote) {
		this.date = date;
		this.prix = prix;
		this.adresse = adresse;
		this.nbPlaces = nbPlaces;
		this.note = note;
		this.hote = hote;
		this.id = id;
	}
	
	public Logement(LocalDate date, double prix, Adresse adresse, int nbPlaces, int note, Hote hote) {
		this.date = date;
		this.prix = prix;
		this.adresse = adresse;
		this.nbPlaces = nbPlaces;
		this.note = note;
		this.hote = hote;
	}

	public LocalDate getDate() {
		return date;
	}

	public double getPrix() {
		return prix;
	}

	public Adresse getAdresse() {
		return adresse;
	}

	public int getNbPlaces() {
		return nbPlaces;
	}

	public int getNote() {
		return note;
	}

	public Hote getHote() {
		return hote;
	}
	
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}

	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}

	public void setNbPlaces(int nbPlaces) {
		this.nbPlaces = nbPlaces;
	}

	public void setNote(int note) {
		this.note = note;
	}

	public void setHote(Hote hote) {
		this.hote = hote;
	}
	

	@Override
	public String toString() {
		return "Logement [id=" + id + ", date=" + date + ", prix=" + prix + ", adresse=" + adresse + ", nbPlaces="
				+ nbPlaces + ", note=" + note + ", hote=" + hote + "]";
	}

	

	
	
	
	
}
