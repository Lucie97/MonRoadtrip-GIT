package model;

import java.time.LocalDate;
import java.util.List;

public class Reservation {

	private Integer id;
	private LocalDate dateReservation;
	private Statut statut;
	private Participant participant;
	private List<Etape> etapes;
	private Roadtrip roadTrip;
	private Client client;


	public Reservation(LocalDate dateReservation, Statut statut, Participant participant, List<Etape> etapes,
			Roadtrip roadTrip, Client client) {
		this.dateReservation = dateReservation;
		this.statut = statut;
		this.participant = participant;
		this.roadTrip = roadTrip;
		this.client = client;
	}

	public LocalDate getDateReservation() {
		return dateReservation;
	}

	public void setDateReservation(LocalDate dateReservation) {
		this.dateReservation = dateReservation;
	}
	

	public Statut getStatut() {
		return statut;
	}

	public Participant getParticipant() {
		return participant;
	}

	public List<Etape> getEtapes() {
		return etapes;
	}

	public Roadtrip getRoadTrip() {
		return roadTrip;
	}

	public Client getClient() {
		return client;
	}

	public void setStatut(Statut statut) {
		this.statut = statut;
	}

	public void setParticipant(Participant participant) {
		this.participant = participant;
	}

	public void setEtapes(List<Etape> etapes) {
		this.etapes = etapes;
	}

	public void setRoadTrip(Roadtrip roadTrip) {
		this.roadTrip = roadTrip;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	@Override
	public String toString() {
		return "Reservation [dateReservation=" + dateReservation + ", statut=" + statut + ", participant=" + participant
				+ ", etapes=" + etapes + ", client=" + client + "]";
	}


	
	

}
