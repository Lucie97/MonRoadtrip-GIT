package model;

import javax.persistence.Embeddable;

@Embeddable
public class Adresse {

	protected String numero;
	protected String voie;
	protected String cp;
	//protected String ville;
	
	public Adresse() {
	}
	
	public Adresse(String numero, String voie, String cp) {
		super();
		this.numero = numero;
		this.voie = voie;
		this.cp = cp;
	}


	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getVoie() {
		return voie;
	}
	public void setVoie(String voie) {
		this.voie = voie;
	}
	public String getCp() {
		return cp;
	}
	public void setCp(String cp) {
		this.cp = cp;
	}

	@Override
	public String toString() {
		return "Adresse [numero=" + numero + ", voie=" + voie + ", cp=" + cp + "]";
	}
	
	
	
}
