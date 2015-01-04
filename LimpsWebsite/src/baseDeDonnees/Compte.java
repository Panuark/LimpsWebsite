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

	public Compte(String pLogin, String pPassword, String pNom, String pPrenom) {
		login = pLogin;
		password = pPassword;
		nom = pNom;
		prenom = pPrenom;
	}
	
	public Compte(String pLogin, String pPassword, String pNom, String pPrenom, String pDescription) {
		login = pLogin;
		password = pPassword;
		nom = pNom;
		prenom = pPrenom;
		description=pDescription;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public boolean isAdmin() {
		return admin;
	}

	public void setAdmin(boolean admin) {
		this.admin = admin;
	}

	public Team getTeam() {
		return team;
	}

	public String setTeam(Team pteam) {
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

	public String getCompteLOL() {
		return CompteLOL;
	}

	public void setCompteLOL(String compteLOL) {
		CompteLOL = compteLOL;
	}

	public String getLogin() {
		return login;
	}

	public String getNom() {
		return nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public boolean isCapitaine() {
		return team != null && this == team.getCapitaine();
	}

	public Boolean connection(String pPassword){
		return pPassword==password;
	}
	
	public String toString(){
		return login;
	}
}
