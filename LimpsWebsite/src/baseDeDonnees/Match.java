package baseDeDonnees;

import java.util.Date;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

public class Match {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@OneToMany(mappedBy = "Team1")
	private Team team1;
	@OneToMany(mappedBy = "Match2")
	private Team team2;
	private Date date;
	
	public Match(int pId, Team pteam1, Team pTeam2,Date pDate) {
		id=pId;
		date=pDate;
		team1=pteam1;
		team1.ajouterMatch1(this);
		team2=pTeam2;
		team2.ajouterMatch2(this);
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public int getId() {
		return id;
	}

	public Team getTeam1() {
		return team1;
	}

	public Team getTeam2() {
		return team2;
	}
	
	public String toString(){
		return id +"[" + team1.getNom() + "," + team2.getNom() + "]" + date; 
	}
}
