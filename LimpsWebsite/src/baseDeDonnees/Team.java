package baseDeDonnees;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Team {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String nom;
	private String logo;
	@OneToMany(mappedBy = "team")
	private Set<Compte> Joueurs;
	@OneToOne
	private Compte Capitaine;
	private String Description;
	@ManyToOne
	private Set<Match> matchs1 = new HashSet<Match>();
	@ManyToOne
	private Set<Match> matchs2 = new HashSet<Match>();
	

	Set<Match> getMatch1() {
		return matchs1;
	}

	void ajouterMatch1(Match match) {
		matchs1.add(match);
	}

	void ajouterMatch2(Match match) {
		matchs2.add(match);
	}

	Set<Match> getMatch2() {
		return matchs2;
	}

	Team(String pNom, Compte pCapitaine) {
		nom = pNom;
		Joueurs = new HashSet<Compte>();
		Joueurs.add(pCapitaine);
		Capitaine = pCapitaine;
	}

	Team(String pNom, Compte pCapitaine, String pDescription) {
		nom = pNom;
		Joueurs = new HashSet<Compte>();
		pCapitaine.setTeam(this);
		Capitaine = pCapitaine;
		Description = pDescription;
	}

	void ajouterJoueur(Compte pCompte) {
		Joueurs.add(pCompte);
	}

	String getNom() {
		return nom;
	}

	void setNom(String nom) {
		this.nom = nom;
	}

	String getLogo() {
		return logo;
	}

	void setLogo(String logo) {
		this.logo = logo;
	}

	public Compte getCapitaine() {
		return Capitaine;
	}

	public void setCapitaine(Compte capitaine) {
		Capitaine = capitaine;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

	public Set<Compte> getJoueurs() {
		return Joueurs;
	}

	public int size() {
		return Joueurs.size();
	}
	
	public String toString(){
		return nom;
	}

}
