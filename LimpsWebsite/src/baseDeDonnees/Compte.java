package baseDeDonnees;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Compte {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String login;
	private String password;
	private String nom;
	private String prenom;
	private String description;
	private boolean admin;
	@ManyToOne
	private Team team;
	private String CompteLOL;

	Compte(String pLogin, String pPassword, String pNom, String pPrenom) {
		login = pLogin;
		password = pPassword;
		nom = pNom;
		prenom = pPrenom;
	}
	
	Compte(String pLogin, String pPassword, String pNom, String pPrenom, String pDescription) {
		login = pLogin;
		password = pPassword;
		nom = pNom;
		prenom = pPrenom;
		description=pDescription;
	}

	String getPassword() {
		return password;
	}

	void setPassword(String password) {
		this.password = password;
	}

	String getDescription() {
		return description;
	}

	void setDescription(String description) {
		this.description = description;
	}

	boolean isAdmin() {
		return admin;
	}

	void setAdmin(boolean admin) {
		this.admin = admin;
	}

	Team getTeam() {
		return team;
	}

	String setTeam(Team pteam) {
		if (team == null){
			if (pteam.size() < 9) {
				this.team = pteam;
				team.ajouterJoueur(this);
				return "Joueur ajoute";
			} else {
				return "Plus de place dans l'equipe";
			}
		} else {
			return "Deja membre d'une equipe";
		}
	}

	String getCompteLOL() {
		return CompteLOL;
	}

	void setCompteLOL(String compteLOL) {
		CompteLOL = compteLOL;
	}

	String getLogin() {
		return login;
	}

	String getNom() {
		return nom;
	}

	String getPrenom() {
		return prenom;
	}

	boolean isCapitaine() {
		return team != null && this == team.getCapitaine();
	}

	Boolean connection(String pPassword){
		return pPassword==password;
	}
	
	public String toString(){
		return login;
	}
}
