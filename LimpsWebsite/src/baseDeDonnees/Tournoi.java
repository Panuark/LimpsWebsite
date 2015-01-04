package baseDeDonnees;

import java.util.HashSet;



public class Tournoi {
HashSet<Team> teams = new HashSet<Team>();
HashSet<Match> poules = new HashSet<Match>();
Tournoi() {
}

void ajouterMatchPoules(Match pMatch){
	poules.add(pMatch);
}

void ajouterTeams(Team pteam){
	teams.add(pteam);
}

public String toString(){
	return poules.toString() + teams.toString();
}
}
