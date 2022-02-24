package model;

import java.time.LocalDate;
import java.util.List;

public class Etape {

	private int duree;
	private LocalDate date;
	private List<Activite> activites;
	private Logement logement;
	private Reservation reservation;
	
	public Etape(int duree, LocalDate date, List<Activite> activites, Logement logement, Reservation reservation) {
		this.duree = duree;
		this.date = date;
		this.activites = activites; //obligatoire dans le constructeur ? 0 à * activite
		this.logement = logement;
		this.reservation = reservation;
	}

	public int getDuree() {
		return duree;
	}

	public LocalDate getDate() {
		return date;
	}

	public List<Activite> getActivites() {
		return activites;
	}

	public Logement getLogement() {
		return logement;
	}

	public Reservation getReservation() {
		return reservation;
	}

	public void setDuree(int duree) {
		this.duree = duree;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public void setActivites(List<Activite> activites) {
		this.activites = activites;
	}

	public void setLogement(Logement logement) {
		this.logement = logement;
	}

	public void setReservation(Reservation reservation) {
		this.reservation = reservation;
	}

	@Override
	public String toString() {
		return "Etape [duree=" + duree + ", date=" + date + ", activites=" + activites + ", logement=" + logement
				+ ", reservation=" + reservation + "]";
	}
	
	
	
	
	
}
