package model;

import java.time.LocalDate;
import java.util.List;

public class Client extends Compte {

	private List<Reservation> reservations;
    private double solde;
    private TypeDePaiement typeDePaiement;
    
	public Client(String nom, String prenom, String mail, String password, LocalDate dateNaissance, List<Reservation> reservations, double solde,
			TypeDePaiement typeDePaiement) {
		super(nom, prenom, mail, password, dateNaissance);
		this.reservations = reservations;
		this.solde = solde;
		this.typeDePaiement = typeDePaiement;
	}

	public List<Reservation> getReservations() {
		return reservations;
	}

	public double getSolde() {
		return solde;
	}

	public TypeDePaiement getTypeDePaiement() {
		return typeDePaiement;
	}

	public void setReservations(List<Reservation> reservations) {
		this.reservations = reservations;
	}

	public void setSolde(double solde) {
		this.solde = solde;
	}

	public void setTypeDePaiement(TypeDePaiement typeDePaiement) {
		this.typeDePaiement = typeDePaiement;
	}

	@Override
	public String toString() {
		return "Client [nom=" + nom + ", prenom=" + prenom + ", mail=" + mail + ", password=" + password + ", idCompte="
				+ idCompte + ", dateNaissance=" + dateNaissance + ", reservations=" + reservations + ", solde=" + solde
				+ ", typeDePaiement=" + typeDePaiement + "]";
	}

	    
}
