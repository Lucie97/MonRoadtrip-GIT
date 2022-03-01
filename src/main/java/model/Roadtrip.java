package model;

import java.time.LocalDate;
import java.util.List;

public class Roadtrip {
	private String departLieu;
	private String destination;
	private LocalDate dateDepart;
	private LocalDate dateArrivee;
	private Double prix;
	private List<Reservation> reservations;
	private Transport transport;
	private Integer id;
	
	public Roadtrip(Integer id, String departLieu, String destination, LocalDate dateDepart, LocalDate dateArrivee, Double prix, Transport transport) {
		this.departLieu = departLieu;
		this.destination = destination;
		this.dateDepart = dateDepart;
		this.dateArrivee = dateArrivee;
		this.prix = prix;
		this.transport = transport;
		this.id=id;
	}
	
	public Roadtrip(String departLieu, String destination, LocalDate dateDepart, LocalDate dateArrivee, Double prix, Transport transport) {
		this.departLieu = departLieu;
		this.destination = destination;
		this.dateDepart = dateDepart;
		this.dateArrivee = dateArrivee;
		this.prix = prix;
		this.transport = transport;
	}

	public String getDepartLieu() {
		return departLieu;
	}

	public String getDestination() {
		return destination;
	}

	public LocalDate getDateDepart() {
		return dateDepart;
	}

	public LocalDate getDateArrivee() {
		return dateArrivee;
	}

	public Double getPrix() {
		return prix;
	}

	public List<Reservation> getReservations() {
		return reservations;
	}

	public Transport getTransport() {
		return transport;
	}

	public void setDepartLieu(String departLieu) {
		this.departLieu = departLieu;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public void setDateDepart(LocalDate dateDepart) {
		this.dateDepart = dateDepart;
	}

	public void setDateArrivee(LocalDate dateArrivee) {
		this.dateArrivee = dateArrivee;
	}

	public void setPrix(Double prix) {
		this.prix = prix;
	}

	public void setReservations(List<Reservation> reservations) {
		this.reservations = reservations;
	}

	public void setTransport(Transport transport) {
		this.transport = transport;
	}

	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Roadtrip [id=" + id +", departLieu=" + departLieu + ", destination=" + destination + ", dateDepart=" + dateDepart
				+ ", dateArrivee=" + dateArrivee + ", prix=" + prix + ", reservations=" + reservations + ", transport="
				+ transport + "]";
	}
	
	
	
}
