package baseDeDonnees;

import java.util.HashSet;



public class Tournoi {
HashSet<Team> teams = new HashSet<Team>();
HashSet<Match> poules = new HashSet<Match>();
public Tournoi() {
}

public void ajouterMatchPoules(Match pMatch){
	poules.add(pMatch);
}

public void ajouterTeams(Team pteam){
	teams.add(pteam);
}

public String toString(){
	return poules.toString() + teams.toString();
}
}
