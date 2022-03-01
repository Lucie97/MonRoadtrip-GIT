package model;

import java.time.LocalDate;
import java.util.List;

public class Hote extends Compte {
	private List<Logement> logements;

	public Hote(Integer id, String nom, String prenom, String mail, String password, LocalDate dateNaissance) {
		super(id, nom, prenom, mail, password, dateNaissance);
	}
	
	public Hote(String nom, String prenom, String mail, String password, LocalDate dateNaissance) {
		super(nom, prenom, mail, password, dateNaissance);
	}

	public List<Logement> getLogements() {
		return logements;
	}

	public void setLogements(List<Logement> logements) {
		this.logements = logements;
	}

	@Override
	public String toString() {
		return "Hote [nom=" + nom + ", prenom=" + prenom + ", mail=" + mail + ", password=" + password + ", id=" + id
				+ ", dateNaissance=" + dateNaissance + ", logements=" + logements + "]";
	}

	
}
