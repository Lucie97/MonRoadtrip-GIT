package model;

import java.time.LocalDate;
import java.util.List;

public class Organisateur extends Compte {
	private List<Activite> activites;

	public Organisateur(String nom, String prenom, String mail, String password, LocalDate dateNaissance) {
		super(nom, prenom, mail, password, dateNaissance);
	}

	public List<Activite> getActivites() {
		return activites;
	}

	public void setActivites(List<Activite> activites) {
		this.activites = activites;
	}

	@Override
	public String toString() {
		return "Organisateur [nom=" + nom + ", prenom=" + prenom + ", mail=" + mail + ", password=" + password
				+ ", idCompte=" + idCompte + ", dateNaissance=" + dateNaissance + ", activites=" + activites + "]";
	}

	
}
