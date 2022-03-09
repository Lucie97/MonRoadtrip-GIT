package model;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Etape {

	private int duree;
	private LocalDate date;
	
	@OneToMany
	private List<Activite> activites;
	
	@ManyToOne
	private Logement logement;
	
	@ManyToOne
	@JoinColumn(name="id_reservation_fk")
	private Reservation reservation;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_etape")
	private Integer id;
	
	public Etape() {}
	
	public Etape(Integer id, int duree, LocalDate date, List<Activite> activites, Logement logement, Reservation reservation) {
		this.id=id;
		this.duree = duree;
		this.date = date;
		this.activites = activites; //obligatoire dans le constructeur ? 0 � * activite
		this.logement = logement;
		this.reservation = reservation;
	}
	
	public Etape(int duree, LocalDate date, List<Activite> activites, Logement logement, Reservation reservation) {
		this.duree = duree;
		this.date = date;
		this.activites = activites; //obligatoire dans le constructeur ? 0 � * activite
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

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Etape [id=" + id + ", duree=" + duree + ", date=" + date + ", activites=" + activites + ", logement="
				+ logement + "]";
	}
	
	
	
	
	
}
